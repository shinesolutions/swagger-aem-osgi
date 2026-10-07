@isTest
private class OASComAdobeCqAuditPurgeDamInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo1 = OASComAdobeCqAuditPurgeDamInfo.getExample();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo2 = comAdobeCqAuditPurgeDamInfo1;
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo3 = new OASComAdobeCqAuditPurgeDamInfo();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo4 = comAdobeCqAuditPurgeDamInfo3;

        System.assert(comAdobeCqAuditPurgeDamInfo1.equals(comAdobeCqAuditPurgeDamInfo2));
        System.assert(comAdobeCqAuditPurgeDamInfo2.equals(comAdobeCqAuditPurgeDamInfo1));
        System.assert(comAdobeCqAuditPurgeDamInfo1.equals(comAdobeCqAuditPurgeDamInfo1));
        System.assert(comAdobeCqAuditPurgeDamInfo3.equals(comAdobeCqAuditPurgeDamInfo4));
        System.assert(comAdobeCqAuditPurgeDamInfo4.equals(comAdobeCqAuditPurgeDamInfo3));
        System.assert(comAdobeCqAuditPurgeDamInfo3.equals(comAdobeCqAuditPurgeDamInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo1 = OASComAdobeCqAuditPurgeDamInfo.getExample();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo2 = OASComAdobeCqAuditPurgeDamInfo.getExample();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo3 = new OASComAdobeCqAuditPurgeDamInfo();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo4 = new OASComAdobeCqAuditPurgeDamInfo();

        System.assert(comAdobeCqAuditPurgeDamInfo1.equals(comAdobeCqAuditPurgeDamInfo2));
        System.assert(comAdobeCqAuditPurgeDamInfo2.equals(comAdobeCqAuditPurgeDamInfo1));
        System.assert(comAdobeCqAuditPurgeDamInfo3.equals(comAdobeCqAuditPurgeDamInfo4));
        System.assert(comAdobeCqAuditPurgeDamInfo4.equals(comAdobeCqAuditPurgeDamInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo1 = OASComAdobeCqAuditPurgeDamInfo.getExample();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo2 = new OASComAdobeCqAuditPurgeDamInfo();

        System.assertEquals(false, comAdobeCqAuditPurgeDamInfo1.equals('foo'));
        System.assertEquals(false, comAdobeCqAuditPurgeDamInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo1 = OASComAdobeCqAuditPurgeDamInfo.getExample();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo2 = new OASComAdobeCqAuditPurgeDamInfo();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo3;

        System.assertEquals(false, comAdobeCqAuditPurgeDamInfo1.equals(comAdobeCqAuditPurgeDamInfo3));
        System.assertEquals(false, comAdobeCqAuditPurgeDamInfo2.equals(comAdobeCqAuditPurgeDamInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo1 = OASComAdobeCqAuditPurgeDamInfo.getExample();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo2 = new OASComAdobeCqAuditPurgeDamInfo();

        System.assertEquals(comAdobeCqAuditPurgeDamInfo1.hashCode(), comAdobeCqAuditPurgeDamInfo1.hashCode());
        System.assertEquals(comAdobeCqAuditPurgeDamInfo2.hashCode(), comAdobeCqAuditPurgeDamInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo1 = OASComAdobeCqAuditPurgeDamInfo.getExample();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo2 = OASComAdobeCqAuditPurgeDamInfo.getExample();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo3 = new OASComAdobeCqAuditPurgeDamInfo();
        OASComAdobeCqAuditPurgeDamInfo comAdobeCqAuditPurgeDamInfo4 = new OASComAdobeCqAuditPurgeDamInfo();

        System.assert(comAdobeCqAuditPurgeDamInfo1.equals(comAdobeCqAuditPurgeDamInfo2));
        System.assert(comAdobeCqAuditPurgeDamInfo3.equals(comAdobeCqAuditPurgeDamInfo4));
        System.assertEquals(comAdobeCqAuditPurgeDamInfo1.hashCode(), comAdobeCqAuditPurgeDamInfo2.hashCode());
        System.assertEquals(comAdobeCqAuditPurgeDamInfo3.hashCode(), comAdobeCqAuditPurgeDamInfo4.hashCode());
    }
}
