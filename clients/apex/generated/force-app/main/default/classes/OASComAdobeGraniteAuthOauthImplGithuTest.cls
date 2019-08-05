@isTest
private class OASComAdobeGraniteAuthOauthImplGithuTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplGithu.getExample();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties2 = comAdobeGraniteAuthOauthImplGithubProviderImplProperties1;
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplGithu();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties4 = comAdobeGraniteAuthOauthImplGithubProviderImplProperties3;

        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties4));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties4.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplGithu.getExample();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties2 = OASComAdobeGraniteAuthOauthImplGithu.getExample();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplGithu();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties4 = new OASComAdobeGraniteAuthOauthImplGithu();

        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties4));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties4.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplGithu.getExample();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplGithu();

        System.assertEquals(false, comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplGithubProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplGithu.getExample();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplGithu();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthImplGithubProviderImplProperties2.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplGithu.getExample();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties2 = new OASComAdobeGraniteAuthOauthImplGithu();

        System.assertEquals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.hashCode(), comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties2.hashCode(), comAdobeGraniteAuthOauthImplGithubProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties1 = OASComAdobeGraniteAuthOauthImplGithu.getExample();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties2 = OASComAdobeGraniteAuthOauthImplGithu.getExample();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties3 = new OASComAdobeGraniteAuthOauthImplGithu();
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties4 = new OASComAdobeGraniteAuthOauthImplGithu();

        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties2));
        System.assert(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3.equals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties1.hashCode(), comAdobeGraniteAuthOauthImplGithubProviderImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthImplGithubProviderImplProperties3.hashCode(), comAdobeGraniteAuthOauthImplGithubProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthImplGithu comAdobeGraniteAuthOauthImplGithubProviderImplProperties = new OASComAdobeGraniteAuthOauthImplGithu();
        Map<String, String> propertyMappings = comAdobeGraniteAuthOauthImplGithubProviderImplProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
        System.assertEquals('oauthProviderGithubAuthorizationUrl', propertyMappings.get('oauth.provider.github.authorization.url'));
        System.assertEquals('oauthProviderGithubTokenUrl', propertyMappings.get('oauth.provider.github.token.url'));
        System.assertEquals('oauthProviderGithubProfileUrl', propertyMappings.get('oauth.provider.github.profile.url'));
    }
}
