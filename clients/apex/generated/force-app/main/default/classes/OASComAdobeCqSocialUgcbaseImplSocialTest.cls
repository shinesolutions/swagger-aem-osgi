@isTest
private class OASComAdobeCqSocialUgcbaseImplSocialTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1 = OASComAdobeCqSocialUgcbaseImplSocial.getExample();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2 = comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1;
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3 = new OASComAdobeCqSocialUgcbaseImplSocial();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4 = comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3;

        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1 = OASComAdobeCqSocialUgcbaseImplSocial.getExample();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2 = OASComAdobeCqSocialUgcbaseImplSocial.getExample();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3 = new OASComAdobeCqSocialUgcbaseImplSocial();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4 = new OASComAdobeCqSocialUgcbaseImplSocial();

        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1 = OASComAdobeCqSocialUgcbaseImplSocial.getExample();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2 = new OASComAdobeCqSocialUgcbaseImplSocial();

        System.assertEquals(false, comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1 = OASComAdobeCqSocialUgcbaseImplSocial.getExample();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2 = new OASComAdobeCqSocialUgcbaseImplSocial();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3;

        System.assertEquals(false, comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3));
        System.assertEquals(false, comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1 = OASComAdobeCqSocialUgcbaseImplSocial.getExample();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2 = new OASComAdobeCqSocialUgcbaseImplSocial();

        System.assertEquals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.hashCode(), comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2.hashCode(), comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1 = OASComAdobeCqSocialUgcbaseImplSocial.getExample();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2 = OASComAdobeCqSocialUgcbaseImplSocial.getExample();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3 = new OASComAdobeCqSocialUgcbaseImplSocial();
        OASComAdobeCqSocialUgcbaseImplSocial comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4 = new OASComAdobeCqSocialUgcbaseImplSocial();

        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3.equals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4));
        System.assertEquals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties1.hashCode(), comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties3.hashCode(), comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties4.hashCode());
    }
}
