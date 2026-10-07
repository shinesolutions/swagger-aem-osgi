@isTest
private class OASComDayCommonsHttpclientInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo1 = OASComDayCommonsHttpclientInfo.getExample();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo2 = comDayCommonsHttpclientInfo1;
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo3 = new OASComDayCommonsHttpclientInfo();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo4 = comDayCommonsHttpclientInfo3;

        System.assert(comDayCommonsHttpclientInfo1.equals(comDayCommonsHttpclientInfo2));
        System.assert(comDayCommonsHttpclientInfo2.equals(comDayCommonsHttpclientInfo1));
        System.assert(comDayCommonsHttpclientInfo1.equals(comDayCommonsHttpclientInfo1));
        System.assert(comDayCommonsHttpclientInfo3.equals(comDayCommonsHttpclientInfo4));
        System.assert(comDayCommonsHttpclientInfo4.equals(comDayCommonsHttpclientInfo3));
        System.assert(comDayCommonsHttpclientInfo3.equals(comDayCommonsHttpclientInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo1 = OASComDayCommonsHttpclientInfo.getExample();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo2 = OASComDayCommonsHttpclientInfo.getExample();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo3 = new OASComDayCommonsHttpclientInfo();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo4 = new OASComDayCommonsHttpclientInfo();

        System.assert(comDayCommonsHttpclientInfo1.equals(comDayCommonsHttpclientInfo2));
        System.assert(comDayCommonsHttpclientInfo2.equals(comDayCommonsHttpclientInfo1));
        System.assert(comDayCommonsHttpclientInfo3.equals(comDayCommonsHttpclientInfo4));
        System.assert(comDayCommonsHttpclientInfo4.equals(comDayCommonsHttpclientInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo1 = OASComDayCommonsHttpclientInfo.getExample();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo2 = new OASComDayCommonsHttpclientInfo();

        System.assertEquals(false, comDayCommonsHttpclientInfo1.equals('foo'));
        System.assertEquals(false, comDayCommonsHttpclientInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo1 = OASComDayCommonsHttpclientInfo.getExample();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo2 = new OASComDayCommonsHttpclientInfo();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo3;

        System.assertEquals(false, comDayCommonsHttpclientInfo1.equals(comDayCommonsHttpclientInfo3));
        System.assertEquals(false, comDayCommonsHttpclientInfo2.equals(comDayCommonsHttpclientInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo1 = OASComDayCommonsHttpclientInfo.getExample();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo2 = new OASComDayCommonsHttpclientInfo();

        System.assertEquals(comDayCommonsHttpclientInfo1.hashCode(), comDayCommonsHttpclientInfo1.hashCode());
        System.assertEquals(comDayCommonsHttpclientInfo2.hashCode(), comDayCommonsHttpclientInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo1 = OASComDayCommonsHttpclientInfo.getExample();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo2 = OASComDayCommonsHttpclientInfo.getExample();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo3 = new OASComDayCommonsHttpclientInfo();
        OASComDayCommonsHttpclientInfo comDayCommonsHttpclientInfo4 = new OASComDayCommonsHttpclientInfo();

        System.assert(comDayCommonsHttpclientInfo1.equals(comDayCommonsHttpclientInfo2));
        System.assert(comDayCommonsHttpclientInfo3.equals(comDayCommonsHttpclientInfo4));
        System.assertEquals(comDayCommonsHttpclientInfo1.hashCode(), comDayCommonsHttpclientInfo2.hashCode());
        System.assertEquals(comDayCommonsHttpclientInfo3.hashCode(), comDayCommonsHttpclientInfo4.hashCode());
    }
}
