@isTest
private class OASComAdobeGraniteWorkflowCoreJcrWorTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1 = OASComAdobeGraniteWorkflowCoreJcrWor.getExample();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2 = comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1;
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3 = new OASComAdobeGraniteWorkflowCoreJcrWor();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4 = comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3;

        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1 = OASComAdobeGraniteWorkflowCoreJcrWor.getExample();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2 = OASComAdobeGraniteWorkflowCoreJcrWor.getExample();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3 = new OASComAdobeGraniteWorkflowCoreJcrWor();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4 = new OASComAdobeGraniteWorkflowCoreJcrWor();

        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1 = OASComAdobeGraniteWorkflowCoreJcrWor.getExample();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2 = new OASComAdobeGraniteWorkflowCoreJcrWor();

        System.assertEquals(false, comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1 = OASComAdobeGraniteWorkflowCoreJcrWor.getExample();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2 = new OASComAdobeGraniteWorkflowCoreJcrWor();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1 = OASComAdobeGraniteWorkflowCoreJcrWor.getExample();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2 = new OASComAdobeGraniteWorkflowCoreJcrWor();

        System.assertEquals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.hashCode(), comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2.hashCode(), comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1 = OASComAdobeGraniteWorkflowCoreJcrWor.getExample();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2 = OASComAdobeGraniteWorkflowCoreJcrWor.getExample();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3 = new OASComAdobeGraniteWorkflowCoreJcrWor();
        OASComAdobeGraniteWorkflowCoreJcrWor comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4 = new OASComAdobeGraniteWorkflowCoreJcrWor();

        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3.equals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4));
        System.assertEquals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties1.hashCode(), comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties3.hashCode(), comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties4.hashCode());
    }
}
