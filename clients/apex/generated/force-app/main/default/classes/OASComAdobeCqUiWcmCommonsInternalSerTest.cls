@isTest
private class OASComAdobeCqUiWcmCommonsInternalSerTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1 = OASComAdobeCqUiWcmCommonsInternalSer.getExample();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2 = comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1;
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3 = new OASComAdobeCqUiWcmCommonsInternalSer();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4 = comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3;

        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1 = OASComAdobeCqUiWcmCommonsInternalSer.getExample();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2 = OASComAdobeCqUiWcmCommonsInternalSer.getExample();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3 = new OASComAdobeCqUiWcmCommonsInternalSer();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4 = new OASComAdobeCqUiWcmCommonsInternalSer();

        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1 = OASComAdobeCqUiWcmCommonsInternalSer.getExample();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2 = new OASComAdobeCqUiWcmCommonsInternalSer();

        System.assertEquals(false, comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1 = OASComAdobeCqUiWcmCommonsInternalSer.getExample();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2 = new OASComAdobeCqUiWcmCommonsInternalSer();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3;

        System.assertEquals(false, comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3));
        System.assertEquals(false, comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1 = OASComAdobeCqUiWcmCommonsInternalSer.getExample();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2 = new OASComAdobeCqUiWcmCommonsInternalSer();

        System.assertEquals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.hashCode(), comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.hashCode());
        System.assertEquals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2.hashCode(), comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1 = OASComAdobeCqUiWcmCommonsInternalSer.getExample();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2 = OASComAdobeCqUiWcmCommonsInternalSer.getExample();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3 = new OASComAdobeCqUiWcmCommonsInternalSer();
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4 = new OASComAdobeCqUiWcmCommonsInternalSer();

        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2));
        System.assert(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3.equals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4));
        System.assertEquals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties1.hashCode(), comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties2.hashCode());
        System.assertEquals(comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties3.hashCode(), comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqUiWcmCommonsInternalSer comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties = new OASComAdobeCqUiWcmCommonsInternalSer();
        Map<String, String> propertyMappings = comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.getPropertyMappings();
        System.assertEquals('resourceTypes', propertyMappings.get('resource.types'));
    }
}
