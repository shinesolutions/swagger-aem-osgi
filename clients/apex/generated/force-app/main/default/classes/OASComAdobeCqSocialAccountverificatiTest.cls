@isTest
private class OASComAdobeCqSocialAccountverificatiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1 = OASComAdobeCqSocialAccountverificati.getExample();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2 = comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1;
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3 = new OASComAdobeCqSocialAccountverificati();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4 = comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3;

        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1 = OASComAdobeCqSocialAccountverificati.getExample();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2 = OASComAdobeCqSocialAccountverificati.getExample();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3 = new OASComAdobeCqSocialAccountverificati();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4 = new OASComAdobeCqSocialAccountverificati();

        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1 = OASComAdobeCqSocialAccountverificati.getExample();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2 = new OASComAdobeCqSocialAccountverificati();

        System.assertEquals(false, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1 = OASComAdobeCqSocialAccountverificati.getExample();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2 = new OASComAdobeCqSocialAccountverificati();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3;

        System.assertEquals(false, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3));
        System.assertEquals(false, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1 = OASComAdobeCqSocialAccountverificati.getExample();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2 = new OASComAdobeCqSocialAccountverificati();

        System.assertEquals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.hashCode(), comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2.hashCode(), comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1 = OASComAdobeCqSocialAccountverificati.getExample();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2 = OASComAdobeCqSocialAccountverificati.getExample();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3 = new OASComAdobeCqSocialAccountverificati();
        OASComAdobeCqSocialAccountverificati comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4 = new OASComAdobeCqSocialAccountverificati();

        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2));
        System.assert(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3.equals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4));
        System.assertEquals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties1.hashCode(), comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties3.hashCode(), comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties4.hashCode());
    }
}
