@isTest
private class OASComAdobeCqSocialCalendarServletsTTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties1 = OASComAdobeCqSocialCalendarServletsT.getExample();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties2 = comAdobeCqSocialCalendarServletsTimeZoneServletProperties1;
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties3 = new OASComAdobeCqSocialCalendarServletsT();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties4 = comAdobeCqSocialCalendarServletsTimeZoneServletProperties3;

        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties2));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties2.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties4));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties4.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties1 = OASComAdobeCqSocialCalendarServletsT.getExample();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties2 = OASComAdobeCqSocialCalendarServletsT.getExample();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties3 = new OASComAdobeCqSocialCalendarServletsT();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties4 = new OASComAdobeCqSocialCalendarServletsT();

        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties2));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties2.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties4));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties4.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties1 = OASComAdobeCqSocialCalendarServletsT.getExample();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties2 = new OASComAdobeCqSocialCalendarServletsT();

        System.assertEquals(false, comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCalendarServletsTimeZoneServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties1 = OASComAdobeCqSocialCalendarServletsT.getExample();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties2 = new OASComAdobeCqSocialCalendarServletsT();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties3;

        System.assertEquals(false, comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3));
        System.assertEquals(false, comAdobeCqSocialCalendarServletsTimeZoneServletProperties2.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties1 = OASComAdobeCqSocialCalendarServletsT.getExample();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties2 = new OASComAdobeCqSocialCalendarServletsT();

        System.assertEquals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.hashCode(), comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties2.hashCode(), comAdobeCqSocialCalendarServletsTimeZoneServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties1 = OASComAdobeCqSocialCalendarServletsT.getExample();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties2 = OASComAdobeCqSocialCalendarServletsT.getExample();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties3 = new OASComAdobeCqSocialCalendarServletsT();
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties4 = new OASComAdobeCqSocialCalendarServletsT();

        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties2));
        System.assert(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3.equals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties4));
        System.assertEquals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties1.hashCode(), comAdobeCqSocialCalendarServletsTimeZoneServletProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCalendarServletsTimeZoneServletProperties3.hashCode(), comAdobeCqSocialCalendarServletsTimeZoneServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialCalendarServletsT comAdobeCqSocialCalendarServletsTimeZoneServletProperties = new OASComAdobeCqSocialCalendarServletsT();
        Map<String, String> propertyMappings = comAdobeCqSocialCalendarServletsTimeZoneServletProperties.getPropertyMappings();
        System.assertEquals('timezonesExpirytime', propertyMappings.get('timezones.expirytime'));
    }
}
