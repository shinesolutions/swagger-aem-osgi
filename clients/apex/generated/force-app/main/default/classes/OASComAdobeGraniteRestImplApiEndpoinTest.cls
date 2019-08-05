@isTest
private class OASComAdobeGraniteRestImplApiEndpoinTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1 = OASComAdobeGraniteRestImplApiEndpoin.getExample();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2 = comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1;
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3 = new OASComAdobeGraniteRestImplApiEndpoin();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4 = comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3;

        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1 = OASComAdobeGraniteRestImplApiEndpoin.getExample();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2 = OASComAdobeGraniteRestImplApiEndpoin.getExample();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3 = new OASComAdobeGraniteRestImplApiEndpoin();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4 = new OASComAdobeGraniteRestImplApiEndpoin();

        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1 = OASComAdobeGraniteRestImplApiEndpoin.getExample();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2 = new OASComAdobeGraniteRestImplApiEndpoin();

        System.assertEquals(false, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1 = OASComAdobeGraniteRestImplApiEndpoin.getExample();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2 = new OASComAdobeGraniteRestImplApiEndpoin();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3;

        System.assertEquals(false, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3));
        System.assertEquals(false, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1 = OASComAdobeGraniteRestImplApiEndpoin.getExample();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2 = new OASComAdobeGraniteRestImplApiEndpoin();

        System.assertEquals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.hashCode(), comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2.hashCode(), comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1 = OASComAdobeGraniteRestImplApiEndpoin.getExample();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2 = OASComAdobeGraniteRestImplApiEndpoin.getExample();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3 = new OASComAdobeGraniteRestImplApiEndpoin();
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4 = new OASComAdobeGraniteRestImplApiEndpoin();

        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2));
        System.assert(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4));
        System.assertEquals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties1.hashCode(), comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties3.hashCode(), comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRestImplApiEndpoin comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties = new OASComAdobeGraniteRestImplApiEndpoin();
        Map<String, String> propertyMappings = comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.getPropertyMappings();
        System.assertEquals('providerRoots', propertyMappings.get('provider.roots'));
    }
}
