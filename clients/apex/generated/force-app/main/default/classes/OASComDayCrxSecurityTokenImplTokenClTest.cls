@isTest
private class OASComDayCrxSecurityTokenImplTokenClTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties1 = OASComDayCrxSecurityTokenImplTokenCl.getExample();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties2 = comDayCrxSecurityTokenImplTokenCleanupTaskProperties1;
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties3 = new OASComDayCrxSecurityTokenImplTokenCl();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties4 = comDayCrxSecurityTokenImplTokenCleanupTaskProperties3;

        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties2));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties2.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties4));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties4.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties1 = OASComDayCrxSecurityTokenImplTokenCl.getExample();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties2 = OASComDayCrxSecurityTokenImplTokenCl.getExample();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties3 = new OASComDayCrxSecurityTokenImplTokenCl();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties4 = new OASComDayCrxSecurityTokenImplTokenCl();

        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties2));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties2.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties4));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties4.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties1 = OASComDayCrxSecurityTokenImplTokenCl.getExample();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties2 = new OASComDayCrxSecurityTokenImplTokenCl();

        System.assertEquals(false, comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.equals('foo'));
        System.assertEquals(false, comDayCrxSecurityTokenImplTokenCleanupTaskProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties1 = OASComDayCrxSecurityTokenImplTokenCl.getExample();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties2 = new OASComDayCrxSecurityTokenImplTokenCl();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties3;

        System.assertEquals(false, comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3));
        System.assertEquals(false, comDayCrxSecurityTokenImplTokenCleanupTaskProperties2.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties1 = OASComDayCrxSecurityTokenImplTokenCl.getExample();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties2 = new OASComDayCrxSecurityTokenImplTokenCl();

        System.assertEquals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.hashCode(), comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.hashCode());
        System.assertEquals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties2.hashCode(), comDayCrxSecurityTokenImplTokenCleanupTaskProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties1 = OASComDayCrxSecurityTokenImplTokenCl.getExample();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties2 = OASComDayCrxSecurityTokenImplTokenCl.getExample();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties3 = new OASComDayCrxSecurityTokenImplTokenCl();
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties4 = new OASComDayCrxSecurityTokenImplTokenCl();

        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties2));
        System.assert(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3.equals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties4));
        System.assertEquals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties1.hashCode(), comDayCrxSecurityTokenImplTokenCleanupTaskProperties2.hashCode());
        System.assertEquals(comDayCrxSecurityTokenImplTokenCleanupTaskProperties3.hashCode(), comDayCrxSecurityTokenImplTokenCleanupTaskProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCrxSecurityTokenImplTokenCl comDayCrxSecurityTokenImplTokenCleanupTaskProperties = new OASComDayCrxSecurityTokenImplTokenCl();
        Map<String, String> propertyMappings = comDayCrxSecurityTokenImplTokenCleanupTaskProperties.getPropertyMappings();
        System.assertEquals('enableTokenCleanupTask', propertyMappings.get('enable.token.cleanup.task'));
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
        System.assertEquals('batchSize', propertyMappings.get('batch.size'));
    }
}
