@isTest
private class OASComDayCqDamStockIntegrationImplCoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1 = OASComDayCqDamStockIntegrationImplCo.getExample();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2 = comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1;
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3 = new OASComDayCqDamStockIntegrationImplCo();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4 = comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3;

        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1 = OASComDayCqDamStockIntegrationImplCo.getExample();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2 = OASComDayCqDamStockIntegrationImplCo.getExample();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3 = new OASComDayCqDamStockIntegrationImplCo();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4 = new OASComDayCqDamStockIntegrationImplCo();

        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1 = OASComDayCqDamStockIntegrationImplCo.getExample();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2 = new OASComDayCqDamStockIntegrationImplCo();

        System.assertEquals(false, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1 = OASComDayCqDamStockIntegrationImplCo.getExample();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2 = new OASComDayCqDamStockIntegrationImplCo();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3;

        System.assertEquals(false, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3));
        System.assertEquals(false, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1 = OASComDayCqDamStockIntegrationImplCo.getExample();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2 = new OASComDayCqDamStockIntegrationImplCo();

        System.assertEquals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.hashCode(), comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.hashCode());
        System.assertEquals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2.hashCode(), comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1 = OASComDayCqDamStockIntegrationImplCo.getExample();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2 = OASComDayCqDamStockIntegrationImplCo.getExample();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3 = new OASComDayCqDamStockIntegrationImplCo();
        OASComDayCqDamStockIntegrationImplCo comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4 = new OASComDayCqDamStockIntegrationImplCo();

        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2));
        System.assert(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3.equals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4));
        System.assertEquals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties1.hashCode(), comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties2.hashCode());
        System.assertEquals(comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties3.hashCode(), comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties4.hashCode());
    }
}
