@isTest
private class OASComAdobeCqSocialCommonsMaintainanTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1 = OASComAdobeCqSocialCommonsMaintainan.getExample();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2 = comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1;
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3 = new OASComAdobeCqSocialCommonsMaintainan();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4 = comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3;

        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1 = OASComAdobeCqSocialCommonsMaintainan.getExample();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2 = OASComAdobeCqSocialCommonsMaintainan.getExample();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3 = new OASComAdobeCqSocialCommonsMaintainan();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4 = new OASComAdobeCqSocialCommonsMaintainan();

        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1 = OASComAdobeCqSocialCommonsMaintainan.getExample();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2 = new OASComAdobeCqSocialCommonsMaintainan();

        System.assertEquals(false, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1 = OASComAdobeCqSocialCommonsMaintainan.getExample();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2 = new OASComAdobeCqSocialCommonsMaintainan();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3;

        System.assertEquals(false, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3));
        System.assertEquals(false, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1 = OASComAdobeCqSocialCommonsMaintainan.getExample();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2 = new OASComAdobeCqSocialCommonsMaintainan();

        System.assertEquals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.hashCode(), comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2.hashCode(), comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1 = OASComAdobeCqSocialCommonsMaintainan.getExample();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2 = OASComAdobeCqSocialCommonsMaintainan.getExample();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3 = new OASComAdobeCqSocialCommonsMaintainan();
        OASComAdobeCqSocialCommonsMaintainan comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4 = new OASComAdobeCqSocialCommonsMaintainan();

        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2));
        System.assert(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3.equals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4));
        System.assertEquals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties1.hashCode(), comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties3.hashCode(), comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties4.hashCode());
    }
}
