@isTest
private class OASComAdobeGraniteRestImplServletDefTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties1 = OASComAdobeGraniteRestImplServletDef.getExample();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties2 = comAdobeGraniteRestImplServletDefaultGETServletProperties1;
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties3 = new OASComAdobeGraniteRestImplServletDef();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties4 = comAdobeGraniteRestImplServletDefaultGETServletProperties3;

        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties1.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties2));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties2.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties1));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties1.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties1));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties3.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties4));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties4.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties3));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties3.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties1 = OASComAdobeGraniteRestImplServletDef.getExample();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties2 = OASComAdobeGraniteRestImplServletDef.getExample();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties3 = new OASComAdobeGraniteRestImplServletDef();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties4 = new OASComAdobeGraniteRestImplServletDef();

        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties1.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties2));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties2.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties1));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties3.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties4));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties4.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties1 = OASComAdobeGraniteRestImplServletDef.getExample();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties2 = new OASComAdobeGraniteRestImplServletDef();

        System.assertEquals(false, comAdobeGraniteRestImplServletDefaultGETServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRestImplServletDefaultGETServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties1 = OASComAdobeGraniteRestImplServletDef.getExample();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties2 = new OASComAdobeGraniteRestImplServletDef();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties3;

        System.assertEquals(false, comAdobeGraniteRestImplServletDefaultGETServletProperties1.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties3));
        System.assertEquals(false, comAdobeGraniteRestImplServletDefaultGETServletProperties2.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties1 = OASComAdobeGraniteRestImplServletDef.getExample();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties2 = new OASComAdobeGraniteRestImplServletDef();

        System.assertEquals(comAdobeGraniteRestImplServletDefaultGETServletProperties1.hashCode(), comAdobeGraniteRestImplServletDefaultGETServletProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRestImplServletDefaultGETServletProperties2.hashCode(), comAdobeGraniteRestImplServletDefaultGETServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties1 = OASComAdobeGraniteRestImplServletDef.getExample();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties2 = OASComAdobeGraniteRestImplServletDef.getExample();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties3 = new OASComAdobeGraniteRestImplServletDef();
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties4 = new OASComAdobeGraniteRestImplServletDef();

        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties1.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties2));
        System.assert(comAdobeGraniteRestImplServletDefaultGETServletProperties3.equals(comAdobeGraniteRestImplServletDefaultGETServletProperties4));
        System.assertEquals(comAdobeGraniteRestImplServletDefaultGETServletProperties1.hashCode(), comAdobeGraniteRestImplServletDefaultGETServletProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRestImplServletDefaultGETServletProperties3.hashCode(), comAdobeGraniteRestImplServletDefaultGETServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRestImplServletDef comAdobeGraniteRestImplServletDefaultGETServletProperties = new OASComAdobeGraniteRestImplServletDef();
        Map<String, String> propertyMappings = comAdobeGraniteRestImplServletDefaultGETServletProperties.getPropertyMappings();
        System.assertEquals('defaultLimit', propertyMappings.get('default.limit'));
        System.assertEquals('useAbsoluteUri', propertyMappings.get('use.absolute.uri'));
    }
}
