<html>
<head>
    <title>json-test</title>
<script src="js/jsonrpc.js" type="text/javascript"></script>
<script src="js/jquery.js" type="text/javascript"></script>
<script>
    var jsonService = new JsonRpc.ServiceProxy("/json", {
        asynchronous: true,
        methods: ['calc.add', 'calc.multiply', 'dao.addFilm']
    });

    addFilm = function(){
        var ru_name = $("#ru_name").val()
        var eng_name = $("#eng_name").val()
        var n = {ru_name: ru_name, eng_name: eng_name}
        JsonRpc.setAsynchronous(jsonService, false);
        try {
            var result = jsonService.dao.addFilm(JSON.stringify(n));
            $("body").append("success")
        } catch (e) {
            alert("Unable to compute because: " + e);
        }
        $("#name").val("")
    }

</script>


</head>
<body>
    <h2>Hello World! json-rpc</h2>
    RU<input id="ru_name" type="text" name="name"><br>
    ENG<input id="eng_name" type="text" name="name"> <br>

    <a href="javascript:addFilm()">add film</a>
    </body>
</html>
