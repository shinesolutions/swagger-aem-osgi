@isTest
private class OASComDayCommonsHttpclientPropertiesTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties1 = OASComDayCommonsHttpclientProperties.getExample();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties2 = comDayCommonsHttpclientProperties1;
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties3 = new OASComDayCommonsHttpclientProperties();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties4 = comDayCommonsHttpclientProperties3;

        System.assert(comDayCommonsHttpclientProperties1.equals(comDayCommonsHttpclientProperties2));
        System.assert(comDayCommonsHttpclientProperties2.equals(comDayCommonsHttpclientProperties1));
        System.assert(comDayCommonsHttpclientProperties1.equals(comDayCommonsHttpclientProperties1));
        System.assert(comDayCommonsHttpclientProperties3.equals(comDayCommonsHttpclientProperties4));
        System.assert(comDayCommonsHttpclientProperties4.equals(comDayCommonsHttpclientProperties3));
        System.assert(comDayCommonsHttpclientProperties3.equals(comDayCommonsHttpclientProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties1 = OASComDayCommonsHttpclientProperties.getExample();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties2 = OASComDayCommonsHttpclientProperties.getExample();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties3 = new OASComDayCommonsHttpclientProperties();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties4 = new OASComDayCommonsHttpclientProperties();

        System.assert(comDayCommonsHttpclientProperties1.equals(comDayCommonsHttpclientProperties2));
        System.assert(comDayCommonsHttpclientProperties2.equals(comDayCommonsHttpclientProperties1));
        System.assert(comDayCommonsHttpclientProperties3.equals(comDayCommonsHttpclientProperties4));
        System.assert(comDayCommonsHttpclientProperties4.equals(comDayCommonsHttpclientProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties1 = OASComDayCommonsHttpclientProperties.getExample();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties2 = new OASComDayCommonsHttpclientProperties();

        System.assertEquals(false, comDayCommonsHttpclientProperties1.equals('foo'));
        System.assertEquals(false, comDayCommonsHttpclientProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties1 = OASComDayCommonsHttpclientProperties.getExample();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties2 = new OASComDayCommonsHttpclientProperties();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties3;

        System.assertEquals(false, comDayCommonsHttpclientProperties1.equals(comDayCommonsHttpclientProperties3));
        System.assertEquals(false, comDayCommonsHttpclientProperties2.equals(comDayCommonsHttpclientProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties1 = OASComDayCommonsHttpclientProperties.getExample();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties2 = new OASComDayCommonsHttpclientProperties();

        System.assertEquals(comDayCommonsHttpclientProperties1.hashCode(), comDayCommonsHttpclientProperties1.hashCode());
        System.assertEquals(comDayCommonsHttpclientProperties2.hashCode(), comDayCommonsHttpclientProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties1 = OASComDayCommonsHttpclientProperties.getExample();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties2 = OASComDayCommonsHttpclientProperties.getExample();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties3 = new OASComDayCommonsHttpclientProperties();
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties4 = new OASComDayCommonsHttpclientProperties();

        System.assert(comDayCommonsHttpclientProperties1.equals(comDayCommonsHttpclientProperties2));
        System.assert(comDayCommonsHttpclientProperties3.equals(comDayCommonsHttpclientProperties4));
        System.assertEquals(comDayCommonsHttpclientProperties1.hashCode(), comDayCommonsHttpclientProperties2.hashCode());
        System.assertEquals(comDayCommonsHttpclientProperties3.hashCode(), comDayCommonsHttpclientProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties = new OASComDayCommonsHttpclientProperties();
        Map<String, String> propertyMappings = comDayCommonsHttpclientProperties.getPropertyMappings();
        System.assertEquals('proxyEnabled', propertyMappings.get('proxy.enabled'));
        System.assertEquals('proxyHost', propertyMappings.get('proxy.host'));
        System.assertEquals('proxyUser', propertyMappings.get('proxy.user'));
        System.assertEquals('proxyPassword', propertyMappings.get('proxy.password'));
        System.assertEquals('proxyNtlmHost', propertyMappings.get('proxy.ntlm.host'));
        System.assertEquals('proxyNtlmDomain', propertyMappings.get('proxy.ntlm.domain'));
        System.assertEquals('proxyExceptions', propertyMappings.get('proxy.exceptions'));
    }
}
