@isTest
private class OASComDayCqWcmCoreImplWCMDebugFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties1 = OASComDayCqWcmCoreImplWCMDebugFilter.getExample();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties2 = comDayCqWcmCoreImplWCMDebugFilterProperties1;
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties3 = new OASComDayCqWcmCoreImplWCMDebugFilter();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties4 = comDayCqWcmCoreImplWCMDebugFilterProperties3;

        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties1.equals(comDayCqWcmCoreImplWCMDebugFilterProperties2));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties2.equals(comDayCqWcmCoreImplWCMDebugFilterProperties1));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties1.equals(comDayCqWcmCoreImplWCMDebugFilterProperties1));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties3.equals(comDayCqWcmCoreImplWCMDebugFilterProperties4));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties4.equals(comDayCqWcmCoreImplWCMDebugFilterProperties3));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties3.equals(comDayCqWcmCoreImplWCMDebugFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties1 = OASComDayCqWcmCoreImplWCMDebugFilter.getExample();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties2 = OASComDayCqWcmCoreImplWCMDebugFilter.getExample();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties3 = new OASComDayCqWcmCoreImplWCMDebugFilter();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties4 = new OASComDayCqWcmCoreImplWCMDebugFilter();

        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties1.equals(comDayCqWcmCoreImplWCMDebugFilterProperties2));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties2.equals(comDayCqWcmCoreImplWCMDebugFilterProperties1));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties3.equals(comDayCqWcmCoreImplWCMDebugFilterProperties4));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties4.equals(comDayCqWcmCoreImplWCMDebugFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties1 = OASComDayCqWcmCoreImplWCMDebugFilter.getExample();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties2 = new OASComDayCqWcmCoreImplWCMDebugFilter();

        System.assertEquals(false, comDayCqWcmCoreImplWCMDebugFilterProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplWCMDebugFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties1 = OASComDayCqWcmCoreImplWCMDebugFilter.getExample();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties2 = new OASComDayCqWcmCoreImplWCMDebugFilter();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplWCMDebugFilterProperties1.equals(comDayCqWcmCoreImplWCMDebugFilterProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplWCMDebugFilterProperties2.equals(comDayCqWcmCoreImplWCMDebugFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties1 = OASComDayCqWcmCoreImplWCMDebugFilter.getExample();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties2 = new OASComDayCqWcmCoreImplWCMDebugFilter();

        System.assertEquals(comDayCqWcmCoreImplWCMDebugFilterProperties1.hashCode(), comDayCqWcmCoreImplWCMDebugFilterProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplWCMDebugFilterProperties2.hashCode(), comDayCqWcmCoreImplWCMDebugFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties1 = OASComDayCqWcmCoreImplWCMDebugFilter.getExample();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties2 = OASComDayCqWcmCoreImplWCMDebugFilter.getExample();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties3 = new OASComDayCqWcmCoreImplWCMDebugFilter();
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties4 = new OASComDayCqWcmCoreImplWCMDebugFilter();

        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties1.equals(comDayCqWcmCoreImplWCMDebugFilterProperties2));
        System.assert(comDayCqWcmCoreImplWCMDebugFilterProperties3.equals(comDayCqWcmCoreImplWCMDebugFilterProperties4));
        System.assertEquals(comDayCqWcmCoreImplWCMDebugFilterProperties1.hashCode(), comDayCqWcmCoreImplWCMDebugFilterProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplWCMDebugFilterProperties3.hashCode(), comDayCqWcmCoreImplWCMDebugFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplWCMDebugFilter comDayCqWcmCoreImplWCMDebugFilterProperties = new OASComDayCqWcmCoreImplWCMDebugFilter();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplWCMDebugFilterProperties.getPropertyMappings();
        System.assertEquals('wcmdbgfilterEnabled', propertyMappings.get('wcmdbgfilter.enabled'));
        System.assertEquals('wcmdbgfilterJspDebug', propertyMappings.get('wcmdbgfilter.jspDebug'));
    }
}
