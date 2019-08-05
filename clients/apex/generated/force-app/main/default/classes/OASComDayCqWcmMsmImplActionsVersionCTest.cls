@isTest
private class OASComDayCqWcmMsmImplActionsVersionCTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsVersionC.getExample();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2 = comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1;
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsVersionC();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4 = comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3;

        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsVersionC.getExample();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsVersionC.getExample();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsVersionC();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsVersionC();

        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsVersionC.getExample();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsVersionC();

        System.assertEquals(false, comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsVersionC.getExample();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsVersionC();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsVersionC.getExample();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsVersionC();

        System.assertEquals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2.hashCode(), comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsVersionC.getExample();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsVersionC.getExample();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsVersionC();
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsVersionC();

        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4));
        System.assertEquals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties3.hashCode(), comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplActionsVersionC comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties = new OASComDayCqWcmMsmImplActionsVersionC();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties.getPropertyMappings();
        System.assertEquals('cqWcmMsmActionExcludednodetypes', propertyMappings.get('cq.wcm.msm.action.excludednodetypes'));
        System.assertEquals('cqWcmMsmActionExcludedparagraphitems', propertyMappings.get('cq.wcm.msm.action.excludedparagraphitems'));
        System.assertEquals('cqWcmMsmActionExcludedprops', propertyMappings.get('cq.wcm.msm.action.excludedprops'));
    }
}
