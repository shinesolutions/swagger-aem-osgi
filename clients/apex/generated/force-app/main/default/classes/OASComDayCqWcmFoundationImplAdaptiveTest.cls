@isTest
private class OASComDayCqWcmFoundationImplAdaptiveTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1 = OASComDayCqWcmFoundationImplAdaptive.getExample();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2 = comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1;
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3 = new OASComDayCqWcmFoundationImplAdaptive();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4 = comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3;

        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1 = OASComDayCqWcmFoundationImplAdaptive.getExample();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2 = OASComDayCqWcmFoundationImplAdaptive.getExample();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3 = new OASComDayCqWcmFoundationImplAdaptive();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4 = new OASComDayCqWcmFoundationImplAdaptive();

        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1 = OASComDayCqWcmFoundationImplAdaptive.getExample();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2 = new OASComDayCqWcmFoundationImplAdaptive();

        System.assertEquals(false, comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1 = OASComDayCqWcmFoundationImplAdaptive.getExample();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2 = new OASComDayCqWcmFoundationImplAdaptive();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3;

        System.assertEquals(false, comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3));
        System.assertEquals(false, comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1 = OASComDayCqWcmFoundationImplAdaptive.getExample();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2 = new OASComDayCqWcmFoundationImplAdaptive();

        System.assertEquals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.hashCode(), comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.hashCode());
        System.assertEquals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2.hashCode(), comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1 = OASComDayCqWcmFoundationImplAdaptive.getExample();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2 = OASComDayCqWcmFoundationImplAdaptive.getExample();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3 = new OASComDayCqWcmFoundationImplAdaptive();
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4 = new OASComDayCqWcmFoundationImplAdaptive();

        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2));
        System.assert(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3.equals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4));
        System.assertEquals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties1.hashCode(), comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties2.hashCode());
        System.assertEquals(comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties3.hashCode(), comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmFoundationImplAdaptive comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties = new OASComDayCqWcmFoundationImplAdaptive();
        Map<String, String> propertyMappings = comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.getPropertyMappings();
        System.assertEquals('adaptSupportedWidths', propertyMappings.get('adapt.supported.widths'));
    }
}
