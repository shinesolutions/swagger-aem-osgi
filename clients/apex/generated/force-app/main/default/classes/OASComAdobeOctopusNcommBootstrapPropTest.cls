@isTest
private class OASComAdobeOctopusNcommBootstrapPropTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties1 = OASComAdobeOctopusNcommBootstrapProp.getExample();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties2 = comAdobeOctopusNcommBootstrapProperties1;
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties3 = new OASComAdobeOctopusNcommBootstrapProp();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties4 = comAdobeOctopusNcommBootstrapProperties3;

        System.assert(comAdobeOctopusNcommBootstrapProperties1.equals(comAdobeOctopusNcommBootstrapProperties2));
        System.assert(comAdobeOctopusNcommBootstrapProperties2.equals(comAdobeOctopusNcommBootstrapProperties1));
        System.assert(comAdobeOctopusNcommBootstrapProperties1.equals(comAdobeOctopusNcommBootstrapProperties1));
        System.assert(comAdobeOctopusNcommBootstrapProperties3.equals(comAdobeOctopusNcommBootstrapProperties4));
        System.assert(comAdobeOctopusNcommBootstrapProperties4.equals(comAdobeOctopusNcommBootstrapProperties3));
        System.assert(comAdobeOctopusNcommBootstrapProperties3.equals(comAdobeOctopusNcommBootstrapProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties1 = OASComAdobeOctopusNcommBootstrapProp.getExample();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties2 = OASComAdobeOctopusNcommBootstrapProp.getExample();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties3 = new OASComAdobeOctopusNcommBootstrapProp();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties4 = new OASComAdobeOctopusNcommBootstrapProp();

        System.assert(comAdobeOctopusNcommBootstrapProperties1.equals(comAdobeOctopusNcommBootstrapProperties2));
        System.assert(comAdobeOctopusNcommBootstrapProperties2.equals(comAdobeOctopusNcommBootstrapProperties1));
        System.assert(comAdobeOctopusNcommBootstrapProperties3.equals(comAdobeOctopusNcommBootstrapProperties4));
        System.assert(comAdobeOctopusNcommBootstrapProperties4.equals(comAdobeOctopusNcommBootstrapProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties1 = OASComAdobeOctopusNcommBootstrapProp.getExample();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties2 = new OASComAdobeOctopusNcommBootstrapProp();

        System.assertEquals(false, comAdobeOctopusNcommBootstrapProperties1.equals('foo'));
        System.assertEquals(false, comAdobeOctopusNcommBootstrapProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties1 = OASComAdobeOctopusNcommBootstrapProp.getExample();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties2 = new OASComAdobeOctopusNcommBootstrapProp();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties3;

        System.assertEquals(false, comAdobeOctopusNcommBootstrapProperties1.equals(comAdobeOctopusNcommBootstrapProperties3));
        System.assertEquals(false, comAdobeOctopusNcommBootstrapProperties2.equals(comAdobeOctopusNcommBootstrapProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties1 = OASComAdobeOctopusNcommBootstrapProp.getExample();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties2 = new OASComAdobeOctopusNcommBootstrapProp();

        System.assertEquals(comAdobeOctopusNcommBootstrapProperties1.hashCode(), comAdobeOctopusNcommBootstrapProperties1.hashCode());
        System.assertEquals(comAdobeOctopusNcommBootstrapProperties2.hashCode(), comAdobeOctopusNcommBootstrapProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties1 = OASComAdobeOctopusNcommBootstrapProp.getExample();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties2 = OASComAdobeOctopusNcommBootstrapProp.getExample();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties3 = new OASComAdobeOctopusNcommBootstrapProp();
        OASComAdobeOctopusNcommBootstrapProp comAdobeOctopusNcommBootstrapProperties4 = new OASComAdobeOctopusNcommBootstrapProp();

        System.assert(comAdobeOctopusNcommBootstrapProperties1.equals(comAdobeOctopusNcommBootstrapProperties2));
        System.assert(comAdobeOctopusNcommBootstrapProperties3.equals(comAdobeOctopusNcommBootstrapProperties4));
        System.assertEquals(comAdobeOctopusNcommBootstrapProperties1.hashCode(), comAdobeOctopusNcommBootstrapProperties2.hashCode());
        System.assertEquals(comAdobeOctopusNcommBootstrapProperties3.hashCode(), comAdobeOctopusNcommBootstrapProperties4.hashCode());
    }
}
