@isTest
private class OASComAdobeGraniteCompatrouterImplRoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties1 = OASComAdobeGraniteCompatrouterImplRo.getExample();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties2 = comAdobeGraniteCompatrouterImplRoutingConfigProperties1;
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties3 = new OASComAdobeGraniteCompatrouterImplRo();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties4 = comAdobeGraniteCompatrouterImplRoutingConfigProperties3;

        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties1.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties2));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties2.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties1));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties1.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties1));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties3.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties4));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties4.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties3));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties3.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties1 = OASComAdobeGraniteCompatrouterImplRo.getExample();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties2 = OASComAdobeGraniteCompatrouterImplRo.getExample();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties3 = new OASComAdobeGraniteCompatrouterImplRo();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties4 = new OASComAdobeGraniteCompatrouterImplRo();

        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties1.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties2));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties2.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties1));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties3.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties4));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties4.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties1 = OASComAdobeGraniteCompatrouterImplRo.getExample();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties2 = new OASComAdobeGraniteCompatrouterImplRo();

        System.assertEquals(false, comAdobeGraniteCompatrouterImplRoutingConfigProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteCompatrouterImplRoutingConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties1 = OASComAdobeGraniteCompatrouterImplRo.getExample();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties2 = new OASComAdobeGraniteCompatrouterImplRo();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties3;

        System.assertEquals(false, comAdobeGraniteCompatrouterImplRoutingConfigProperties1.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties3));
        System.assertEquals(false, comAdobeGraniteCompatrouterImplRoutingConfigProperties2.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties1 = OASComAdobeGraniteCompatrouterImplRo.getExample();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties2 = new OASComAdobeGraniteCompatrouterImplRo();

        System.assertEquals(comAdobeGraniteCompatrouterImplRoutingConfigProperties1.hashCode(), comAdobeGraniteCompatrouterImplRoutingConfigProperties1.hashCode());
        System.assertEquals(comAdobeGraniteCompatrouterImplRoutingConfigProperties2.hashCode(), comAdobeGraniteCompatrouterImplRoutingConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties1 = OASComAdobeGraniteCompatrouterImplRo.getExample();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties2 = OASComAdobeGraniteCompatrouterImplRo.getExample();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties3 = new OASComAdobeGraniteCompatrouterImplRo();
        OASComAdobeGraniteCompatrouterImplRo comAdobeGraniteCompatrouterImplRoutingConfigProperties4 = new OASComAdobeGraniteCompatrouterImplRo();

        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties1.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties2));
        System.assert(comAdobeGraniteCompatrouterImplRoutingConfigProperties3.equals(comAdobeGraniteCompatrouterImplRoutingConfigProperties4));
        System.assertEquals(comAdobeGraniteCompatrouterImplRoutingConfigProperties1.hashCode(), comAdobeGraniteCompatrouterImplRoutingConfigProperties2.hashCode());
        System.assertEquals(comAdobeGraniteCompatrouterImplRoutingConfigProperties3.hashCode(), comAdobeGraniteCompatrouterImplRoutingConfigProperties4.hashCode());
    }
}
