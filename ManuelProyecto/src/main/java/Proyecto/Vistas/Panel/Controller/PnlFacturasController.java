/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Vistas.Panel.Controller;

import Proyecto.Vistas.Panel.IternalFacturas;
import java.io.FileNotFoundException;
import static Proyecto.Vistas.Panel.StarProg.*;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rolando
 */
public class PnlFacturasController {
    private IternalFacturas iternalFacturas;
    
   

    public PnlFacturasController(IternalFacturas internalFact) {
          this.iternalFacturas= internalFact;
        initComponent();
    }

    
    
    
    public void initComponent(){
        iternalFacturas.getTblFactura().setModel(FacturaModelo);
        iternalFacturas.getBtnImprimir().addActionListener(((e) -> {
            try {
                BtnImprimirActionListener(e);
            } catch (Exception ex) {
                Logger.getLogger(PnlFacturasController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
    }
    private void BtnImprimirActionListener(ActionEvent e) throws IOException, Exception{
       File ruta = new File("Factura"+String.valueOf(iternalFacturas.getTblFactura().getSelectedRow()+1)+".txt");
        Desktop dt= Desktop.getDesktop();
         dt.open(ruta);
        
    }
    
}
