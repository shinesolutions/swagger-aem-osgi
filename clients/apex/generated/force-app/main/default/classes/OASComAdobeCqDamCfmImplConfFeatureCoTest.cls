@isTest
private class OASComAdobeCqDamCfmImplConfFeatureCoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties1 = OASComAdobeCqDamCfmImplConfFeatureCo.getExample();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties2 = comAdobeCqDamCfmImplConfFeatureConfigImplProperties1;
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties3 = new OASComAdobeCqDamCfmImplConfFeatureCo();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties4 = comAdobeCqDamCfmImplConfFeatureConfigImplProperties3;

        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties2));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties2.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties4));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties4.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties1 = OASComAdobeCqDamCfmImplConfFeatureCo.getExample();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties2 = OASComAdobeCqDamCfmImplConfFeatureCo.getExample();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties3 = new OASComAdobeCqDamCfmImplConfFeatureCo();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties4 = new OASComAdobeCqDamCfmImplConfFeatureCo();

        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties2));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties2.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties4));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties4.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties1 = OASComAdobeCqDamCfmImplConfFeatureCo.getExample();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties2 = new OASComAdobeCqDamCfmImplConfFeatureCo();

        System.assertEquals(false, comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamCfmImplConfFeatureConfigImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties1 = OASComAdobeCqDamCfmImplConfFeatureCo.getExample();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties2 = new OASComAdobeCqDamCfmImplConfFeatureCo();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties3;

        System.assertEquals(false, comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3));
        System.assertEquals(false, comAdobeCqDamCfmImplConfFeatureConfigImplProperties2.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties1 = OASComAdobeCqDamCfmImplConfFeatureCo.getExample();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties2 = new OASComAdobeCqDamCfmImplConfFeatureCo();

        System.assertEquals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.hashCode(), comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.hashCode());
        System.assertEquals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties2.hashCode(), comAdobeCqDamCfmImplConfFeatureConfigImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties1 = OASComAdobeCqDamCfmImplConfFeatureCo.getExample();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties2 = OASComAdobeCqDamCfmImplConfFeatureCo.getExample();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties3 = new OASComAdobeCqDamCfmImplConfFeatureCo();
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties4 = new OASComAdobeCqDamCfmImplConfFeatureCo();

        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties2));
        System.assert(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3.equals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties4));
        System.assertEquals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties1.hashCode(), comAdobeCqDamCfmImplConfFeatureConfigImplProperties2.hashCode());
        System.assertEquals(comAdobeCqDamCfmImplConfFeatureConfigImplProperties3.hashCode(), comAdobeCqDamCfmImplConfFeatureConfigImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamCfmImplConfFeatureCo comAdobeCqDamCfmImplConfFeatureConfigImplProperties = new OASComAdobeCqDamCfmImplConfFeatureCo();
        Map<String, String> propertyMappings = comAdobeCqDamCfmImplConfFeatureConfigImplProperties.getPropertyMappings();
        System.assertEquals('damCfmResourceTypes', propertyMappings.get('dam.cfm.resourceTypes'));
        System.assertEquals('damCfmReferenceProperties', propertyMappings.get('dam.cfm.referenceProperties'));
    }
}
