@isTest
private class OASComAdobeCqDamProcessorNuiImplNuiATest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1 = OASComAdobeCqDamProcessorNuiImplNuiA.getExample();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2 = comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1;
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3 = new OASComAdobeCqDamProcessorNuiImplNuiA();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4 = comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3;

        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1 = OASComAdobeCqDamProcessorNuiImplNuiA.getExample();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2 = OASComAdobeCqDamProcessorNuiImplNuiA.getExample();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3 = new OASComAdobeCqDamProcessorNuiImplNuiA();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4 = new OASComAdobeCqDamProcessorNuiImplNuiA();

        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1 = OASComAdobeCqDamProcessorNuiImplNuiA.getExample();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2 = new OASComAdobeCqDamProcessorNuiImplNuiA();

        System.assertEquals(false, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1 = OASComAdobeCqDamProcessorNuiImplNuiA.getExample();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2 = new OASComAdobeCqDamProcessorNuiImplNuiA();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3;

        System.assertEquals(false, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3));
        System.assertEquals(false, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1 = OASComAdobeCqDamProcessorNuiImplNuiA.getExample();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2 = new OASComAdobeCqDamProcessorNuiImplNuiA();

        System.assertEquals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.hashCode(), comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.hashCode());
        System.assertEquals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2.hashCode(), comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1 = OASComAdobeCqDamProcessorNuiImplNuiA.getExample();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2 = OASComAdobeCqDamProcessorNuiImplNuiA.getExample();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3 = new OASComAdobeCqDamProcessorNuiImplNuiA();
        OASComAdobeCqDamProcessorNuiImplNuiA comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4 = new OASComAdobeCqDamProcessorNuiImplNuiA();

        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2));
        System.assert(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3.equals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4));
        System.assertEquals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties1.hashCode(), comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties2.hashCode());
        System.assertEquals(comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties3.hashCode(), comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties4.hashCode());
    }
}
