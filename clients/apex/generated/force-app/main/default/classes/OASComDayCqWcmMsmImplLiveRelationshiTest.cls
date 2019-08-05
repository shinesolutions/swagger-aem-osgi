@isTest
private class OASComDayCqWcmMsmImplLiveRelationshiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1 = OASComDayCqWcmMsmImplLiveRelationshi.getExample();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2 = comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1;
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3 = new OASComDayCqWcmMsmImplLiveRelationshi();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4 = comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3;

        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1 = OASComDayCqWcmMsmImplLiveRelationshi.getExample();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2 = OASComDayCqWcmMsmImplLiveRelationshi.getExample();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3 = new OASComDayCqWcmMsmImplLiveRelationshi();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4 = new OASComDayCqWcmMsmImplLiveRelationshi();

        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1 = OASComDayCqWcmMsmImplLiveRelationshi.getExample();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2 = new OASComDayCqWcmMsmImplLiveRelationshi();

        System.assertEquals(false, comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1 = OASComDayCqWcmMsmImplLiveRelationshi.getExample();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2 = new OASComDayCqWcmMsmImplLiveRelationshi();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1 = OASComDayCqWcmMsmImplLiveRelationshi.getExample();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2 = new OASComDayCqWcmMsmImplLiveRelationshi();

        System.assertEquals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.hashCode(), comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2.hashCode(), comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1 = OASComDayCqWcmMsmImplLiveRelationshi.getExample();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2 = OASComDayCqWcmMsmImplLiveRelationshi.getExample();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3 = new OASComDayCqWcmMsmImplLiveRelationshi();
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4 = new OASComDayCqWcmMsmImplLiveRelationshi();

        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2));
        System.assert(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3.equals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4));
        System.assertEquals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties1.hashCode(), comDayCqWcmMsmImplLiveRelationshipManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplLiveRelationshipManagerImplProperties3.hashCode(), comDayCqWcmMsmImplLiveRelationshipManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplLiveRelationshi comDayCqWcmMsmImplLiveRelationshipManagerImplProperties = new OASComDayCqWcmMsmImplLiveRelationshi();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplLiveRelationshipManagerImplProperties.getPropertyMappings();
        System.assertEquals('liverelationshipmgrRelationsconfigDefault', propertyMappings.get('liverelationshipmgr.relationsconfig.default'));
    }
}
