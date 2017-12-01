jQuery(document).ready(function($) {

    /*
    | NAVBAR
    */
    $('.nav-bar .item > .btn-drop, .sidebar-main .item > .btn-drop').click(function() {
        $(this).parent().toggleClass("-active");

        return false;
    });

});