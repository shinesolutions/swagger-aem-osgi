@isTest
private class OASComDayCqWcmCoreImplWarpTimeWarpFiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties1 = OASComDayCqWcmCoreImplWarpTimeWarpFi.getExample();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties2 = comDayCqWcmCoreImplWarpTimeWarpFilterProperties1;
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties3 = new OASComDayCqWcmCoreImplWarpTimeWarpFi();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties4 = comDayCqWcmCoreImplWarpTimeWarpFilterProperties3;

        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties2));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties2.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties4));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties4.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties1 = OASComDayCqWcmCoreImplWarpTimeWarpFi.getExample();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties2 = OASComDayCqWcmCoreImplWarpTimeWarpFi.getExample();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties3 = new OASComDayCqWcmCoreImplWarpTimeWarpFi();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties4 = new OASComDayCqWcmCoreImplWarpTimeWarpFi();

        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties2));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties2.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties4));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties4.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties1 = OASComDayCqWcmCoreImplWarpTimeWarpFi.getExample();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties2 = new OASComDayCqWcmCoreImplWarpTimeWarpFi();

        System.assertEquals(false, comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplWarpTimeWarpFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties1 = OASComDayCqWcmCoreImplWarpTimeWarpFi.getExample();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties2 = new OASComDayCqWcmCoreImplWarpTimeWarpFi();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplWarpTimeWarpFilterProperties2.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties1 = OASComDayCqWcmCoreImplWarpTimeWarpFi.getExample();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties2 = new OASComDayCqWcmCoreImplWarpTimeWarpFi();

        System.assertEquals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.hashCode(), comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties2.hashCode(), comDayCqWcmCoreImplWarpTimeWarpFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties1 = OASComDayCqWcmCoreImplWarpTimeWarpFi.getExample();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties2 = OASComDayCqWcmCoreImplWarpTimeWarpFi.getExample();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties3 = new OASComDayCqWcmCoreImplWarpTimeWarpFi();
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties4 = new OASComDayCqWcmCoreImplWarpTimeWarpFi();

        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties2));
        System.assert(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3.equals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties4));
        System.assertEquals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties1.hashCode(), comDayCqWcmCoreImplWarpTimeWarpFilterProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplWarpTimeWarpFilterProperties3.hashCode(), comDayCqWcmCoreImplWarpTimeWarpFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplWarpTimeWarpFi comDayCqWcmCoreImplWarpTimeWarpFilterProperties = new OASComDayCqWcmCoreImplWarpTimeWarpFi();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplWarpTimeWarpFilterProperties.getPropertyMappings();
        System.assertEquals('filterOrder', propertyMappings.get('filter.order'));
        System.assertEquals('filterScope', propertyMappings.get('filter.scope'));
    }
}
