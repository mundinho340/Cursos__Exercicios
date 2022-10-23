import React from "react"
import "./style.css"
function Rodape(){
    return(
        <>
            <div className="rodape">
            
                <div>
                    <img class="img-circle img-section-1" src="https://www.isutc.ac.mz/wp-content/uploads/2020/09/icone-1.png"/>

                    <p>INSCRIÇÕES</p>
                </div>

                <div>
                    <img class="img-circle img-section-1" src="https://www.isutc.ac.mz/wp-content/uploads/2020/09/icon-calendario_ISUTC.png"/>

                    <p>LICENCIATURA</p>
                </div>

                <div>
                    <img class="img-circle img-section-1" src="https://www.isutc.ac.mz/wp-content/uploads/2020/09/icon-matriculas_ISUTC.png"/>

                    <p>ADMISSÃO</p>
                </div>
            </div>
        </>
    )
}

export default Rodape