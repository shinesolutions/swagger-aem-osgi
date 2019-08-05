@isTest
private class OASComAdobeFdFpConfigFormsPortalScheTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1 = OASComAdobeFdFpConfigFormsPortalSche.getExample();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2 = comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1;
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3 = new OASComAdobeFdFpConfigFormsPortalSche();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4 = comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3;

        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1 = OASComAdobeFdFpConfigFormsPortalSche.getExample();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2 = OASComAdobeFdFpConfigFormsPortalSche.getExample();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3 = new OASComAdobeFdFpConfigFormsPortalSche();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4 = new OASComAdobeFdFpConfigFormsPortalSche();

        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1 = OASComAdobeFdFpConfigFormsPortalSche.getExample();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2 = new OASComAdobeFdFpConfigFormsPortalSche();

        System.assertEquals(false, comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1 = OASComAdobeFdFpConfigFormsPortalSche.getExample();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2 = new OASComAdobeFdFpConfigFormsPortalSche();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3;

        System.assertEquals(false, comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3));
        System.assertEquals(false, comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1 = OASComAdobeFdFpConfigFormsPortalSche.getExample();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2 = new OASComAdobeFdFpConfigFormsPortalSche();

        System.assertEquals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.hashCode(), comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.hashCode());
        System.assertEquals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2.hashCode(), comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1 = OASComAdobeFdFpConfigFormsPortalSche.getExample();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2 = OASComAdobeFdFpConfigFormsPortalSche.getExample();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3 = new OASComAdobeFdFpConfigFormsPortalSche();
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4 = new OASComAdobeFdFpConfigFormsPortalSche();

        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2));
        System.assert(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3.equals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4));
        System.assertEquals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties1.hashCode(), comAdobeFdFpConfigFormsPortalSchedulerServiceProperties2.hashCode());
        System.assertEquals(comAdobeFdFpConfigFormsPortalSchedulerServiceProperties3.hashCode(), comAdobeFdFpConfigFormsPortalSchedulerServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeFdFpConfigFormsPortalSche comAdobeFdFpConfigFormsPortalSchedulerServiceProperties = new OASComAdobeFdFpConfigFormsPortalSche();
        Map<String, String> propertyMappings = comAdobeFdFpConfigFormsPortalSchedulerServiceProperties.getPropertyMappings();
        System.assertEquals('formportalInterval', propertyMappings.get('formportal.interval'));
    }
}
