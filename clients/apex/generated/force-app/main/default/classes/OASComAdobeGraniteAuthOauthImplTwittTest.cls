@isTest
private class OASComAdobeGraniteAuthOauthImplTwittTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplTwitt.getExample();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2 = comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1;
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplTwitt();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4 = comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3;

        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplTwitt.getExample();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2 = OASComAdobeGraniteAuthOauthImplTwitt.getExample();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplTwitt();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4 = new OASComAdobeGraniteAuthOauthImplTwitt();

        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplTwitt.getExample();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplTwitt();

        System.assertEquals(false, comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplTwitt.getExample();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplTwitt();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplTwitt.getExample();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplTwitt();

        System.assertEquals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.hashCode(), comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2.hashCode(), comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplTwitt.getExample();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2 = OASComAdobeGraniteAuthOauthImplTwitt.getExample();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplTwitt();
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4 = new OASComAdobeGraniteAuthOauthImplTwitt();

        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties1.hashCode(), comAdobeGraniteAuthOauthImplTwitterProviderImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplTwitterProviderImplProperties3.hashCode(), comAdobeGraniteAuthOauthImplTwitterProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthImplTwitt comAdobeGraniteAuthOauthImplTwitterProviderImplProperties = new OASComAdobeGraniteAuthOauthImplTwitt();
        Map<String, String> propertyMappings = comAdobeGraniteAuthOauthImplTwitterProviderImplProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
    }
}
