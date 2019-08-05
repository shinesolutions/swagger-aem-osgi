@isTest
private class OASComAdobeCqDamMacSyncHelperImplMACTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1 = OASComAdobeCqDamMacSyncHelperImplMAC.getExample();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2 = comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1;
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3 = new OASComAdobeCqDamMacSyncHelperImplMAC();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4 = comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3;

        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1 = OASComAdobeCqDamMacSyncHelperImplMAC.getExample();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2 = OASComAdobeCqDamMacSyncHelperImplMAC.getExample();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3 = new OASComAdobeCqDamMacSyncHelperImplMAC();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4 = new OASComAdobeCqDamMacSyncHelperImplMAC();

        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1 = OASComAdobeCqDamMacSyncHelperImplMAC.getExample();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2 = new OASComAdobeCqDamMacSyncHelperImplMAC();

        System.assertEquals(false, comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1 = OASComAdobeCqDamMacSyncHelperImplMAC.getExample();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2 = new OASComAdobeCqDamMacSyncHelperImplMAC();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3;

        System.assertEquals(false, comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3));
        System.assertEquals(false, comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1 = OASComAdobeCqDamMacSyncHelperImplMAC.getExample();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2 = new OASComAdobeCqDamMacSyncHelperImplMAC();

        System.assertEquals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.hashCode(), comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.hashCode());
        System.assertEquals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2.hashCode(), comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1 = OASComAdobeCqDamMacSyncHelperImplMAC.getExample();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2 = OASComAdobeCqDamMacSyncHelperImplMAC.getExample();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3 = new OASComAdobeCqDamMacSyncHelperImplMAC();
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4 = new OASComAdobeCqDamMacSyncHelperImplMAC();

        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2));
        System.assert(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3.equals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4));
        System.assertEquals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties1.hashCode(), comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties2.hashCode());
        System.assertEquals(comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties3.hashCode(), comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamMacSyncHelperImplMAC comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties = new OASComAdobeCqDamMacSyncHelperImplMAC();
        Map<String, String> propertyMappings = comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.getPropertyMappings();
        System.assertEquals('comAdobeDamMacSyncClientSoTimeout', propertyMappings.get('com.adobe.dam.mac.sync.client.so.timeout'));
    }
}
