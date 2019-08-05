@isTest
private class OASComAdobeGraniteAuthOauthImplBeareTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplBeare.getExample();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2 = comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1;
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthOauthImplBeare();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4 = comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3;

        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplBeare.getExample();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2 = OASComAdobeGraniteAuthOauthImplBeare.getExample();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthOauthImplBeare();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4 = new OASComAdobeGraniteAuthOauthImplBeare();

        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplBeare.getExample();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthOauthImplBeare();

        System.assertEquals(false, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplBeare.getExample();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthOauthImplBeare();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplBeare.getExample();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthOauthImplBeare();

        System.assertEquals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.hashCode(), comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2.hashCode(), comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplBeare.getExample();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2 = OASComAdobeGraniteAuthOauthImplBeare.getExample();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthOauthImplBeare();
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4 = new OASComAdobeGraniteAuthOauthImplBeare();

        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties1.hashCode(), comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties3.hashCode(), comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthImplBeare comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties = new OASComAdobeGraniteAuthOauthImplBeare();
        Map<String, String> propertyMappings = comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.getPropertyMappings();
        System.assertEquals('oauthClientIdsAllowed', propertyMappings.get('oauth.clientIds.allowed'));
        System.assertEquals('authBearerSyncIms', propertyMappings.get('auth.bearer.sync.ims'));
        System.assertEquals('authTokenRequestParameter', propertyMappings.get('auth.tokenRequestParameter'));
        System.assertEquals('oauthBearerConfigid', propertyMappings.get('oauth.bearer.configid'));
        System.assertEquals('oauthJwtSupport', propertyMappings.get('oauth.jwt.support'));
    }
}
