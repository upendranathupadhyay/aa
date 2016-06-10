<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.5.2/angular.min.js"></script>
<script src="<c:url value='/resources/theme1/js/app.js' />"></script>
<script src="<c:url value='/resources/theme1/js/service/student_service.js' />"></script>
<script src="<c:url value='/resources/theme1/js/controller/student_controller.js' />"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body ng-app="myApp">



<div class="formcontainer">
		<form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
			ID :<input type="text" ng-model="ctrl.student.id" />
			<input type="submit"  value="{{!ctrl.Student.id }}" >
		</form>
</div>



 <div  ng-controller="StudentController as ctrl">
 
			<table class="table table-hover">
                  <thead>
                      <tr>
                          <th>ID.</th>
                          <th>Name</th>
                      </tr>
                  </thead>
                  <tbody>
                      <tr ng-repeat="u in ctrl.students">
                          <td><span ng-bind="u.id"></span></td>
                          <td><span ng-bind="u.name"></span></td>
                      </tr>
                  </tbody>
            </table>
 			<button type="button" ng-click="ctrl.fetchAllStudents()">SHOW</button>
 </div>
 
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="<c:url value='/static/js/app.js' />"></script>
<script src="<c:url value='/static/js/service/student_service.js' />"></script>
<script src="<c:url value='/static/js/controller/student_controller.js' />"></script>
</body>
</html>