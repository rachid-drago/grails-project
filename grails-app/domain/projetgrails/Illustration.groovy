package projetgrails

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.Resource

@Secured
@Resource(uri='/ilus', formats=['json', 'xml'])
class Illustration {



    String filename
    static belongsTo = [annonces: Annonce]

    static constraints = {
        filename nullable: false, blank: false


    }
}
