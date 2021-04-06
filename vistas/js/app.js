const app = (function () {
    function calculate(){
        let valor = $("#value").val()
        console.log(valor)

        if(valor===""){
            alert("ingrese datos porfavor")
        }
        else{
            let result 
         const promise = $.get({
                url:"https://uh8n4bojj2.execute-api.us-east-1.amazonaws.com/tallerapigateway/converter?value="+ valor,
                contentType: "application/json"
            });

            promise.then((data)=>{
                let datajson = JSON.parse(data);
                 result = datajson.result;
                console.log(result)
            })
          
            $("#conteiner").append("<label>"+result+"</label>")
        }
    }

    return{
        calculate: calculate
    }

})();