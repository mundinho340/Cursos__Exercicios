import React from "react"
import HelloWord from "../HelloWords"
import { AiOutlineSearch, AiFillHome } from "react-icons/ai"
import { RiMessengerLine } from "react-icons/ri"
import { BsPlusSquare } from "react-icons/bs"
import { MdOutlineExplore } from "react-icons/md"
import { FiHeart } from "react-icons/fi"

import { IconContext } from "react-icons"

import "./style.css"
function Pop(){
    console.log("ola")
}

export function Header(){

    return(
        <header className="header" >
            <div className="container">
                
                 <img className="logo" src="https://www.instagram.com/static/images/web/mobile_nav_type_logo.png/735145cfe0a4.png" />

                <div className="input-fake">
                    <IconContext.Provider value={{ color: '#8e8e8e' }}>
                        <AiOutlineSearch />
                    </IconContext.Provider>
                    
                    <input placeholder="Pesquisar" />
                </div>

                <div className="menu-icons">
                    <IconContext.Provider value={{size: '26px'}}>
                        <div>
                            <button onClick="Pop()">    
                                <AiFillHome className="pagina"  />
                            </button>
                            
                        </div>
                        <div> 
                            <RiMessengerLine />
                        </div>
                        <div>
                            <BsPlusSquare />
                        </div>
                        <div>
                          <MdOutlineExplore />
                        </div>
                        <div>
                            <FiHeart />
                        </div>
                    </IconContext.Provider>
                    <img className="img-user" src="https://avatars.githubusercontent.com/u/87779356?v=4" />
                </div>

            </div>
        </header>
    )
}
 
