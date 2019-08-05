@isTest
private class OASComAdobeGraniteConfImplRuntimeAwaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1 = OASComAdobeGraniteConfImplRuntimeAwa.getExample();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2 = comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1;
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3 = new OASComAdobeGraniteConfImplRuntimeAwa();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4 = comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3;

        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1 = OASComAdobeGraniteConfImplRuntimeAwa.getExample();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2 = OASComAdobeGraniteConfImplRuntimeAwa.getExample();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3 = new OASComAdobeGraniteConfImplRuntimeAwa();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4 = new OASComAdobeGraniteConfImplRuntimeAwa();

        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1 = OASComAdobeGraniteConfImplRuntimeAwa.getExample();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2 = new OASComAdobeGraniteConfImplRuntimeAwa();

        System.assertEquals(false, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1 = OASComAdobeGraniteConfImplRuntimeAwa.getExample();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2 = new OASComAdobeGraniteConfImplRuntimeAwa();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3;

        System.assertEquals(false, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3));
        System.assertEquals(false, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1 = OASComAdobeGraniteConfImplRuntimeAwa.getExample();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2 = new OASComAdobeGraniteConfImplRuntimeAwa();

        System.assertEquals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.hashCode(), comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.hashCode());
        System.assertEquals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2.hashCode(), comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1 = OASComAdobeGraniteConfImplRuntimeAwa.getExample();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2 = OASComAdobeGraniteConfImplRuntimeAwa.getExample();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3 = new OASComAdobeGraniteConfImplRuntimeAwa();
        OASComAdobeGraniteConfImplRuntimeAwa comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4 = new OASComAdobeGraniteConfImplRuntimeAwa();

        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2));
        System.assert(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3.equals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4));
        System.assertEquals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties1.hashCode(), comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties2.hashCode());
        System.assertEquals(comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties3.hashCode(), comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties4.hashCode());
    }
}
