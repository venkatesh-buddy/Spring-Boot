package com.compare.pdf.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.compare.pdf.api.NewComparison;

@RestController
@CrossOrigin(origins = "*")
public class ComparePdfController {
	
	@GetMapping(value="/comparepdf/viewer")
	@ResponseBody
	public String getComparisonViewerUrl() {
		NewComparison comparison = new NewComparison();
		return comparison.createPdfComparison();
		
	}

}
