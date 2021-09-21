package projetgrails

class BootStrap {

    def init = { servletContext ->

        def adminRole = new Role(authority: 'ROLE_ADMIN').save()
        def adminUser = new User(username: 'admin', password: 'admin').save()

        UserRole.create(adminUser,adminRole,true)




        ["Alice","Bob","Charly", "Danny","Etienne"].each {
            String username ->
                def userInstance = new User(username: username, password: "itasecret")
                (1..5).each {
                    Integer aIndex ->
                        def annonceInstance =
                                new Annonce(title: "title", description: "description",
                                price: aIndex * 100
                                )
                        (1..3).each {
                            annonceInstance.addToImages(new Illustration(filename: "test-"+ username + "-" + aIndex + ".png" + it))
                        }
                        userInstance.addToAnnonces(annonceInstance)
                        userInstance.save()
                }
        }

        
    }
    def destroy = {
    }
}
