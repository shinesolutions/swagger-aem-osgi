@isTest
private class OASComAdobeGraniteAnalyzerScriptsComTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1 = OASComAdobeGraniteAnalyzerScriptsCom.getExample();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2 = comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1;
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3 = new OASComAdobeGraniteAnalyzerScriptsCom();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4 = comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3;

        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1 = OASComAdobeGraniteAnalyzerScriptsCom.getExample();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2 = OASComAdobeGraniteAnalyzerScriptsCom.getExample();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3 = new OASComAdobeGraniteAnalyzerScriptsCom();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4 = new OASComAdobeGraniteAnalyzerScriptsCom();

        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1 = OASComAdobeGraniteAnalyzerScriptsCom.getExample();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2 = new OASComAdobeGraniteAnalyzerScriptsCom();

        System.assertEquals(false, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1 = OASComAdobeGraniteAnalyzerScriptsCom.getExample();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2 = new OASComAdobeGraniteAnalyzerScriptsCom();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3;

        System.assertEquals(false, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3));
        System.assertEquals(false, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1 = OASComAdobeGraniteAnalyzerScriptsCom.getExample();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2 = new OASComAdobeGraniteAnalyzerScriptsCom();

        System.assertEquals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.hashCode(), comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2.hashCode(), comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1 = OASComAdobeGraniteAnalyzerScriptsCom.getExample();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2 = OASComAdobeGraniteAnalyzerScriptsCom.getExample();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3 = new OASComAdobeGraniteAnalyzerScriptsCom();
        OASComAdobeGraniteAnalyzerScriptsCom comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4 = new OASComAdobeGraniteAnalyzerScriptsCom();

        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2));
        System.assert(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3.equals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4));
        System.assertEquals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties1.hashCode(), comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties3.hashCode(), comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties4.hashCode());
    }
}
