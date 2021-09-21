package projetgrails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        /*"/api/users"(resources: "user")
        "/api/salesad"(resources: "saleAd")
        "/api/illustrations"(resources: "illustration")
*/
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
