@isTest
private class OASComAdobeGraniteOauthServerAuthImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1 = OASComAdobeGraniteOauthServerAuthImp.getExample();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2 = comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1;
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3 = new OASComAdobeGraniteOauthServerAuthImp();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4 = comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3;

        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1 = OASComAdobeGraniteOauthServerAuthImp.getExample();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2 = OASComAdobeGraniteOauthServerAuthImp.getExample();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3 = new OASComAdobeGraniteOauthServerAuthImp();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4 = new OASComAdobeGraniteOauthServerAuthImp();

        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1 = OASComAdobeGraniteOauthServerAuthImp.getExample();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2 = new OASComAdobeGraniteOauthServerAuthImp();

        System.assertEquals(false, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1 = OASComAdobeGraniteOauthServerAuthImp.getExample();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2 = new OASComAdobeGraniteOauthServerAuthImp();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3;

        System.assertEquals(false, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3));
        System.assertEquals(false, comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1 = OASComAdobeGraniteOauthServerAuthImp.getExample();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2 = new OASComAdobeGraniteOauthServerAuthImp();

        System.assertEquals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.hashCode(), comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.hashCode());
        System.assertEquals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2.hashCode(), comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1 = OASComAdobeGraniteOauthServerAuthImp.getExample();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2 = OASComAdobeGraniteOauthServerAuthImp.getExample();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3 = new OASComAdobeGraniteOauthServerAuthImp();
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4 = new OASComAdobeGraniteOauthServerAuthImp();

        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2));
        System.assert(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3.equals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4));
        System.assertEquals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties1.hashCode(), comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties2.hashCode());
        System.assertEquals(comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties3.hashCode(), comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteOauthServerAuthImp comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties = new OASComAdobeGraniteOauthServerAuthImp();
        Map<String, String> propertyMappings = comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.getPropertyMappings();
        System.assertEquals('jaasControlFlag', propertyMappings.get('jaas.controlFlag'));
        System.assertEquals('jaasRealmName', propertyMappings.get('jaas.realmName'));
        System.assertEquals('jaasRanking', propertyMappings.get('jaas.ranking'));
        System.assertEquals('oauthOfflineValidation', propertyMappings.get('oauth.offline.validation'));
    }
}
