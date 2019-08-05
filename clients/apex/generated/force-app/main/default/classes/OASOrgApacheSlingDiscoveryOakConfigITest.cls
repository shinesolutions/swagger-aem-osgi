@isTest
private class OASOrgApacheSlingDiscoveryOakConfigITest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo1 = OASOrgApacheSlingDiscoveryOakConfigI.getExample();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo2 = orgApacheSlingDiscoveryOakConfigInfo1;
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo3 = new OASOrgApacheSlingDiscoveryOakConfigI();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo4 = orgApacheSlingDiscoveryOakConfigInfo3;

        System.assert(orgApacheSlingDiscoveryOakConfigInfo1.equals(orgApacheSlingDiscoveryOakConfigInfo2));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo2.equals(orgApacheSlingDiscoveryOakConfigInfo1));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo1.equals(orgApacheSlingDiscoveryOakConfigInfo1));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo3.equals(orgApacheSlingDiscoveryOakConfigInfo4));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo4.equals(orgApacheSlingDiscoveryOakConfigInfo3));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo3.equals(orgApacheSlingDiscoveryOakConfigInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo1 = OASOrgApacheSlingDiscoveryOakConfigI.getExample();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo2 = OASOrgApacheSlingDiscoveryOakConfigI.getExample();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo3 = new OASOrgApacheSlingDiscoveryOakConfigI();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo4 = new OASOrgApacheSlingDiscoveryOakConfigI();

        System.assert(orgApacheSlingDiscoveryOakConfigInfo1.equals(orgApacheSlingDiscoveryOakConfigInfo2));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo2.equals(orgApacheSlingDiscoveryOakConfigInfo1));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo3.equals(orgApacheSlingDiscoveryOakConfigInfo4));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo4.equals(orgApacheSlingDiscoveryOakConfigInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo1 = OASOrgApacheSlingDiscoveryOakConfigI.getExample();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo2 = new OASOrgApacheSlingDiscoveryOakConfigI();

        System.assertEquals(false, orgApacheSlingDiscoveryOakConfigInfo1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDiscoveryOakConfigInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo1 = OASOrgApacheSlingDiscoveryOakConfigI.getExample();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo2 = new OASOrgApacheSlingDiscoveryOakConfigI();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo3;

        System.assertEquals(false, orgApacheSlingDiscoveryOakConfigInfo1.equals(orgApacheSlingDiscoveryOakConfigInfo3));
        System.assertEquals(false, orgApacheSlingDiscoveryOakConfigInfo2.equals(orgApacheSlingDiscoveryOakConfigInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo1 = OASOrgApacheSlingDiscoveryOakConfigI.getExample();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo2 = new OASOrgApacheSlingDiscoveryOakConfigI();

        System.assertEquals(orgApacheSlingDiscoveryOakConfigInfo1.hashCode(), orgApacheSlingDiscoveryOakConfigInfo1.hashCode());
        System.assertEquals(orgApacheSlingDiscoveryOakConfigInfo2.hashCode(), orgApacheSlingDiscoveryOakConfigInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo1 = OASOrgApacheSlingDiscoveryOakConfigI.getExample();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo2 = OASOrgApacheSlingDiscoveryOakConfigI.getExample();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo3 = new OASOrgApacheSlingDiscoveryOakConfigI();
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo4 = new OASOrgApacheSlingDiscoveryOakConfigI();

        System.assert(orgApacheSlingDiscoveryOakConfigInfo1.equals(orgApacheSlingDiscoveryOakConfigInfo2));
        System.assert(orgApacheSlingDiscoveryOakConfigInfo3.equals(orgApacheSlingDiscoveryOakConfigInfo4));
        System.assertEquals(orgApacheSlingDiscoveryOakConfigInfo1.hashCode(), orgApacheSlingDiscoveryOakConfigInfo2.hashCode());
        System.assertEquals(orgApacheSlingDiscoveryOakConfigInfo3.hashCode(), orgApacheSlingDiscoveryOakConfigInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDiscoveryOakConfigI orgApacheSlingDiscoveryOakConfigInfo = new OASOrgApacheSlingDiscoveryOakConfigI();
        Map<String, String> propertyMappings = orgApacheSlingDiscoveryOakConfigInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}
