<!DOCTYPE html>
<head lang="fr">
    <meta charset="UTF-8">
    <title>Welcome!</title>
</head>

<body style="overflow: hidden;  -webkit-font-smoothing: antialiased;">
<h1>Welcome ${user}!</h1>
<p>items:<br/>
            <#list items as item>
                ${item}<br/>
            </#list>
</p>
</body>
</html>