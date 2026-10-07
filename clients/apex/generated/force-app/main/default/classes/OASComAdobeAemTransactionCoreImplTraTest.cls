@isTest
private class OASComAdobeAemTransactionCoreImplTraTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties1 = OASComAdobeAemTransactionCoreImplTra.getExample();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties2 = comAdobeAemTransactionCoreImplTransactionRecorderProperties1;
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties3 = new OASComAdobeAemTransactionCoreImplTra();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties4 = comAdobeAemTransactionCoreImplTransactionRecorderProperties3;

        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties1.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties2));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties2.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties1));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties1.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties1));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties3.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties4));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties4.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties3));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties3.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties1 = OASComAdobeAemTransactionCoreImplTra.getExample();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties2 = OASComAdobeAemTransactionCoreImplTra.getExample();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties3 = new OASComAdobeAemTransactionCoreImplTra();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties4 = new OASComAdobeAemTransactionCoreImplTra();

        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties1.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties2));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties2.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties1));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties3.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties4));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties4.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties1 = OASComAdobeAemTransactionCoreImplTra.getExample();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties2 = new OASComAdobeAemTransactionCoreImplTra();

        System.assertEquals(false, comAdobeAemTransactionCoreImplTransactionRecorderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeAemTransactionCoreImplTransactionRecorderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties1 = OASComAdobeAemTransactionCoreImplTra.getExample();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties2 = new OASComAdobeAemTransactionCoreImplTra();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties3;

        System.assertEquals(false, comAdobeAemTransactionCoreImplTransactionRecorderProperties1.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties3));
        System.assertEquals(false, comAdobeAemTransactionCoreImplTransactionRecorderProperties2.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties1 = OASComAdobeAemTransactionCoreImplTra.getExample();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties2 = new OASComAdobeAemTransactionCoreImplTra();

        System.assertEquals(comAdobeAemTransactionCoreImplTransactionRecorderProperties1.hashCode(), comAdobeAemTransactionCoreImplTransactionRecorderProperties1.hashCode());
        System.assertEquals(comAdobeAemTransactionCoreImplTransactionRecorderProperties2.hashCode(), comAdobeAemTransactionCoreImplTransactionRecorderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties1 = OASComAdobeAemTransactionCoreImplTra.getExample();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties2 = OASComAdobeAemTransactionCoreImplTra.getExample();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties3 = new OASComAdobeAemTransactionCoreImplTra();
        OASComAdobeAemTransactionCoreImplTra comAdobeAemTransactionCoreImplTransactionRecorderProperties4 = new OASComAdobeAemTransactionCoreImplTra();

        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties1.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties2));
        System.assert(comAdobeAemTransactionCoreImplTransactionRecorderProperties3.equals(comAdobeAemTransactionCoreImplTransactionRecorderProperties4));
        System.assertEquals(comAdobeAemTransactionCoreImplTransactionRecorderProperties1.hashCode(), comAdobeAemTransactionCoreImplTransactionRecorderProperties2.hashCode());
        System.assertEquals(comAdobeAemTransactionCoreImplTransactionRecorderProperties3.hashCode(), comAdobeAemTransactionCoreImplTransactionRecorderProperties4.hashCode());
    }
}
