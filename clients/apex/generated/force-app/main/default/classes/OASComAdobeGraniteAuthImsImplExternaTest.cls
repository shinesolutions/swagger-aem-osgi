@isTest
private class OASComAdobeGraniteAuthImsImplExternaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1 = OASComAdobeGraniteAuthImsImplExterna.getExample();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2 = comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1;
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3 = new OASComAdobeGraniteAuthImsImplExterna();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4 = comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3;

        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1 = OASComAdobeGraniteAuthImsImplExterna.getExample();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2 = OASComAdobeGraniteAuthImsImplExterna.getExample();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3 = new OASComAdobeGraniteAuthImsImplExterna();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4 = new OASComAdobeGraniteAuthImsImplExterna();

        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1 = OASComAdobeGraniteAuthImsImplExterna.getExample();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2 = new OASComAdobeGraniteAuthImsImplExterna();

        System.assertEquals(false, comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1 = OASComAdobeGraniteAuthImsImplExterna.getExample();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2 = new OASComAdobeGraniteAuthImsImplExterna();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3;

        System.assertEquals(false, comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3));
        System.assertEquals(false, comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1 = OASComAdobeGraniteAuthImsImplExterna.getExample();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2 = new OASComAdobeGraniteAuthImsImplExterna();

        System.assertEquals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.hashCode(), comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2.hashCode(), comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1 = OASComAdobeGraniteAuthImsImplExterna.getExample();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2 = OASComAdobeGraniteAuthImsImplExterna.getExample();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3 = new OASComAdobeGraniteAuthImsImplExterna();
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4 = new OASComAdobeGraniteAuthImsImplExterna();

        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2));
        System.assert(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3.equals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4));
        System.assertEquals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties1.hashCode(), comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties3.hashCode(), comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthImsImplExterna comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties = new OASComAdobeGraniteAuthImsImplExterna();
        Map<String, String> propertyMappings = comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
    }
}
