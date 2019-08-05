@isTest
private class OASComDayCqWcmMsmImplActionsContentDTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentD.getExample();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2 = comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1;
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentD();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4 = comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3;

        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentD.getExample();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsContentD.getExample();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentD();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsContentD();

        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentD.getExample();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentD();

        System.assertEquals(false, comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentD.getExample();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentD();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentD.getExample();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsContentD();

        System.assertEquals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2.hashCode(), comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsContentD.getExample();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsContentD.getExample();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsContentD();
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsContentD();

        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4));
        System.assertEquals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties3.hashCode(), comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplActionsContentD comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties = new OASComDayCqWcmMsmImplActionsContentD();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.getPropertyMappings();
        System.assertEquals('cqWcmMsmActionExcludednodetypes', propertyMappings.get('cq.wcm.msm.action.excludednodetypes'));
        System.assertEquals('cqWcmMsmActionExcludedparagraphitems', propertyMappings.get('cq.wcm.msm.action.excludedparagraphitems'));
        System.assertEquals('cqWcmMsmActionExcludedprops', propertyMappings.get('cq.wcm.msm.action.excludedprops'));
    }
}
