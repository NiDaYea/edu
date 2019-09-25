/*点击单选按钮事件*/
function dati(answerCode,x){
    var an1="1";
    switch (an){
        case 0:
            an1="A";
            break;
        case 1:
            an1="B";
            break;
        case 2:
            an1="C";
            break;
        case 3:
            an1="D";
            break;
    }
    if(answerCode==1){
        $("#yes").attr("type","button");
        $("#yes").css("width","150px");
        $("#"+x).css({"background-color":"blue"});
        $("#"+x).attr("name",an1);
        $("input[type='radio']").remove();
        num+=1;
        dui+=1;
        var lv=dui/num*100;
        $("#dui").html(dui);
        $("#lv").html(lv.toFixed(2));
    }else {
        $("#no").attr({"type":"button","value":"您答错了！正确答案是："+an1});
        $("#"+x).css({"background-color":"red"});
        $("#"+x).attr("name",an1);
        $("input[type='radio']").remove();
        num+=1;
        cuo+=1;
        var lv=dui/num*100;
        $("#cuo").html(cuo);
        $("#lv").html(lv.toFixed(2));
    }

}
/*点击下一道事件*/
function  xia() {
    dex+=1;
    if(dex>99){
        dex=99;
    }
    $("#img").html("");
    $("#ryi").html("");
    $("#rer").html("");
    $("#rsan").html("");
    $("#rsi").html("");
    $(".hiddena").attr("type","hidden");
    $.each(topic,function(index,result) {
        if(index==dex){
            //获取表格颜色
            var color=$("#"+dex).css("background-color");
            //获取正确答案
            var yes=$("#"+dex).attr("name");
            if(result.topicImg!=null){
                $("#img").html('<img src="'+result.topicImg+'" width="300px" height="150px"/>')
            }
            var titou=index+1;
            $("#timu").html(titou+"."+result.topicName);
            var luanxu=(result.listanswer).sort(function () {
                return Math.random() > 0.5 ? -1:1;
            })
            $.each(luanxu,function(index1,result1){
                if(result1.answerCode==1){
                    an=index1;
                }
                switch (index1){
                    case 0 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#ryi").append("A："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#ryi").append("A："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"width":"250px"})
                        }else{
                            $("#ryi").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#ryi").append("A："+result1.answerVal);
                        }
                        break;
                    case 1 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rer").append("B："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#rer").append("B："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"width":"250px"})
                        }else{
                            $("#rer").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rer").append("B："+result1.answerVal);
                        }
                        break;
                    case 2 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rsan").append("C："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#rsan").append("C："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"width":"250px"})
                        }else{
                            $("#rsan").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rsan").append("C："+result1.answerVal);
                        }
                        break;
                    case 3 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rsi").append("D："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#ri").append("D："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"width":"250px"})
                        }else{
                            $("#rsi").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rsi").append("D："+result1.answerVal);
                        }
                        break;
                }
            })

        }
    })
}
/*点击上一道事件*/
function  shang() {
    dex-=1;
    if(dex<0){
        dex=0;
    }
    $("#img").html("");
    $("#ryi").html("");
    $("#rer").html("");
    $("#rsan").html("");
    $("#rsi").html("");
    $(".hiddena").attr("type","hidden");
    $.each(topic,function(index,result) {
        if(index==dex){
            //获取表格颜色
            var color=$("#"+dex).css("background-color");
            //获取正确答案
            var yes=$("#"+dex).attr("name");
            if(result.topicImg!=null){
                $("#img").html('<img src="'+result.topicImg+'" width="300px" height="150px"/>')
            }
            var titou=index+1;
            $("#timu").html(titou+"."+result.topicName);
            var luanxu=(result.listanswer).sort(function () {
                return Math.random() > 0.5 ? -1:1;
            })
            $.each(luanxu,function(index1,result1){
                if(result1.answerCode==1){
                    an=index1;
                }
                switch (index1){
                    case 0 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#ryi").append("A："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#ryi").append("A："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"background-color":"#67b168","width":"250px"})
                        }else{
                            $("#ryi").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#ryi").append("A："+result1.answerVal);
                        }
                        break;
                    case 1 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rer").append("B："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#rer").append("B："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"background-color":"#67b168","width":"250px"})
                        }else{
                            $("#rer").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rer").append("B："+result1.answerVal);
                        }
                        break;
                    case 2 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rsan").append("C："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#rsan").append("C："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"background-color":"#67b168","width":"250px"})
                        }else{
                            $("#rsan").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rsan").append("C："+result1.answerVal);
                        }
                        break;
                    case 3 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rsi").append("D："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#ri").append("D："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"background-color":"#67b168","width":"250px"})
                        }else{
                            $("#rsi").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rsi").append("D："+result1.answerVal);
                        }
                        break;
                }
            })

        }
    })
}
/*点击表格选择题事件*/
function  huanTi(index2) {
    $("#img").html("");
    $("#ryi").html("");
    $("#rer").html("");
    $("#rsan").html("");
    $("#rsi").html("");
    $(".hiddena").attr("type","hidden");
    $.each(topic,function(index,result) {
        if(index==index2){
            dex=index;
            //获取表格颜色
            var color=$("#"+dex).css("background-color");
            //获取正确答案
            var yes=$("#"+dex).attr("name");
            if(result.topicImg!=null){
                $("#img").html('<img src="'+result.topicImg+'" width="300px" height="150px"/>')
            }
            var titou=index2+1;
            $("#timu").html(titou+"."+result.topicName);
            $.each(result.listanswer,function(index1,result1){
                if(result1.answerCode==1){
                    an=index1;
                }
                switch (index1){
                    case 0 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#ryi").append("A："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#ryi").append("A："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"background-color":"#67b168","width":"250px"})
                        }else{
                            $("#ryi").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#ryi").append("A："+result1.answerVal);
                        }
                        break;
                    case 1 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rer").append("B："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#rer").append("B："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"background-color":"#67b168","width":"250px"})
                        }else{
                            $("#rer").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rer").append("B："+result1.answerVal);
                        }
                        break;
                    case 2 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rsan").append("C："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#rsan").append("C："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"background-color":"#67b168","width":"250px"})
                        }else{
                            $("#rsan").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rsan").append("C："+result1.answerVal);
                        }
                        break;
                    case 3 :
                        if(color=="rgb(255, 0, 0)"){
                            $("#rsi").append("D："+result1.answerVal);
                            $("#no").attr({"type":"button","value":"您答错了！正确答案是："+yes});
                        }else if(color=="rgb(0, 0, 255)"){
                            $("#ri").append("D："+result1.answerVal);
                            $("#yes").attr({"type":"button","value":"您答对了！正确答案是："+yes});
                            $("#yes").css({"background-color":"#67b168","width":"250px"})
                        }else{
                            $("#rsi").append('<input type="radio" name="radio" onclick="dati('+result1.answerCode+','+index+')"/>');
                            $("#rsi").append("D："+result1.answerVal);
                        }
                        break;
                }
            })

        }
    })
}