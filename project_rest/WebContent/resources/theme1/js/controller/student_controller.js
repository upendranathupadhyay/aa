/**
 * controller
 */

'use strict';

App.controller('StudentController', ['$scope', 'StudentService', function($scope, StudentService) {
	
	var self = this;
    self.student={id:null,name:''};
    self.students=[];
    
    self.fetchAllStudents = function(){
    	
    	StudentService.fetchAllStudents()
            .then(
	                 function(d) {
	                	 
	                      self.students = d;
	                 },
	                  function(errResponse){
	                      console.error('Error while fetching students');
	                 }
                 );
    };
	
    self.fetchStudent = function(id){
    	
    	studentService.fetchStudent(id)
    		.then(
    				function(d){
    					
    					self.student = d;
    				},
    				function(errResponse){
    					console.error('No student find by this id');
    				}
    				
    		
    		);
    };
    
}]);