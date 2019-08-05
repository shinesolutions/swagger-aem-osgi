@isTest
private class OASComDayCqWcmMsmImplActionsPageMoveTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsPageMove.getExample();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2 = comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1;
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsPageMove();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4 = comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3;

        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsPageMove.getExample();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsPageMove.getExample();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsPageMove();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsPageMove();

        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsPageMove.getExample();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsPageMove();

        System.assertEquals(false, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsPageMove.getExample();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsPageMove();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsPageMove.getExample();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsPageMove();

        System.assertEquals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2.hashCode(), comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsPageMove.getExample();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsPageMove.getExample();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsPageMove();
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsPageMove();

        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4));
        System.assertEquals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties3.hashCode(), comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplActionsPageMove comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties = new OASComDayCqWcmMsmImplActionsPageMove();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.getPropertyMappings();
        System.assertEquals('cqWcmMsmActionExcludednodetypes', propertyMappings.get('cq.wcm.msm.action.excludednodetypes'));
        System.assertEquals('cqWcmMsmActionExcludedparagraphitems', propertyMappings.get('cq.wcm.msm.action.excludedparagraphitems'));
        System.assertEquals('cqWcmMsmActionExcludedprops', propertyMappings.get('cq.wcm.msm.action.excludedprops'));
        System.assertEquals('cqWcmMsmImplActionsPagemovePropReferenceUpdate', propertyMappings.get('cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate'));
    }
}
