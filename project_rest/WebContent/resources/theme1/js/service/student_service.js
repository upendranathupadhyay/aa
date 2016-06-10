/**
 * student service
 */

'use strict';

App.factory('StudentService',['$http','$q',function($http,$q){
	
	return {
        
		fetchAllStudents: function()
		{
        	
            return $http.get('http://localhost:8085/project_rest/students')
                    .then(
                            function(response){
                            	
                                return response.data;
                            }, 
                            function(errResponse){
                                console.error('Error while fetching students list');
                                return $q.reject(errResponse);
                            }
                    );
        },
	
	
	
		fetchStudent: function(id)
		{
			
			return $http.get('http://localhost:8085/project_rest/rest/student/'+id)
					.then(
							function(response){
								return response.data;
							},
							function(errResponse){
								console.error('No student by this id is present');
								return $q.reject(errResponse);
							}
					);
		}
	};
}]);