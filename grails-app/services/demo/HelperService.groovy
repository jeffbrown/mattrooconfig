package demo

class HelperService {

    def grailsApplication
    
    def getMessage() {
        retrieveMessage()
    }

    private retrieveMessage() {
        // this is a bad idea, just
        // demonstrating that it does work
        grailsApplication.config.helper.message
    }
}
