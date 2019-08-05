@isTest
private class OASComAdobeGraniteAuthCertImplClientTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1 = OASComAdobeGraniteAuthCertImplClient.getExample();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2 = comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1;
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3 = new OASComAdobeGraniteAuthCertImplClient();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4 = comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3;

        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1 = OASComAdobeGraniteAuthCertImplClient.getExample();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2 = OASComAdobeGraniteAuthCertImplClient.getExample();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3 = new OASComAdobeGraniteAuthCertImplClient();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4 = new OASComAdobeGraniteAuthCertImplClient();

        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1 = OASComAdobeGraniteAuthCertImplClient.getExample();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2 = new OASComAdobeGraniteAuthCertImplClient();

        System.assertEquals(false, comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1 = OASComAdobeGraniteAuthCertImplClient.getExample();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2 = new OASComAdobeGraniteAuthCertImplClient();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3;

        System.assertEquals(false, comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3));
        System.assertEquals(false, comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1 = OASComAdobeGraniteAuthCertImplClient.getExample();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2 = new OASComAdobeGraniteAuthCertImplClient();

        System.assertEquals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.hashCode(), comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2.hashCode(), comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1 = OASComAdobeGraniteAuthCertImplClient.getExample();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2 = OASComAdobeGraniteAuthCertImplClient.getExample();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3 = new OASComAdobeGraniteAuthCertImplClient();
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4 = new OASComAdobeGraniteAuthCertImplClient();

        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2));
        System.assert(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3.equals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4));
        System.assertEquals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties1.hashCode(), comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties3.hashCode(), comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthCertImplClient comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties = new OASComAdobeGraniteAuthCertImplClient();
        Map<String, String> propertyMappings = comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
