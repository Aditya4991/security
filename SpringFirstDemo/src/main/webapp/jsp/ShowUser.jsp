<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url  value="/add" />

<title>Insert title here</title>
</head>
<body>
<select class="select-width" id="category_list_d">
<option value="">Select Category</option> 
  <c:forEach var="catList" items="${category_lst}">
   <option value="${catList.categoryId}">${catList.categoryName }</option>
  </c:forEach>
</select>

<select class="select-width" id="product_list_d">
<option value="">Select Product</option> 
</select>

</body>
</html>