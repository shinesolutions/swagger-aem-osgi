@isTest
private class OASComAdobeGraniteTranslationCoreImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1 = OASComAdobeGraniteTranslationCoreImp.getExample();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2 = comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1;
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3 = new OASComAdobeGraniteTranslationCoreImp();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4 = comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3;

        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1 = OASComAdobeGraniteTranslationCoreImp.getExample();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2 = OASComAdobeGraniteTranslationCoreImp.getExample();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3 = new OASComAdobeGraniteTranslationCoreImp();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4 = new OASComAdobeGraniteTranslationCoreImp();

        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1 = OASComAdobeGraniteTranslationCoreImp.getExample();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2 = new OASComAdobeGraniteTranslationCoreImp();

        System.assertEquals(false, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1 = OASComAdobeGraniteTranslationCoreImp.getExample();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2 = new OASComAdobeGraniteTranslationCoreImp();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3;

        System.assertEquals(false, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3));
        System.assertEquals(false, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1 = OASComAdobeGraniteTranslationCoreImp.getExample();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2 = new OASComAdobeGraniteTranslationCoreImp();

        System.assertEquals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.hashCode(), comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2.hashCode(), comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1 = OASComAdobeGraniteTranslationCoreImp.getExample();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2 = OASComAdobeGraniteTranslationCoreImp.getExample();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3 = new OASComAdobeGraniteTranslationCoreImp();
        OASComAdobeGraniteTranslationCoreImp comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4 = new OASComAdobeGraniteTranslationCoreImp();

        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2));
        System.assert(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3.equals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4));
        System.assertEquals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties1.hashCode(), comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties3.hashCode(), comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties4.hashCode());
    }
}
