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
        Map<String, String> x-property-mappings = comAdobeGraniteAuthImsImplIMSProviderImplProperties.getx-property-mappings();
        System.assertEquals('oauthProviderId', x-property-mappings.get('oauth.provider.id'));
        System.assertEquals('oauthProviderImsAuthorizationUrl', x-property-mappings.get('oauth.provider.ims.authorization.url'));
        System.assertEquals('oauthProviderImsTokenUrl', x-property-mappings.get('oauth.provider.ims.token.url'));
        System.assertEquals('oauthProviderImsProfileUrl', x-property-mappings.get('oauth.provider.ims.profile.url'));
        System.assertEquals('oauthProviderImsExtendedDetailsUrls', x-property-mappings.get('oauth.provider.ims.extended.details.urls'));
        System.assertEquals('oauthProviderImsValidateTokenUrl', x-property-mappings.get('oauth.provider.ims.validate.token.url'));
        System.assertEquals('oauthProviderImsSessionProperty', x-property-mappings.get('oauth.provider.ims.session.property'));
        System.assertEquals('oauthProviderImsServiceTokenClientId', x-property-mappings.get('oauth.provider.ims.service.token.client.id'));
        System.assertEquals('oauthProviderImsServiceTokenClientSecret', x-property-mappings.get('oauth.provider.ims.service.token.client.secret'));
        System.assertEquals('oauthProviderImsServiceToken', x-property-mappings.get('oauth.provider.ims.service.token'));
        System.assertEquals('imsOrgRef', x-property-mappings.get('ims.org.ref'));
        System.assertEquals('imsGroupMapping', x-property-mappings.get('ims.group.mapping'));
        System.assertEquals('oauthProviderImsOnlyLicenseGroup', x-property-mappings.get('oauth.provider.ims.only.license.group'));
    }
}
