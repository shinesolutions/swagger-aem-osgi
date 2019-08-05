@isTest
private class OASOrgApacheFelixScrScrServiceProperTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties1 = OASOrgApacheFelixScrScrServiceProper.getExample();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties2 = orgApacheFelixScrScrServiceProperties1;
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties3 = new OASOrgApacheFelixScrScrServiceProper();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties4 = orgApacheFelixScrScrServiceProperties3;

        System.assert(orgApacheFelixScrScrServiceProperties1.equals(orgApacheFelixScrScrServiceProperties2));
        System.assert(orgApacheFelixScrScrServiceProperties2.equals(orgApacheFelixScrScrServiceProperties1));
        System.assert(orgApacheFelixScrScrServiceProperties1.equals(orgApacheFelixScrScrServiceProperties1));
        System.assert(orgApacheFelixScrScrServiceProperties3.equals(orgApacheFelixScrScrServiceProperties4));
        System.assert(orgApacheFelixScrScrServiceProperties4.equals(orgApacheFelixScrScrServiceProperties3));
        System.assert(orgApacheFelixScrScrServiceProperties3.equals(orgApacheFelixScrScrServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties1 = OASOrgApacheFelixScrScrServiceProper.getExample();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties2 = OASOrgApacheFelixScrScrServiceProper.getExample();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties3 = new OASOrgApacheFelixScrScrServiceProper();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties4 = new OASOrgApacheFelixScrScrServiceProper();

        System.assert(orgApacheFelixScrScrServiceProperties1.equals(orgApacheFelixScrScrServiceProperties2));
        System.assert(orgApacheFelixScrScrServiceProperties2.equals(orgApacheFelixScrScrServiceProperties1));
        System.assert(orgApacheFelixScrScrServiceProperties3.equals(orgApacheFelixScrScrServiceProperties4));
        System.assert(orgApacheFelixScrScrServiceProperties4.equals(orgApacheFelixScrScrServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties1 = OASOrgApacheFelixScrScrServiceProper.getExample();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties2 = new OASOrgApacheFelixScrScrServiceProper();

        System.assertEquals(false, orgApacheFelixScrScrServiceProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixScrScrServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties1 = OASOrgApacheFelixScrScrServiceProper.getExample();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties2 = new OASOrgApacheFelixScrScrServiceProper();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties3;

        System.assertEquals(false, orgApacheFelixScrScrServiceProperties1.equals(orgApacheFelixScrScrServiceProperties3));
        System.assertEquals(false, orgApacheFelixScrScrServiceProperties2.equals(orgApacheFelixScrScrServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties1 = OASOrgApacheFelixScrScrServiceProper.getExample();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties2 = new OASOrgApacheFelixScrScrServiceProper();

        System.assertEquals(orgApacheFelixScrScrServiceProperties1.hashCode(), orgApacheFelixScrScrServiceProperties1.hashCode());
        System.assertEquals(orgApacheFelixScrScrServiceProperties2.hashCode(), orgApacheFelixScrScrServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties1 = OASOrgApacheFelixScrScrServiceProper.getExample();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties2 = OASOrgApacheFelixScrScrServiceProper.getExample();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties3 = new OASOrgApacheFelixScrScrServiceProper();
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties4 = new OASOrgApacheFelixScrScrServiceProper();

        System.assert(orgApacheFelixScrScrServiceProperties1.equals(orgApacheFelixScrScrServiceProperties2));
        System.assert(orgApacheFelixScrScrServiceProperties3.equals(orgApacheFelixScrScrServiceProperties4));
        System.assertEquals(orgApacheFelixScrScrServiceProperties1.hashCode(), orgApacheFelixScrScrServiceProperties2.hashCode());
        System.assertEquals(orgApacheFelixScrScrServiceProperties3.hashCode(), orgApacheFelixScrScrServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixScrScrServiceProper orgApacheFelixScrScrServiceProperties = new OASOrgApacheFelixScrScrServiceProper();
        Map<String, String> propertyMappings = orgApacheFelixScrScrServiceProperties.getPropertyMappings();
        System.assertEquals('dsLoglevel', propertyMappings.get('ds.loglevel'));
        System.assertEquals('dsFactoryEnabled', propertyMappings.get('ds.factory.enabled'));
        System.assertEquals('dsDelayedKeepInstances', propertyMappings.get('ds.delayed.keepInstances'));
        System.assertEquals('dsLockTimeoutMilliseconds', propertyMappings.get('ds.lock.timeout.milliseconds'));
        System.assertEquals('dsStopTimeoutMilliseconds', propertyMappings.get('ds.stop.timeout.milliseconds'));
        System.assertEquals('dsGlobalExtender', propertyMappings.get('ds.global.extender'));
    }
}
