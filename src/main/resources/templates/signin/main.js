signinEl = document.querySelector('.signin_btn');
signinEl.addEventListener('click', () => {
  let id = document.querySelector('#id')
  let name = document.querySelector('#name')
  let pw = document.querySelector('#pass')
  if(id.value == "" || name.value == "" || pw.value == ""){
    alert("회원가입을 할 수 없습니다")
  }
  else location.ref = './login/login.html'
})
