@isTest
private class OASComDayCqDamCoreImplServletResourcTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties1 = OASComDayCqDamCoreImplServletResourc.getExample();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties2 = comDayCqDamCoreImplServletResourceCollectionServletProperties1;
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties3 = new OASComDayCqDamCoreImplServletResourc();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties4 = comDayCqDamCoreImplServletResourceCollectionServletProperties3;

        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties1.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties2));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties2.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties1));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties1.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties1));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties3.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties4));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties4.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties3));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties3.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties1 = OASComDayCqDamCoreImplServletResourc.getExample();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties2 = OASComDayCqDamCoreImplServletResourc.getExample();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties3 = new OASComDayCqDamCoreImplServletResourc();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties4 = new OASComDayCqDamCoreImplServletResourc();

        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties1.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties2));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties2.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties1));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties3.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties4));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties4.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties1 = OASComDayCqDamCoreImplServletResourc.getExample();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties2 = new OASComDayCqDamCoreImplServletResourc();

        System.assertEquals(false, comDayCqDamCoreImplServletResourceCollectionServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletResourceCollectionServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties1 = OASComDayCqDamCoreImplServletResourc.getExample();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties2 = new OASComDayCqDamCoreImplServletResourc();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletResourceCollectionServletProperties1.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletResourceCollectionServletProperties2.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties1 = OASComDayCqDamCoreImplServletResourc.getExample();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties2 = new OASComDayCqDamCoreImplServletResourc();

        System.assertEquals(comDayCqDamCoreImplServletResourceCollectionServletProperties1.hashCode(), comDayCqDamCoreImplServletResourceCollectionServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletResourceCollectionServletProperties2.hashCode(), comDayCqDamCoreImplServletResourceCollectionServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties1 = OASComDayCqDamCoreImplServletResourc.getExample();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties2 = OASComDayCqDamCoreImplServletResourc.getExample();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties3 = new OASComDayCqDamCoreImplServletResourc();
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties4 = new OASComDayCqDamCoreImplServletResourc();

        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties1.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties2));
        System.assert(comDayCqDamCoreImplServletResourceCollectionServletProperties3.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletResourceCollectionServletProperties1.hashCode(), comDayCqDamCoreImplServletResourceCollectionServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletResourceCollectionServletProperties3.hashCode(), comDayCqDamCoreImplServletResourceCollectionServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletResourc comDayCqDamCoreImplServletResourceCollectionServletProperties = new OASComDayCqDamCoreImplServletResourc();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletResourceCollectionServletProperties.getPropertyMappings();
        System.assertEquals('slingServletResourceTypes', propertyMappings.get('sling.servlet.resourceTypes'));
        System.assertEquals('slingServletMethods', propertyMappings.get('sling.servlet.methods'));
        System.assertEquals('slingServletSelectors', propertyMappings.get('sling.servlet.selectors'));
        System.assertEquals('downloadConfig', propertyMappings.get('download.config'));
        System.assertEquals('viewSelector', propertyMappings.get('view.selector'));
        System.assertEquals('sendEmail', propertyMappings.get('send_email'));
    }
}
