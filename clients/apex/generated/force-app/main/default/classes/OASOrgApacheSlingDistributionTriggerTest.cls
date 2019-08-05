@isTest
private class OASOrgApacheSlingDistributionTriggerTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1 = OASOrgApacheSlingDistributionTrigger.getExample();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2 = orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1;
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3 = new OASOrgApacheSlingDistributionTrigger();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4 = orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3;

        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1 = OASOrgApacheSlingDistributionTrigger.getExample();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2 = OASOrgApacheSlingDistributionTrigger.getExample();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3 = new OASOrgApacheSlingDistributionTrigger();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4 = new OASOrgApacheSlingDistributionTrigger();

        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1 = OASOrgApacheSlingDistributionTrigger.getExample();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2 = new OASOrgApacheSlingDistributionTrigger();

        System.assertEquals(false, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1 = OASOrgApacheSlingDistributionTrigger.getExample();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2 = new OASOrgApacheSlingDistributionTrigger();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3;

        System.assertEquals(false, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3));
        System.assertEquals(false, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1 = OASOrgApacheSlingDistributionTrigger.getExample();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2 = new OASOrgApacheSlingDistributionTrigger();

        System.assertEquals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.hashCode(), orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.hashCode());
        System.assertEquals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2.hashCode(), orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1 = OASOrgApacheSlingDistributionTrigger.getExample();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2 = OASOrgApacheSlingDistributionTrigger.getExample();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3 = new OASOrgApacheSlingDistributionTrigger();
        OASOrgApacheSlingDistributionTrigger orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4 = new OASOrgApacheSlingDistributionTrigger();

        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2));
        System.assert(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3.equals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4));
        System.assertEquals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties1.hashCode(), orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties2.hashCode());
        System.assertEquals(orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties3.hashCode(), orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties4.hashCode());
    }
}
