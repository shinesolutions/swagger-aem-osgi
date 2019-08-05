@isTest
private class OASComDayCqStatisticsImplStatisticsSTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties1 = OASComDayCqStatisticsImplStatisticsS.getExample();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties2 = comDayCqStatisticsImplStatisticsServiceImplProperties1;
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties3 = new OASComDayCqStatisticsImplStatisticsS();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties4 = comDayCqStatisticsImplStatisticsServiceImplProperties3;

        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties1.equals(comDayCqStatisticsImplStatisticsServiceImplProperties2));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties2.equals(comDayCqStatisticsImplStatisticsServiceImplProperties1));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties1.equals(comDayCqStatisticsImplStatisticsServiceImplProperties1));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties3.equals(comDayCqStatisticsImplStatisticsServiceImplProperties4));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties4.equals(comDayCqStatisticsImplStatisticsServiceImplProperties3));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties3.equals(comDayCqStatisticsImplStatisticsServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties1 = OASComDayCqStatisticsImplStatisticsS.getExample();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties2 = OASComDayCqStatisticsImplStatisticsS.getExample();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties3 = new OASComDayCqStatisticsImplStatisticsS();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties4 = new OASComDayCqStatisticsImplStatisticsS();

        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties1.equals(comDayCqStatisticsImplStatisticsServiceImplProperties2));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties2.equals(comDayCqStatisticsImplStatisticsServiceImplProperties1));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties3.equals(comDayCqStatisticsImplStatisticsServiceImplProperties4));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties4.equals(comDayCqStatisticsImplStatisticsServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties1 = OASComDayCqStatisticsImplStatisticsS.getExample();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties2 = new OASComDayCqStatisticsImplStatisticsS();

        System.assertEquals(false, comDayCqStatisticsImplStatisticsServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqStatisticsImplStatisticsServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties1 = OASComDayCqStatisticsImplStatisticsS.getExample();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties2 = new OASComDayCqStatisticsImplStatisticsS();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties3;

        System.assertEquals(false, comDayCqStatisticsImplStatisticsServiceImplProperties1.equals(comDayCqStatisticsImplStatisticsServiceImplProperties3));
        System.assertEquals(false, comDayCqStatisticsImplStatisticsServiceImplProperties2.equals(comDayCqStatisticsImplStatisticsServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties1 = OASComDayCqStatisticsImplStatisticsS.getExample();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties2 = new OASComDayCqStatisticsImplStatisticsS();

        System.assertEquals(comDayCqStatisticsImplStatisticsServiceImplProperties1.hashCode(), comDayCqStatisticsImplStatisticsServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqStatisticsImplStatisticsServiceImplProperties2.hashCode(), comDayCqStatisticsImplStatisticsServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties1 = OASComDayCqStatisticsImplStatisticsS.getExample();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties2 = OASComDayCqStatisticsImplStatisticsS.getExample();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties3 = new OASComDayCqStatisticsImplStatisticsS();
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties4 = new OASComDayCqStatisticsImplStatisticsS();

        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties1.equals(comDayCqStatisticsImplStatisticsServiceImplProperties2));
        System.assert(comDayCqStatisticsImplStatisticsServiceImplProperties3.equals(comDayCqStatisticsImplStatisticsServiceImplProperties4));
        System.assertEquals(comDayCqStatisticsImplStatisticsServiceImplProperties1.hashCode(), comDayCqStatisticsImplStatisticsServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqStatisticsImplStatisticsServiceImplProperties3.hashCode(), comDayCqStatisticsImplStatisticsServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqStatisticsImplStatisticsS comDayCqStatisticsImplStatisticsServiceImplProperties = new OASComDayCqStatisticsImplStatisticsS();
        Map<String, String> propertyMappings = comDayCqStatisticsImplStatisticsServiceImplProperties.getPropertyMappings();
        System.assertEquals('schedulerPeriod', propertyMappings.get('scheduler.period'));
        System.assertEquals('schedulerConcurrent', propertyMappings.get('scheduler.concurrent'));
    }
}
