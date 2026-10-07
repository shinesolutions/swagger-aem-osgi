@isTest
private class OASComAdobeGraniteRepositoryImplCommTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties1 = OASComAdobeGraniteRepositoryImplComm.getExample();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties2 = comAdobeGraniteRepositoryImplCommitStatsConfigProperties1;
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties3 = new OASComAdobeGraniteRepositoryImplComm();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties4 = comAdobeGraniteRepositoryImplCommitStatsConfigProperties3;

        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties2));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties2.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties4));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties4.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties1 = OASComAdobeGraniteRepositoryImplComm.getExample();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties2 = OASComAdobeGraniteRepositoryImplComm.getExample();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties3 = new OASComAdobeGraniteRepositoryImplComm();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties4 = new OASComAdobeGraniteRepositoryImplComm();

        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties2));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties2.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties4));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties4.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties1 = OASComAdobeGraniteRepositoryImplComm.getExample();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties2 = new OASComAdobeGraniteRepositoryImplComm();

        System.assertEquals(false, comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRepositoryImplCommitStatsConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties1 = OASComAdobeGraniteRepositoryImplComm.getExample();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties2 = new OASComAdobeGraniteRepositoryImplComm();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties3;

        System.assertEquals(false, comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3));
        System.assertEquals(false, comAdobeGraniteRepositoryImplCommitStatsConfigProperties2.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties1 = OASComAdobeGraniteRepositoryImplComm.getExample();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties2 = new OASComAdobeGraniteRepositoryImplComm();

        System.assertEquals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.hashCode(), comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties2.hashCode(), comAdobeGraniteRepositoryImplCommitStatsConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties1 = OASComAdobeGraniteRepositoryImplComm.getExample();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties2 = OASComAdobeGraniteRepositoryImplComm.getExample();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties3 = new OASComAdobeGraniteRepositoryImplComm();
        OASComAdobeGraniteRepositoryImplComm comAdobeGraniteRepositoryImplCommitStatsConfigProperties4 = new OASComAdobeGraniteRepositoryImplComm();

        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties2));
        System.assert(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3.equals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties4));
        System.assertEquals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties1.hashCode(), comAdobeGraniteRepositoryImplCommitStatsConfigProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryImplCommitStatsConfigProperties3.hashCode(), comAdobeGraniteRepositoryImplCommitStatsConfigProperties4.hashCode());
    }
}
