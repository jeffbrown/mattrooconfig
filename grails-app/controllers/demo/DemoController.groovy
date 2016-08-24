package demo

class DemoController {
    HelperService helperService


    def index() {
        render helperService.message
    }
}
