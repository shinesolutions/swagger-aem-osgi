@isTest
private class OASComAdobeGraniteCompatrouterImplCoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1 = OASComAdobeGraniteCompatrouterImplCo.getExample();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2 = comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1;
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3 = new OASComAdobeGraniteCompatrouterImplCo();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4 = comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3;

        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1 = OASComAdobeGraniteCompatrouterImplCo.getExample();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2 = OASComAdobeGraniteCompatrouterImplCo.getExample();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3 = new OASComAdobeGraniteCompatrouterImplCo();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4 = new OASComAdobeGraniteCompatrouterImplCo();

        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1 = OASComAdobeGraniteCompatrouterImplCo.getExample();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2 = new OASComAdobeGraniteCompatrouterImplCo();

        System.assertEquals(false, comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1 = OASComAdobeGraniteCompatrouterImplCo.getExample();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2 = new OASComAdobeGraniteCompatrouterImplCo();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3;

        System.assertEquals(false, comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3));
        System.assertEquals(false, comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1 = OASComAdobeGraniteCompatrouterImplCo.getExample();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2 = new OASComAdobeGraniteCompatrouterImplCo();

        System.assertEquals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.hashCode(), comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2.hashCode(), comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1 = OASComAdobeGraniteCompatrouterImplCo.getExample();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2 = OASComAdobeGraniteCompatrouterImplCo.getExample();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3 = new OASComAdobeGraniteCompatrouterImplCo();
        OASComAdobeGraniteCompatrouterImplCo comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4 = new OASComAdobeGraniteCompatrouterImplCo();

        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2));
        System.assert(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3.equals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4));
        System.assertEquals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties1.hashCode(), comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties3.hashCode(), comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties4.hashCode());
    }
}
