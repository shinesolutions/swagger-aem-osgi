@isTest
private class OASComAdobeCqAccountApiAccountManageTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties1 = OASComAdobeCqAccountApiAccountManage.getExample();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties2 = comAdobeCqAccountApiAccountManagementServiceProperties1;
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties3 = new OASComAdobeCqAccountApiAccountManage();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties4 = comAdobeCqAccountApiAccountManagementServiceProperties3;

        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties1.equals(comAdobeCqAccountApiAccountManagementServiceProperties2));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties2.equals(comAdobeCqAccountApiAccountManagementServiceProperties1));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties1.equals(comAdobeCqAccountApiAccountManagementServiceProperties1));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties3.equals(comAdobeCqAccountApiAccountManagementServiceProperties4));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties4.equals(comAdobeCqAccountApiAccountManagementServiceProperties3));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties3.equals(comAdobeCqAccountApiAccountManagementServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties1 = OASComAdobeCqAccountApiAccountManage.getExample();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties2 = OASComAdobeCqAccountApiAccountManage.getExample();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties3 = new OASComAdobeCqAccountApiAccountManage();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties4 = new OASComAdobeCqAccountApiAccountManage();

        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties1.equals(comAdobeCqAccountApiAccountManagementServiceProperties2));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties2.equals(comAdobeCqAccountApiAccountManagementServiceProperties1));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties3.equals(comAdobeCqAccountApiAccountManagementServiceProperties4));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties4.equals(comAdobeCqAccountApiAccountManagementServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties1 = OASComAdobeCqAccountApiAccountManage.getExample();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties2 = new OASComAdobeCqAccountApiAccountManage();

        System.assertEquals(false, comAdobeCqAccountApiAccountManagementServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqAccountApiAccountManagementServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties1 = OASComAdobeCqAccountApiAccountManage.getExample();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties2 = new OASComAdobeCqAccountApiAccountManage();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties3;

        System.assertEquals(false, comAdobeCqAccountApiAccountManagementServiceProperties1.equals(comAdobeCqAccountApiAccountManagementServiceProperties3));
        System.assertEquals(false, comAdobeCqAccountApiAccountManagementServiceProperties2.equals(comAdobeCqAccountApiAccountManagementServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties1 = OASComAdobeCqAccountApiAccountManage.getExample();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties2 = new OASComAdobeCqAccountApiAccountManage();

        System.assertEquals(comAdobeCqAccountApiAccountManagementServiceProperties1.hashCode(), comAdobeCqAccountApiAccountManagementServiceProperties1.hashCode());
        System.assertEquals(comAdobeCqAccountApiAccountManagementServiceProperties2.hashCode(), comAdobeCqAccountApiAccountManagementServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties1 = OASComAdobeCqAccountApiAccountManage.getExample();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties2 = OASComAdobeCqAccountApiAccountManage.getExample();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties3 = new OASComAdobeCqAccountApiAccountManage();
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties4 = new OASComAdobeCqAccountApiAccountManage();

        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties1.equals(comAdobeCqAccountApiAccountManagementServiceProperties2));
        System.assert(comAdobeCqAccountApiAccountManagementServiceProperties3.equals(comAdobeCqAccountApiAccountManagementServiceProperties4));
        System.assertEquals(comAdobeCqAccountApiAccountManagementServiceProperties1.hashCode(), comAdobeCqAccountApiAccountManagementServiceProperties2.hashCode());
        System.assertEquals(comAdobeCqAccountApiAccountManagementServiceProperties3.hashCode(), comAdobeCqAccountApiAccountManagementServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqAccountApiAccountManage comAdobeCqAccountApiAccountManagementServiceProperties = new OASComAdobeCqAccountApiAccountManage();
        Map<String, String> propertyMappings = comAdobeCqAccountApiAccountManagementServiceProperties.getPropertyMappings();
        System.assertEquals('cqAccountmanagerTokenValidityPeriod', propertyMappings.get('cq.accountmanager.token.validity.period'));
        System.assertEquals('cqAccountmanagerConfigRequestnewaccountMail', propertyMappings.get('cq.accountmanager.config.requestnewaccount.mail'));
        System.assertEquals('cqAccountmanagerConfigRequestnewpwdMail', propertyMappings.get('cq.accountmanager.config.requestnewpwd.mail'));
    }
}
