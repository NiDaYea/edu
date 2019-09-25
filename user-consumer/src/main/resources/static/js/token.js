function getToken() {
    var cookieStr=document.cookie;
    var cookieArray=cookieStr.split("; ");
    var token="";
    if(cookieArray.length>0){
        for (var i=0;i<cookieArray.length;i++){
            var key=cookieArray[i].split("=")[0];
            var value=cookieArray[i].split("=")[1];
            if(key=='token'){
                token=value;
            }
        }
    }
    return token;
}

function getGenTime() {
    var cookieStr=document.cookie;
    var cookieArray=cookieStr.split("; ");
    var genTime="";
    for (var i=0;i<cookieArray.length;i++){
        var key=cookieArray[i].split("=")[0];
        var value=cookieArray[i].split("=")[1];
        if(key=='genTime'){
            genTime=value;
        }
    }
    return genTime;
}