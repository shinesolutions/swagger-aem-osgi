@isTest
private class OASOrgApacheFelixWebconsolePluginsMeTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1 = OASOrgApacheFelixWebconsolePluginsMe.getExample();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2 = orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1;
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3 = new OASOrgApacheFelixWebconsolePluginsMe();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4 = orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3;

        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1 = OASOrgApacheFelixWebconsolePluginsMe.getExample();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2 = OASOrgApacheFelixWebconsolePluginsMe.getExample();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3 = new OASOrgApacheFelixWebconsolePluginsMe();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4 = new OASOrgApacheFelixWebconsolePluginsMe();

        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1 = OASOrgApacheFelixWebconsolePluginsMe.getExample();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2 = new OASOrgApacheFelixWebconsolePluginsMe();

        System.assertEquals(false, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1 = OASOrgApacheFelixWebconsolePluginsMe.getExample();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2 = new OASOrgApacheFelixWebconsolePluginsMe();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3;

        System.assertEquals(false, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3));
        System.assertEquals(false, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1 = OASOrgApacheFelixWebconsolePluginsMe.getExample();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2 = new OASOrgApacheFelixWebconsolePluginsMe();

        System.assertEquals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.hashCode(), orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.hashCode());
        System.assertEquals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2.hashCode(), orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1 = OASOrgApacheFelixWebconsolePluginsMe.getExample();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2 = OASOrgApacheFelixWebconsolePluginsMe.getExample();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3 = new OASOrgApacheFelixWebconsolePluginsMe();
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4 = new OASOrgApacheFelixWebconsolePluginsMe();

        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2));
        System.assert(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3.equals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4));
        System.assertEquals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties1.hashCode(), orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties2.hashCode());
        System.assertEquals(orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties3.hashCode(), orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixWebconsolePluginsMe orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties = new OASOrgApacheFelixWebconsolePluginsMe();
        Map<String, String> propertyMappings = orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.getPropertyMappings();
        System.assertEquals('felixMemoryusageDumpThreshold', propertyMappings.get('felix.memoryusage.dump.threshold'));
        System.assertEquals('felixMemoryusageDumpInterval', propertyMappings.get('felix.memoryusage.dump.interval'));
        System.assertEquals('felixMemoryusageDumpLocation', propertyMappings.get('felix.memoryusage.dump.location'));
    }
}
