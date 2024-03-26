<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Asco</title>
  <style>
    body {
      background-color: #f2f2f2;
      font-family: Arial, sans-serif;
      font-size: 16px;
      color: #333;
    }
    h1 {
      text-align: center;
      margin-top: 50px;
      font-size: 36px;
      color: #555;
    }
    p {
      text-align: center;
      font-size: 20px;
      margin-top: 20px;
    }
    .biggest-salary {
      color: #4CAF50;
      font-weight: bold;
    }
    .department-name {
      color: #f44336;
      font-weight: bold;
    }
    .employee-list {
      color: #2196F3;
    }
    button {
      background-color: #2196F3;
      color: #fff;
      border: none;
      padding: 10px 20px;
      border-radius: 5px;
      font-size: 20px;
      cursor: pointer;
      margin-top: 30px;
    }
    button:hover {
      background-color: #0c7cd5;
    }
  </style>
</head>
<body>
<h1>Внутрішня інформація</h1>
<p>Найбільша зарплата: <span class="biggest-salary"><c:out value="${asco.biggestSalary()}"/></span></p>
<p>Назва департаменту в якому працівник отримує більше ніж директор: <span class="department-name"><c:out value="${asco.ifEmployeeHasBiggerSalary()}"/></span></p>
Список всіх працівників: <c:forEach var="i" items="${asco.listOfAllEmployees()}">
  ${i}
</c:forEach>
</body>
</html>