/**
 * Created by Administrator on 2018/1/23.
 */

function hideAlert(arg) {

    if ( arg.innerHTML.length!=0){
        setTimeout(function arg1() {
            arg.innerHTML="";
        },2000);
    }

}
function gotoView(id) {
    document.getElementById(id).scrollIntoView()
    
}