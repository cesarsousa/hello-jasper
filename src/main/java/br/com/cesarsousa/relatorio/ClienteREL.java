package br.com.cesarsousa.relatorio;

import java.util.List;

import br.com.cesarsousa.model.Cliente;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ClienteREL {
	
	//Caminho base
	private String path; 
	
	// Caminho para o package onde estão armazenados os relatorios Jarper
	private String pathToReportPackage; 
	
	//Recupera os caminhos para que a classe possa encontrar os relatórios
	public ClienteREL() {
		this.path = this.getClass().getClassLoader().getResource("").getPath();
		this.pathToReportPackage = this.path + "br/com/cesarsousa/jasper/";
		System.out.println(path);
	}
	
	
	//Imprime gera uma lista de Clientes
	public void imprimir(List<Cliente> clientes) throws Exception	
	{
		JasperReport report = JasperCompileManager.compileReport(this.getPathToReportPackage() + "Clientes.jrxml");
		
		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(clientes));

		JasperExportManager.exportReportToPdfFile(print, "C:\\Users\\cesar\\eclipse-oxygen-workspace\\hello-jasper\\target\\relatorios\\clientes.pdf");	
		
		
	}

	public String getPathToReportPackage() {
		return this.pathToReportPackage;
	}
	
	public String getPath() {
		return this.path;
	}
}