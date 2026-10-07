@isTest
private class OASComDayCqDamCoreImplAssetMoveListeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties1 = OASComDayCqDamCoreImplAssetMoveListe.getExample();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties2 = comDayCqDamCoreImplAssetMoveListenerProperties1;
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties3 = new OASComDayCqDamCoreImplAssetMoveListe();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties4 = comDayCqDamCoreImplAssetMoveListenerProperties3;

        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties1.equals(comDayCqDamCoreImplAssetMoveListenerProperties2));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties2.equals(comDayCqDamCoreImplAssetMoveListenerProperties1));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties1.equals(comDayCqDamCoreImplAssetMoveListenerProperties1));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties3.equals(comDayCqDamCoreImplAssetMoveListenerProperties4));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties4.equals(comDayCqDamCoreImplAssetMoveListenerProperties3));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties3.equals(comDayCqDamCoreImplAssetMoveListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties1 = OASComDayCqDamCoreImplAssetMoveListe.getExample();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties2 = OASComDayCqDamCoreImplAssetMoveListe.getExample();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties3 = new OASComDayCqDamCoreImplAssetMoveListe();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties4 = new OASComDayCqDamCoreImplAssetMoveListe();

        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties1.equals(comDayCqDamCoreImplAssetMoveListenerProperties2));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties2.equals(comDayCqDamCoreImplAssetMoveListenerProperties1));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties3.equals(comDayCqDamCoreImplAssetMoveListenerProperties4));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties4.equals(comDayCqDamCoreImplAssetMoveListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties1 = OASComDayCqDamCoreImplAssetMoveListe.getExample();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties2 = new OASComDayCqDamCoreImplAssetMoveListe();

        System.assertEquals(false, comDayCqDamCoreImplAssetMoveListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplAssetMoveListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties1 = OASComDayCqDamCoreImplAssetMoveListe.getExample();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties2 = new OASComDayCqDamCoreImplAssetMoveListe();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties3;

        System.assertEquals(false, comDayCqDamCoreImplAssetMoveListenerProperties1.equals(comDayCqDamCoreImplAssetMoveListenerProperties3));
        System.assertEquals(false, comDayCqDamCoreImplAssetMoveListenerProperties2.equals(comDayCqDamCoreImplAssetMoveListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties1 = OASComDayCqDamCoreImplAssetMoveListe.getExample();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties2 = new OASComDayCqDamCoreImplAssetMoveListe();

        System.assertEquals(comDayCqDamCoreImplAssetMoveListenerProperties1.hashCode(), comDayCqDamCoreImplAssetMoveListenerProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplAssetMoveListenerProperties2.hashCode(), comDayCqDamCoreImplAssetMoveListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties1 = OASComDayCqDamCoreImplAssetMoveListe.getExample();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties2 = OASComDayCqDamCoreImplAssetMoveListe.getExample();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties3 = new OASComDayCqDamCoreImplAssetMoveListe();
        OASComDayCqDamCoreImplAssetMoveListe comDayCqDamCoreImplAssetMoveListenerProperties4 = new OASComDayCqDamCoreImplAssetMoveListe();

        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties1.equals(comDayCqDamCoreImplAssetMoveListenerProperties2));
        System.assert(comDayCqDamCoreImplAssetMoveListenerProperties3.equals(comDayCqDamCoreImplAssetMoveListenerProperties4));
        System.assertEquals(comDayCqDamCoreImplAssetMoveListenerProperties1.hashCode(), comDayCqDamCoreImplAssetMoveListenerProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplAssetMoveListenerProperties3.hashCode(), comDayCqDamCoreImplAssetMoveListenerProperties4.hashCode());
    }
}
