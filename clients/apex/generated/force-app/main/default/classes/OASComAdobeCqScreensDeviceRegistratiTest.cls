@isTest
private class OASComAdobeCqScreensDeviceRegistratiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1 = OASComAdobeCqScreensDeviceRegistrati.getExample();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2 = comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1;
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3 = new OASComAdobeCqScreensDeviceRegistrati();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4 = comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3;

        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1 = OASComAdobeCqScreensDeviceRegistrati.getExample();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2 = OASComAdobeCqScreensDeviceRegistrati.getExample();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3 = new OASComAdobeCqScreensDeviceRegistrati();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4 = new OASComAdobeCqScreensDeviceRegistrati();

        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1 = OASComAdobeCqScreensDeviceRegistrati.getExample();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2 = new OASComAdobeCqScreensDeviceRegistrati();

        System.assertEquals(false, comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1 = OASComAdobeCqScreensDeviceRegistrati.getExample();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2 = new OASComAdobeCqScreensDeviceRegistrati();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3;

        System.assertEquals(false, comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3));
        System.assertEquals(false, comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1 = OASComAdobeCqScreensDeviceRegistrati.getExample();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2 = new OASComAdobeCqScreensDeviceRegistrati();

        System.assertEquals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.hashCode(), comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2.hashCode(), comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1 = OASComAdobeCqScreensDeviceRegistrati.getExample();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2 = OASComAdobeCqScreensDeviceRegistrati.getExample();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3 = new OASComAdobeCqScreensDeviceRegistrati();
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4 = new OASComAdobeCqScreensDeviceRegistrati();

        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2));
        System.assert(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3.equals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4));
        System.assertEquals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties1.hashCode(), comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties3.hashCode(), comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties4.hashCode());
    }
}
