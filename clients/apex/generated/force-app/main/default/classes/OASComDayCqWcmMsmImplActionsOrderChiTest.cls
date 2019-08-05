@isTest
private class OASComDayCqWcmMsmImplActionsOrderChiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsOrderChi.getExample();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2 = comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1;
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsOrderChi();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4 = comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3;

        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsOrderChi.getExample();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsOrderChi.getExample();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsOrderChi();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsOrderChi();

        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsOrderChi.getExample();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsOrderChi();

        System.assertEquals(false, comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsOrderChi.getExample();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsOrderChi();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsOrderChi.getExample();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsOrderChi();

        System.assertEquals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2.hashCode(), comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsOrderChi.getExample();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsOrderChi.getExample();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsOrderChi();
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsOrderChi();

        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4));
        System.assertEquals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties3.hashCode(), comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplActionsOrderChi comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties = new OASComDayCqWcmMsmImplActionsOrderChi();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.getPropertyMappings();
        System.assertEquals('cqWcmMsmActionExcludednodetypes', propertyMappings.get('cq.wcm.msm.action.excludednodetypes'));
        System.assertEquals('cqWcmMsmActionExcludedparagraphitems', propertyMappings.get('cq.wcm.msm.action.excludedparagraphitems'));
        System.assertEquals('cqWcmMsmActionExcludedprops', propertyMappings.get('cq.wcm.msm.action.excludedprops'));
    }
}
