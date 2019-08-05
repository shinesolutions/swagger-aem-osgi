@isTest
private class OASComAdobeCqSecurityHcDispatcherImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1 = OASComAdobeCqSecurityHcDispatcherImp.getExample();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2 = comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1;
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3 = new OASComAdobeCqSecurityHcDispatcherImp();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4 = comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3;

        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1 = OASComAdobeCqSecurityHcDispatcherImp.getExample();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2 = OASComAdobeCqSecurityHcDispatcherImp.getExample();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3 = new OASComAdobeCqSecurityHcDispatcherImp();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4 = new OASComAdobeCqSecurityHcDispatcherImp();

        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1 = OASComAdobeCqSecurityHcDispatcherImp.getExample();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2 = new OASComAdobeCqSecurityHcDispatcherImp();

        System.assertEquals(false, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1 = OASComAdobeCqSecurityHcDispatcherImp.getExample();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2 = new OASComAdobeCqSecurityHcDispatcherImp();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3;

        System.assertEquals(false, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3));
        System.assertEquals(false, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1 = OASComAdobeCqSecurityHcDispatcherImp.getExample();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2 = new OASComAdobeCqSecurityHcDispatcherImp();

        System.assertEquals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.hashCode(), comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2.hashCode(), comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1 = OASComAdobeCqSecurityHcDispatcherImp.getExample();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2 = OASComAdobeCqSecurityHcDispatcherImp.getExample();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3 = new OASComAdobeCqSecurityHcDispatcherImp();
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4 = new OASComAdobeCqSecurityHcDispatcherImp();

        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3.equals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4));
        System.assertEquals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties1.hashCode(), comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties3.hashCode(), comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSecurityHcDispatcherImp comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties = new OASComAdobeCqSecurityHcDispatcherImp();
        Map<String, String> propertyMappings = comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('dispatcherAddress', propertyMappings.get('dispatcher.address'));
        System.assertEquals('dispatcherFilterAllowed', propertyMappings.get('dispatcher.filter.allowed'));
        System.assertEquals('dispatcherFilterBlocked', propertyMappings.get('dispatcher.filter.blocked'));
    }
}
