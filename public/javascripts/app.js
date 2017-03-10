
$(document).ready(function() {

    $('#a').click(function(e) {
      ajaxCall();
    });
    $('#b').click(function(e) {
      ajaxCall1();
    });    $('#c').click(function(e) {
      ajaxCall2();
    });    $('#d').click(function(e) {
      ajaxCall3();
    });    $('#e').click(function(e) {
      ajaxCall4();
    });    $('#f').click(function(e) {
      ajaxCall5();
    });


});


var ajaxCall = function() {
    var ajaxCallBack = {
        success : function(data) {$('#placeholder').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.Application.ajaxCall().ajax(ajaxCallBack);
};

var ajaxCall1 = function() {
    var ajaxCallBack1 = {
        success : function(data) {$('#placeholder').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.Application.ajaxCall1().ajax(ajaxCallBack1);
};
var ajaxCall2 = function() {
    var ajaxCallBack2 = {
        success : function(data) {$('#placeholder').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.Application.ajaxCall2().ajax(ajaxCallBack2);
};
var ajaxCall3 = function() {
    var ajaxCallBack3 = {
        success : function(data) {$('#placeholder').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.Application.ajaxCall3().ajax(ajaxCallBack3);
};
var ajaxCall4 = function() {
    var ajaxCallBack4 = {
        success : function(data) {$('#placeholder').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.Application.ajaxCall4().ajax(ajaxCallBack4);
};
var ajaxCall5 = function() {
    var ajaxCallBack5 = {
        success : function(data) {$('#placeholder').html(data);},
        error : function(error) {alert(error);}
    }

    jsRoutes.controllers.Application.ajaxCall5().ajax(ajaxCallBack5);
};


