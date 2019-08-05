@isTest
private class OASComDayCqWcmMsmImplActionsReferencTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsReferenc.getExample();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2 = comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1;
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsReferenc();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4 = comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3;

        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsReferenc.getExample();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsReferenc.getExample();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsReferenc();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsReferenc();

        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsReferenc.getExample();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsReferenc();

        System.assertEquals(false, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsReferenc.getExample();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsReferenc();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3;

        System.assertEquals(false, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3));
        System.assertEquals(false, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsReferenc.getExample();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2 = new OASComDayCqWcmMsmImplActionsReferenc();

        System.assertEquals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2.hashCode(), comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1 = OASComDayCqWcmMsmImplActionsReferenc.getExample();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2 = OASComDayCqWcmMsmImplActionsReferenc.getExample();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3 = new OASComDayCqWcmMsmImplActionsReferenc();
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4 = new OASComDayCqWcmMsmImplActionsReferenc();

        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2));
        System.assert(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3.equals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4));
        System.assertEquals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties1.hashCode(), comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties2.hashCode());
        System.assertEquals(comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties3.hashCode(), comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMsmImplActionsReferenc comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties = new OASComDayCqWcmMsmImplActionsReferenc();
        Map<String, String> propertyMappings = comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.getPropertyMappings();
        System.assertEquals('cqWcmMsmActionExcludednodetypes', propertyMappings.get('cq.wcm.msm.action.excludednodetypes'));
        System.assertEquals('cqWcmMsmActionExcludedparagraphitems', propertyMappings.get('cq.wcm.msm.action.excludedparagraphitems'));
        System.assertEquals('cqWcmMsmActionExcludedprops', propertyMappings.get('cq.wcm.msm.action.excludedprops'));
        System.assertEquals('cqWcmMsmImplActionReferencesupdatePropUpdateNested', propertyMappings.get('cq.wcm.msm.impl.action.referencesupdate.prop_updateNested'));
    }
}
