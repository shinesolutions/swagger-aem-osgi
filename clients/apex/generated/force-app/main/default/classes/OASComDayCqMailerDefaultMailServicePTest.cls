@isTest
private class OASComDayCqMailerDefaultMailServicePTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties1 = OASComDayCqMailerDefaultMailServiceP.getExample();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties2 = comDayCqMailerDefaultMailServiceProperties1;
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties3 = new OASComDayCqMailerDefaultMailServiceP();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties4 = comDayCqMailerDefaultMailServiceProperties3;

        System.assert(comDayCqMailerDefaultMailServiceProperties1.equals(comDayCqMailerDefaultMailServiceProperties2));
        System.assert(comDayCqMailerDefaultMailServiceProperties2.equals(comDayCqMailerDefaultMailServiceProperties1));
        System.assert(comDayCqMailerDefaultMailServiceProperties1.equals(comDayCqMailerDefaultMailServiceProperties1));
        System.assert(comDayCqMailerDefaultMailServiceProperties3.equals(comDayCqMailerDefaultMailServiceProperties4));
        System.assert(comDayCqMailerDefaultMailServiceProperties4.equals(comDayCqMailerDefaultMailServiceProperties3));
        System.assert(comDayCqMailerDefaultMailServiceProperties3.equals(comDayCqMailerDefaultMailServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties1 = OASComDayCqMailerDefaultMailServiceP.getExample();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties2 = OASComDayCqMailerDefaultMailServiceP.getExample();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties3 = new OASComDayCqMailerDefaultMailServiceP();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties4 = new OASComDayCqMailerDefaultMailServiceP();

        System.assert(comDayCqMailerDefaultMailServiceProperties1.equals(comDayCqMailerDefaultMailServiceProperties2));
        System.assert(comDayCqMailerDefaultMailServiceProperties2.equals(comDayCqMailerDefaultMailServiceProperties1));
        System.assert(comDayCqMailerDefaultMailServiceProperties3.equals(comDayCqMailerDefaultMailServiceProperties4));
        System.assert(comDayCqMailerDefaultMailServiceProperties4.equals(comDayCqMailerDefaultMailServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties1 = OASComDayCqMailerDefaultMailServiceP.getExample();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties2 = new OASComDayCqMailerDefaultMailServiceP();

        System.assertEquals(false, comDayCqMailerDefaultMailServiceProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMailerDefaultMailServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties1 = OASComDayCqMailerDefaultMailServiceP.getExample();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties2 = new OASComDayCqMailerDefaultMailServiceP();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties3;

        System.assertEquals(false, comDayCqMailerDefaultMailServiceProperties1.equals(comDayCqMailerDefaultMailServiceProperties3));
        System.assertEquals(false, comDayCqMailerDefaultMailServiceProperties2.equals(comDayCqMailerDefaultMailServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties1 = OASComDayCqMailerDefaultMailServiceP.getExample();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties2 = new OASComDayCqMailerDefaultMailServiceP();

        System.assertEquals(comDayCqMailerDefaultMailServiceProperties1.hashCode(), comDayCqMailerDefaultMailServiceProperties1.hashCode());
        System.assertEquals(comDayCqMailerDefaultMailServiceProperties2.hashCode(), comDayCqMailerDefaultMailServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties1 = OASComDayCqMailerDefaultMailServiceP.getExample();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties2 = OASComDayCqMailerDefaultMailServiceP.getExample();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties3 = new OASComDayCqMailerDefaultMailServiceP();
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties4 = new OASComDayCqMailerDefaultMailServiceP();

        System.assert(comDayCqMailerDefaultMailServiceProperties1.equals(comDayCqMailerDefaultMailServiceProperties2));
        System.assert(comDayCqMailerDefaultMailServiceProperties3.equals(comDayCqMailerDefaultMailServiceProperties4));
        System.assertEquals(comDayCqMailerDefaultMailServiceProperties1.hashCode(), comDayCqMailerDefaultMailServiceProperties2.hashCode());
        System.assertEquals(comDayCqMailerDefaultMailServiceProperties3.hashCode(), comDayCqMailerDefaultMailServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMailerDefaultMailServiceP comDayCqMailerDefaultMailServiceProperties = new OASComDayCqMailerDefaultMailServiceP();
        Map<String, String> propertyMappings = comDayCqMailerDefaultMailServiceProperties.getPropertyMappings();
        System.assertEquals('smtpHost', propertyMappings.get('smtp.host'));
        System.assertEquals('smtpPort', propertyMappings.get('smtp.port'));
        System.assertEquals('smtpUser', propertyMappings.get('smtp.user'));
        System.assertEquals('smtpPassword', propertyMappings.get('smtp.password'));
        System.assertEquals('fromAddress', propertyMappings.get('from.address'));
        System.assertEquals('smtpSsl', propertyMappings.get('smtp.ssl'));
        System.assertEquals('smtpStarttls', propertyMappings.get('smtp.starttls'));
        System.assertEquals('debugEmail', propertyMappings.get('debug.email'));
    }
}
