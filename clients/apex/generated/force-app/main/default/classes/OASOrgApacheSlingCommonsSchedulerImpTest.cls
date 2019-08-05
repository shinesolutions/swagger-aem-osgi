@isTest
private class OASOrgApacheSlingCommonsSchedulerImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1 = OASOrgApacheSlingCommonsSchedulerImp.getExample();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2 = orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1;
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3 = new OASOrgApacheSlingCommonsSchedulerImp();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4 = orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3;

        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1 = OASOrgApacheSlingCommonsSchedulerImp.getExample();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2 = OASOrgApacheSlingCommonsSchedulerImp.getExample();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3 = new OASOrgApacheSlingCommonsSchedulerImp();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4 = new OASOrgApacheSlingCommonsSchedulerImp();

        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1 = OASOrgApacheSlingCommonsSchedulerImp.getExample();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2 = new OASOrgApacheSlingCommonsSchedulerImp();

        System.assertEquals(false, orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1 = OASOrgApacheSlingCommonsSchedulerImp.getExample();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2 = new OASOrgApacheSlingCommonsSchedulerImp();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3;

        System.assertEquals(false, orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3));
        System.assertEquals(false, orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1 = OASOrgApacheSlingCommonsSchedulerImp.getExample();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2 = new OASOrgApacheSlingCommonsSchedulerImp();

        System.assertEquals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.hashCode(), orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.hashCode());
        System.assertEquals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2.hashCode(), orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1 = OASOrgApacheSlingCommonsSchedulerImp.getExample();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2 = OASOrgApacheSlingCommonsSchedulerImp.getExample();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3 = new OASOrgApacheSlingCommonsSchedulerImp();
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4 = new OASOrgApacheSlingCommonsSchedulerImp();

        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2));
        System.assert(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3.equals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4));
        System.assertEquals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties1.hashCode(), orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties2.hashCode());
        System.assertEquals(orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties3.hashCode(), orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingCommonsSchedulerImp orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties = new OASOrgApacheSlingCommonsSchedulerImp();
        Map<String, String> propertyMappings = orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.getPropertyMappings();
        System.assertEquals('maxQuartzJobDurationAcceptable', propertyMappings.get('max.quartzJob.duration.acceptable'));
    }
}
