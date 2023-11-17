package es.iessoterohernandez.daw.endes.HelloWorldPdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class HelloWorldPdf 
{
    public static void main( String[] args )
    {
    	Document d = new Document();
    	
    	try {
    		
    		PdfWriter.getInstance(d, new FileOutputStream("HolaMundo.pdf"));
    		d.open();
    		d.add(new Paragraph("Hola Mundo"));
    		
    		
    	} catch (Exception e) {
    		
    		e.printStackTrace();
    		
    	} finally {
    		
    		d.close();
    	}
    	
    	
    	
        
        
        
    }
}
