@isTest
private class OASComAdobeGraniteRepositoryServiceUTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties1 = OASComAdobeGraniteRepositoryServiceU.getExample();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties2 = comAdobeGraniteRepositoryServiceUserConfigurationProperties1;
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties3 = new OASComAdobeGraniteRepositoryServiceU();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties4 = comAdobeGraniteRepositoryServiceUserConfigurationProperties3;

        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties1.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties2));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties2.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties1));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties1.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties1));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties3.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties4));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties4.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties3));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties3.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties1 = OASComAdobeGraniteRepositoryServiceU.getExample();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties2 = OASComAdobeGraniteRepositoryServiceU.getExample();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties3 = new OASComAdobeGraniteRepositoryServiceU();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties4 = new OASComAdobeGraniteRepositoryServiceU();

        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties1.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties2));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties2.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties1));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties3.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties4));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties4.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties1 = OASComAdobeGraniteRepositoryServiceU.getExample();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties2 = new OASComAdobeGraniteRepositoryServiceU();

        System.assertEquals(false, comAdobeGraniteRepositoryServiceUserConfigurationProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRepositoryServiceUserConfigurationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties1 = OASComAdobeGraniteRepositoryServiceU.getExample();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties2 = new OASComAdobeGraniteRepositoryServiceU();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties3;

        System.assertEquals(false, comAdobeGraniteRepositoryServiceUserConfigurationProperties1.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties3));
        System.assertEquals(false, comAdobeGraniteRepositoryServiceUserConfigurationProperties2.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties1 = OASComAdobeGraniteRepositoryServiceU.getExample();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties2 = new OASComAdobeGraniteRepositoryServiceU();

        System.assertEquals(comAdobeGraniteRepositoryServiceUserConfigurationProperties1.hashCode(), comAdobeGraniteRepositoryServiceUserConfigurationProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryServiceUserConfigurationProperties2.hashCode(), comAdobeGraniteRepositoryServiceUserConfigurationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties1 = OASComAdobeGraniteRepositoryServiceU.getExample();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties2 = OASComAdobeGraniteRepositoryServiceU.getExample();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties3 = new OASComAdobeGraniteRepositoryServiceU();
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties4 = new OASComAdobeGraniteRepositoryServiceU();

        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties1.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties2));
        System.assert(comAdobeGraniteRepositoryServiceUserConfigurationProperties3.equals(comAdobeGraniteRepositoryServiceUserConfigurationProperties4));
        System.assertEquals(comAdobeGraniteRepositoryServiceUserConfigurationProperties1.hashCode(), comAdobeGraniteRepositoryServiceUserConfigurationProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryServiceUserConfigurationProperties3.hashCode(), comAdobeGraniteRepositoryServiceUserConfigurationProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRepositoryServiceU comAdobeGraniteRepositoryServiceUserConfigurationProperties = new OASComAdobeGraniteRepositoryServiceU();
        Map<String, String> propertyMappings = comAdobeGraniteRepositoryServiceUserConfigurationProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
        System.assertEquals('serviceusersSimpleSubjectPopulation', propertyMappings.get('serviceusers.simpleSubjectPopulation'));
        System.assertEquals('serviceusersList', propertyMappings.get('serviceusers.list'));
    }
}
