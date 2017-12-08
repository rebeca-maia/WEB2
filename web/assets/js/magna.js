jQuery(document).ready(function($) {

    /*
     | NAVBAR
     */
    $('.nav-bar .item > .btn-drop, .sidebar-main .item > .btn-drop').click(function() {
        $(this).parent().toggleClass("-active");

        return false;
    });

    /*
     | MASK
     */
    $('.cep').mask('00000-000');


    $(".btn-delete").click(function() {

        if (confirm('Deseja realmente excluir esse registro?') === true) {
            document.location.href = $(this).attr('href');
        }

        return false;
    });
});