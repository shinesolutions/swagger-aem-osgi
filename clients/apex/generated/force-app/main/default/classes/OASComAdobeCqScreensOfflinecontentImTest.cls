@isTest
private class OASComAdobeCqScreensOfflinecontentImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1 = OASComAdobeCqScreensOfflinecontentIm.getExample();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2 = comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1;
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3 = new OASComAdobeCqScreensOfflinecontentIm();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4 = comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3;

        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1 = OASComAdobeCqScreensOfflinecontentIm.getExample();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2 = OASComAdobeCqScreensOfflinecontentIm.getExample();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3 = new OASComAdobeCqScreensOfflinecontentIm();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4 = new OASComAdobeCqScreensOfflinecontentIm();

        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1 = OASComAdobeCqScreensOfflinecontentIm.getExample();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2 = new OASComAdobeCqScreensOfflinecontentIm();

        System.assertEquals(false, comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1 = OASComAdobeCqScreensOfflinecontentIm.getExample();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2 = new OASComAdobeCqScreensOfflinecontentIm();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3;

        System.assertEquals(false, comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3));
        System.assertEquals(false, comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1 = OASComAdobeCqScreensOfflinecontentIm.getExample();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2 = new OASComAdobeCqScreensOfflinecontentIm();

        System.assertEquals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.hashCode(), comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2.hashCode(), comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1 = OASComAdobeCqScreensOfflinecontentIm.getExample();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2 = OASComAdobeCqScreensOfflinecontentIm.getExample();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3 = new OASComAdobeCqScreensOfflinecontentIm();
        OASComAdobeCqScreensOfflinecontentIm comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4 = new OASComAdobeCqScreensOfflinecontentIm();

        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2));
        System.assert(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3.equals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4));
        System.assertEquals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties1.hashCode(), comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties3.hashCode(), comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties4.hashCode());
    }
}
