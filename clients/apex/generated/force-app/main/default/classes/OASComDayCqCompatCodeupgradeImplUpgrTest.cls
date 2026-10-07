@isTest
private class OASComDayCqCompatCodeupgradeImplUpgrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1 = OASComDayCqCompatCodeupgradeImplUpgr.getExample();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2 = comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1;
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3 = new OASComDayCqCompatCodeupgradeImplUpgr();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4 = comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3;

        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1 = OASComDayCqCompatCodeupgradeImplUpgr.getExample();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2 = OASComDayCqCompatCodeupgradeImplUpgr.getExample();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3 = new OASComDayCqCompatCodeupgradeImplUpgr();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4 = new OASComDayCqCompatCodeupgradeImplUpgr();

        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1 = OASComDayCqCompatCodeupgradeImplUpgr.getExample();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2 = new OASComDayCqCompatCodeupgradeImplUpgr();

        System.assertEquals(false, comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.equals('foo'));
        System.assertEquals(false, comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1 = OASComDayCqCompatCodeupgradeImplUpgr.getExample();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2 = new OASComDayCqCompatCodeupgradeImplUpgr();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3;

        System.assertEquals(false, comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3));
        System.assertEquals(false, comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1 = OASComDayCqCompatCodeupgradeImplUpgr.getExample();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2 = new OASComDayCqCompatCodeupgradeImplUpgr();

        System.assertEquals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.hashCode(), comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.hashCode());
        System.assertEquals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2.hashCode(), comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1 = OASComDayCqCompatCodeupgradeImplUpgr.getExample();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2 = OASComDayCqCompatCodeupgradeImplUpgr.getExample();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3 = new OASComDayCqCompatCodeupgradeImplUpgr();
        OASComDayCqCompatCodeupgradeImplUpgr comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4 = new OASComDayCqCompatCodeupgradeImplUpgr();

        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2));
        System.assert(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3.equals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4));
        System.assertEquals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties1.hashCode(), comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties2.hashCode());
        System.assertEquals(comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties3.hashCode(), comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties4.hashCode());
    }
}
