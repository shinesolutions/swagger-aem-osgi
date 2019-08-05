@isTest
private class OASComAdobeCqSocialConnectOauthImplTTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplT.getExample();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2 = comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1;
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3 = new OASComAdobeCqSocialConnectOauthImplT();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4 = comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3;

        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplT.getExample();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2 = OASComAdobeCqSocialConnectOauthImplT.getExample();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3 = new OASComAdobeCqSocialConnectOauthImplT();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4 = new OASComAdobeCqSocialConnectOauthImplT();

        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplT.getExample();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2 = new OASComAdobeCqSocialConnectOauthImplT();

        System.assertEquals(false, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplT.getExample();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2 = new OASComAdobeCqSocialConnectOauthImplT();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3;

        System.assertEquals(false, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3));
        System.assertEquals(false, comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplT.getExample();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2 = new OASComAdobeCqSocialConnectOauthImplT();

        System.assertEquals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.hashCode(), comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2.hashCode(), comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1 = OASComAdobeCqSocialConnectOauthImplT.getExample();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2 = OASComAdobeCqSocialConnectOauthImplT.getExample();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3 = new OASComAdobeCqSocialConnectOauthImplT();
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4 = new OASComAdobeCqSocialConnectOauthImplT();

        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3.equals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4));
        System.assertEquals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties1.hashCode(), comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties3.hashCode(), comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialConnectOauthImplT comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties = new OASComAdobeCqSocialConnectOauthImplT();
        Map<String, String> propertyMappings = comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
        System.assertEquals('oauthCloudConfigRoot', propertyMappings.get('oauth.cloud.config.root'));
        System.assertEquals('providerConfigRoot', propertyMappings.get('provider.config.root'));
        System.assertEquals('providerConfigUserFolder', propertyMappings.get('provider.config.user.folder'));
        System.assertEquals('providerConfigTwitterEnableParams', propertyMappings.get('provider.config.twitter.enable.params'));
        System.assertEquals('providerConfigTwitterParams', propertyMappings.get('provider.config.twitter.params'));
        System.assertEquals('providerConfigRefreshUserdataEnabled', propertyMappings.get('provider.config.refresh.userdata.enabled'));
    }
}
