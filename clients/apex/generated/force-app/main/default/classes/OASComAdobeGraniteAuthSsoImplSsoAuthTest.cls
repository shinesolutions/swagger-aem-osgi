@isTest
private class OASComAdobeGraniteAuthSsoImplSsoAuthTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSsoImplSsoAuth.getExample();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2 = comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1;
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthSsoImplSsoAuth();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4 = comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3;

        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSsoImplSsoAuth.getExample();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2 = OASComAdobeGraniteAuthSsoImplSsoAuth.getExample();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthSsoImplSsoAuth();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4 = new OASComAdobeGraniteAuthSsoImplSsoAuth();

        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSsoImplSsoAuth.getExample();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthSsoImplSsoAuth();

        System.assertEquals(false, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSsoImplSsoAuth.getExample();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthSsoImplSsoAuth();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3;

        System.assertEquals(false, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3));
        System.assertEquals(false, comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSsoImplSsoAuth.getExample();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthSsoImplSsoAuth();

        System.assertEquals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.hashCode(), comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2.hashCode(), comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthSsoImplSsoAuth.getExample();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2 = OASComAdobeGraniteAuthSsoImplSsoAuth.getExample();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthSsoImplSsoAuth();
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4 = new OASComAdobeGraniteAuthSsoImplSsoAuth();

        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4));
        System.assertEquals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties1.hashCode(), comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties3.hashCode(), comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthSsoImplSsoAuth comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties = new OASComAdobeGraniteAuthSsoImplSsoAuth();
        Map<String, String> propertyMappings = comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
        System.assertEquals('jaasControlFlag', propertyMappings.get('jaas.controlFlag'));
        System.assertEquals('jaasRealmName', propertyMappings.get('jaas.realmName'));
        System.assertEquals('jaasRanking', propertyMappings.get('jaas.ranking'));
    }
}
