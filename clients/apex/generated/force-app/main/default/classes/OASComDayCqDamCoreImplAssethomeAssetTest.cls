@isTest
private class OASComDayCqDamCoreImplAssethomeAssetTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1 = OASComDayCqDamCoreImplAssethomeAsset.getExample();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2 = comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1;
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3 = new OASComDayCqDamCoreImplAssethomeAsset();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4 = comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3;

        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1 = OASComDayCqDamCoreImplAssethomeAsset.getExample();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2 = OASComDayCqDamCoreImplAssethomeAsset.getExample();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3 = new OASComDayCqDamCoreImplAssethomeAsset();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4 = new OASComDayCqDamCoreImplAssethomeAsset();

        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1 = OASComDayCqDamCoreImplAssethomeAsset.getExample();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2 = new OASComDayCqDamCoreImplAssethomeAsset();

        System.assertEquals(false, comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1 = OASComDayCqDamCoreImplAssethomeAsset.getExample();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2 = new OASComDayCqDamCoreImplAssethomeAsset();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3;

        System.assertEquals(false, comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3));
        System.assertEquals(false, comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1 = OASComDayCqDamCoreImplAssethomeAsset.getExample();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2 = new OASComDayCqDamCoreImplAssethomeAsset();

        System.assertEquals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.hashCode(), comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2.hashCode(), comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1 = OASComDayCqDamCoreImplAssethomeAsset.getExample();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2 = OASComDayCqDamCoreImplAssethomeAsset.getExample();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3 = new OASComDayCqDamCoreImplAssethomeAsset();
        OASComDayCqDamCoreImplAssethomeAsset comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4 = new OASComDayCqDamCoreImplAssethomeAsset();

        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2));
        System.assert(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3.equals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4));
        System.assertEquals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties1.hashCode(), comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties3.hashCode(), comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties4.hashCode());
    }
}
