@isTest
private class OASComDayCqWcmMsmImplRolloutManagerITest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties1 = OASComDayCqWcmMsmImplRolloutManagerI.getExample();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties2 = comDayCqWcmMsmImplRolloutManagerImplProperties1;
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties3 = new OASComDayCqWcmMsmImplRolloutManagerI();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties4 = comDayCqWcmMsmImplRolloutManagerImplProperties3;

        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties1.equals(comDayCqWcmMsmImplRolloutManagerImplProperties2));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties2.equals(comDayCqWcmMsmImplRolloutManagerImplProperties1));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties1.equals(comDayCqWcmMsmImplRolloutManagerImplProperties1));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties3.equals(comDayCqWcmMsmImplRolloutManagerImplProperties4));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties4.equals(comDayCqWcmMsmImplRolloutManagerImplProperties3));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties3.equals(comDayCqWcmMsmImplRolloutManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties1 = OASComDayCqWcmMsmImplRolloutManagerI.getExample();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties2 = OASComDayCqWcmMsmImplRolloutManagerI.getExample();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties3 = new OASComDayCqWcmMsmImplRolloutManagerI();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties4 = new OASComDayCqWcmMsmImplRolloutManagerI();

        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties1.equals(comDayCqWcmMsmImplRolloutManagerImplProperties2));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties2.equals(comDayCqWcmMsmImplRolloutManagerImplProperties1));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties3.equals(comDayCqWcmMsmImplRolloutManagerImplProperties4));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties4.equals(comDayCqWcmMsmImplRolloutManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties1 = OASComDayCqWcmMsmImplRolloutManagerI.getExample();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties2 = new OASComDayCqWcmMsmImplRolloutManagerI();

        System.assertEquals(false, comDayCqWcmMsmImplRolloutManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplRolloutManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties1 = OASComDayCqWcmMsmImplRolloutManagerI.getExample();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties2 = new OASComDayCqWcmMsmImplRolloutManagerI();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplRolloutManagerImplProperties1.equals(comDayCqWcmMsmImplRolloutManagerImplProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplRolloutManagerImplProperties2.equals(comDayCqWcmMsmImplRolloutManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties1 = OASComDayCqWcmMsmImplRolloutManagerI.getExample();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties2 = new OASComDayCqWcmMsmImplRolloutManagerI();

        System.assertEquals(comDayCqWcmMsmImplRolloutManagerImplProperties1.hashCode(), comDayCqWcmMsmImplRolloutManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplRolloutManagerImplProperties2.hashCode(), comDayCqWcmMsmImplRolloutManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties1 = OASComDayCqWcmMsmImplRolloutManagerI.getExample();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties2 = OASComDayCqWcmMsmImplRolloutManagerI.getExample();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties3 = new OASComDayCqWcmMsmImplRolloutManagerI();
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties4 = new OASComDayCqWcmMsmImplRolloutManagerI();

        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties1.equals(comDayCqWcmMsmImplRolloutManagerImplProperties2));
        System.assert(comDayCqWcmMsmImplRolloutManagerImplProperties3.equals(comDayCqWcmMsmImplRolloutManagerImplProperties4));
        System.assertEquals(comDayCqWcmMsmImplRolloutManagerImplProperties1.hashCode(), comDayCqWcmMsmImplRolloutManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplRolloutManagerImplProperties3.hashCode(), comDayCqWcmMsmImplRolloutManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplRolloutManagerI comDayCqWcmMsmImplRolloutManagerImplProperties = new OASComDayCqWcmMsmImplRolloutManagerI();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplRolloutManagerImplProperties.getPropertyMappings();
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
        System.assertEquals('rolloutmgrExcludedpropsDefault', propertyMappings.get('rolloutmgr.excludedprops.default'));
        System.assertEquals('rolloutmgrExcludedparagraphpropsDefault', propertyMappings.get('rolloutmgr.excludedparagraphprops.default'));
        System.assertEquals('rolloutmgrExcludednodetypesDefault', propertyMappings.get('rolloutmgr.excludednodetypes.default'));
        System.assertEquals('rolloutmgrThreadpoolMaxsize', propertyMappings.get('rolloutmgr.threadpool.maxsize'));
        System.assertEquals('rolloutmgrThreadpoolMaxshutdowntime', propertyMappings.get('rolloutmgr.threadpool.maxshutdowntime'));
        System.assertEquals('rolloutmgrThreadpoolPriority', propertyMappings.get('rolloutmgr.threadpool.priority'));
        System.assertEquals('rolloutmgrCommitSize', propertyMappings.get('rolloutmgr.commit.size'));
        System.assertEquals('rolloutmgrConflicthandlingEnabled', propertyMappings.get('rolloutmgr.conflicthandling.enabled'));
    }
}
