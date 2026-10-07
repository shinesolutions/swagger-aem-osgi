@isTest
private class OASComAdobeGraniteAuthRequirementImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1 = OASComAdobeGraniteAuthRequirementImp.getExample();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2 = comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1;
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3 = new OASComAdobeGraniteAuthRequirementImp();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4 = comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3;

        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1 = OASComAdobeGraniteAuthRequirementImp.getExample();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2 = OASComAdobeGraniteAuthRequirementImp.getExample();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3 = new OASComAdobeGraniteAuthRequirementImp();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4 = new OASComAdobeGraniteAuthRequirementImp();

        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1 = OASComAdobeGraniteAuthRequirementImp.getExample();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2 = new OASComAdobeGraniteAuthRequirementImp();

        System.assertEquals(false, comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1 = OASComAdobeGraniteAuthRequirementImp.getExample();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2 = new OASComAdobeGraniteAuthRequirementImp();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3;

        System.assertEquals(false, comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3));
        System.assertEquals(false, comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1 = OASComAdobeGraniteAuthRequirementImp.getExample();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2 = new OASComAdobeGraniteAuthRequirementImp();

        System.assertEquals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.hashCode(), comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2.hashCode(), comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1 = OASComAdobeGraniteAuthRequirementImp.getExample();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2 = OASComAdobeGraniteAuthRequirementImp.getExample();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3 = new OASComAdobeGraniteAuthRequirementImp();
        OASComAdobeGraniteAuthRequirementImp comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4 = new OASComAdobeGraniteAuthRequirementImp();

        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2));
        System.assert(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3.equals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4));
        System.assertEquals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties1.hashCode(), comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties3.hashCode(), comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties4.hashCode());
    }
}
