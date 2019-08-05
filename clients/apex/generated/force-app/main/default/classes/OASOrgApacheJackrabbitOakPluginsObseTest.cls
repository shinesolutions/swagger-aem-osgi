@isTest
private class OASOrgApacheJackrabbitOakPluginsObseTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1 = OASOrgApacheJackrabbitOakPluginsObse.getExample();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2 = orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1;
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3 = new OASOrgApacheJackrabbitOakPluginsObse();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4 = orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3;

        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1 = OASOrgApacheJackrabbitOakPluginsObse.getExample();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2 = OASOrgApacheJackrabbitOakPluginsObse.getExample();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3 = new OASOrgApacheJackrabbitOakPluginsObse();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4 = new OASOrgApacheJackrabbitOakPluginsObse();

        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1 = OASOrgApacheJackrabbitOakPluginsObse.getExample();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2 = new OASOrgApacheJackrabbitOakPluginsObse();

        System.assertEquals(false, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1 = OASOrgApacheJackrabbitOakPluginsObse.getExample();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2 = new OASOrgApacheJackrabbitOakPluginsObse();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1 = OASOrgApacheJackrabbitOakPluginsObse.getExample();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2 = new OASOrgApacheJackrabbitOakPluginsObse();

        System.assertEquals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.hashCode(), orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2.hashCode(), orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1 = OASOrgApacheJackrabbitOakPluginsObse.getExample();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2 = OASOrgApacheJackrabbitOakPluginsObse.getExample();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3 = new OASOrgApacheJackrabbitOakPluginsObse();
        OASOrgApacheJackrabbitOakPluginsObse orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4 = new OASOrgApacheJackrabbitOakPluginsObse();

        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2));
        System.assert(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3.equals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4));
        System.assertEquals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties1.hashCode(), orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties3.hashCode(), orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties4.hashCode());
    }
}
