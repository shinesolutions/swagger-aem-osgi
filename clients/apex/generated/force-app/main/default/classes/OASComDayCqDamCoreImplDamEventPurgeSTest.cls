@isTest
private class OASComDayCqDamCoreImplDamEventPurgeSTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties1 = OASComDayCqDamCoreImplDamEventPurgeS.getExample();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties2 = comDayCqDamCoreImplDamEventPurgeServiceProperties1;
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties3 = new OASComDayCqDamCoreImplDamEventPurgeS();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties4 = comDayCqDamCoreImplDamEventPurgeServiceProperties3;

        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties1.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties2));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties2.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties1));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties1.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties1));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties3.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties4));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties4.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties3));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties3.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties1 = OASComDayCqDamCoreImplDamEventPurgeS.getExample();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties2 = OASComDayCqDamCoreImplDamEventPurgeS.getExample();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties3 = new OASComDayCqDamCoreImplDamEventPurgeS();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties4 = new OASComDayCqDamCoreImplDamEventPurgeS();

        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties1.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties2));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties2.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties1));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties3.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties4));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties4.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties1 = OASComDayCqDamCoreImplDamEventPurgeS.getExample();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties2 = new OASComDayCqDamCoreImplDamEventPurgeS();

        System.assertEquals(false, comDayCqDamCoreImplDamEventPurgeServiceProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplDamEventPurgeServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties1 = OASComDayCqDamCoreImplDamEventPurgeS.getExample();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties2 = new OASComDayCqDamCoreImplDamEventPurgeS();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties3;

        System.assertEquals(false, comDayCqDamCoreImplDamEventPurgeServiceProperties1.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties3));
        System.assertEquals(false, comDayCqDamCoreImplDamEventPurgeServiceProperties2.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties1 = OASComDayCqDamCoreImplDamEventPurgeS.getExample();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties2 = new OASComDayCqDamCoreImplDamEventPurgeS();

        System.assertEquals(comDayCqDamCoreImplDamEventPurgeServiceProperties1.hashCode(), comDayCqDamCoreImplDamEventPurgeServiceProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplDamEventPurgeServiceProperties2.hashCode(), comDayCqDamCoreImplDamEventPurgeServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties1 = OASComDayCqDamCoreImplDamEventPurgeS.getExample();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties2 = OASComDayCqDamCoreImplDamEventPurgeS.getExample();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties3 = new OASComDayCqDamCoreImplDamEventPurgeS();
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties4 = new OASComDayCqDamCoreImplDamEventPurgeS();

        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties1.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties2));
        System.assert(comDayCqDamCoreImplDamEventPurgeServiceProperties3.equals(comDayCqDamCoreImplDamEventPurgeServiceProperties4));
        System.assertEquals(comDayCqDamCoreImplDamEventPurgeServiceProperties1.hashCode(), comDayCqDamCoreImplDamEventPurgeServiceProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplDamEventPurgeServiceProperties3.hashCode(), comDayCqDamCoreImplDamEventPurgeServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplDamEventPurgeS comDayCqDamCoreImplDamEventPurgeServiceProperties = new OASComDayCqDamCoreImplDamEventPurgeS();
        Map<String, String> propertyMappings = comDayCqDamCoreImplDamEventPurgeServiceProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
    }
}
