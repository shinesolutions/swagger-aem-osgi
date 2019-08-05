@isTest
private class OASComAdobeGraniteAcpPlatformPlatforTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties1 = OASComAdobeGraniteAcpPlatformPlatfor.getExample();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties2 = comAdobeGraniteAcpPlatformPlatformServletProperties1;
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties3 = new OASComAdobeGraniteAcpPlatformPlatfor();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties4 = comAdobeGraniteAcpPlatformPlatformServletProperties3;

        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties1.equals(comAdobeGraniteAcpPlatformPlatformServletProperties2));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties2.equals(comAdobeGraniteAcpPlatformPlatformServletProperties1));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties1.equals(comAdobeGraniteAcpPlatformPlatformServletProperties1));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties3.equals(comAdobeGraniteAcpPlatformPlatformServletProperties4));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties4.equals(comAdobeGraniteAcpPlatformPlatformServletProperties3));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties3.equals(comAdobeGraniteAcpPlatformPlatformServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties1 = OASComAdobeGraniteAcpPlatformPlatfor.getExample();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties2 = OASComAdobeGraniteAcpPlatformPlatfor.getExample();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties3 = new OASComAdobeGraniteAcpPlatformPlatfor();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties4 = new OASComAdobeGraniteAcpPlatformPlatfor();

        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties1.equals(comAdobeGraniteAcpPlatformPlatformServletProperties2));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties2.equals(comAdobeGraniteAcpPlatformPlatformServletProperties1));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties3.equals(comAdobeGraniteAcpPlatformPlatformServletProperties4));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties4.equals(comAdobeGraniteAcpPlatformPlatformServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties1 = OASComAdobeGraniteAcpPlatformPlatfor.getExample();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties2 = new OASComAdobeGraniteAcpPlatformPlatfor();

        System.assertEquals(false, comAdobeGraniteAcpPlatformPlatformServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAcpPlatformPlatformServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties1 = OASComAdobeGraniteAcpPlatformPlatfor.getExample();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties2 = new OASComAdobeGraniteAcpPlatformPlatfor();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties3;

        System.assertEquals(false, comAdobeGraniteAcpPlatformPlatformServletProperties1.equals(comAdobeGraniteAcpPlatformPlatformServletProperties3));
        System.assertEquals(false, comAdobeGraniteAcpPlatformPlatformServletProperties2.equals(comAdobeGraniteAcpPlatformPlatformServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties1 = OASComAdobeGraniteAcpPlatformPlatfor.getExample();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties2 = new OASComAdobeGraniteAcpPlatformPlatfor();

        System.assertEquals(comAdobeGraniteAcpPlatformPlatformServletProperties1.hashCode(), comAdobeGraniteAcpPlatformPlatformServletProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAcpPlatformPlatformServletProperties2.hashCode(), comAdobeGraniteAcpPlatformPlatformServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties1 = OASComAdobeGraniteAcpPlatformPlatfor.getExample();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties2 = OASComAdobeGraniteAcpPlatformPlatfor.getExample();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties3 = new OASComAdobeGraniteAcpPlatformPlatfor();
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties4 = new OASComAdobeGraniteAcpPlatformPlatfor();

        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties1.equals(comAdobeGraniteAcpPlatformPlatformServletProperties2));
        System.assert(comAdobeGraniteAcpPlatformPlatformServletProperties3.equals(comAdobeGraniteAcpPlatformPlatformServletProperties4));
        System.assertEquals(comAdobeGraniteAcpPlatformPlatformServletProperties1.hashCode(), comAdobeGraniteAcpPlatformPlatformServletProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAcpPlatformPlatformServletProperties3.hashCode(), comAdobeGraniteAcpPlatformPlatformServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAcpPlatformPlatfor comAdobeGraniteAcpPlatformPlatformServletProperties = new OASComAdobeGraniteAcpPlatformPlatfor();
        Map<String, String> propertyMappings = comAdobeGraniteAcpPlatformPlatformServletProperties.getPropertyMappings();
        System.assertEquals('queryLimit', propertyMappings.get('query.limit'));
        System.assertEquals('fileTypeExtensionMap', propertyMappings.get('file.type.extension.map'));
    }
}
