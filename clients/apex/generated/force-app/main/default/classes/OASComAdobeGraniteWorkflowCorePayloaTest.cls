@isTest
private class OASComAdobeGraniteWorkflowCorePayloaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties1 = OASComAdobeGraniteWorkflowCorePayloa.getExample();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties2 = comAdobeGraniteWorkflowCorePayloadMapCacheProperties1;
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties3 = new OASComAdobeGraniteWorkflowCorePayloa();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties4 = comAdobeGraniteWorkflowCorePayloadMapCacheProperties3;

        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties2));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties2.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties4));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties4.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties1 = OASComAdobeGraniteWorkflowCorePayloa.getExample();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties2 = OASComAdobeGraniteWorkflowCorePayloa.getExample();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties3 = new OASComAdobeGraniteWorkflowCorePayloa();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties4 = new OASComAdobeGraniteWorkflowCorePayloa();

        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties2));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties2.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties4));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties4.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties1 = OASComAdobeGraniteWorkflowCorePayloa.getExample();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties2 = new OASComAdobeGraniteWorkflowCorePayloa();

        System.assertEquals(false, comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowCorePayloadMapCacheProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties1 = OASComAdobeGraniteWorkflowCorePayloa.getExample();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties2 = new OASComAdobeGraniteWorkflowCorePayloa();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowCorePayloadMapCacheProperties2.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties1 = OASComAdobeGraniteWorkflowCorePayloa.getExample();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties2 = new OASComAdobeGraniteWorkflowCorePayloa();

        System.assertEquals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.hashCode(), comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties2.hashCode(), comAdobeGraniteWorkflowCorePayloadMapCacheProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties1 = OASComAdobeGraniteWorkflowCorePayloa.getExample();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties2 = OASComAdobeGraniteWorkflowCorePayloa.getExample();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties3 = new OASComAdobeGraniteWorkflowCorePayloa();
        OASComAdobeGraniteWorkflowCorePayloa comAdobeGraniteWorkflowCorePayloadMapCacheProperties4 = new OASComAdobeGraniteWorkflowCorePayloa();

        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties2));
        System.assert(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3.equals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties4));
        System.assertEquals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties1.hashCode(), comAdobeGraniteWorkflowCorePayloadMapCacheProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCorePayloadMapCacheProperties3.hashCode(), comAdobeGraniteWorkflowCorePayloadMapCacheProperties4.hashCode());
    }
}
