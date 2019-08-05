@isTest
private class OASComDayCqDamStockIntegrationImplCaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1 = OASComDayCqDamStockIntegrationImplCa.getExample();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2 = comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1;
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3 = new OASComDayCqDamStockIntegrationImplCa();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4 = comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3;

        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1 = OASComDayCqDamStockIntegrationImplCa.getExample();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2 = OASComDayCqDamStockIntegrationImplCa.getExample();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3 = new OASComDayCqDamStockIntegrationImplCa();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4 = new OASComDayCqDamStockIntegrationImplCa();

        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1 = OASComDayCqDamStockIntegrationImplCa.getExample();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2 = new OASComDayCqDamStockIntegrationImplCa();

        System.assertEquals(false, comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1 = OASComDayCqDamStockIntegrationImplCa.getExample();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2 = new OASComDayCqDamStockIntegrationImplCa();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3;

        System.assertEquals(false, comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3));
        System.assertEquals(false, comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1 = OASComDayCqDamStockIntegrationImplCa.getExample();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2 = new OASComDayCqDamStockIntegrationImplCa();

        System.assertEquals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.hashCode(), comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.hashCode());
        System.assertEquals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2.hashCode(), comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1 = OASComDayCqDamStockIntegrationImplCa.getExample();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2 = OASComDayCqDamStockIntegrationImplCa.getExample();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3 = new OASComDayCqDamStockIntegrationImplCa();
        OASComDayCqDamStockIntegrationImplCa comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4 = new OASComDayCqDamStockIntegrationImplCa();

        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2));
        System.assert(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3.equals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4));
        System.assertEquals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties1.hashCode(), comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties2.hashCode());
        System.assertEquals(comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties3.hashCode(), comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties4.hashCode());
    }
}
