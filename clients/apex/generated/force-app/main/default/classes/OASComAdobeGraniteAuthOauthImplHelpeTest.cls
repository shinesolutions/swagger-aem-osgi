@isTest
private class OASComAdobeGraniteAuthOauthImplHelpeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1 = OASComAdobeGraniteAuthOauthImplHelpe.getExample();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2 = comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1;
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3 = new OASComAdobeGraniteAuthOauthImplHelpe();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4 = comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3;

        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1 = OASComAdobeGraniteAuthOauthImplHelpe.getExample();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2 = OASComAdobeGraniteAuthOauthImplHelpe.getExample();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3 = new OASComAdobeGraniteAuthOauthImplHelpe();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4 = new OASComAdobeGraniteAuthOauthImplHelpe();

        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1 = OASComAdobeGraniteAuthOauthImplHelpe.getExample();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2 = new OASComAdobeGraniteAuthOauthImplHelpe();

        System.assertEquals(false, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1 = OASComAdobeGraniteAuthOauthImplHelpe.getExample();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2 = new OASComAdobeGraniteAuthOauthImplHelpe();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1 = OASComAdobeGraniteAuthOauthImplHelpe.getExample();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2 = new OASComAdobeGraniteAuthOauthImplHelpe();

        System.assertEquals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.hashCode(), comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2.hashCode(), comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1 = OASComAdobeGraniteAuthOauthImplHelpe.getExample();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2 = OASComAdobeGraniteAuthOauthImplHelpe.getExample();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3 = new OASComAdobeGraniteAuthOauthImplHelpe();
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4 = new OASComAdobeGraniteAuthOauthImplHelpe();

        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2));
        System.assert(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3.equals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties1.hashCode(), comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties3.hashCode(), comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthImplHelpe comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties = new OASComAdobeGraniteAuthOauthImplHelpe();
        Map<String, String> propertyMappings = comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties.getPropertyMappings();
        System.assertEquals('oauthCookieLoginTimeout', propertyMappings.get('oauth.cookie.login.timeout'));
        System.assertEquals('oauthCookieMaxAge', propertyMappings.get('oauth.cookie.max.age'));
    }
}
