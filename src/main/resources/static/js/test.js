// import axios from 'axios'

function fetchUser() {
  axios.get("/users")
  .then(res => {
    console.log(res)
  })
}
fetchUser();