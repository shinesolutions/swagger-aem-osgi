@isTest
private class OASComAdobeCqDamDmProcessImagePTiffMTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties1 = OASComAdobeCqDamDmProcessImagePTiffM.getExample();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties2 = comAdobeCqDamDmProcessImagePTiffManagerImplProperties1;
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties3 = new OASComAdobeCqDamDmProcessImagePTiffM();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties4 = comAdobeCqDamDmProcessImagePTiffManagerImplProperties3;

        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties2));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties2.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties4));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties4.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties1 = OASComAdobeCqDamDmProcessImagePTiffM.getExample();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties2 = OASComAdobeCqDamDmProcessImagePTiffM.getExample();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties3 = new OASComAdobeCqDamDmProcessImagePTiffM();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties4 = new OASComAdobeCqDamDmProcessImagePTiffM();

        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties2));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties2.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties4));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties4.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties1 = OASComAdobeCqDamDmProcessImagePTiffM.getExample();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties2 = new OASComAdobeCqDamDmProcessImagePTiffM();

        System.assertEquals(false, comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamDmProcessImagePTiffManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties1 = OASComAdobeCqDamDmProcessImagePTiffM.getExample();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties2 = new OASComAdobeCqDamDmProcessImagePTiffM();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties3;

        System.assertEquals(false, comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3));
        System.assertEquals(false, comAdobeCqDamDmProcessImagePTiffManagerImplProperties2.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties1 = OASComAdobeCqDamDmProcessImagePTiffM.getExample();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties2 = new OASComAdobeCqDamDmProcessImagePTiffM();

        System.assertEquals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.hashCode(), comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.hashCode());
        System.assertEquals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties2.hashCode(), comAdobeCqDamDmProcessImagePTiffManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties1 = OASComAdobeCqDamDmProcessImagePTiffM.getExample();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties2 = OASComAdobeCqDamDmProcessImagePTiffM.getExample();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties3 = new OASComAdobeCqDamDmProcessImagePTiffM();
        OASComAdobeCqDamDmProcessImagePTiffM comAdobeCqDamDmProcessImagePTiffManagerImplProperties4 = new OASComAdobeCqDamDmProcessImagePTiffM();

        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties2));
        System.assert(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3.equals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties4));
        System.assertEquals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties1.hashCode(), comAdobeCqDamDmProcessImagePTiffManagerImplProperties2.hashCode());
        System.assertEquals(comAdobeCqDamDmProcessImagePTiffManagerImplProperties3.hashCode(), comAdobeCqDamDmProcessImagePTiffManagerImplProperties4.hashCode());
    }
}
