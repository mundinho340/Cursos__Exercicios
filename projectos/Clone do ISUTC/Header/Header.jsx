import React from "react"
import "./style.css"
import { FaSearch } from "react-icons/fa"
import Slider from "./Slider/Slider"


function Header(){
    return(
        <>
            <div className="todos1">
                <img className="isutc-logo" src="https://www.isutc.ac.mz/wp-content/uploads/2019/09/logoisutc-1.png" alt="" />
                <div className="todos">
                    <div>
                        <span className="texto">INSCRIÇÕES ONLINE</span>
                    </div>
                        

                    <div>
                        <img className="fenix" src="https://fenix.isutc.ac.mz/isutc/images/newImage2012/logo-fenixedu.svg"/>
                    </div>       
                    <div>
                        <FaSearch className="pesquisa"/>
                    </div>
                </div>
            </div>

            <div className="nav-barra">
                <div></div>
               <div className="menu">
                    <div>
                        A INSTITUIÇÃO
                    </div>
                    <div>
                        ENSINO
                    </div>
                    <div>
                        <p>INVESTIGAÇÃO & INOVAÇÃO</p>
                    </div>
                    <div>
                        Estudantes
                    </div>
                    <div>
                        ALMIN
                    </div>
                </div>    
            </div>
            <div>
                <Slider className="slide"/>
            </div>
        </>
    )
}
export default Header