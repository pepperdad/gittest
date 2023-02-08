// import axios from 'axios'
function fetchUser() {
  axios.get("/users")
  .then(res => {
    const getData = res.data;
    getData.map(d => {
      document.write(d.loginId + " " + d.password + " " + d.nickName + '<br>');
    })
  })
}
fetchUser();