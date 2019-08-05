@isTest
private class OASComAdobeGraniteCsrfImplCSRFServleTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties1 = OASComAdobeGraniteCsrfImplCSRFServle.getExample();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties2 = comAdobeGraniteCsrfImplCSRFServletProperties1;
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties3 = new OASComAdobeGraniteCsrfImplCSRFServle();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties4 = comAdobeGraniteCsrfImplCSRFServletProperties3;

        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties1.equals(comAdobeGraniteCsrfImplCSRFServletProperties2));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties2.equals(comAdobeGraniteCsrfImplCSRFServletProperties1));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties1.equals(comAdobeGraniteCsrfImplCSRFServletProperties1));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties3.equals(comAdobeGraniteCsrfImplCSRFServletProperties4));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties4.equals(comAdobeGraniteCsrfImplCSRFServletProperties3));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties3.equals(comAdobeGraniteCsrfImplCSRFServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties1 = OASComAdobeGraniteCsrfImplCSRFServle.getExample();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties2 = OASComAdobeGraniteCsrfImplCSRFServle.getExample();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties3 = new OASComAdobeGraniteCsrfImplCSRFServle();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties4 = new OASComAdobeGraniteCsrfImplCSRFServle();

        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties1.equals(comAdobeGraniteCsrfImplCSRFServletProperties2));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties2.equals(comAdobeGraniteCsrfImplCSRFServletProperties1));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties3.equals(comAdobeGraniteCsrfImplCSRFServletProperties4));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties4.equals(comAdobeGraniteCsrfImplCSRFServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties1 = OASComAdobeGraniteCsrfImplCSRFServle.getExample();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties2 = new OASComAdobeGraniteCsrfImplCSRFServle();

        System.assertEquals(false, comAdobeGraniteCsrfImplCSRFServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteCsrfImplCSRFServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties1 = OASComAdobeGraniteCsrfImplCSRFServle.getExample();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties2 = new OASComAdobeGraniteCsrfImplCSRFServle();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties3;

        System.assertEquals(false, comAdobeGraniteCsrfImplCSRFServletProperties1.equals(comAdobeGraniteCsrfImplCSRFServletProperties3));
        System.assertEquals(false, comAdobeGraniteCsrfImplCSRFServletProperties2.equals(comAdobeGraniteCsrfImplCSRFServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties1 = OASComAdobeGraniteCsrfImplCSRFServle.getExample();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties2 = new OASComAdobeGraniteCsrfImplCSRFServle();

        System.assertEquals(comAdobeGraniteCsrfImplCSRFServletProperties1.hashCode(), comAdobeGraniteCsrfImplCSRFServletProperties1.hashCode());
        System.assertEquals(comAdobeGraniteCsrfImplCSRFServletProperties2.hashCode(), comAdobeGraniteCsrfImplCSRFServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties1 = OASComAdobeGraniteCsrfImplCSRFServle.getExample();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties2 = OASComAdobeGraniteCsrfImplCSRFServle.getExample();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties3 = new OASComAdobeGraniteCsrfImplCSRFServle();
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties4 = new OASComAdobeGraniteCsrfImplCSRFServle();

        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties1.equals(comAdobeGraniteCsrfImplCSRFServletProperties2));
        System.assert(comAdobeGraniteCsrfImplCSRFServletProperties3.equals(comAdobeGraniteCsrfImplCSRFServletProperties4));
        System.assertEquals(comAdobeGraniteCsrfImplCSRFServletProperties1.hashCode(), comAdobeGraniteCsrfImplCSRFServletProperties2.hashCode());
        System.assertEquals(comAdobeGraniteCsrfImplCSRFServletProperties3.hashCode(), comAdobeGraniteCsrfImplCSRFServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteCsrfImplCSRFServle comAdobeGraniteCsrfImplCSRFServletProperties = new OASComAdobeGraniteCsrfImplCSRFServle();
        Map<String, String> propertyMappings = comAdobeGraniteCsrfImplCSRFServletProperties.getPropertyMappings();
        System.assertEquals('csrfTokenExpiresIn', propertyMappings.get('csrf.token.expires.in'));
        System.assertEquals('slingAuthRequirements', propertyMappings.get('sling.auth.requirements'));
    }
}
