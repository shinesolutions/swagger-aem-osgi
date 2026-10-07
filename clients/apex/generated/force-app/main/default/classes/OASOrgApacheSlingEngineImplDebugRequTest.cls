@isTest
private class OASOrgApacheSlingEngineImplDebugRequTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1 = OASOrgApacheSlingEngineImplDebugRequ.getExample();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2 = orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1;
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3 = new OASOrgApacheSlingEngineImplDebugRequ();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4 = orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3;

        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1 = OASOrgApacheSlingEngineImplDebugRequ.getExample();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2 = OASOrgApacheSlingEngineImplDebugRequ.getExample();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3 = new OASOrgApacheSlingEngineImplDebugRequ();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4 = new OASOrgApacheSlingEngineImplDebugRequ();

        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1 = OASOrgApacheSlingEngineImplDebugRequ.getExample();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2 = new OASOrgApacheSlingEngineImplDebugRequ();

        System.assertEquals(false, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1 = OASOrgApacheSlingEngineImplDebugRequ.getExample();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2 = new OASOrgApacheSlingEngineImplDebugRequ();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3;

        System.assertEquals(false, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3));
        System.assertEquals(false, orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1 = OASOrgApacheSlingEngineImplDebugRequ.getExample();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2 = new OASOrgApacheSlingEngineImplDebugRequ();

        System.assertEquals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.hashCode(), orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.hashCode());
        System.assertEquals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2.hashCode(), orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1 = OASOrgApacheSlingEngineImplDebugRequ.getExample();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2 = OASOrgApacheSlingEngineImplDebugRequ.getExample();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3 = new OASOrgApacheSlingEngineImplDebugRequ();
        OASOrgApacheSlingEngineImplDebugRequ orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4 = new OASOrgApacheSlingEngineImplDebugRequ();

        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2));
        System.assert(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3.equals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4));
        System.assertEquals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties1.hashCode(), orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties2.hashCode());
        System.assertEquals(orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties3.hashCode(), orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties4.hashCode());
    }
}
