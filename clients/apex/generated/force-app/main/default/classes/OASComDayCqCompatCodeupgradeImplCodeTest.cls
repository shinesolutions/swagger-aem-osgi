@isTest
private class OASComDayCqCompatCodeupgradeImplCodeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1 = OASComDayCqCompatCodeupgradeImplCode.getExample();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2 = comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1;
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3 = new OASComDayCqCompatCodeupgradeImplCode();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4 = comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3;

        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1 = OASComDayCqCompatCodeupgradeImplCode.getExample();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2 = OASComDayCqCompatCodeupgradeImplCode.getExample();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3 = new OASComDayCqCompatCodeupgradeImplCode();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4 = new OASComDayCqCompatCodeupgradeImplCode();

        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1 = OASComDayCqCompatCodeupgradeImplCode.getExample();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2 = new OASComDayCqCompatCodeupgradeImplCode();

        System.assertEquals(false, comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.equals('foo'));
        System.assertEquals(false, comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1 = OASComDayCqCompatCodeupgradeImplCode.getExample();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2 = new OASComDayCqCompatCodeupgradeImplCode();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3;

        System.assertEquals(false, comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3));
        System.assertEquals(false, comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1 = OASComDayCqCompatCodeupgradeImplCode.getExample();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2 = new OASComDayCqCompatCodeupgradeImplCode();

        System.assertEquals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.hashCode(), comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.hashCode());
        System.assertEquals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2.hashCode(), comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1 = OASComDayCqCompatCodeupgradeImplCode.getExample();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2 = OASComDayCqCompatCodeupgradeImplCode.getExample();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3 = new OASComDayCqCompatCodeupgradeImplCode();
        OASComDayCqCompatCodeupgradeImplCode comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4 = new OASComDayCqCompatCodeupgradeImplCode();

        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2));
        System.assert(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3.equals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4));
        System.assertEquals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties1.hashCode(), comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties2.hashCode());
        System.assertEquals(comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties3.hashCode(), comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties4.hashCode());
    }
}
