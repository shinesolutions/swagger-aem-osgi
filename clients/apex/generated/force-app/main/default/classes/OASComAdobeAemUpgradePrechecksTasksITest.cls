@isTest
private class OASComAdobeAemUpgradePrechecksTasksITest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1 = OASComAdobeAemUpgradePrechecksTasksI.getExample();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2 = comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1;
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3 = new OASComAdobeAemUpgradePrechecksTasksI();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4 = comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3;

        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1 = OASComAdobeAemUpgradePrechecksTasksI.getExample();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2 = OASComAdobeAemUpgradePrechecksTasksI.getExample();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3 = new OASComAdobeAemUpgradePrechecksTasksI();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4 = new OASComAdobeAemUpgradePrechecksTasksI();

        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1 = OASComAdobeAemUpgradePrechecksTasksI.getExample();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2 = new OASComAdobeAemUpgradePrechecksTasksI();

        System.assertEquals(false, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1 = OASComAdobeAemUpgradePrechecksTasksI.getExample();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2 = new OASComAdobeAemUpgradePrechecksTasksI();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3;

        System.assertEquals(false, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3));
        System.assertEquals(false, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1 = OASComAdobeAemUpgradePrechecksTasksI.getExample();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2 = new OASComAdobeAemUpgradePrechecksTasksI();

        System.assertEquals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.hashCode(), comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.hashCode());
        System.assertEquals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2.hashCode(), comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1 = OASComAdobeAemUpgradePrechecksTasksI.getExample();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2 = OASComAdobeAemUpgradePrechecksTasksI.getExample();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3 = new OASComAdobeAemUpgradePrechecksTasksI();
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4 = new OASComAdobeAemUpgradePrechecksTasksI();

        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2));
        System.assert(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3.equals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4));
        System.assertEquals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties1.hashCode(), comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties2.hashCode());
        System.assertEquals(comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties3.hashCode(), comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeAemUpgradePrechecksTasksI comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties = new OASComAdobeAemUpgradePrechecksTasksI();
        Map<String, String> propertyMappings = comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.getPropertyMappings();
        System.assertEquals('rootPath', propertyMappings.get('root.path'));
        System.assertEquals('fixInconsistencies', propertyMappings.get('fix.inconsistencies'));
    }
}
