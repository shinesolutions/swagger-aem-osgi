@isTest
private class OASComDayCqWcmMsmImplActionsContentUTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentU.getExample();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2 = comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1;
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentU();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4 = comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3;

        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentU.getExample();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsContentU.getExample();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentU();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsContentU();

        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentU.getExample();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentU();

        System.assertEquals(false, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentU.getExample();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentU();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentU.getExample();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentU();

        System.assertEquals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2.hashCode(), comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentU.getExample();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsContentU.getExample();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentU();
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsContentU();

        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4));
        System.assertEquals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties3.hashCode(), comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplActionsContentU comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties = new OASComDayCqWcmMsmImplActionsContentU();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.getPropertyMappings();
        System.assertEquals('cqWcmMsmActionExcludednodetypes', propertyMappings.get('cq.wcm.msm.action.excludednodetypes'));
        System.assertEquals('cqWcmMsmActionExcludedparagraphitems', propertyMappings.get('cq.wcm.msm.action.excludedparagraphitems'));
        System.assertEquals('cqWcmMsmActionExcludedprops', propertyMappings.get('cq.wcm.msm.action.excludedprops'));
        System.assertEquals('cqWcmMsmActionIgnoredMixin', propertyMappings.get('cq.wcm.msm.action.ignoredMixin'));
    }
}
