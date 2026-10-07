@isTest
private class OASComAdobeGraniteAuthOauthImplOAuthTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplOAuth.getExample();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2 = comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1;
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthOauthImplOAuth();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4 = comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3;

        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplOAuth.getExample();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2 = OASComAdobeGraniteAuthOauthImplOAuth.getExample();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthOauthImplOAuth();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4 = new OASComAdobeGraniteAuthOauthImplOAuth();

        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplOAuth.getExample();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthOauthImplOAuth();

        System.assertEquals(false, comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplOAuth.getExample();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthOauthImplOAuth();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplOAuth.getExample();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2 = new OASComAdobeGraniteAuthOauthImplOAuth();

        System.assertEquals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.hashCode(), comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2.hashCode(), comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1 = OASComAdobeGraniteAuthOauthImplOAuth.getExample();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2 = OASComAdobeGraniteAuthOauthImplOAuth.getExample();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3 = new OASComAdobeGraniteAuthOauthImplOAuth();
        OASComAdobeGraniteAuthOauthImplOAuth comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4 = new OASComAdobeGraniteAuthOauthImplOAuth();

        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2));
        System.assert(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3.equals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties1.hashCode(), comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties3.hashCode(), comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties4.hashCode());
    }
}
