@isTest
private class OASComAdobeGraniteAuthOauthImplFacebTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplFaceb.getExample();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2 = comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1;
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplFaceb();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4 = comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3;

        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplFaceb.getExample();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2 = OASComAdobeGraniteAuthOauthImplFaceb.getExample();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplFaceb();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4 = new OASComAdobeGraniteAuthOauthImplFaceb();

        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplFaceb.getExample();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplFaceb();

        System.assertEquals(false, comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplFaceb.getExample();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplFaceb();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplFaceb.getExample();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplFaceb();

        System.assertEquals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.hashCode(), comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2.hashCode(), comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplFaceb.getExample();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2 = OASComAdobeGraniteAuthOauthImplFaceb.getExample();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplFaceb();
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4 = new OASComAdobeGraniteAuthOauthImplFaceb();

        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties1.hashCode(), comAdobeGraniteAuthOauthImplFacebookProviderImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplFacebookProviderImplProperties3.hashCode(), comAdobeGraniteAuthOauthImplFacebookProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthImplFaceb comAdobeGraniteAuthOauthImplFacebookProviderImplProperties = new OASComAdobeGraniteAuthOauthImplFaceb();
        Map<String, String> propertyMappings = comAdobeGraniteAuthOauthImplFacebookProviderImplProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
    }
}
