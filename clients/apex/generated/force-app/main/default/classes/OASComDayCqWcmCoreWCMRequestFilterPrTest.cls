@isTest
private class OASComDayCqWcmCoreWCMRequestFilterPrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties1 = OASComDayCqWcmCoreWCMRequestFilterPr.getExample();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties2 = comDayCqWcmCoreWCMRequestFilterProperties1;
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties3 = new OASComDayCqWcmCoreWCMRequestFilterPr();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties4 = comDayCqWcmCoreWCMRequestFilterProperties3;

        System.assert(comDayCqWcmCoreWCMRequestFilterProperties1.equals(comDayCqWcmCoreWCMRequestFilterProperties2));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties2.equals(comDayCqWcmCoreWCMRequestFilterProperties1));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties1.equals(comDayCqWcmCoreWCMRequestFilterProperties1));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties3.equals(comDayCqWcmCoreWCMRequestFilterProperties4));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties4.equals(comDayCqWcmCoreWCMRequestFilterProperties3));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties3.equals(comDayCqWcmCoreWCMRequestFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties1 = OASComDayCqWcmCoreWCMRequestFilterPr.getExample();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties2 = OASComDayCqWcmCoreWCMRequestFilterPr.getExample();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties3 = new OASComDayCqWcmCoreWCMRequestFilterPr();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties4 = new OASComDayCqWcmCoreWCMRequestFilterPr();

        System.assert(comDayCqWcmCoreWCMRequestFilterProperties1.equals(comDayCqWcmCoreWCMRequestFilterProperties2));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties2.equals(comDayCqWcmCoreWCMRequestFilterProperties1));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties3.equals(comDayCqWcmCoreWCMRequestFilterProperties4));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties4.equals(comDayCqWcmCoreWCMRequestFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties1 = OASComDayCqWcmCoreWCMRequestFilterPr.getExample();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties2 = new OASComDayCqWcmCoreWCMRequestFilterPr();

        System.assertEquals(false, comDayCqWcmCoreWCMRequestFilterProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreWCMRequestFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties1 = OASComDayCqWcmCoreWCMRequestFilterPr.getExample();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties2 = new OASComDayCqWcmCoreWCMRequestFilterPr();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties3;

        System.assertEquals(false, comDayCqWcmCoreWCMRequestFilterProperties1.equals(comDayCqWcmCoreWCMRequestFilterProperties3));
        System.assertEquals(false, comDayCqWcmCoreWCMRequestFilterProperties2.equals(comDayCqWcmCoreWCMRequestFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties1 = OASComDayCqWcmCoreWCMRequestFilterPr.getExample();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties2 = new OASComDayCqWcmCoreWCMRequestFilterPr();

        System.assertEquals(comDayCqWcmCoreWCMRequestFilterProperties1.hashCode(), comDayCqWcmCoreWCMRequestFilterProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreWCMRequestFilterProperties2.hashCode(), comDayCqWcmCoreWCMRequestFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties1 = OASComDayCqWcmCoreWCMRequestFilterPr.getExample();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties2 = OASComDayCqWcmCoreWCMRequestFilterPr.getExample();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties3 = new OASComDayCqWcmCoreWCMRequestFilterPr();
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties4 = new OASComDayCqWcmCoreWCMRequestFilterPr();

        System.assert(comDayCqWcmCoreWCMRequestFilterProperties1.equals(comDayCqWcmCoreWCMRequestFilterProperties2));
        System.assert(comDayCqWcmCoreWCMRequestFilterProperties3.equals(comDayCqWcmCoreWCMRequestFilterProperties4));
        System.assertEquals(comDayCqWcmCoreWCMRequestFilterProperties1.hashCode(), comDayCqWcmCoreWCMRequestFilterProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreWCMRequestFilterProperties3.hashCode(), comDayCqWcmCoreWCMRequestFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreWCMRequestFilterPr comDayCqWcmCoreWCMRequestFilterProperties = new OASComDayCqWcmCoreWCMRequestFilterPr();
        Map<String, String> propertyMappings = comDayCqWcmCoreWCMRequestFilterProperties.getPropertyMappings();
        System.assertEquals('wcmfilterMode', propertyMappings.get('wcmfilter.mode'));
    }
}
