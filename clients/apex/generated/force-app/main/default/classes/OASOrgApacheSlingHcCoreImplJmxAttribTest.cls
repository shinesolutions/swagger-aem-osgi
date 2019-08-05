@isTest
private class OASOrgApacheSlingHcCoreImplJmxAttribTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplJmxAttrib.getExample();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2 = orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1;
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplJmxAttrib();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4 = orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3;

        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplJmxAttrib.getExample();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2 = OASOrgApacheSlingHcCoreImplJmxAttrib.getExample();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplJmxAttrib();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4 = new OASOrgApacheSlingHcCoreImplJmxAttrib();

        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplJmxAttrib.getExample();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplJmxAttrib();

        System.assertEquals(false, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplJmxAttrib.getExample();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplJmxAttrib();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3;

        System.assertEquals(false, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3));
        System.assertEquals(false, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplJmxAttrib.getExample();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplJmxAttrib();

        System.assertEquals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.hashCode(), orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2.hashCode(), orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplJmxAttrib.getExample();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2 = OASOrgApacheSlingHcCoreImplJmxAttrib.getExample();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplJmxAttrib();
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4 = new OASOrgApacheSlingHcCoreImplJmxAttrib();

        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3.equals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4));
        System.assertEquals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties1.hashCode(), orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties2.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties3.hashCode(), orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingHcCoreImplJmxAttrib orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties = new OASOrgApacheSlingHcCoreImplJmxAttrib();
        Map<String, String> propertyMappings = orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcName', propertyMappings.get('hc.name'));
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('hcMbeanName', propertyMappings.get('hc.mbean.name'));
        System.assertEquals('mbeanName', propertyMappings.get('mbean.name'));
        System.assertEquals('attributeName', propertyMappings.get('attribute.name'));
        System.assertEquals('attributeValueConstraint', propertyMappings.get('attribute.value.constraint'));
    }
}
