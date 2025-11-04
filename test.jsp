<html>
<head>
    <title>Temperature Converter using JavaBean</title>
</head>
<body>
<center>
    <h1>Temperature Converter</h1>
    <jsp:useBean id="converter" class="com.mycompany.TemperatureConverter" scope="page" />

    <%
        String str = request.getParameter("tempValue");
        String mode = request.getParameter("mode");

        if (str != null && mode != null) {
            double val = Double.parseDouble(str);

            if (mode.equals("CtoF")) {
                converter.setCelsius(val);
    %>
                <p><b><%= val %>°C = <%= converter.convertCelsiusToFahrenheit() %>°F</b></p>
    <%
            } else {
                converter.setFahrenheit(val);
    %>
                <p><b><%= val %>°F = <%= converter.convertFahrenheitToCelsius() %>°C</b></p>
    <%
            }
        }
    %>
</center>
</body>
</html>
