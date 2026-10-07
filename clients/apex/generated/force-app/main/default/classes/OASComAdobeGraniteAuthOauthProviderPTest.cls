@isTest
private class OASComAdobeGraniteAuthOauthProviderPTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties1 = OASComAdobeGraniteAuthOauthProviderP.getExample();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties2 = comAdobeGraniteAuthOauthProviderProperties1;
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties3 = new OASComAdobeGraniteAuthOauthProviderP();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties4 = comAdobeGraniteAuthOauthProviderProperties3;

        System.assert(comAdobeGraniteAuthOauthProviderProperties1.equals(comAdobeGraniteAuthOauthProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthProviderProperties2.equals(comAdobeGraniteAuthOauthProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthProviderProperties1.equals(comAdobeGraniteAuthOauthProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthProviderProperties3.equals(comAdobeGraniteAuthOauthProviderProperties4));
        System.assert(comAdobeGraniteAuthOauthProviderProperties4.equals(comAdobeGraniteAuthOauthProviderProperties3));
        System.assert(comAdobeGraniteAuthOauthProviderProperties3.equals(comAdobeGraniteAuthOauthProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties1 = OASComAdobeGraniteAuthOauthProviderP.getExample();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties2 = OASComAdobeGraniteAuthOauthProviderP.getExample();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties3 = new OASComAdobeGraniteAuthOauthProviderP();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties4 = new OASComAdobeGraniteAuthOauthProviderP();

        System.assert(comAdobeGraniteAuthOauthProviderProperties1.equals(comAdobeGraniteAuthOauthProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthProviderProperties2.equals(comAdobeGraniteAuthOauthProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthProviderProperties3.equals(comAdobeGraniteAuthOauthProviderProperties4));
        System.assert(comAdobeGraniteAuthOauthProviderProperties4.equals(comAdobeGraniteAuthOauthProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties1 = OASComAdobeGraniteAuthOauthProviderP.getExample();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties2 = new OASComAdobeGraniteAuthOauthProviderP();

        System.assertEquals(false, comAdobeGraniteAuthOauthProviderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties1 = OASComAdobeGraniteAuthOauthProviderP.getExample();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties2 = new OASComAdobeGraniteAuthOauthProviderP();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthProviderProperties1.equals(comAdobeGraniteAuthOauthProviderProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthProviderProperties2.equals(comAdobeGraniteAuthOauthProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties1 = OASComAdobeGraniteAuthOauthProviderP.getExample();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties2 = new OASComAdobeGraniteAuthOauthProviderP();

        System.assertEquals(comAdobeGraniteAuthOauthProviderProperties1.hashCode(), comAdobeGraniteAuthOauthProviderProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthProviderProperties2.hashCode(), comAdobeGraniteAuthOauthProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties1 = OASComAdobeGraniteAuthOauthProviderP.getExample();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties2 = OASComAdobeGraniteAuthOauthProviderP.getExample();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties3 = new OASComAdobeGraniteAuthOauthProviderP();
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties4 = new OASComAdobeGraniteAuthOauthProviderP();

        System.assert(comAdobeGraniteAuthOauthProviderProperties1.equals(comAdobeGraniteAuthOauthProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthProviderProperties3.equals(comAdobeGraniteAuthOauthProviderProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthProviderProperties1.hashCode(), comAdobeGraniteAuthOauthProviderProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthProviderProperties3.hashCode(), comAdobeGraniteAuthOauthProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthProviderP comAdobeGraniteAuthOauthProviderProperties = new OASComAdobeGraniteAuthOauthProviderP();
        Map<String, String> x-property-mappings = comAdobeGraniteAuthOauthProviderProperties.getx-property-mappings();
        System.assertEquals('oauthConfigId', x-property-mappings.get('oauth.config.id'));
        System.assertEquals('oauthClientId', x-property-mappings.get('oauth.client.id'));
        System.assertEquals('oauthClientSecret', x-property-mappings.get('oauth.client.secret'));
        System.assertEquals('oauthScope', x-property-mappings.get('oauth.scope'));
        System.assertEquals('oauthConfigProviderId', x-property-mappings.get('oauth.config.provider.id'));
        System.assertEquals('oauthCreateUsers', x-property-mappings.get('oauth.create.users'));
        System.assertEquals('oauthUseridProperty', x-property-mappings.get('oauth.userid.property'));
        System.assertEquals('forceStrictUsernameMatching', x-property-mappings.get('force.strict.username.matching'));
        System.assertEquals('oauthEncodeUserids', x-property-mappings.get('oauth.encode.userids'));
        System.assertEquals('oauthHashUserids', x-property-mappings.get('oauth.hash.userids'));
        System.assertEquals('oauthCallBackUrl', x-property-mappings.get('oauth.callBackUrl'));
        System.assertEquals('oauthAccessTokenPersist', x-property-mappings.get('oauth.access.token.persist'));
        System.assertEquals('oauthAccessTokenPersistCookie', x-property-mappings.get('oauth.access.token.persist.cookie'));
        System.assertEquals('oauthCsrfStateProtection', x-property-mappings.get('oauth.csrf.state.protection'));
        System.assertEquals('oauthRedirectRequestParams', x-property-mappings.get('oauth.redirect.request.params'));
        System.assertEquals('oauthConfigSiblingsAllow', x-property-mappings.get('oauth.config.siblings.allow'));
    }
}
