@isTest
private class OASComDayCqCommonsServletsRootMappinTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties1 = OASComDayCqCommonsServletsRootMappin.getExample();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties2 = comDayCqCommonsServletsRootMappingServletProperties1;
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties3 = new OASComDayCqCommonsServletsRootMappin();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties4 = comDayCqCommonsServletsRootMappingServletProperties3;

        System.assert(comDayCqCommonsServletsRootMappingServletProperties1.equals(comDayCqCommonsServletsRootMappingServletProperties2));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties2.equals(comDayCqCommonsServletsRootMappingServletProperties1));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties1.equals(comDayCqCommonsServletsRootMappingServletProperties1));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties3.equals(comDayCqCommonsServletsRootMappingServletProperties4));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties4.equals(comDayCqCommonsServletsRootMappingServletProperties3));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties3.equals(comDayCqCommonsServletsRootMappingServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties1 = OASComDayCqCommonsServletsRootMappin.getExample();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties2 = OASComDayCqCommonsServletsRootMappin.getExample();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties3 = new OASComDayCqCommonsServletsRootMappin();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties4 = new OASComDayCqCommonsServletsRootMappin();

        System.assert(comDayCqCommonsServletsRootMappingServletProperties1.equals(comDayCqCommonsServletsRootMappingServletProperties2));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties2.equals(comDayCqCommonsServletsRootMappingServletProperties1));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties3.equals(comDayCqCommonsServletsRootMappingServletProperties4));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties4.equals(comDayCqCommonsServletsRootMappingServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties1 = OASComDayCqCommonsServletsRootMappin.getExample();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties2 = new OASComDayCqCommonsServletsRootMappin();

        System.assertEquals(false, comDayCqCommonsServletsRootMappingServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqCommonsServletsRootMappingServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties1 = OASComDayCqCommonsServletsRootMappin.getExample();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties2 = new OASComDayCqCommonsServletsRootMappin();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties3;

        System.assertEquals(false, comDayCqCommonsServletsRootMappingServletProperties1.equals(comDayCqCommonsServletsRootMappingServletProperties3));
        System.assertEquals(false, comDayCqCommonsServletsRootMappingServletProperties2.equals(comDayCqCommonsServletsRootMappingServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties1 = OASComDayCqCommonsServletsRootMappin.getExample();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties2 = new OASComDayCqCommonsServletsRootMappin();

        System.assertEquals(comDayCqCommonsServletsRootMappingServletProperties1.hashCode(), comDayCqCommonsServletsRootMappingServletProperties1.hashCode());
        System.assertEquals(comDayCqCommonsServletsRootMappingServletProperties2.hashCode(), comDayCqCommonsServletsRootMappingServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties1 = OASComDayCqCommonsServletsRootMappin.getExample();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties2 = OASComDayCqCommonsServletsRootMappin.getExample();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties3 = new OASComDayCqCommonsServletsRootMappin();
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties4 = new OASComDayCqCommonsServletsRootMappin();

        System.assert(comDayCqCommonsServletsRootMappingServletProperties1.equals(comDayCqCommonsServletsRootMappingServletProperties2));
        System.assert(comDayCqCommonsServletsRootMappingServletProperties3.equals(comDayCqCommonsServletsRootMappingServletProperties4));
        System.assertEquals(comDayCqCommonsServletsRootMappingServletProperties1.hashCode(), comDayCqCommonsServletsRootMappingServletProperties2.hashCode());
        System.assertEquals(comDayCqCommonsServletsRootMappingServletProperties3.hashCode(), comDayCqCommonsServletsRootMappingServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqCommonsServletsRootMappin comDayCqCommonsServletsRootMappingServletProperties = new OASComDayCqCommonsServletsRootMappin();
        Map<String, String> propertyMappings = comDayCqCommonsServletsRootMappingServletProperties.getPropertyMappings();
        System.assertEquals('rootmappingTarget', propertyMappings.get('rootmapping.target'));
    }
}
