@isTest
private class OASComAdobeCqSocialConnectOauthImplSTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1 = OASComAdobeCqSocialConnectOauthImplS.getExample();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2 = comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1;
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3 = new OASComAdobeCqSocialConnectOauthImplS();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4 = comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3;

        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1 = OASComAdobeCqSocialConnectOauthImplS.getExample();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2 = OASComAdobeCqSocialConnectOauthImplS.getExample();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3 = new OASComAdobeCqSocialConnectOauthImplS();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4 = new OASComAdobeCqSocialConnectOauthImplS();

        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1 = OASComAdobeCqSocialConnectOauthImplS.getExample();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2 = new OASComAdobeCqSocialConnectOauthImplS();

        System.assertEquals(false, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1 = OASComAdobeCqSocialConnectOauthImplS.getExample();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2 = new OASComAdobeCqSocialConnectOauthImplS();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3;

        System.assertEquals(false, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3));
        System.assertEquals(false, comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1 = OASComAdobeCqSocialConnectOauthImplS.getExample();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2 = new OASComAdobeCqSocialConnectOauthImplS();

        System.assertEquals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.hashCode(), comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2.hashCode(), comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1 = OASComAdobeCqSocialConnectOauthImplS.getExample();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2 = OASComAdobeCqSocialConnectOauthImplS.getExample();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3 = new OASComAdobeCqSocialConnectOauthImplS();
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4 = new OASComAdobeCqSocialConnectOauthImplS();

        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2));
        System.assert(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3.equals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4));
        System.assertEquals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties1.hashCode(), comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties3.hashCode(), comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialConnectOauthImplS comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties = new OASComAdobeCqSocialConnectOauthImplS();
        Map<String, String> propertyMappings = comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.getPropertyMappings();
        System.assertEquals('providerConfigUserFolder', propertyMappings.get('provider.config.user.folder'));
    }
}
