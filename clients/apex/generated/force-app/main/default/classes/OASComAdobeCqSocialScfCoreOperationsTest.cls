@isTest
private class OASComAdobeCqSocialScfCoreOperationsTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1 = OASComAdobeCqSocialScfCoreOperations.getExample();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2 = comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1;
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3 = new OASComAdobeCqSocialScfCoreOperations();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4 = comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3;

        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1 = OASComAdobeCqSocialScfCoreOperations.getExample();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2 = OASComAdobeCqSocialScfCoreOperations.getExample();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3 = new OASComAdobeCqSocialScfCoreOperations();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4 = new OASComAdobeCqSocialScfCoreOperations();

        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1 = OASComAdobeCqSocialScfCoreOperations.getExample();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2 = new OASComAdobeCqSocialScfCoreOperations();

        System.assertEquals(false, comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1 = OASComAdobeCqSocialScfCoreOperations.getExample();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2 = new OASComAdobeCqSocialScfCoreOperations();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3;

        System.assertEquals(false, comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3));
        System.assertEquals(false, comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1 = OASComAdobeCqSocialScfCoreOperations.getExample();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2 = new OASComAdobeCqSocialScfCoreOperations();

        System.assertEquals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.hashCode(), comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2.hashCode(), comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1 = OASComAdobeCqSocialScfCoreOperations.getExample();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2 = OASComAdobeCqSocialScfCoreOperations.getExample();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3 = new OASComAdobeCqSocialScfCoreOperations();
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4 = new OASComAdobeCqSocialScfCoreOperations();

        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2));
        System.assert(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3.equals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4));
        System.assertEquals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties1.hashCode(), comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties3.hashCode(), comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialScfCoreOperations comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties = new OASComAdobeCqSocialScfCoreOperations();
        Map<String, String> propertyMappings = comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.getPropertyMappings();
        System.assertEquals('slingServletSelectors', propertyMappings.get('sling.servlet.selectors'));
        System.assertEquals('slingServletExtensions', propertyMappings.get('sling.servlet.extensions'));
    }
}
