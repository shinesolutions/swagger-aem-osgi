@isTest
private class OASOrgApacheSlingDistributionTranspoTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1 = OASOrgApacheSlingDistributionTranspo.getExample();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2 = orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1;
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3 = new OASOrgApacheSlingDistributionTranspo();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4 = orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3;

        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1 = OASOrgApacheSlingDistributionTranspo.getExample();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2 = OASOrgApacheSlingDistributionTranspo.getExample();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3 = new OASOrgApacheSlingDistributionTranspo();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4 = new OASOrgApacheSlingDistributionTranspo();

        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1 = OASOrgApacheSlingDistributionTranspo.getExample();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2 = new OASOrgApacheSlingDistributionTranspo();

        System.assertEquals(false, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1 = OASOrgApacheSlingDistributionTranspo.getExample();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2 = new OASOrgApacheSlingDistributionTranspo();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3;

        System.assertEquals(false, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3));
        System.assertEquals(false, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1 = OASOrgApacheSlingDistributionTranspo.getExample();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2 = new OASOrgApacheSlingDistributionTranspo();

        System.assertEquals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.hashCode(), orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.hashCode());
        System.assertEquals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2.hashCode(), orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1 = OASOrgApacheSlingDistributionTranspo.getExample();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2 = OASOrgApacheSlingDistributionTranspo.getExample();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3 = new OASOrgApacheSlingDistributionTranspo();
        OASOrgApacheSlingDistributionTranspo orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4 = new OASOrgApacheSlingDistributionTranspo();

        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2));
        System.assert(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3.equals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4));
        System.assertEquals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties1.hashCode(), orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties2.hashCode());
        System.assertEquals(orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties3.hashCode(), orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties4.hashCode());
    }
}
