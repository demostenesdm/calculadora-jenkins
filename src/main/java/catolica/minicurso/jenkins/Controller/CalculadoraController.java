
@RestContoller
public class CalculadoraController {
    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/ola")
    public String hello(){
        return calculadoraService.hello();
    }
    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return calculadoraService.somar(a,b);
    }
    @GetMapping("/subtrair/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return calculadoraService.subtrair(a,b);
    }
}