@isTest
private class OASComAdobeCqAuditPurgeReplicationInTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo1 = OASComAdobeCqAuditPurgeReplicationIn.getExample();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo2 = comAdobeCqAuditPurgeReplicationInfo1;
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo3 = new OASComAdobeCqAuditPurgeReplicationIn();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo4 = comAdobeCqAuditPurgeReplicationInfo3;

        System.assert(comAdobeCqAuditPurgeReplicationInfo1.equals(comAdobeCqAuditPurgeReplicationInfo2));
        System.assert(comAdobeCqAuditPurgeReplicationInfo2.equals(comAdobeCqAuditPurgeReplicationInfo1));
        System.assert(comAdobeCqAuditPurgeReplicationInfo1.equals(comAdobeCqAuditPurgeReplicationInfo1));
        System.assert(comAdobeCqAuditPurgeReplicationInfo3.equals(comAdobeCqAuditPurgeReplicationInfo4));
        System.assert(comAdobeCqAuditPurgeReplicationInfo4.equals(comAdobeCqAuditPurgeReplicationInfo3));
        System.assert(comAdobeCqAuditPurgeReplicationInfo3.equals(comAdobeCqAuditPurgeReplicationInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo1 = OASComAdobeCqAuditPurgeReplicationIn.getExample();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo2 = OASComAdobeCqAuditPurgeReplicationIn.getExample();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo3 = new OASComAdobeCqAuditPurgeReplicationIn();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo4 = new OASComAdobeCqAuditPurgeReplicationIn();

        System.assert(comAdobeCqAuditPurgeReplicationInfo1.equals(comAdobeCqAuditPurgeReplicationInfo2));
        System.assert(comAdobeCqAuditPurgeReplicationInfo2.equals(comAdobeCqAuditPurgeReplicationInfo1));
        System.assert(comAdobeCqAuditPurgeReplicationInfo3.equals(comAdobeCqAuditPurgeReplicationInfo4));
        System.assert(comAdobeCqAuditPurgeReplicationInfo4.equals(comAdobeCqAuditPurgeReplicationInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo1 = OASComAdobeCqAuditPurgeReplicationIn.getExample();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo2 = new OASComAdobeCqAuditPurgeReplicationIn();

        System.assertEquals(false, comAdobeCqAuditPurgeReplicationInfo1.equals('foo'));
        System.assertEquals(false, comAdobeCqAuditPurgeReplicationInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo1 = OASComAdobeCqAuditPurgeReplicationIn.getExample();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo2 = new OASComAdobeCqAuditPurgeReplicationIn();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo3;

        System.assertEquals(false, comAdobeCqAuditPurgeReplicationInfo1.equals(comAdobeCqAuditPurgeReplicationInfo3));
        System.assertEquals(false, comAdobeCqAuditPurgeReplicationInfo2.equals(comAdobeCqAuditPurgeReplicationInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo1 = OASComAdobeCqAuditPurgeReplicationIn.getExample();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo2 = new OASComAdobeCqAuditPurgeReplicationIn();

        System.assertEquals(comAdobeCqAuditPurgeReplicationInfo1.hashCode(), comAdobeCqAuditPurgeReplicationInfo1.hashCode());
        System.assertEquals(comAdobeCqAuditPurgeReplicationInfo2.hashCode(), comAdobeCqAuditPurgeReplicationInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo1 = OASComAdobeCqAuditPurgeReplicationIn.getExample();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo2 = OASComAdobeCqAuditPurgeReplicationIn.getExample();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo3 = new OASComAdobeCqAuditPurgeReplicationIn();
        OASComAdobeCqAuditPurgeReplicationIn comAdobeCqAuditPurgeReplicationInfo4 = new OASComAdobeCqAuditPurgeReplicationIn();

        System.assert(comAdobeCqAuditPurgeReplicationInfo1.equals(comAdobeCqAuditPurgeReplicationInfo2));
        System.assert(comAdobeCqAuditPurgeReplicationInfo3.equals(comAdobeCqAuditPurgeReplicationInfo4));
        System.assertEquals(comAdobeCqAuditPurgeReplicationInfo1.hashCode(), comAdobeCqAuditPurgeReplicationInfo2.hashCode());
        System.assertEquals(comAdobeCqAuditPurgeReplicationInfo3.hashCode(), comAdobeCqAuditPurgeReplicationInfo4.hashCode());
    }
}
