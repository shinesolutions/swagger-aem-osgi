@isTest
private class OASComAdobeCqScreensImplJobsDistribuTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1 = OASComAdobeCqScreensImplJobsDistribu.getExample();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2 = comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1;
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3 = new OASComAdobeCqScreensImplJobsDistribu();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4 = comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3;

        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1 = OASComAdobeCqScreensImplJobsDistribu.getExample();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2 = OASComAdobeCqScreensImplJobsDistribu.getExample();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3 = new OASComAdobeCqScreensImplJobsDistribu();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4 = new OASComAdobeCqScreensImplJobsDistribu();

        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1 = OASComAdobeCqScreensImplJobsDistribu.getExample();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2 = new OASComAdobeCqScreensImplJobsDistribu();

        System.assertEquals(false, comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1 = OASComAdobeCqScreensImplJobsDistribu.getExample();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2 = new OASComAdobeCqScreensImplJobsDistribu();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3;

        System.assertEquals(false, comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3));
        System.assertEquals(false, comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1 = OASComAdobeCqScreensImplJobsDistribu.getExample();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2 = new OASComAdobeCqScreensImplJobsDistribu();

        System.assertEquals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.hashCode(), comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2.hashCode(), comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1 = OASComAdobeCqScreensImplJobsDistribu.getExample();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2 = OASComAdobeCqScreensImplJobsDistribu.getExample();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3 = new OASComAdobeCqScreensImplJobsDistribu();
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4 = new OASComAdobeCqScreensImplJobsDistribu();

        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2));
        System.assert(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4));
        System.assertEquals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties1.hashCode(), comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties3.hashCode(), comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScreensImplJobsDistribu comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties = new OASComAdobeCqScreensImplJobsDistribu();
        Map<String, String> propertyMappings = comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
    }
}
