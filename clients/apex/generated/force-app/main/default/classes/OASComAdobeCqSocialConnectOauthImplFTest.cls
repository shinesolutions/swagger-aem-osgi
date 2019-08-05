@isTest
private class OASComAdobeCqSocialConnectOauthImplFTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplF.getExample();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2 = comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1;
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3 = new OASComAdobeCqSocialConnectOauthImplF();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4 = comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3;

        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplF.getExample();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2 = OASComAdobeCqSocialConnectOauthImplF.getExample();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3 = new OASComAdobeCqSocialConnectOauthImplF();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4 = new OASComAdobeCqSocialConnectOauthImplF();

        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplF.getExample();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2 = new OASComAdobeCqSocialConnectOauthImplF();

        System.assertEquals(false, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplF.getExample();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2 = new OASComAdobeCqSocialConnectOauthImplF();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3;

        System.assertEquals(false, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3));
        System.assertEquals(false, comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplF.getExample();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2 = new OASComAdobeCqSocialConnectOauthImplF();

        System.assertEquals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.hashCode(), comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2.hashCode(), comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplF.getExample();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2 = OASComAdobeCqSocialConnectOauthImplF.getExample();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3 = new OASComAdobeCqSocialConnectOauthImplF();
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4 = new OASComAdobeCqSocialConnectOauthImplF();

        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3.equals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4));
        System.assertEquals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties1.hashCode(), comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties3.hashCode(), comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialConnectOauthImplF comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties = new OASComAdobeCqSocialConnectOauthImplF();
        Map<String, String> propertyMappings = comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
        System.assertEquals('oauthCloudConfigRoot', propertyMappings.get('oauth.cloud.config.root'));
        System.assertEquals('providerConfigRoot', propertyMappings.get('provider.config.root'));
        System.assertEquals('providerConfigCreateTagsEnabled', propertyMappings.get('provider.config.create.tags.enabled'));
        System.assertEquals('providerConfigUserFolder', propertyMappings.get('provider.config.user.folder'));
        System.assertEquals('providerConfigFacebookFetchFields', propertyMappings.get('provider.config.facebook.fetch.fields'));
        System.assertEquals('providerConfigFacebookFields', propertyMappings.get('provider.config.facebook.fields'));
        System.assertEquals('providerConfigRefreshUserdataEnabled', propertyMappings.get('provider.config.refresh.userdata.enabled'));
    }
}
