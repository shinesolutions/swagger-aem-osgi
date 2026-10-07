@isTest
private class OASOrgApacheSlingFeatureflagsImplConTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1 = OASOrgApacheSlingFeatureflagsImplCon.getExample();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2 = orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1;
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3 = new OASOrgApacheSlingFeatureflagsImplCon();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4 = orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3;

        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1 = OASOrgApacheSlingFeatureflagsImplCon.getExample();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2 = OASOrgApacheSlingFeatureflagsImplCon.getExample();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3 = new OASOrgApacheSlingFeatureflagsImplCon();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4 = new OASOrgApacheSlingFeatureflagsImplCon();

        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1 = OASOrgApacheSlingFeatureflagsImplCon.getExample();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2 = new OASOrgApacheSlingFeatureflagsImplCon();

        System.assertEquals(false, orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1 = OASOrgApacheSlingFeatureflagsImplCon.getExample();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2 = new OASOrgApacheSlingFeatureflagsImplCon();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3;

        System.assertEquals(false, orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3));
        System.assertEquals(false, orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1 = OASOrgApacheSlingFeatureflagsImplCon.getExample();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2 = new OASOrgApacheSlingFeatureflagsImplCon();

        System.assertEquals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.hashCode(), orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.hashCode());
        System.assertEquals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2.hashCode(), orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1 = OASOrgApacheSlingFeatureflagsImplCon.getExample();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2 = OASOrgApacheSlingFeatureflagsImplCon.getExample();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3 = new OASOrgApacheSlingFeatureflagsImplCon();
        OASOrgApacheSlingFeatureflagsImplCon orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4 = new OASOrgApacheSlingFeatureflagsImplCon();

        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2));
        System.assert(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3.equals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4));
        System.assertEquals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties1.hashCode(), orgApacheSlingFeatureflagsImplConfiguredFeatureProperties2.hashCode());
        System.assertEquals(orgApacheSlingFeatureflagsImplConfiguredFeatureProperties3.hashCode(), orgApacheSlingFeatureflagsImplConfiguredFeatureProperties4.hashCode());
    }
}
