@isTest
private class OASComAdobeGraniteResourcestatusImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1 = OASComAdobeGraniteResourcestatusImpl.getExample();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2 = comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1;
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3 = new OASComAdobeGraniteResourcestatusImpl();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4 = comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3;

        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1 = OASComAdobeGraniteResourcestatusImpl.getExample();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2 = OASComAdobeGraniteResourcestatusImpl.getExample();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3 = new OASComAdobeGraniteResourcestatusImpl();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4 = new OASComAdobeGraniteResourcestatusImpl();

        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1 = OASComAdobeGraniteResourcestatusImpl.getExample();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2 = new OASComAdobeGraniteResourcestatusImpl();

        System.assertEquals(false, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1 = OASComAdobeGraniteResourcestatusImpl.getExample();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2 = new OASComAdobeGraniteResourcestatusImpl();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3;

        System.assertEquals(false, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3));
        System.assertEquals(false, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1 = OASComAdobeGraniteResourcestatusImpl.getExample();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2 = new OASComAdobeGraniteResourcestatusImpl();

        System.assertEquals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.hashCode(), comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.hashCode());
        System.assertEquals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2.hashCode(), comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1 = OASComAdobeGraniteResourcestatusImpl.getExample();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2 = OASComAdobeGraniteResourcestatusImpl.getExample();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3 = new OASComAdobeGraniteResourcestatusImpl();
        OASComAdobeGraniteResourcestatusImpl comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4 = new OASComAdobeGraniteResourcestatusImpl();

        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2));
        System.assert(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3.equals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4));
        System.assertEquals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties1.hashCode(), comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties2.hashCode());
        System.assertEquals(comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties3.hashCode(), comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties4.hashCode());
    }
}
