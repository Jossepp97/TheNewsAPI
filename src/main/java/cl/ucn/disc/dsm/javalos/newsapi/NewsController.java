/*
 * Copyright 2021 José Ávalos Guzmán
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without
 * limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.javalos.newsapi;

import cl.ucn.disc.dsm.javalos.newsapi.model.News;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import java.util.ArrayList;
import java.util.List;

/**
 *  The Controller of News
 *  @author José Ávalos-Guzmán
 */
@RestController
public class NewsController {

    /**
     * @return all the News in the backend.
     */
    @GetMapping("/v1/news")
    public List<News> all(){
        return new ArrayList<>();
    }

    /**
     * @param id of News to retrieve.
     * @return the News.
     */
    @GetMapping("/v1/news/{id}")
    public News one(@PathVariable final Long id){
        // FIXME: Only for test
        News news = new News(
                "Autoridades UCN informan a las unidades los detalles del Plan Retorno y piden acelerar regreso",
                "Noticias UCN",
                "UCN",
                "https://www.noticias.ucn.cl/destacado/autoridades-ucn-informan-a-las-unidades-los-detalles-del-plan-retorno-y-piden-acelerar-regreso/#:~:text=9%20noviembre%2C%202021-,Autoridades%20UCN%20informan%20a%20las%20unidades%20los%20detalles%20del%20Plan,distintas%20unidades%20de%20la%20Universidad.",
                "https://www.noticias.ucn.cl/wp-content/uploads/2011/11/WhatsApp-Image-2021-11-05-at-13.26.53-1.jpeg",
                "En reuniones presenciales realizadas en la Casa Central se expusieron las medidas adoptadas y se respondieron las dudas de los y las representantes de las distintas unidades de la Universidad.",
                "Directores/as y representantes de las distintas unidades académicas de Antofagasta de la Universidad Católica del Norte (UCN), recibieron con aprobación los detalles del Plan Retorno que desarrolla nuestra Casa de Estudios. En dos reuniones presenciales realizadas en el auditorio Andrés Sabella de la Casa Central, el vicerrector académico, Nelson Fernández Vergara; la vicerrectora de Asuntos Económicos y Administrativos, Ingrid Álvarez Arzic; y la directora de la Dirección de Personas (ex Dirección de Recursos Humanos) Alejandra Pizarro Véliz, les explicaron los detalles del proceso, respondiendo también las dudas de los y las asistentes.",
                ZonedDateTime.now(ZoneId.of("-4"))
        );

        return news;
    }
}