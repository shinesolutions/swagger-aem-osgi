@isTest
private class OASComAdobeGraniteAuthImsImplIMSProvTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties1 = OASComAdobeGraniteAuthImsImplIMSProv.getExample();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties2 = comAdobeGraniteAuthImsImplIMSProviderImplProperties1;
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties3 = new OASComAdobeGraniteAuthImsImplIMSProv();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties4 = comAdobeGraniteAuthImsImplIMSProviderImplProperties3;

        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties1.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties2.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties1.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties3.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties4));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties4.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties3));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties3.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties1 = OASComAdobeGraniteAuthImsImplIMSProv.getExample();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties2 = OASComAdobeGraniteAuthImsImplIMSProv.getExample();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties3 = new OASComAdobeGraniteAuthImsImplIMSProv();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties4 = new OASComAdobeGraniteAuthImsImplIMSProv();

        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties1.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties2.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties3.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties4));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties4.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties1 = OASComAdobeGraniteAuthImsImplIMSProv.getExample();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties2 = new OASComAdobeGraniteAuthImsImplIMSProv();

        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties1 = OASComAdobeGraniteAuthImsImplIMSProv.getExample();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties2 = new OASComAdobeGraniteAuthImsImplIMSProv();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties3;

        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSProviderImplProperties1.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties3));
        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSProviderImplProperties2.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties1 = OASComAdobeGraniteAuthImsImplIMSProv.getExample();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties2 = new OASComAdobeGraniteAuthImsImplIMSProv();

        System.assertEquals(comAdobeGraniteAuthImsImplIMSProviderImplProperties1.hashCode(), comAdobeGraniteAuthImsImplIMSProviderImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplIMSProviderImplProperties2.hashCode(), comAdobeGraniteAuthImsImplIMSProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties1 = OASComAdobeGraniteAuthImsImplIMSProv.getExample();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties2 = OASComAdobeGraniteAuthImsImplIMSProv.getExample();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties3 = new OASComAdobeGraniteAuthImsImplIMSProv();
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties4 = new OASComAdobeGraniteAuthImsImplIMSProv();

        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties1.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSProviderImplProperties3.equals(comAdobeGraniteAuthImsImplIMSProviderImplProperties4));
        System.assertEquals(comAdobeGraniteAuthImsImplIMSProviderImplProperties1.hashCode(), comAdobeGraniteAuthImsImplIMSProviderImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplIMSProviderImplProperties3.hashCode(), comAdobeGraniteAuthImsImplIMSProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthImsImplIMSProv comAdobeGraniteAuthImsImplIMSProviderImplProperties = new OASComAdobeGraniteAuthImsImplIMSProv();
        Map<String, String> propertyMappings = comAdobeGraniteAuthImsImplIMSProviderImplProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
        System.assertEquals('oauthProviderImsAuthorizationUrl', propertyMappings.get('oauth.provider.ims.authorization.url'));
        System.assertEquals('oauthProviderImsTokenUrl', propertyMappings.get('oauth.provider.ims.token.url'));
        System.assertEquals('oauthProviderImsProfileUrl', propertyMappings.get('oauth.provider.ims.profile.url'));
        System.assertEquals('oauthProviderImsExtendedDetailsUrls', propertyMappings.get('oauth.provider.ims.extended.details.urls'));
        System.assertEquals('oauthProviderImsValidateTokenUrl', propertyMappings.get('oauth.provider.ims.validate.token.url'));
        System.assertEquals('oauthProviderImsSessionProperty', propertyMappings.get('oauth.provider.ims.session.property'));
        System.assertEquals('oauthProviderImsServiceTokenClientId', propertyMappings.get('oauth.provider.ims.service.token.client.id'));
        System.assertEquals('oauthProviderImsServiceTokenClientSecret', propertyMappings.get('oauth.provider.ims.service.token.client.secret'));
        System.assertEquals('oauthProviderImsServiceToken', propertyMappings.get('oauth.provider.ims.service.token'));
        System.assertEquals('imsOrgRef', propertyMappings.get('ims.org.ref'));
        System.assertEquals('imsGroupMapping', propertyMappings.get('ims.group.mapping'));
        System.assertEquals('oauthProviderImsOnlyLicenseGroup', propertyMappings.get('oauth.provider.ims.only.license.group'));
    }
}
