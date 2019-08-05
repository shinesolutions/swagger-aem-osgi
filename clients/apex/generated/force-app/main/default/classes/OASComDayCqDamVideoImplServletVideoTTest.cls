@isTest
private class OASComDayCqDamVideoImplServletVideoTTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties1 = OASComDayCqDamVideoImplServletVideoT.getExample();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties2 = comDayCqDamVideoImplServletVideoTestServletProperties1;
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties3 = new OASComDayCqDamVideoImplServletVideoT();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties4 = comDayCqDamVideoImplServletVideoTestServletProperties3;

        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties1.equals(comDayCqDamVideoImplServletVideoTestServletProperties2));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties2.equals(comDayCqDamVideoImplServletVideoTestServletProperties1));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties1.equals(comDayCqDamVideoImplServletVideoTestServletProperties1));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties3.equals(comDayCqDamVideoImplServletVideoTestServletProperties4));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties4.equals(comDayCqDamVideoImplServletVideoTestServletProperties3));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties3.equals(comDayCqDamVideoImplServletVideoTestServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties1 = OASComDayCqDamVideoImplServletVideoT.getExample();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties2 = OASComDayCqDamVideoImplServletVideoT.getExample();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties3 = new OASComDayCqDamVideoImplServletVideoT();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties4 = new OASComDayCqDamVideoImplServletVideoT();

        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties1.equals(comDayCqDamVideoImplServletVideoTestServletProperties2));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties2.equals(comDayCqDamVideoImplServletVideoTestServletProperties1));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties3.equals(comDayCqDamVideoImplServletVideoTestServletProperties4));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties4.equals(comDayCqDamVideoImplServletVideoTestServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties1 = OASComDayCqDamVideoImplServletVideoT.getExample();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties2 = new OASComDayCqDamVideoImplServletVideoT();

        System.assertEquals(false, comDayCqDamVideoImplServletVideoTestServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamVideoImplServletVideoTestServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties1 = OASComDayCqDamVideoImplServletVideoT.getExample();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties2 = new OASComDayCqDamVideoImplServletVideoT();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties3;

        System.assertEquals(false, comDayCqDamVideoImplServletVideoTestServletProperties1.equals(comDayCqDamVideoImplServletVideoTestServletProperties3));
        System.assertEquals(false, comDayCqDamVideoImplServletVideoTestServletProperties2.equals(comDayCqDamVideoImplServletVideoTestServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties1 = OASComDayCqDamVideoImplServletVideoT.getExample();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties2 = new OASComDayCqDamVideoImplServletVideoT();

        System.assertEquals(comDayCqDamVideoImplServletVideoTestServletProperties1.hashCode(), comDayCqDamVideoImplServletVideoTestServletProperties1.hashCode());
        System.assertEquals(comDayCqDamVideoImplServletVideoTestServletProperties2.hashCode(), comDayCqDamVideoImplServletVideoTestServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties1 = OASComDayCqDamVideoImplServletVideoT.getExample();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties2 = OASComDayCqDamVideoImplServletVideoT.getExample();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties3 = new OASComDayCqDamVideoImplServletVideoT();
        OASComDayCqDamVideoImplServletVideoT comDayCqDamVideoImplServletVideoTestServletProperties4 = new OASComDayCqDamVideoImplServletVideoT();

        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties1.equals(comDayCqDamVideoImplServletVideoTestServletProperties2));
        System.assert(comDayCqDamVideoImplServletVideoTestServletProperties3.equals(comDayCqDamVideoImplServletVideoTestServletProperties4));
        System.assertEquals(comDayCqDamVideoImplServletVideoTestServletProperties1.hashCode(), comDayCqDamVideoImplServletVideoTestServletProperties2.hashCode());
        System.assertEquals(comDayCqDamVideoImplServletVideoTestServletProperties3.hashCode(), comDayCqDamVideoImplServletVideoTestServletProperties4.hashCode());
    }
}
