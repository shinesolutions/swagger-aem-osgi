@isTest
private class OASComDayCqDamCoreImplReportsReportPTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties1 = OASComDayCqDamCoreImplReportsReportP.getExample();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties2 = comDayCqDamCoreImplReportsReportPurgeServiceProperties1;
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties3 = new OASComDayCqDamCoreImplReportsReportP();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties4 = comDayCqDamCoreImplReportsReportPurgeServiceProperties3;

        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties1.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties2));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties2.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties1));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties1.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties1));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties3.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties4));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties4.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties3));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties3.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties1 = OASComDayCqDamCoreImplReportsReportP.getExample();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties2 = OASComDayCqDamCoreImplReportsReportP.getExample();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties3 = new OASComDayCqDamCoreImplReportsReportP();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties4 = new OASComDayCqDamCoreImplReportsReportP();

        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties1.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties2));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties2.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties1));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties3.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties4));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties4.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties1 = OASComDayCqDamCoreImplReportsReportP.getExample();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties2 = new OASComDayCqDamCoreImplReportsReportP();

        System.assertEquals(false, comDayCqDamCoreImplReportsReportPurgeServiceProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplReportsReportPurgeServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties1 = OASComDayCqDamCoreImplReportsReportP.getExample();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties2 = new OASComDayCqDamCoreImplReportsReportP();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties3;

        System.assertEquals(false, comDayCqDamCoreImplReportsReportPurgeServiceProperties1.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties3));
        System.assertEquals(false, comDayCqDamCoreImplReportsReportPurgeServiceProperties2.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties1 = OASComDayCqDamCoreImplReportsReportP.getExample();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties2 = new OASComDayCqDamCoreImplReportsReportP();

        System.assertEquals(comDayCqDamCoreImplReportsReportPurgeServiceProperties1.hashCode(), comDayCqDamCoreImplReportsReportPurgeServiceProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplReportsReportPurgeServiceProperties2.hashCode(), comDayCqDamCoreImplReportsReportPurgeServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties1 = OASComDayCqDamCoreImplReportsReportP.getExample();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties2 = OASComDayCqDamCoreImplReportsReportP.getExample();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties3 = new OASComDayCqDamCoreImplReportsReportP();
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties4 = new OASComDayCqDamCoreImplReportsReportP();

        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties1.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties2));
        System.assert(comDayCqDamCoreImplReportsReportPurgeServiceProperties3.equals(comDayCqDamCoreImplReportsReportPurgeServiceProperties4));
        System.assertEquals(comDayCqDamCoreImplReportsReportPurgeServiceProperties1.hashCode(), comDayCqDamCoreImplReportsReportPurgeServiceProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplReportsReportPurgeServiceProperties3.hashCode(), comDayCqDamCoreImplReportsReportPurgeServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplReportsReportP comDayCqDamCoreImplReportsReportPurgeServiceProperties = new OASComDayCqDamCoreImplReportsReportP();
        Map<String, String> propertyMappings = comDayCqDamCoreImplReportsReportPurgeServiceProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
    }
}
