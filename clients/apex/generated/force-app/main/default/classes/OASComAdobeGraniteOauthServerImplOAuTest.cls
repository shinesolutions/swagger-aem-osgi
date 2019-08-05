@isTest
private class OASComAdobeGraniteOauthServerImplOAuTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1 = OASComAdobeGraniteOauthServerImplOAu.getExample();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2 = comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1;
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3 = new OASComAdobeGraniteOauthServerImplOAu();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4 = comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3;

        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1 = OASComAdobeGraniteOauthServerImplOAu.getExample();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2 = OASComAdobeGraniteOauthServerImplOAu.getExample();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3 = new OASComAdobeGraniteOauthServerImplOAu();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4 = new OASComAdobeGraniteOauthServerImplOAu();

        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1 = OASComAdobeGraniteOauthServerImplOAu.getExample();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2 = new OASComAdobeGraniteOauthServerImplOAu();

        System.assertEquals(false, comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1 = OASComAdobeGraniteOauthServerImplOAu.getExample();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2 = new OASComAdobeGraniteOauthServerImplOAu();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3;

        System.assertEquals(false, comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3));
        System.assertEquals(false, comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1 = OASComAdobeGraniteOauthServerImplOAu.getExample();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2 = new OASComAdobeGraniteOauthServerImplOAu();

        System.assertEquals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.hashCode(), comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.hashCode());
        System.assertEquals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2.hashCode(), comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1 = OASComAdobeGraniteOauthServerImplOAu.getExample();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2 = OASComAdobeGraniteOauthServerImplOAu.getExample();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3 = new OASComAdobeGraniteOauthServerImplOAu();
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4 = new OASComAdobeGraniteOauthServerImplOAu();

        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2));
        System.assert(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3.equals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4));
        System.assertEquals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties1.hashCode(), comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties2.hashCode());
        System.assertEquals(comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties3.hashCode(), comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteOauthServerImplOAu comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties = new OASComAdobeGraniteOauthServerImplOAu();
        Map<String, String> propertyMappings = comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.getPropertyMappings();
        System.assertEquals('oauthTokenRevocationActive', propertyMappings.get('oauth.token.revocation.active'));
    }
}
