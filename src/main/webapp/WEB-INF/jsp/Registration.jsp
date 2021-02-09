<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>EMS - Car Registration</title>
    <style>
        td, th {
            font-family: arial, sans-serif;
        }
    </style>
    <script type="text/javascript">
        function validate() {
            if (document.forms["car"]["fname"].value == "") {
                alert("Please enter marka");
                document.forms["car"]["fname"].focus();
                return false;
            }
            if (document.forms["car"]["lname"].value == "") {
                alert("Please enter model");
                document.forms["car"]["lname"].focus();
                return false;
            }
            if (document.forms["car"]["vites"].value == "") {
                alert("Please enter vites");
                document.forms["car"]["vites"].focus();
                return false;
            }
            if (document.forms["car"]["plaka"].value == "") {
                alert("Please enter plaka");
                document.forms["car"]["plaka"].focus();
                return false;
            }
            if (document.forms["car"]["empId"].value == "") {
                alert("Please enter emp Id");
                document.forms["car"]["empId"].focus();
                return false;
            }
            if (document.forms["car"]["renk"].value == "") {
                alert("Please enter renk");
                document.forms["car"]["renk"].focus();
                return false;
            }
            if (document.forms["car"]["age"].value == "" || document.forms["car"]["yas"].value == 0) {
                alert("Please enter valid yas");
                document.forms["car"]["yas"].focus();
                return false;
            }
        }
    </script>
</head>
<body style="background-color: #FFFFE0;">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Car <c:out value="${car.id != null ? 'Update' : 'Registration' }" /></h2></div>
<form:form method="POST" modelAttribute="car" action="/home" name="car">
    <table style="vertical-align: center; margin-left:20%;">

        <tr>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>Marka :</td>
            <td><form:input path="marka" id="fname" /></td>
        </tr>
        <tr>
            <td>Model :</td>
            <td><form:input path="model" id="lname"/></td>
        </tr>
        <tr>
            <td>Vites :</td>
            <td><form:input path="vites" id="vites"/></td>
        </tr>
        <tr>
            <td>Plaka :</td>
            <td><form:input path="plaka" id="plaka"/></td>
        </tr>
        <tr>
            <td>Emp. Id :</td>
            <td><form:input path="empId" id="empId"/></td>
        </tr>
        <tr>
            <td>Renk :</td>
            <td><form:input path="renk" id="renk" /></td>
        </tr>
        <tr>
            <td>Yas :</td>
            <td><form:input path="yas" id="yas" /></td>
        </tr>
        <tr>
            <td>Personal Email :</td>
            <td><form:input path="personalEmail" /></td>
        </tr>
        <tr>
            <td>Mobile No :</td>
            <td><form:input path="mobileNo" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="<c:out value="${car.id != null ? 'Update' : 'Register' }" />"
                                   onclick="return validate();">&nbsp;&nbsp; <a href="/list">Car List</a>&nbsp;
                <c:if test="${car.id ne null}"><b>|</b>&nbsp;<a href="/registration">Registration</a></c:if>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>



<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="ISO-8859-1">--%>
<%--    <title>EMS - Car Registration</title>--%>
<%--    <style>--%>
<%--        td, th {--%>
<%--            font-family: arial, sans-serif;--%>
<%--        }--%>
<%--    </style>--%>
<%--    <script type="text/javascript">--%>
<%--        function validate() {--%>
<%--            if (document.forms["car"]["fname"].value == "") {--%>
<%--                alert("Please enter first name");--%>
<%--                document.forms["car"]["fname"].focus();--%>
<%--                return false;--%>
<%--            }--%>
<%--            if (document.forms["car"]["lname"].value == "") {--%>
<%--                alert("Please enter last name");--%>
<%--                document.forms["car"]["lname"].focus();--%>
<%--                return false;--%>
<%--            }--%>
<%--            if (document.forms["car"]["userName"].value == "") {--%>
<%--                alert("Please enter user name");--%>
<%--                document.forms["car"]["userName"].focus();--%>
<%--                return false;--%>
<%--            }--%>
<%--            if (document.forms["car"]["emailId"].value == "") {--%>
<%--                alert("Please enter email id");--%>
<%--                document.forms["car"]["emailId"].focus();--%>
<%--                return false;--%>
<%--            }--%>
<%--            if (document.forms["car"]["empId"].value == "") {--%>
<%--                alert("Please enter emp Id");--%>
<%--                document.forms["car"]["empId"].focus();--%>
<%--                return false;--%>
<%--            }--%>
<%--            if (document.forms["car"]["bloodGp"].value == "") {--%>
<%--                alert("Please enter blood group");--%>
<%--                document.forms["car"]["bloodGp"].focus();--%>
<%--                return false;--%>
<%--            }--%>
<%--            if (document.forms["car"]["age"].value == "" || document.forms["car"]["age"].value == 0) {--%>
<%--                alert("Please enter valid age");--%>
<%--                document.forms["car"]["age"].focus();--%>
<%--                return false;--%>
<%--            }--%>
<%--        }--%>
<%--    </script>--%>
<%--</head>--%>
<%--<body style="background-color: #FFFFE0;">--%>
<%--<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Car <c:out value="${car.id != null ? 'Update' : 'Registration' }" /></h2></div>--%>
<%--<form:form method="POST" modelAttribute="car" action="/home" name="car">--%>
<%--    <table style="vertical-align: center; margin-left:20%;">--%>

<%--        <tr>--%>
<%--            <td><form:hidden path="id"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>First Name :</td>--%>
<%--            <td><form:input path="firstName" id="fname" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Last Name :</td>--%>
<%--            <td><form:input path="lastName" id="lname"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>User Name :</td>--%>
<%--            <td><form:input path="userName" id="userName"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Email Id :</td>--%>
<%--            <td><form:input path="emailId" id="emailId"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Emp. Id :</td>--%>
<%--            <td><form:input path="empId" id="empId"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Blood Group :</td>--%>
<%--            <td><form:input path="bloodGp" id="bloodGp" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Age :</td>--%>
<%--            <td><form:input path="age" id="age" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Personal Email :</td>--%>
<%--            <td><form:input path="personalEmail" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Mobile No :</td>--%>
<%--            <td><form:input path="mobileNo" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td colspan="2"><input type="submit" value="<c:out value="${car.id != null ? 'Update' : 'Register' }" />"--%>
<%--                                   onclick="return validate();">&nbsp;&nbsp; <a href="/list">Car List</a>&nbsp;--%>
<%--                <c:if test="${car.id ne null}"><b>|</b>&nbsp;<a href="/registration">Registration</a></c:if>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form:form>--%>

<%--</body>--%>
<%--</html>--%>