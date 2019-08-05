@isTest
private class OASComDayCqWcmCoreImplPagePageInfoAgTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1 = OASComDayCqWcmCoreImplPagePageInfoAg.getExample();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2 = comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1;
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3 = new OASComDayCqWcmCoreImplPagePageInfoAg();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4 = comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3;

        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1 = OASComDayCqWcmCoreImplPagePageInfoAg.getExample();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2 = OASComDayCqWcmCoreImplPagePageInfoAg.getExample();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3 = new OASComDayCqWcmCoreImplPagePageInfoAg();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4 = new OASComDayCqWcmCoreImplPagePageInfoAg();

        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1 = OASComDayCqWcmCoreImplPagePageInfoAg.getExample();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2 = new OASComDayCqWcmCoreImplPagePageInfoAg();

        System.assertEquals(false, comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1 = OASComDayCqWcmCoreImplPagePageInfoAg.getExample();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2 = new OASComDayCqWcmCoreImplPagePageInfoAg();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1 = OASComDayCqWcmCoreImplPagePageInfoAg.getExample();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2 = new OASComDayCqWcmCoreImplPagePageInfoAg();

        System.assertEquals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.hashCode(), comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2.hashCode(), comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1 = OASComDayCqWcmCoreImplPagePageInfoAg.getExample();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2 = OASComDayCqWcmCoreImplPagePageInfoAg.getExample();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3 = new OASComDayCqWcmCoreImplPagePageInfoAg();
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4 = new OASComDayCqWcmCoreImplPagePageInfoAg();

        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2));
        System.assert(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3.equals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4));
        System.assertEquals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties1.hashCode(), comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties3.hashCode(), comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplPagePageInfoAg comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties = new OASComDayCqWcmCoreImplPagePageInfoAg();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.getPropertyMappings();
        System.assertEquals('pageInfoProviderPropertyRegexDefault', propertyMappings.get('page.info.provider.property.regex.default'));
        System.assertEquals('pageInfoProviderPropertyName', propertyMappings.get('page.info.provider.property.name'));
    }
}
