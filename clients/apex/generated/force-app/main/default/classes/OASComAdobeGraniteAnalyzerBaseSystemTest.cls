@isTest
private class OASComAdobeGraniteAnalyzerBaseSystemTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1 = OASComAdobeGraniteAnalyzerBaseSystem.getExample();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2 = comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1;
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3 = new OASComAdobeGraniteAnalyzerBaseSystem();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4 = comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3;

        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1 = OASComAdobeGraniteAnalyzerBaseSystem.getExample();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2 = OASComAdobeGraniteAnalyzerBaseSystem.getExample();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3 = new OASComAdobeGraniteAnalyzerBaseSystem();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4 = new OASComAdobeGraniteAnalyzerBaseSystem();

        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1 = OASComAdobeGraniteAnalyzerBaseSystem.getExample();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2 = new OASComAdobeGraniteAnalyzerBaseSystem();

        System.assertEquals(false, comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1 = OASComAdobeGraniteAnalyzerBaseSystem.getExample();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2 = new OASComAdobeGraniteAnalyzerBaseSystem();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3;

        System.assertEquals(false, comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3));
        System.assertEquals(false, comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1 = OASComAdobeGraniteAnalyzerBaseSystem.getExample();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2 = new OASComAdobeGraniteAnalyzerBaseSystem();

        System.assertEquals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.hashCode(), comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2.hashCode(), comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1 = OASComAdobeGraniteAnalyzerBaseSystem.getExample();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2 = OASComAdobeGraniteAnalyzerBaseSystem.getExample();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3 = new OASComAdobeGraniteAnalyzerBaseSystem();
        OASComAdobeGraniteAnalyzerBaseSystem comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4 = new OASComAdobeGraniteAnalyzerBaseSystem();

        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2));
        System.assert(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3.equals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4));
        System.assertEquals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties1.hashCode(), comAdobeGraniteAnalyzerBaseSystemStatusServletProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAnalyzerBaseSystemStatusServletProperties3.hashCode(), comAdobeGraniteAnalyzerBaseSystemStatusServletProperties4.hashCode());
    }
}
