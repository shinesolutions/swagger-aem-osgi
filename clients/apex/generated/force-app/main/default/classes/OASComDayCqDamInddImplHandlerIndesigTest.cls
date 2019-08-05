@isTest
private class OASComDayCqDamInddImplHandlerIndesigTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1 = OASComDayCqDamInddImplHandlerIndesig.getExample();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2 = comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1;
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3 = new OASComDayCqDamInddImplHandlerIndesig();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4 = comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3;

        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1 = OASComDayCqDamInddImplHandlerIndesig.getExample();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2 = OASComDayCqDamInddImplHandlerIndesig.getExample();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3 = new OASComDayCqDamInddImplHandlerIndesig();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4 = new OASComDayCqDamInddImplHandlerIndesig();

        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1 = OASComDayCqDamInddImplHandlerIndesig.getExample();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2 = new OASComDayCqDamInddImplHandlerIndesig();

        System.assertEquals(false, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1 = OASComDayCqDamInddImplHandlerIndesig.getExample();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2 = new OASComDayCqDamInddImplHandlerIndesig();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3;

        System.assertEquals(false, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3));
        System.assertEquals(false, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1 = OASComDayCqDamInddImplHandlerIndesig.getExample();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2 = new OASComDayCqDamInddImplHandlerIndesig();

        System.assertEquals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.hashCode(), comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2.hashCode(), comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1 = OASComDayCqDamInddImplHandlerIndesig.getExample();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2 = OASComDayCqDamInddImplHandlerIndesig.getExample();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3 = new OASComDayCqDamInddImplHandlerIndesig();
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4 = new OASComDayCqDamInddImplHandlerIndesig();

        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2));
        System.assert(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3.equals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4));
        System.assertEquals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties1.hashCode(), comDayCqDamInddImplHandlerIndesignXMPHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamInddImplHandlerIndesignXMPHandlerProperties3.hashCode(), comDayCqDamInddImplHandlerIndesignXMPHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamInddImplHandlerIndesig comDayCqDamInddImplHandlerIndesignXMPHandlerProperties = new OASComDayCqDamInddImplHandlerIndesig();
        Map<String, String> propertyMappings = comDayCqDamInddImplHandlerIndesignXMPHandlerProperties.getPropertyMappings();
        System.assertEquals('processLabel', propertyMappings.get('process.label'));
        System.assertEquals('extractPages', propertyMappings.get('extract.pages'));
    }
}
