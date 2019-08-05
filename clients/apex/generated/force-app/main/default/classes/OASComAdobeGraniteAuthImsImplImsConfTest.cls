@isTest
private class OASComAdobeGraniteAuthImsImplImsConfTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1 = OASComAdobeGraniteAuthImsImplImsConf.getExample();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2 = comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1;
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3 = new OASComAdobeGraniteAuthImsImplImsConf();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4 = comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3;

        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1 = OASComAdobeGraniteAuthImsImplImsConf.getExample();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2 = OASComAdobeGraniteAuthImsImplImsConf.getExample();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3 = new OASComAdobeGraniteAuthImsImplImsConf();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4 = new OASComAdobeGraniteAuthImsImplImsConf();

        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1 = OASComAdobeGraniteAuthImsImplImsConf.getExample();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2 = new OASComAdobeGraniteAuthImsImplImsConf();

        System.assertEquals(false, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1 = OASComAdobeGraniteAuthImsImplImsConf.getExample();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2 = new OASComAdobeGraniteAuthImsImplImsConf();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3;

        System.assertEquals(false, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3));
        System.assertEquals(false, comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1 = OASComAdobeGraniteAuthImsImplImsConf.getExample();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2 = new OASComAdobeGraniteAuthImsImplImsConf();

        System.assertEquals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.hashCode(), comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2.hashCode(), comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1 = OASComAdobeGraniteAuthImsImplImsConf.getExample();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2 = OASComAdobeGraniteAuthImsImplImsConf.getExample();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3 = new OASComAdobeGraniteAuthImsImplImsConf();
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4 = new OASComAdobeGraniteAuthImsImplImsConf();

        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3.equals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4));
        System.assertEquals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties1.hashCode(), comAdobeGraniteAuthImsImplImsConfigProviderImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplImsConfigProviderImplProperties3.hashCode(), comAdobeGraniteAuthImsImplImsConfigProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthImsImplImsConf comAdobeGraniteAuthImsImplImsConfigProviderImplProperties = new OASComAdobeGraniteAuthImsImplImsConf();
        Map<String, String> propertyMappings = comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.getPropertyMappings();
        System.assertEquals('oauthConfigmanagerImsConfigid', propertyMappings.get('oauth.configmanager.ims.configid'));
        System.assertEquals('imsOwningEntity', propertyMappings.get('ims.owningEntity'));
        System.assertEquals('aemInstanceId', propertyMappings.get('aem.instanceId'));
        System.assertEquals('imsServiceCode', propertyMappings.get('ims.serviceCode'));
    }
}
