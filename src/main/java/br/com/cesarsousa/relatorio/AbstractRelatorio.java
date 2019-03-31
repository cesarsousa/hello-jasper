package br.com.cesarsousa.relatorio;

import java.util.HashMap;
import java.util.List;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public abstract class AbstractRelatorio {

	private String path;

	public void gerarRelatorio(String nomeRelatorio, HashMap paramRelatorio, List listaRelatorio) throws Exception {

		this.path = "C:\\eclipseOxygenWorkspace\\hello-jasper\\src\\main\\java\\br\\com\\cesarsousa\\jasper\\";
		
		JasperPrint print = JasperFillManager.fillReport(this.path + nomeRelatorio + ".jasper", paramRelatorio, new JREmptyDataSource());

		JasperExportManager.exportReportToPdfFile(print,"C:\\eclipseOxygenWorkspace\\hello-jasper\\target\\" + nomeRelatorio + ".pdf");

	}

}
