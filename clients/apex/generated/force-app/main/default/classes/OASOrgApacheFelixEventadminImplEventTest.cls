@isTest
private class OASOrgApacheFelixEventadminImplEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties1 = OASOrgApacheFelixEventadminImplEvent.getExample();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties2 = orgApacheFelixEventadminImplEventAdminProperties1;
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties3 = new OASOrgApacheFelixEventadminImplEvent();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties4 = orgApacheFelixEventadminImplEventAdminProperties3;

        System.assert(orgApacheFelixEventadminImplEventAdminProperties1.equals(orgApacheFelixEventadminImplEventAdminProperties2));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties2.equals(orgApacheFelixEventadminImplEventAdminProperties1));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties1.equals(orgApacheFelixEventadminImplEventAdminProperties1));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties3.equals(orgApacheFelixEventadminImplEventAdminProperties4));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties4.equals(orgApacheFelixEventadminImplEventAdminProperties3));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties3.equals(orgApacheFelixEventadminImplEventAdminProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties1 = OASOrgApacheFelixEventadminImplEvent.getExample();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties2 = OASOrgApacheFelixEventadminImplEvent.getExample();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties3 = new OASOrgApacheFelixEventadminImplEvent();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties4 = new OASOrgApacheFelixEventadminImplEvent();

        System.assert(orgApacheFelixEventadminImplEventAdminProperties1.equals(orgApacheFelixEventadminImplEventAdminProperties2));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties2.equals(orgApacheFelixEventadminImplEventAdminProperties1));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties3.equals(orgApacheFelixEventadminImplEventAdminProperties4));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties4.equals(orgApacheFelixEventadminImplEventAdminProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties1 = OASOrgApacheFelixEventadminImplEvent.getExample();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties2 = new OASOrgApacheFelixEventadminImplEvent();

        System.assertEquals(false, orgApacheFelixEventadminImplEventAdminProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixEventadminImplEventAdminProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties1 = OASOrgApacheFelixEventadminImplEvent.getExample();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties2 = new OASOrgApacheFelixEventadminImplEvent();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties3;

        System.assertEquals(false, orgApacheFelixEventadminImplEventAdminProperties1.equals(orgApacheFelixEventadminImplEventAdminProperties3));
        System.assertEquals(false, orgApacheFelixEventadminImplEventAdminProperties2.equals(orgApacheFelixEventadminImplEventAdminProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties1 = OASOrgApacheFelixEventadminImplEvent.getExample();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties2 = new OASOrgApacheFelixEventadminImplEvent();

        System.assertEquals(orgApacheFelixEventadminImplEventAdminProperties1.hashCode(), orgApacheFelixEventadminImplEventAdminProperties1.hashCode());
        System.assertEquals(orgApacheFelixEventadminImplEventAdminProperties2.hashCode(), orgApacheFelixEventadminImplEventAdminProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties1 = OASOrgApacheFelixEventadminImplEvent.getExample();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties2 = OASOrgApacheFelixEventadminImplEvent.getExample();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties3 = new OASOrgApacheFelixEventadminImplEvent();
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties4 = new OASOrgApacheFelixEventadminImplEvent();

        System.assert(orgApacheFelixEventadminImplEventAdminProperties1.equals(orgApacheFelixEventadminImplEventAdminProperties2));
        System.assert(orgApacheFelixEventadminImplEventAdminProperties3.equals(orgApacheFelixEventadminImplEventAdminProperties4));
        System.assertEquals(orgApacheFelixEventadminImplEventAdminProperties1.hashCode(), orgApacheFelixEventadminImplEventAdminProperties2.hashCode());
        System.assertEquals(orgApacheFelixEventadminImplEventAdminProperties3.hashCode(), orgApacheFelixEventadminImplEventAdminProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixEventadminImplEvent orgApacheFelixEventadminImplEventAdminProperties = new OASOrgApacheFelixEventadminImplEvent();
        Map<String, String> propertyMappings = orgApacheFelixEventadminImplEventAdminProperties.getPropertyMappings();
        System.assertEquals('orgApacheFelixEventadminThreadPoolSize', propertyMappings.get('org.apache.felix.eventadmin.ThreadPoolSize'));
        System.assertEquals('orgApacheFelixEventadminAsyncToSyncThreadRatio', propertyMappings.get('org.apache.felix.eventadmin.AsyncToSyncThreadRatio'));
        System.assertEquals('orgApacheFelixEventadminTimeout', propertyMappings.get('org.apache.felix.eventadmin.Timeout'));
        System.assertEquals('orgApacheFelixEventadminRequireTopic', propertyMappings.get('org.apache.felix.eventadmin.RequireTopic'));
        System.assertEquals('orgApacheFelixEventadminIgnoreTimeout', propertyMappings.get('org.apache.felix.eventadmin.IgnoreTimeout'));
        System.assertEquals('orgApacheFelixEventadminIgnoreTopic', propertyMappings.get('org.apache.felix.eventadmin.IgnoreTopic'));
    }
}
