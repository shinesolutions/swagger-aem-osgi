@isTest
private class OASComDayCqWcmMsmImplActionsContentCTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentC.getExample();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2 = comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1;
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentC();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4 = comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3;

        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentC.getExample();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsContentC.getExample();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentC();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsContentC();

        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentC.getExample();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentC();

        System.assertEquals(false, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentC.getExample();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentC();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentC.getExample();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentC();

        System.assertEquals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2.hashCode(), comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentC.getExample();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsContentC.getExample();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentC();
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsContentC();

        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4));
        System.assertEquals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties3.hashCode(), comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplActionsContentC comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties = new OASComDayCqWcmMsmImplActionsContentC();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.getPropertyMappings();
        System.assertEquals('cqWcmMsmActionExcludednodetypes', propertyMappings.get('cq.wcm.msm.action.excludednodetypes'));
        System.assertEquals('cqWcmMsmActionExcludedparagraphitems', propertyMappings.get('cq.wcm.msm.action.excludedparagraphitems'));
        System.assertEquals('cqWcmMsmActionExcludedprops', propertyMappings.get('cq.wcm.msm.action.excludedprops'));
        System.assertEquals('contentcopyactionOrderStyle', propertyMappings.get('contentcopyaction.order.style'));
    }
}
