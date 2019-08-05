@isTest
private class OASComAdobeGraniteAuthOauthAccesstokTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties1 = OASComAdobeGraniteAuthOauthAccesstok.getExample();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties2 = comAdobeGraniteAuthOauthAccesstokenProviderProperties1;
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties3 = new OASComAdobeGraniteAuthOauthAccesstok();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties4 = comAdobeGraniteAuthOauthAccesstokenProviderProperties3;

        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties1.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties2.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties1.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties3.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties4));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties4.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties3));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties3.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties1 = OASComAdobeGraniteAuthOauthAccesstok.getExample();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties2 = OASComAdobeGraniteAuthOauthAccesstok.getExample();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties3 = new OASComAdobeGraniteAuthOauthAccesstok();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties4 = new OASComAdobeGraniteAuthOauthAccesstok();

        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties1.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties2.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties1));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties3.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties4));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties4.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties1 = OASComAdobeGraniteAuthOauthAccesstok.getExample();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties2 = new OASComAdobeGraniteAuthOauthAccesstok();

        System.assertEquals(false, comAdobeGraniteAuthOauthAccesstokenProviderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthAccesstokenProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties1 = OASComAdobeGraniteAuthOauthAccesstok.getExample();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties2 = new OASComAdobeGraniteAuthOauthAccesstok();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties3;

        System.assertEquals(false, comAdobeGraniteAuthOauthAccesstokenProviderProperties1.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties3));
        System.assertEquals(false, comAdobeGraniteAuthOauthAccesstokenProviderProperties2.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties1 = OASComAdobeGraniteAuthOauthAccesstok.getExample();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties2 = new OASComAdobeGraniteAuthOauthAccesstok();

        System.assertEquals(comAdobeGraniteAuthOauthAccesstokenProviderProperties1.hashCode(), comAdobeGraniteAuthOauthAccesstokenProviderProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthAccesstokenProviderProperties2.hashCode(), comAdobeGraniteAuthOauthAccesstokenProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties1 = OASComAdobeGraniteAuthOauthAccesstok.getExample();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties2 = OASComAdobeGraniteAuthOauthAccesstok.getExample();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties3 = new OASComAdobeGraniteAuthOauthAccesstok();
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties4 = new OASComAdobeGraniteAuthOauthAccesstok();

        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties1.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties2));
        System.assert(comAdobeGraniteAuthOauthAccesstokenProviderProperties3.equals(comAdobeGraniteAuthOauthAccesstokenProviderProperties4));
        System.assertEquals(comAdobeGraniteAuthOauthAccesstokenProviderProperties1.hashCode(), comAdobeGraniteAuthOauthAccesstokenProviderProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthAccesstokenProviderProperties3.hashCode(), comAdobeGraniteAuthOauthAccesstokenProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthOauthAccesstok comAdobeGraniteAuthOauthAccesstokenProviderProperties = new OASComAdobeGraniteAuthOauthAccesstok();
        Map<String, String> propertyMappings = comAdobeGraniteAuthOauthAccesstokenProviderProperties.getPropertyMappings();
        System.assertEquals('authTokenProviderTitle', propertyMappings.get('auth.token.provider.title'));
        System.assertEquals('authTokenProviderDefaultClaims', propertyMappings.get('auth.token.provider.default.claims'));
        System.assertEquals('authTokenProviderEndpoint', propertyMappings.get('auth.token.provider.endpoint'));
        System.assertEquals('authAccessTokenRequest', propertyMappings.get('auth.access.token.request'));
        System.assertEquals('authTokenProviderKeypairAlias', propertyMappings.get('auth.token.provider.keypair.alias'));
        System.assertEquals('authTokenProviderConnTimeout', propertyMappings.get('auth.token.provider.conn.timeout'));
        System.assertEquals('authTokenProviderSoTimeout', propertyMappings.get('auth.token.provider.so.timeout'));
        System.assertEquals('authTokenProviderClientId', propertyMappings.get('auth.token.provider.client.id'));
        System.assertEquals('authTokenProviderScope', propertyMappings.get('auth.token.provider.scope'));
        System.assertEquals('authTokenProviderReuseAccessToken', propertyMappings.get('auth.token.provider.reuse.access.token'));
        System.assertEquals('authTokenProviderRelaxedSsl', propertyMappings.get('auth.token.provider.relaxed.ssl'));
        System.assertEquals('tokenRequestCustomizerType', propertyMappings.get('token.request.customizer.type'));
        System.assertEquals('authTokenValidatorType', propertyMappings.get('auth.token.validator.type'));
    }
}
