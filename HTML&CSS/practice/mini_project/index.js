$('.prolog-btn').click(function(){
    // console.log('prolog button')
    $('.main-prolog').css('display','block')
    $('.main-blog').css('display','none')
})

$('.blog-btn').click(function(){
    // console.log('prolog button')
    $('.main-prolog').css('display','none')
    $('.main-blog').css('display','block')
})

$('.writing-box-button').on('click',function(){
    $('.write-popup').css('display','block')
})
$('.btn-cancel').on('click',function(){
    $('.write-popup').css('display','none')
})
$('#content').keyup(function(event){
    if(event.keyCode == 27){
            $('.write-popup').css('display','none')
    }
})
$('.log-out').on('click',function(){
    var result = confirm("로그아웃 하시겠습니까?");
        if(result){
            location.replace('login.html')
        }
})