@isTest
private class OASComAdobeGraniteCsrfImplCSRFFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties1 = OASComAdobeGraniteCsrfImplCSRFFilter.getExample();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties2 = comAdobeGraniteCsrfImplCSRFFilterProperties1;
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties3 = new OASComAdobeGraniteCsrfImplCSRFFilter();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties4 = comAdobeGraniteCsrfImplCSRFFilterProperties3;

        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties1.equals(comAdobeGraniteCsrfImplCSRFFilterProperties2));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties2.equals(comAdobeGraniteCsrfImplCSRFFilterProperties1));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties1.equals(comAdobeGraniteCsrfImplCSRFFilterProperties1));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties3.equals(comAdobeGraniteCsrfImplCSRFFilterProperties4));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties4.equals(comAdobeGraniteCsrfImplCSRFFilterProperties3));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties3.equals(comAdobeGraniteCsrfImplCSRFFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties1 = OASComAdobeGraniteCsrfImplCSRFFilter.getExample();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties2 = OASComAdobeGraniteCsrfImplCSRFFilter.getExample();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties3 = new OASComAdobeGraniteCsrfImplCSRFFilter();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties4 = new OASComAdobeGraniteCsrfImplCSRFFilter();

        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties1.equals(comAdobeGraniteCsrfImplCSRFFilterProperties2));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties2.equals(comAdobeGraniteCsrfImplCSRFFilterProperties1));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties3.equals(comAdobeGraniteCsrfImplCSRFFilterProperties4));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties4.equals(comAdobeGraniteCsrfImplCSRFFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties1 = OASComAdobeGraniteCsrfImplCSRFFilter.getExample();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties2 = new OASComAdobeGraniteCsrfImplCSRFFilter();

        System.assertEquals(false, comAdobeGraniteCsrfImplCSRFFilterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteCsrfImplCSRFFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties1 = OASComAdobeGraniteCsrfImplCSRFFilter.getExample();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties2 = new OASComAdobeGraniteCsrfImplCSRFFilter();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties3;

        System.assertEquals(false, comAdobeGraniteCsrfImplCSRFFilterProperties1.equals(comAdobeGraniteCsrfImplCSRFFilterProperties3));
        System.assertEquals(false, comAdobeGraniteCsrfImplCSRFFilterProperties2.equals(comAdobeGraniteCsrfImplCSRFFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties1 = OASComAdobeGraniteCsrfImplCSRFFilter.getExample();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties2 = new OASComAdobeGraniteCsrfImplCSRFFilter();

        System.assertEquals(comAdobeGraniteCsrfImplCSRFFilterProperties1.hashCode(), comAdobeGraniteCsrfImplCSRFFilterProperties1.hashCode());
        System.assertEquals(comAdobeGraniteCsrfImplCSRFFilterProperties2.hashCode(), comAdobeGraniteCsrfImplCSRFFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties1 = OASComAdobeGraniteCsrfImplCSRFFilter.getExample();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties2 = OASComAdobeGraniteCsrfImplCSRFFilter.getExample();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties3 = new OASComAdobeGraniteCsrfImplCSRFFilter();
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties4 = new OASComAdobeGraniteCsrfImplCSRFFilter();

        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties1.equals(comAdobeGraniteCsrfImplCSRFFilterProperties2));
        System.assert(comAdobeGraniteCsrfImplCSRFFilterProperties3.equals(comAdobeGraniteCsrfImplCSRFFilterProperties4));
        System.assertEquals(comAdobeGraniteCsrfImplCSRFFilterProperties1.hashCode(), comAdobeGraniteCsrfImplCSRFFilterProperties2.hashCode());
        System.assertEquals(comAdobeGraniteCsrfImplCSRFFilterProperties3.hashCode(), comAdobeGraniteCsrfImplCSRFFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteCsrfImplCSRFFilter comAdobeGraniteCsrfImplCSRFFilterProperties = new OASComAdobeGraniteCsrfImplCSRFFilter();
        Map<String, String> x-property-mappings = comAdobeGraniteCsrfImplCSRFFilterProperties.getx-property-mappings();
        System.assertEquals('filterMethods', x-property-mappings.get('filter.methods'));
        System.assertEquals('filterEnableSafeUserAgents', x-property-mappings.get('filter.enable.safe.user.agents'));
        System.assertEquals('filterSafeUserAgents', x-property-mappings.get('filter.safe.user.agents'));
        System.assertEquals('filterExcludedPaths', x-property-mappings.get('filter.excluded.paths'));
    }
}
