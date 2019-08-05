@isTest
private class OASComDayCqDamCoreImplServletGuidLooTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties1 = OASComDayCqDamCoreImplServletGuidLoo.getExample();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties2 = comDayCqDamCoreImplServletGuidLookupFilterProperties1;
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties3 = new OASComDayCqDamCoreImplServletGuidLoo();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties4 = comDayCqDamCoreImplServletGuidLookupFilterProperties3;

        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties1.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties2));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties2.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties1));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties1.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties1));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties3.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties4));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties4.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties3));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties3.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties1 = OASComDayCqDamCoreImplServletGuidLoo.getExample();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties2 = OASComDayCqDamCoreImplServletGuidLoo.getExample();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties3 = new OASComDayCqDamCoreImplServletGuidLoo();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties4 = new OASComDayCqDamCoreImplServletGuidLoo();

        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties1.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties2));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties2.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties1));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties3.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties4));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties4.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties1 = OASComDayCqDamCoreImplServletGuidLoo.getExample();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties2 = new OASComDayCqDamCoreImplServletGuidLoo();

        System.assertEquals(false, comDayCqDamCoreImplServletGuidLookupFilterProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletGuidLookupFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties1 = OASComDayCqDamCoreImplServletGuidLoo.getExample();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties2 = new OASComDayCqDamCoreImplServletGuidLoo();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletGuidLookupFilterProperties1.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletGuidLookupFilterProperties2.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties1 = OASComDayCqDamCoreImplServletGuidLoo.getExample();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties2 = new OASComDayCqDamCoreImplServletGuidLoo();

        System.assertEquals(comDayCqDamCoreImplServletGuidLookupFilterProperties1.hashCode(), comDayCqDamCoreImplServletGuidLookupFilterProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletGuidLookupFilterProperties2.hashCode(), comDayCqDamCoreImplServletGuidLookupFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties1 = OASComDayCqDamCoreImplServletGuidLoo.getExample();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties2 = OASComDayCqDamCoreImplServletGuidLoo.getExample();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties3 = new OASComDayCqDamCoreImplServletGuidLoo();
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties4 = new OASComDayCqDamCoreImplServletGuidLoo();

        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties1.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties2));
        System.assert(comDayCqDamCoreImplServletGuidLookupFilterProperties3.equals(comDayCqDamCoreImplServletGuidLookupFilterProperties4));
        System.assertEquals(comDayCqDamCoreImplServletGuidLookupFilterProperties1.hashCode(), comDayCqDamCoreImplServletGuidLookupFilterProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletGuidLookupFilterProperties3.hashCode(), comDayCqDamCoreImplServletGuidLookupFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletGuidLoo comDayCqDamCoreImplServletGuidLookupFilterProperties = new OASComDayCqDamCoreImplServletGuidLoo();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletGuidLookupFilterProperties.getPropertyMappings();
        System.assertEquals('cqDamCoreGuidlookupfilterEnabled', propertyMappings.get('cq.dam.core.guidlookupfilter.enabled'));
    }
}
