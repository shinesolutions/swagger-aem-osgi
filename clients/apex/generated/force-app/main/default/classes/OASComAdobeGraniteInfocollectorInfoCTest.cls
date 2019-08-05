@isTest
private class OASComAdobeGraniteInfocollectorInfoCTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties1 = OASComAdobeGraniteInfocollectorInfoC.getExample();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties2 = comAdobeGraniteInfocollectorInfoCollectorProperties1;
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties3 = new OASComAdobeGraniteInfocollectorInfoC();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties4 = comAdobeGraniteInfocollectorInfoCollectorProperties3;

        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties1.equals(comAdobeGraniteInfocollectorInfoCollectorProperties2));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties2.equals(comAdobeGraniteInfocollectorInfoCollectorProperties1));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties1.equals(comAdobeGraniteInfocollectorInfoCollectorProperties1));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties3.equals(comAdobeGraniteInfocollectorInfoCollectorProperties4));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties4.equals(comAdobeGraniteInfocollectorInfoCollectorProperties3));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties3.equals(comAdobeGraniteInfocollectorInfoCollectorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties1 = OASComAdobeGraniteInfocollectorInfoC.getExample();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties2 = OASComAdobeGraniteInfocollectorInfoC.getExample();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties3 = new OASComAdobeGraniteInfocollectorInfoC();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties4 = new OASComAdobeGraniteInfocollectorInfoC();

        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties1.equals(comAdobeGraniteInfocollectorInfoCollectorProperties2));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties2.equals(comAdobeGraniteInfocollectorInfoCollectorProperties1));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties3.equals(comAdobeGraniteInfocollectorInfoCollectorProperties4));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties4.equals(comAdobeGraniteInfocollectorInfoCollectorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties1 = OASComAdobeGraniteInfocollectorInfoC.getExample();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties2 = new OASComAdobeGraniteInfocollectorInfoC();

        System.assertEquals(false, comAdobeGraniteInfocollectorInfoCollectorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteInfocollectorInfoCollectorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties1 = OASComAdobeGraniteInfocollectorInfoC.getExample();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties2 = new OASComAdobeGraniteInfocollectorInfoC();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties3;

        System.assertEquals(false, comAdobeGraniteInfocollectorInfoCollectorProperties1.equals(comAdobeGraniteInfocollectorInfoCollectorProperties3));
        System.assertEquals(false, comAdobeGraniteInfocollectorInfoCollectorProperties2.equals(comAdobeGraniteInfocollectorInfoCollectorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties1 = OASComAdobeGraniteInfocollectorInfoC.getExample();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties2 = new OASComAdobeGraniteInfocollectorInfoC();

        System.assertEquals(comAdobeGraniteInfocollectorInfoCollectorProperties1.hashCode(), comAdobeGraniteInfocollectorInfoCollectorProperties1.hashCode());
        System.assertEquals(comAdobeGraniteInfocollectorInfoCollectorProperties2.hashCode(), comAdobeGraniteInfocollectorInfoCollectorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties1 = OASComAdobeGraniteInfocollectorInfoC.getExample();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties2 = OASComAdobeGraniteInfocollectorInfoC.getExample();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties3 = new OASComAdobeGraniteInfocollectorInfoC();
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties4 = new OASComAdobeGraniteInfocollectorInfoC();

        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties1.equals(comAdobeGraniteInfocollectorInfoCollectorProperties2));
        System.assert(comAdobeGraniteInfocollectorInfoCollectorProperties3.equals(comAdobeGraniteInfocollectorInfoCollectorProperties4));
        System.assertEquals(comAdobeGraniteInfocollectorInfoCollectorProperties1.hashCode(), comAdobeGraniteInfocollectorInfoCollectorProperties2.hashCode());
        System.assertEquals(comAdobeGraniteInfocollectorInfoCollectorProperties3.hashCode(), comAdobeGraniteInfocollectorInfoCollectorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteInfocollectorInfoC comAdobeGraniteInfocollectorInfoCollectorProperties = new OASComAdobeGraniteInfocollectorInfoC();
        Map<String, String> propertyMappings = comAdobeGraniteInfocollectorInfoCollectorProperties.getPropertyMappings();
        System.assertEquals('graniteInfocollectorIncludeThreadDumps', propertyMappings.get('granite.infocollector.includeThreadDumps'));
        System.assertEquals('graniteInfocollectorIncludeHeapDump', propertyMappings.get('granite.infocollector.includeHeapDump'));
    }
}
