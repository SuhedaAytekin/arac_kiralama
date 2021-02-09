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
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Customer </h2></div>
<form:form method="POST" modelAttribute="customer" action="/home" name="customer">
    <table style="vertical-align: center; margin-left:20%;">

        <tr>
            <td><form:hidden path="c_id"/></td>
        </tr>
        <tr>
            <td>Ad:</td>
            <td><form:input path="ad" id="fname" /></td>
        </tr>
        <tr>
            <td>Soyad :</td>
            <td><form:input path="soyad" id="lname"/></td>
        </tr>
        <tr>
            <td>Tc :</td>
            <td><form:input path="tc" id="tc"/></td>
        </tr>
        <tr>
            <td>Telefon :</td>
            <td><form:input path="telefon" id="telefon"/></td>
        </tr>
        <tr>
            <td>Kiralanan_plaka :</td>
            <td><form:input path="kiralanan_plaka" id="kiralanan_plaka"/></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="<c:out value="${customer.c_id != null ? 'Update' : 'Rezervation' }" />"
                                   onclick="return validate();">&nbsp;&nbsp; <a href="/list">Rezervation</a>&nbsp;
                <c:if test="${customer.c_id ne null}"><b>|</b>&nbsp;<a href="/rezervation">Rezervation</a></c:if>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
