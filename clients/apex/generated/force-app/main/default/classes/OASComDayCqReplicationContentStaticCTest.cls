@isTest
private class OASComDayCqReplicationContentStaticCTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties1 = OASComDayCqReplicationContentStaticC.getExample();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties2 = comDayCqReplicationContentStaticContentBuilderProperties1;
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties3 = new OASComDayCqReplicationContentStaticC();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties4 = comDayCqReplicationContentStaticContentBuilderProperties3;

        System.assert(comDayCqReplicationContentStaticContentBuilderProperties1.equals(comDayCqReplicationContentStaticContentBuilderProperties2));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties2.equals(comDayCqReplicationContentStaticContentBuilderProperties1));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties1.equals(comDayCqReplicationContentStaticContentBuilderProperties1));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties3.equals(comDayCqReplicationContentStaticContentBuilderProperties4));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties4.equals(comDayCqReplicationContentStaticContentBuilderProperties3));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties3.equals(comDayCqReplicationContentStaticContentBuilderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties1 = OASComDayCqReplicationContentStaticC.getExample();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties2 = OASComDayCqReplicationContentStaticC.getExample();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties3 = new OASComDayCqReplicationContentStaticC();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties4 = new OASComDayCqReplicationContentStaticC();

        System.assert(comDayCqReplicationContentStaticContentBuilderProperties1.equals(comDayCqReplicationContentStaticContentBuilderProperties2));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties2.equals(comDayCqReplicationContentStaticContentBuilderProperties1));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties3.equals(comDayCqReplicationContentStaticContentBuilderProperties4));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties4.equals(comDayCqReplicationContentStaticContentBuilderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties1 = OASComDayCqReplicationContentStaticC.getExample();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties2 = new OASComDayCqReplicationContentStaticC();

        System.assertEquals(false, comDayCqReplicationContentStaticContentBuilderProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationContentStaticContentBuilderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties1 = OASComDayCqReplicationContentStaticC.getExample();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties2 = new OASComDayCqReplicationContentStaticC();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties3;

        System.assertEquals(false, comDayCqReplicationContentStaticContentBuilderProperties1.equals(comDayCqReplicationContentStaticContentBuilderProperties3));
        System.assertEquals(false, comDayCqReplicationContentStaticContentBuilderProperties2.equals(comDayCqReplicationContentStaticContentBuilderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties1 = OASComDayCqReplicationContentStaticC.getExample();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties2 = new OASComDayCqReplicationContentStaticC();

        System.assertEquals(comDayCqReplicationContentStaticContentBuilderProperties1.hashCode(), comDayCqReplicationContentStaticContentBuilderProperties1.hashCode());
        System.assertEquals(comDayCqReplicationContentStaticContentBuilderProperties2.hashCode(), comDayCqReplicationContentStaticContentBuilderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties1 = OASComDayCqReplicationContentStaticC.getExample();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties2 = OASComDayCqReplicationContentStaticC.getExample();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties3 = new OASComDayCqReplicationContentStaticC();
        OASComDayCqReplicationContentStaticC comDayCqReplicationContentStaticContentBuilderProperties4 = new OASComDayCqReplicationContentStaticC();

        System.assert(comDayCqReplicationContentStaticContentBuilderProperties1.equals(comDayCqReplicationContentStaticContentBuilderProperties2));
        System.assert(comDayCqReplicationContentStaticContentBuilderProperties3.equals(comDayCqReplicationContentStaticContentBuilderProperties4));
        System.assertEquals(comDayCqReplicationContentStaticContentBuilderProperties1.hashCode(), comDayCqReplicationContentStaticContentBuilderProperties2.hashCode());
        System.assertEquals(comDayCqReplicationContentStaticContentBuilderProperties3.hashCode(), comDayCqReplicationContentStaticContentBuilderProperties4.hashCode());
    }
}
