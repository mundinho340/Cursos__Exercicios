import React, {useState} from "react"
import {BrowserRouter as Router,Switch, Route,Link } from "react-router-dom"

 /*import Contacto from "./Meuprojecto/Contacto"
import Company from "./Meuprojecto/Company"
import Home from "./Meuprojecto/Home"
import NewProject from "./Meuprojecto/NewProject"
import Container from "./Meuprojecto/layout/Container"
import Project from "./Meuprojecto/layout/Project"

import Navbar from "./Meuprojecto/layout/Navbar"
import Footer from "./Meuprojecto/layout/Footer"
function App() {
  return (
    <div>
       <Router>
          <Navbar />
         <Switch>
          <Container customClass="min-height">
              <Route exact path="/">
                <Home/>
              </Route>

              <Route exact path="/Project">
                <Project />
              </Route>

              <Route exact path="/Company">
                <Company />
              </Route>
              <Route exact path="/Contacto">
                <Contacto/>
              </Route>
              <Route exact path="/NewProject">
                <NewProject />
              </Route>
            </Container>
         </Switch>
         <Footer/>
       </Router>
    </div>
  )
}
*/
//import {Layout} from "./Layout/"
//import {Header} from "./Header/"


const App =() =>{
  const [alunos, setAlunos] = useState([
    {id:1, name:"Raimumndo"},
    {id:2, name:"Mundas"},
    {id:3, name:"Krypthon"}
    ])

  const add =()=>{
    setAlunos([
      ...alunos,
      {id:Math.random(), name:"new student"}])
  }
   return(
      <>
        <ul>
          {alunos.map(lista => <div key={lista.id}>{lista.name}</div>)

          }
        <button onClick={add}>Adicionar</button>
        </ul>
      </>
    )
}

export default App
