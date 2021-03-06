package com.itogge.demofreemarker.domain;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import freemarker.template.SimpleSequence;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

public class FreeMarkerSort implements TemplateMethodModelEx {
	
	public Object exec(List arguments) throws TemplateModelException {
		SimpleSequence simpleSequence = (SimpleSequence) arguments.get(0);
		List<BigDecimal> list = simpleSequence.toList();

		Collections.sort(list, new Comparator<BigDecimal>() {
			public int compare(BigDecimal o1, BigDecimal o2) {
				return o1.intValue() - o2.intValue();
			}
		});
		return list;
	}
	
}
