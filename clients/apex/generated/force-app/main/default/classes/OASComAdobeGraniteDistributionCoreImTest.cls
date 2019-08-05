@isTest
private class OASComAdobeGraniteDistributionCoreImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1 = OASComAdobeGraniteDistributionCoreIm.getExample();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2 = comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1;
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3 = new OASComAdobeGraniteDistributionCoreIm();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4 = comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3;

        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1 = OASComAdobeGraniteDistributionCoreIm.getExample();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2 = OASComAdobeGraniteDistributionCoreIm.getExample();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3 = new OASComAdobeGraniteDistributionCoreIm();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4 = new OASComAdobeGraniteDistributionCoreIm();

        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1 = OASComAdobeGraniteDistributionCoreIm.getExample();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2 = new OASComAdobeGraniteDistributionCoreIm();

        System.assertEquals(false, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1 = OASComAdobeGraniteDistributionCoreIm.getExample();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2 = new OASComAdobeGraniteDistributionCoreIm();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3;

        System.assertEquals(false, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3));
        System.assertEquals(false, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1 = OASComAdobeGraniteDistributionCoreIm.getExample();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2 = new OASComAdobeGraniteDistributionCoreIm();

        System.assertEquals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.hashCode(), comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.hashCode());
        System.assertEquals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2.hashCode(), comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1 = OASComAdobeGraniteDistributionCoreIm.getExample();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2 = OASComAdobeGraniteDistributionCoreIm.getExample();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3 = new OASComAdobeGraniteDistributionCoreIm();
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4 = new OASComAdobeGraniteDistributionCoreIm();

        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2));
        System.assert(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4));
        System.assertEquals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties1.hashCode(), comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties2.hashCode());
        System.assertEquals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties3.hashCode(), comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteDistributionCoreIm comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties = new OASComAdobeGraniteDistributionCoreIm();
        Map<String, String> propertyMappings = comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.getPropertyMappings();
        System.assertEquals('accessTokenProviderTarget', propertyMappings.get('accessTokenProvider.target'));
    }
}
