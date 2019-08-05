@isTest
private class OASComAdobeCqAccountImplAccountManagTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties1 = OASComAdobeCqAccountImplAccountManag.getExample();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties2 = comAdobeCqAccountImplAccountManagementServletProperties1;
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties3 = new OASComAdobeCqAccountImplAccountManag();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties4 = comAdobeCqAccountImplAccountManagementServletProperties3;

        System.assert(comAdobeCqAccountImplAccountManagementServletProperties1.equals(comAdobeCqAccountImplAccountManagementServletProperties2));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties2.equals(comAdobeCqAccountImplAccountManagementServletProperties1));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties1.equals(comAdobeCqAccountImplAccountManagementServletProperties1));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties3.equals(comAdobeCqAccountImplAccountManagementServletProperties4));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties4.equals(comAdobeCqAccountImplAccountManagementServletProperties3));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties3.equals(comAdobeCqAccountImplAccountManagementServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties1 = OASComAdobeCqAccountImplAccountManag.getExample();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties2 = OASComAdobeCqAccountImplAccountManag.getExample();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties3 = new OASComAdobeCqAccountImplAccountManag();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties4 = new OASComAdobeCqAccountImplAccountManag();

        System.assert(comAdobeCqAccountImplAccountManagementServletProperties1.equals(comAdobeCqAccountImplAccountManagementServletProperties2));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties2.equals(comAdobeCqAccountImplAccountManagementServletProperties1));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties3.equals(comAdobeCqAccountImplAccountManagementServletProperties4));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties4.equals(comAdobeCqAccountImplAccountManagementServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties1 = OASComAdobeCqAccountImplAccountManag.getExample();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties2 = new OASComAdobeCqAccountImplAccountManag();

        System.assertEquals(false, comAdobeCqAccountImplAccountManagementServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqAccountImplAccountManagementServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties1 = OASComAdobeCqAccountImplAccountManag.getExample();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties2 = new OASComAdobeCqAccountImplAccountManag();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties3;

        System.assertEquals(false, comAdobeCqAccountImplAccountManagementServletProperties1.equals(comAdobeCqAccountImplAccountManagementServletProperties3));
        System.assertEquals(false, comAdobeCqAccountImplAccountManagementServletProperties2.equals(comAdobeCqAccountImplAccountManagementServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties1 = OASComAdobeCqAccountImplAccountManag.getExample();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties2 = new OASComAdobeCqAccountImplAccountManag();

        System.assertEquals(comAdobeCqAccountImplAccountManagementServletProperties1.hashCode(), comAdobeCqAccountImplAccountManagementServletProperties1.hashCode());
        System.assertEquals(comAdobeCqAccountImplAccountManagementServletProperties2.hashCode(), comAdobeCqAccountImplAccountManagementServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties1 = OASComAdobeCqAccountImplAccountManag.getExample();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties2 = OASComAdobeCqAccountImplAccountManag.getExample();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties3 = new OASComAdobeCqAccountImplAccountManag();
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties4 = new OASComAdobeCqAccountImplAccountManag();

        System.assert(comAdobeCqAccountImplAccountManagementServletProperties1.equals(comAdobeCqAccountImplAccountManagementServletProperties2));
        System.assert(comAdobeCqAccountImplAccountManagementServletProperties3.equals(comAdobeCqAccountImplAccountManagementServletProperties4));
        System.assertEquals(comAdobeCqAccountImplAccountManagementServletProperties1.hashCode(), comAdobeCqAccountImplAccountManagementServletProperties2.hashCode());
        System.assertEquals(comAdobeCqAccountImplAccountManagementServletProperties3.hashCode(), comAdobeCqAccountImplAccountManagementServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqAccountImplAccountManag comAdobeCqAccountImplAccountManagementServletProperties = new OASComAdobeCqAccountImplAccountManag();
        Map<String, String> propertyMappings = comAdobeCqAccountImplAccountManagementServletProperties.getPropertyMappings();
        System.assertEquals('cqAccountmanagerConfigInformnewaccountMail', propertyMappings.get('cq.accountmanager.config.informnewaccount.mail'));
        System.assertEquals('cqAccountmanagerConfigInformnewpwdMail', propertyMappings.get('cq.accountmanager.config.informnewpwd.mail'));
    }
}
