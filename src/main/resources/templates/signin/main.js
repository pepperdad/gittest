import axios from 'axios'

signinEl = document.querySelector('.signin_btn');
signinEl.addEventListener('click', () => {
  const id = document.querySelector('#id')
  const name = document.querySelector('#name')
  const pw = document.querySelector('#pass')
  if(id.value == "" || name.value == "" || pw.value == ""){
    alert("회원가입을 할 수 없습니다")
  }
  else location.ref = './login/login.html'
})

function singinPost() {
  const id = document.querySelector('#id')
  const name = document.querySelector('#name')
  const pw = document.querySelector('#pass')

  axios.post("/src/main/resources/")
}

