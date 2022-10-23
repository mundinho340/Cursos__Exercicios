import React from "react"
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
import Body from "./Body/Body"
import Header from "./Header/Header"

const App =() =>{
  return(
      <>
        <Header/>
        <Body/>
      </>
    )
}

export default App
