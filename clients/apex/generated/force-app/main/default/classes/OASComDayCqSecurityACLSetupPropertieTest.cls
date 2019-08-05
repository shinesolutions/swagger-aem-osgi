@isTest
private class OASComDayCqSecurityACLSetupPropertieTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties1 = OASComDayCqSecurityACLSetupPropertie.getExample();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties2 = comDayCqSecurityACLSetupProperties1;
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties3 = new OASComDayCqSecurityACLSetupPropertie();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties4 = comDayCqSecurityACLSetupProperties3;

        System.assert(comDayCqSecurityACLSetupProperties1.equals(comDayCqSecurityACLSetupProperties2));
        System.assert(comDayCqSecurityACLSetupProperties2.equals(comDayCqSecurityACLSetupProperties1));
        System.assert(comDayCqSecurityACLSetupProperties1.equals(comDayCqSecurityACLSetupProperties1));
        System.assert(comDayCqSecurityACLSetupProperties3.equals(comDayCqSecurityACLSetupProperties4));
        System.assert(comDayCqSecurityACLSetupProperties4.equals(comDayCqSecurityACLSetupProperties3));
        System.assert(comDayCqSecurityACLSetupProperties3.equals(comDayCqSecurityACLSetupProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties1 = OASComDayCqSecurityACLSetupPropertie.getExample();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties2 = OASComDayCqSecurityACLSetupPropertie.getExample();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties3 = new OASComDayCqSecurityACLSetupPropertie();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties4 = new OASComDayCqSecurityACLSetupPropertie();

        System.assert(comDayCqSecurityACLSetupProperties1.equals(comDayCqSecurityACLSetupProperties2));
        System.assert(comDayCqSecurityACLSetupProperties2.equals(comDayCqSecurityACLSetupProperties1));
        System.assert(comDayCqSecurityACLSetupProperties3.equals(comDayCqSecurityACLSetupProperties4));
        System.assert(comDayCqSecurityACLSetupProperties4.equals(comDayCqSecurityACLSetupProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties1 = OASComDayCqSecurityACLSetupPropertie.getExample();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties2 = new OASComDayCqSecurityACLSetupPropertie();

        System.assertEquals(false, comDayCqSecurityACLSetupProperties1.equals('foo'));
        System.assertEquals(false, comDayCqSecurityACLSetupProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties1 = OASComDayCqSecurityACLSetupPropertie.getExample();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties2 = new OASComDayCqSecurityACLSetupPropertie();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties3;

        System.assertEquals(false, comDayCqSecurityACLSetupProperties1.equals(comDayCqSecurityACLSetupProperties3));
        System.assertEquals(false, comDayCqSecurityACLSetupProperties2.equals(comDayCqSecurityACLSetupProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties1 = OASComDayCqSecurityACLSetupPropertie.getExample();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties2 = new OASComDayCqSecurityACLSetupPropertie();

        System.assertEquals(comDayCqSecurityACLSetupProperties1.hashCode(), comDayCqSecurityACLSetupProperties1.hashCode());
        System.assertEquals(comDayCqSecurityACLSetupProperties2.hashCode(), comDayCqSecurityACLSetupProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties1 = OASComDayCqSecurityACLSetupPropertie.getExample();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties2 = OASComDayCqSecurityACLSetupPropertie.getExample();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties3 = new OASComDayCqSecurityACLSetupPropertie();
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties4 = new OASComDayCqSecurityACLSetupPropertie();

        System.assert(comDayCqSecurityACLSetupProperties1.equals(comDayCqSecurityACLSetupProperties2));
        System.assert(comDayCqSecurityACLSetupProperties3.equals(comDayCqSecurityACLSetupProperties4));
        System.assertEquals(comDayCqSecurityACLSetupProperties1.hashCode(), comDayCqSecurityACLSetupProperties2.hashCode());
        System.assertEquals(comDayCqSecurityACLSetupProperties3.hashCode(), comDayCqSecurityACLSetupProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqSecurityACLSetupPropertie comDayCqSecurityACLSetupProperties = new OASComDayCqSecurityACLSetupPropertie();
        Map<String, String> propertyMappings = comDayCqSecurityACLSetupProperties.getPropertyMappings();
        System.assertEquals('cqAclsetupRules', propertyMappings.get('cq.aclsetup.rules'));
    }
}
