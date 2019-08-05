@isTest
private class OASComAdobeGraniteBundlesHcImplJobsHTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplJobsH.getExample();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2 = comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1;
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplJobsH();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4 = comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3;

        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplJobsH.getExample();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplJobsH.getExample();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplJobsH();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplJobsH();

        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplJobsH.getExample();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplJobsH();

        System.assertEquals(false, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplJobsH.getExample();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplJobsH();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplJobsH.getExample();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2 = new OASComAdobeGraniteBundlesHcImplJobsH();

        System.assertEquals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2.hashCode(), comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1 = OASComAdobeGraniteBundlesHcImplJobsH.getExample();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2 = OASComAdobeGraniteBundlesHcImplJobsH.getExample();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3 = new OASComAdobeGraniteBundlesHcImplJobsH();
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4 = new OASComAdobeGraniteBundlesHcImplJobsH();

        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2));
        System.assert(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3.equals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties1.hashCode(), comAdobeGraniteBundlesHcImplJobsHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteBundlesHcImplJobsHealthCheckProperties3.hashCode(), comAdobeGraniteBundlesHcImplJobsHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteBundlesHcImplJobsH comAdobeGraniteBundlesHcImplJobsHealthCheckProperties = new OASComAdobeGraniteBundlesHcImplJobsH();
        Map<String, String> propertyMappings = comAdobeGraniteBundlesHcImplJobsHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('maxQueuedJobs', propertyMappings.get('max.queued.jobs'));
    }
}
