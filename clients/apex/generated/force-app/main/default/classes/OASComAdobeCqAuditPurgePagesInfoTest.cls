@isTest
private class OASComAdobeCqAuditPurgePagesInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo1 = OASComAdobeCqAuditPurgePagesInfo.getExample();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo2 = comAdobeCqAuditPurgePagesInfo1;
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo3 = new OASComAdobeCqAuditPurgePagesInfo();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo4 = comAdobeCqAuditPurgePagesInfo3;

        System.assert(comAdobeCqAuditPurgePagesInfo1.equals(comAdobeCqAuditPurgePagesInfo2));
        System.assert(comAdobeCqAuditPurgePagesInfo2.equals(comAdobeCqAuditPurgePagesInfo1));
        System.assert(comAdobeCqAuditPurgePagesInfo1.equals(comAdobeCqAuditPurgePagesInfo1));
        System.assert(comAdobeCqAuditPurgePagesInfo3.equals(comAdobeCqAuditPurgePagesInfo4));
        System.assert(comAdobeCqAuditPurgePagesInfo4.equals(comAdobeCqAuditPurgePagesInfo3));
        System.assert(comAdobeCqAuditPurgePagesInfo3.equals(comAdobeCqAuditPurgePagesInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo1 = OASComAdobeCqAuditPurgePagesInfo.getExample();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo2 = OASComAdobeCqAuditPurgePagesInfo.getExample();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo3 = new OASComAdobeCqAuditPurgePagesInfo();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo4 = new OASComAdobeCqAuditPurgePagesInfo();

        System.assert(comAdobeCqAuditPurgePagesInfo1.equals(comAdobeCqAuditPurgePagesInfo2));
        System.assert(comAdobeCqAuditPurgePagesInfo2.equals(comAdobeCqAuditPurgePagesInfo1));
        System.assert(comAdobeCqAuditPurgePagesInfo3.equals(comAdobeCqAuditPurgePagesInfo4));
        System.assert(comAdobeCqAuditPurgePagesInfo4.equals(comAdobeCqAuditPurgePagesInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo1 = OASComAdobeCqAuditPurgePagesInfo.getExample();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo2 = new OASComAdobeCqAuditPurgePagesInfo();

        System.assertEquals(false, comAdobeCqAuditPurgePagesInfo1.equals('foo'));
        System.assertEquals(false, comAdobeCqAuditPurgePagesInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo1 = OASComAdobeCqAuditPurgePagesInfo.getExample();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo2 = new OASComAdobeCqAuditPurgePagesInfo();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo3;

        System.assertEquals(false, comAdobeCqAuditPurgePagesInfo1.equals(comAdobeCqAuditPurgePagesInfo3));
        System.assertEquals(false, comAdobeCqAuditPurgePagesInfo2.equals(comAdobeCqAuditPurgePagesInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo1 = OASComAdobeCqAuditPurgePagesInfo.getExample();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo2 = new OASComAdobeCqAuditPurgePagesInfo();

        System.assertEquals(comAdobeCqAuditPurgePagesInfo1.hashCode(), comAdobeCqAuditPurgePagesInfo1.hashCode());
        System.assertEquals(comAdobeCqAuditPurgePagesInfo2.hashCode(), comAdobeCqAuditPurgePagesInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo1 = OASComAdobeCqAuditPurgePagesInfo.getExample();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo2 = OASComAdobeCqAuditPurgePagesInfo.getExample();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo3 = new OASComAdobeCqAuditPurgePagesInfo();
        OASComAdobeCqAuditPurgePagesInfo comAdobeCqAuditPurgePagesInfo4 = new OASComAdobeCqAuditPurgePagesInfo();

        System.assert(comAdobeCqAuditPurgePagesInfo1.equals(comAdobeCqAuditPurgePagesInfo2));
        System.assert(comAdobeCqAuditPurgePagesInfo3.equals(comAdobeCqAuditPurgePagesInfo4));
        System.assertEquals(comAdobeCqAuditPurgePagesInfo1.hashCode(), comAdobeCqAuditPurgePagesInfo2.hashCode());
        System.assertEquals(comAdobeCqAuditPurgePagesInfo3.hashCode(), comAdobeCqAuditPurgePagesInfo4.hashCode());
    }
}
