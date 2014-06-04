package net.rtriangle;

import net.rtriangle.Rtriangle;
import net.rtriangle.RtriangleProvider;
import junit.framework.TestCase;

public class TestCaseRtriangleProvider extends TestCase {
	public void test() {
		Rtriangle rt = RtriangleProvider.getRtriangle();
		double modv13 = Math.pow(rt.getApexX3() - rt.getApexX1(), 2)
				+ Math.pow(rt.getApexY3() - rt.getApexY1(), 2);
		double modv12 = Math.pow(rt.getApexX2() - rt.getApexX1(), 2)
				+ Math.pow(rt.getApexY2() - rt.getApexY1(), 2);
		double modv23 = Math.pow(rt.getApexX3() - rt.getApexX2(), 2)
				+ Math.pow(rt.getApexY3() - rt.getApexY2(), 2);
		System.out.println("стороны:" + modv13 + "," + modv12 + "," + modv23);
		assertTrue(modv13 + modv12 == modv23 || modv23 + modv12 == modv13
				|| modv23 + modv13 == modv12);
	}

}
