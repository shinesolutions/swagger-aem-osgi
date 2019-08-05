@isTest
private class OASComAdobeGraniteAuthOauthImplGraniTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties1 = OASComAdobeGraniteAuthOauthImplGrani.getExample();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties2 = comAdobeGraniteAuthOauthImplGraniteProviderProperties1;
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties3 = new OASComAdobeGraniteAuthOauthImplGrani();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties4 = comAdobeGraniteAuthOauthImplGraniteProviderProperties3;

        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties1.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties2.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties1.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties3.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties4));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties4.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties3));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties3.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties1 = OASComAdobeGraniteAuthOauthImplGrani.getExample();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties2 = OASComAdobeGraniteAuthOauthImplGrani.getExample();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties3 = new OASComAdobeGraniteAuthOauthImplGrani();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties4 = new OASComAdobeGraniteAuthOauthImplGrani();

        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties1.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties2.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties3.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties4));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties4.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties1 = OASComAdobeGraniteAuthOauthImplGrani.getExample();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties2 = new OASComAdobeGraniteAuthOauthImplGrani();

        System.assertEquals(false, comAdobeGraniteAuthOauthImplGraniteProviderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplGraniteProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties1 = OASComAdobeGraniteAuthOauthImplGrani.getExample();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties2 = new OASComAdobeGraniteAuthOauthImplGrani();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthImplGraniteProviderProperties1.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplGraniteProviderProperties2.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties1 = OASComAdobeGraniteAuthOauthImplGrani.getExample();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties2 = new OASComAdobeGraniteAuthOauthImplGrani();

        System.assertEquals(comAdobeGraniteAuthOauthImplGraniteProviderProperties1.hashCode(), comAdobeGraniteAuthOauthImplGraniteProviderProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplGraniteProviderProperties2.hashCode(), comAdobeGraniteAuthOauthImplGraniteProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties1 = OASComAdobeGraniteAuthOauthImplGrani.getExample();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties2 = OASComAdobeGraniteAuthOauthImplGrani.getExample();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties3 = new OASComAdobeGraniteAuthOauthImplGrani();
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties4 = new OASComAdobeGraniteAuthOauthImplGrani();

        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties1.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthImplGraniteProviderProperties3.equals(comAdobeGraniteAuthOauthImplGraniteProviderProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthImplGraniteProviderProperties1.hashCode(), comAdobeGraniteAuthOauthImplGraniteProviderProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplGraniteProviderProperties3.hashCode(), comAdobeGraniteAuthOauthImplGraniteProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthImplGrani comAdobeGraniteAuthOauthImplGraniteProviderProperties = new OASComAdobeGraniteAuthOauthImplGrani();
        Map<String, String> propertyMappings = comAdobeGraniteAuthOauthImplGraniteProviderProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
        System.assertEquals('oauthProviderGraniteAuthorizationUrl', propertyMappings.get('oauth.provider.granite.authorization.url'));
        System.assertEquals('oauthProviderGraniteTokenUrl', propertyMappings.get('oauth.provider.granite.token.url'));
        System.assertEquals('oauthProviderGraniteProfileUrl', propertyMappings.get('oauth.provider.granite.profile.url'));
        System.assertEquals('oauthProviderGraniteExtendedDetailsUrls', propertyMappings.get('oauth.provider.granite.extended.details.urls'));
    }
}
