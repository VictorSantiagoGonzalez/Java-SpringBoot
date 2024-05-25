
package com.ideas.aplicacion.controller;


import com.ideas.aplicacion.domain.Tbl_pedidos_pro;
import com.ideas.aplicacion.domain.Tbl_proveedor;
import com.ideas.aplicacion.service.Tbl_pedidos_proServicelmpl;
import com.ideas.aplicacion.service.Tbl_proveedorServicelmpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;    
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorInicio {
  
     
     @Autowired  //Inyecciones
    private Tbl_pedidos_proServicelmpl tbl_pedidos_proServiceImpl;
     
     @Autowired
     private Tbl_proveedorServicelmpl tbl_proveedorServiceImpl;
   

    //Interfaz de HOME//
    @GetMapping("/")
    public String Inicio(Model model){
         
    return "/Index";
    }
      //Interfaz de iniciar sesión//
          @GetMapping("/Iniciar")
     public String Iniciar(Model model){
          
    return "layout/Login";
    }
      //Interfaz de registrar nueva cuenta//
            @GetMapping("/Registrar")
     public String Registrar(Model model){
        
    return "layout/Registrarse";
    }
      //Interfaz de Inicio en ingles//
      @GetMapping("/HomeEnglish")
     public String HomeEn(Model model){

         
    return "layout/HomeEnglish";
    }
      //Interfaz de catalogo//
         @GetMapping("/Catalogo")
     public String Catalogo(Model model){

    return "layout/Catalogo";
    }
     //Interfaz de contactanos//
         @GetMapping("/Contactanos")
     public String Contactanos(Model model){
          
    return "layout/Contactanos"; 
    }
      //Interfaz de quienes somos//
          @GetMapping("/Quienes")
     public String Quienes(Model model){
          
    return "layout/QuienesSomos";
    }
     //Interfaz de administrador-empleado//
           @GetMapping("/Admin")
     public String Admin(Model model){
          
    return "layout/dash_admin";
    }
       //Interfaz de usuario//
           @GetMapping("/Usuario")
     public String Usuario(Model model){
          
    return "layout/dash_usuario";
    }
     
          @GetMapping("/recuperar")
     public String Recuperar(Model model){
          
    return "layout/recuperarcon";
    }
     
           @GetMapping("/informe")
     public String Informes(Model model){
          
    return "Informe/Informe";
    }
     //Carga masiva de datos
              @GetMapping("/Carga_Masiva")
     public String cargaMasiva(Model model){
        
    return "Proveedores/CargaMasiva2";
    }
     
   // @GetMapping("/")
    //public String Enviar(){
        
    //}
     

     
   
 
    ///////////////////////////////////////MODULO DE PROVEEDORES///////////////////////////////////////////////////
     //////////////PEDIDOS PROVEEDOR///////////////////////// 
    
    @GetMapping("/consultar")
    public String consultarTabla(Model model, Tbl_pedidos_pro tbl_pedidos_pro){
         
        System.out.println(tbl_pedidos_proServiceImpl.listarTbl_pedidos_pro());  

       List<Tbl_pedidos_pro> lstTbl_pedidos_pro = tbl_pedidos_proServiceImpl.listarTbl_pedidos_pro();
       model.addAttribute("lstTbl_pedidos_pro",lstTbl_pedidos_pro);
        
    return "Proveedores/CoPedido";
    }
    
     @GetMapping("/registrar")
    public String registrtarView(Model model, Tbl_pedidos_pro tbl_pedidos_pro){
       // List<Tbl_pedidos_pro> lstTbl_pedidos_pro = tbl_pedidos_proServiceImpl.listarTbl_pedidos_pro(); //
       
       List<Tbl_proveedor> lstTbl_proveedor = tbl_proveedorServiceImpl.listarTbl_proveedor();
       
       
       
        model.addAttribute("lstTbl_proveedor", lstTbl_proveedor);
        
       // model.addAttribute("lstTbl_pedidos_pro", lstTbl_pedidos_pro); //
       return"Proveedores/RePedido";
    }
    
     @PostMapping("/guardar")
    public String guardarAction(Model model, Tbl_pedidos_pro tbl_pedidos_pro){
        
       tbl_pedidos_proServiceImpl.guardar(tbl_pedidos_pro);
      return "redirect:/Admin";
       
    }
    
   @GetMapping("/editar/{idtbl_pedidos_pro}")
    public String editar(Tbl_pedidos_pro tbl_pedidos_pro, Model model) {
        tbl_pedidos_pro = tbl_pedidos_proServiceImpl.encontrar(tbl_pedidos_pro);
        
        List<Tbl_proveedor> lstTbl_proveedor = tbl_proveedorServiceImpl.listaTbl_proveedoresSelect(tbl_pedidos_pro);
        
     
        model.addAttribute("tbl_pedidos_pro", tbl_pedidos_pro);
        model.addAttribute("lstTbl_proveedor", lstTbl_proveedor);

        return "Proveedores/RePedido";
    }
   
     @GetMapping("/eliminar")
    public String eliminarView(Model model, Tbl_pedidos_pro tbl_pedidos_pro){
        List<Tbl_pedidos_pro> lstTbl_pedidos_pro = tbl_pedidos_proServiceImpl.listarTbl_pedidos_pro();
        model.addAttribute("lstTbl_pedidos_pro", lstTbl_pedidos_pro);
        return "Proveedores/CoPedido";
    }
   
    @GetMapping("/eliminar/{idtbl_pedidos_pro}")
    public String eliminar(Tbl_pedidos_pro tbl_pedidos_pro){
        tbl_pedidos_proServiceImpl.eliminar(tbl_pedidos_pro);
        return "redirect:/Admin";
    }
    
    //////////////Proveedores PROVEEDOR///////////////////////// 
    
     @GetMapping("/registrarPro")
    public String registrtarView(Model model, Tbl_proveedor tbl_proveedor){
        List<Tbl_proveedor> lstTbl_proveedor =  tbl_proveedorServiceImpl.listarTbl_proveedor();
       
       model.addAttribute("lstTbl_proveedor", lstTbl_proveedor);
       
     
       return"Proveedores/RgProveedor";
    }
    
      @PostMapping("/guardarPro")
    public String guardarAction(Model model, Tbl_proveedor tbl_proveedor){
        
       tbl_proveedorServiceImpl.guardartbl_proveedor(tbl_proveedor);

        return "redirect:/Admin";
       
    }
    
     @GetMapping("/consultarPro")
    public String consultarTabla(Model model, Tbl_proveedor tbl_proveedor){
         
        System.out.println(tbl_proveedorServiceImpl.listarTbl_proveedor());  

       List<Tbl_proveedor> lstTbl_proveedor = tbl_proveedorServiceImpl.listarTbl_proveedor();
       model.addAttribute("lstTbl_proveedor",lstTbl_proveedor);
        
    return "Proveedores/CoProveedor";
    }
    
      @GetMapping("/editarPro/{idtbl_proveedor}")
    public String editar(Tbl_proveedor tbl_proveedor, Model model) {
        tbl_proveedor  = tbl_proveedorServiceImpl.encontrartbl_proveedor(tbl_proveedor);
        
      
        model.addAttribute("tbl_proveedor", tbl_proveedor);

        return "Proveedores/RgProveedor";
    }
    
    
     @GetMapping("/eliminarPro")
    public String eliminarView(Model model, Tbl_proveedor tbl_proveedor){
        List<Tbl_proveedor> lstTbl_proveedor = tbl_proveedorServiceImpl.listarTbl_proveedor();
        model.addAttribute("lstTbl_proveedor", lstTbl_proveedor);
        return "Proveedores/CoProveedor";
    }
    
    @GetMapping("/eliminarPro/{idtbl_proveedor}")
    public String eliminar(Tbl_proveedor tbl_proveedor){
        tbl_proveedorServiceImpl.eliminartbl_proveedor(tbl_proveedor);
         return "redirect:/Admin";
    }
}


