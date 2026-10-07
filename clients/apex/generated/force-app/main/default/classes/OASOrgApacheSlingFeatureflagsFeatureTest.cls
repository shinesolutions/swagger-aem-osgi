@isTest
private class OASOrgApacheSlingFeatureflagsFeatureTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties1 = OASOrgApacheSlingFeatureflagsFeature.getExample();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties2 = orgApacheSlingFeatureflagsFeatureProperties1;
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties3 = new OASOrgApacheSlingFeatureflagsFeature();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties4 = orgApacheSlingFeatureflagsFeatureProperties3;

        System.assert(orgApacheSlingFeatureflagsFeatureProperties1.equals(orgApacheSlingFeatureflagsFeatureProperties2));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties2.equals(orgApacheSlingFeatureflagsFeatureProperties1));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties1.equals(orgApacheSlingFeatureflagsFeatureProperties1));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties3.equals(orgApacheSlingFeatureflagsFeatureProperties4));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties4.equals(orgApacheSlingFeatureflagsFeatureProperties3));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties3.equals(orgApacheSlingFeatureflagsFeatureProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties1 = OASOrgApacheSlingFeatureflagsFeature.getExample();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties2 = OASOrgApacheSlingFeatureflagsFeature.getExample();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties3 = new OASOrgApacheSlingFeatureflagsFeature();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties4 = new OASOrgApacheSlingFeatureflagsFeature();

        System.assert(orgApacheSlingFeatureflagsFeatureProperties1.equals(orgApacheSlingFeatureflagsFeatureProperties2));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties2.equals(orgApacheSlingFeatureflagsFeatureProperties1));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties3.equals(orgApacheSlingFeatureflagsFeatureProperties4));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties4.equals(orgApacheSlingFeatureflagsFeatureProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties1 = OASOrgApacheSlingFeatureflagsFeature.getExample();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties2 = new OASOrgApacheSlingFeatureflagsFeature();

        System.assertEquals(false, orgApacheSlingFeatureflagsFeatureProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingFeatureflagsFeatureProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties1 = OASOrgApacheSlingFeatureflagsFeature.getExample();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties2 = new OASOrgApacheSlingFeatureflagsFeature();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties3;

        System.assertEquals(false, orgApacheSlingFeatureflagsFeatureProperties1.equals(orgApacheSlingFeatureflagsFeatureProperties3));
        System.assertEquals(false, orgApacheSlingFeatureflagsFeatureProperties2.equals(orgApacheSlingFeatureflagsFeatureProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties1 = OASOrgApacheSlingFeatureflagsFeature.getExample();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties2 = new OASOrgApacheSlingFeatureflagsFeature();

        System.assertEquals(orgApacheSlingFeatureflagsFeatureProperties1.hashCode(), orgApacheSlingFeatureflagsFeatureProperties1.hashCode());
        System.assertEquals(orgApacheSlingFeatureflagsFeatureProperties2.hashCode(), orgApacheSlingFeatureflagsFeatureProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties1 = OASOrgApacheSlingFeatureflagsFeature.getExample();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties2 = OASOrgApacheSlingFeatureflagsFeature.getExample();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties3 = new OASOrgApacheSlingFeatureflagsFeature();
        OASOrgApacheSlingFeatureflagsFeature orgApacheSlingFeatureflagsFeatureProperties4 = new OASOrgApacheSlingFeatureflagsFeature();

        System.assert(orgApacheSlingFeatureflagsFeatureProperties1.equals(orgApacheSlingFeatureflagsFeatureProperties2));
        System.assert(orgApacheSlingFeatureflagsFeatureProperties3.equals(orgApacheSlingFeatureflagsFeatureProperties4));
        System.assertEquals(orgApacheSlingFeatureflagsFeatureProperties1.hashCode(), orgApacheSlingFeatureflagsFeatureProperties2.hashCode());
        System.assertEquals(orgApacheSlingFeatureflagsFeatureProperties3.hashCode(), orgApacheSlingFeatureflagsFeatureProperties4.hashCode());
    }
}
