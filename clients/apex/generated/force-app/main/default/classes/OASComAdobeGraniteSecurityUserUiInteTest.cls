@isTest
private class OASComAdobeGraniteSecurityUserUiInteTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1 = OASComAdobeGraniteSecurityUserUiInte.getExample();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2 = comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1;
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3 = new OASComAdobeGraniteSecurityUserUiInte();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4 = comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3;

        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1 = OASComAdobeGraniteSecurityUserUiInte.getExample();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2 = OASComAdobeGraniteSecurityUserUiInte.getExample();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3 = new OASComAdobeGraniteSecurityUserUiInte();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4 = new OASComAdobeGraniteSecurityUserUiInte();

        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1 = OASComAdobeGraniteSecurityUserUiInte.getExample();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2 = new OASComAdobeGraniteSecurityUserUiInte();

        System.assertEquals(false, comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1 = OASComAdobeGraniteSecurityUserUiInte.getExample();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2 = new OASComAdobeGraniteSecurityUserUiInte();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3;

        System.assertEquals(false, comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3));
        System.assertEquals(false, comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1 = OASComAdobeGraniteSecurityUserUiInte.getExample();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2 = new OASComAdobeGraniteSecurityUserUiInte();

        System.assertEquals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.hashCode(), comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.hashCode());
        System.assertEquals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2.hashCode(), comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1 = OASComAdobeGraniteSecurityUserUiInte.getExample();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2 = OASComAdobeGraniteSecurityUserUiInte.getExample();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3 = new OASComAdobeGraniteSecurityUserUiInte();
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4 = new OASComAdobeGraniteSecurityUserUiInte();

        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2));
        System.assert(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3.equals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4));
        System.assertEquals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties1.hashCode(), comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties2.hashCode());
        System.assertEquals(comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties3.hashCode(), comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteSecurityUserUiInte comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties = new OASComAdobeGraniteSecurityUserUiInte();
        Map<String, String> propertyMappings = comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
