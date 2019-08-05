@isTest
private class OASOrgApacheFelixSystemreadySystemReTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties1 = OASOrgApacheFelixSystemreadySystemRe.getExample();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties2 = orgApacheFelixSystemreadySystemReadyMonitorProperties1;
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties3 = new OASOrgApacheFelixSystemreadySystemRe();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties4 = orgApacheFelixSystemreadySystemReadyMonitorProperties3;

        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties1.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties2));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties2.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties1));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties1.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties1));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties3.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties4));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties4.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties3));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties3.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties1 = OASOrgApacheFelixSystemreadySystemRe.getExample();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties2 = OASOrgApacheFelixSystemreadySystemRe.getExample();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties3 = new OASOrgApacheFelixSystemreadySystemRe();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties4 = new OASOrgApacheFelixSystemreadySystemRe();

        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties1.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties2));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties2.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties1));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties3.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties4));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties4.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties1 = OASOrgApacheFelixSystemreadySystemRe.getExample();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties2 = new OASOrgApacheFelixSystemreadySystemRe();

        System.assertEquals(false, orgApacheFelixSystemreadySystemReadyMonitorProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixSystemreadySystemReadyMonitorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties1 = OASOrgApacheFelixSystemreadySystemRe.getExample();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties2 = new OASOrgApacheFelixSystemreadySystemRe();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties3;

        System.assertEquals(false, orgApacheFelixSystemreadySystemReadyMonitorProperties1.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties3));
        System.assertEquals(false, orgApacheFelixSystemreadySystemReadyMonitorProperties2.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties1 = OASOrgApacheFelixSystemreadySystemRe.getExample();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties2 = new OASOrgApacheFelixSystemreadySystemRe();

        System.assertEquals(orgApacheFelixSystemreadySystemReadyMonitorProperties1.hashCode(), orgApacheFelixSystemreadySystemReadyMonitorProperties1.hashCode());
        System.assertEquals(orgApacheFelixSystemreadySystemReadyMonitorProperties2.hashCode(), orgApacheFelixSystemreadySystemReadyMonitorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties1 = OASOrgApacheFelixSystemreadySystemRe.getExample();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties2 = OASOrgApacheFelixSystemreadySystemRe.getExample();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties3 = new OASOrgApacheFelixSystemreadySystemRe();
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties4 = new OASOrgApacheFelixSystemreadySystemRe();

        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties1.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties2));
        System.assert(orgApacheFelixSystemreadySystemReadyMonitorProperties3.equals(orgApacheFelixSystemreadySystemReadyMonitorProperties4));
        System.assertEquals(orgApacheFelixSystemreadySystemReadyMonitorProperties1.hashCode(), orgApacheFelixSystemreadySystemReadyMonitorProperties2.hashCode());
        System.assertEquals(orgApacheFelixSystemreadySystemReadyMonitorProperties3.hashCode(), orgApacheFelixSystemreadySystemReadyMonitorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixSystemreadySystemRe orgApacheFelixSystemreadySystemReadyMonitorProperties = new OASOrgApacheFelixSystemreadySystemRe();
        Map<String, String> propertyMappings = orgApacheFelixSystemreadySystemReadyMonitorProperties.getPropertyMappings();
        System.assertEquals('pollInterval', propertyMappings.get('poll.interval'));
    }
}
