@isTest
private class OASComAdobeGraniteAuthSamlSamlAuthenTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSamlSamlAuthen.getExample();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2 = comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1;
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthSamlSamlAuthen();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4 = comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3;

        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSamlSamlAuthen.getExample();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2 = OASComAdobeGraniteAuthSamlSamlAuthen.getExample();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthSamlSamlAuthen();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4 = new OASComAdobeGraniteAuthSamlSamlAuthen();

        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSamlSamlAuthen.getExample();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthSamlSamlAuthen();

        System.assertEquals(false, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSamlSamlAuthen.getExample();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthSamlSamlAuthen();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3;

        System.assertEquals(false, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3));
        System.assertEquals(false, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSamlSamlAuthen.getExample();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthSamlSamlAuthen();

        System.assertEquals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.hashCode(), comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2.hashCode(), comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSamlSamlAuthen.getExample();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2 = OASComAdobeGraniteAuthSamlSamlAuthen.getExample();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthSamlSamlAuthen();
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4 = new OASComAdobeGraniteAuthSamlSamlAuthen();

        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4));
        System.assertEquals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties1.hashCode(), comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties3.hashCode(), comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthSamlSamlAuthen comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties = new OASComAdobeGraniteAuthSamlSamlAuthen();
        Map<String, String> propertyMappings = comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
