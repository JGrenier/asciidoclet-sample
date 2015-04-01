package fr.sample.test;

/**
 * = Test
 * 
 * [red]#La classe test ne fait strictement rien.# +
 * Mot avec des *é* et des *è* et des *ê*
 * 
 * 
 * . un
 * . deux
 * . trois 
 *  
 * inclusion d'un diagramme de test :
 * 
 * [[plantuml]]
 * .Diagramme de classe
 * [plantuml, "build/tmp/javadoc/class", "png", align="center"]
 * ---------------------------------------------------------------------
 * AbstractHandler <|-- Handler
 * AbstractHandler ..> Object
 * ---------------------------------------------------------------------
 * 
 * [[plantuml]]
 * .Diagramme de cas d'utilisation
 * [plantuml, "build/tmp/javadoc/usecase", "png", align="center"]
 * ---------------------------------------------------------------------
 * A -> (Start)
 * B --> (Administrer application) : gestion des alertes
 * ---------------------------------------------------------------------
 * 
 * [[ditagraph]]
 * .Diagramme DITAA
 * [ditaa, "build/tmp/javadoc/dita_graph","png",aling="right", scale="20"]
 * ....
 *                    +-------------+
 *                    | Asciidoctor |-------+
 *                    |   diagram   |       |
 *                    +-------------+       | PNG out
 *                        ^                 |
 *                        | ditaa in        |
 *                        |                 v
 *  +--------+   +--------+----+    /---------------\
 *  |        | --+ Asciidoctor +--> |               |
 *  |  Text  |   +-------------+    |   Beautiful   |
 *  |Document|   |   !magic!   |    |    Output     |
 *  |     {d}|   |             |    |               |
 *  +---+----+   +-------------+    \---------------/
 *      :                                   ^
 *      |          Lots of work             |
 *      +-----------------------------------+
 * ....
 * 
 * 
 * @author Julien Grenier
 * @version 1.0 1 avr. 2015 11:52:44
 * @since 1.0
 */
public class Test {

    public Test() {
        
    }
}
