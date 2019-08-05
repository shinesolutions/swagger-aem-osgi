@isTest
private class OASComAdobeGraniteActivitystreamsImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1 = OASComAdobeGraniteActivitystreamsImp.getExample();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2 = comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1;
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3 = new OASComAdobeGraniteActivitystreamsImp();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4 = comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3;

        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1 = OASComAdobeGraniteActivitystreamsImp.getExample();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2 = OASComAdobeGraniteActivitystreamsImp.getExample();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3 = new OASComAdobeGraniteActivitystreamsImp();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4 = new OASComAdobeGraniteActivitystreamsImp();

        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1 = OASComAdobeGraniteActivitystreamsImp.getExample();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2 = new OASComAdobeGraniteActivitystreamsImp();

        System.assertEquals(false, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1 = OASComAdobeGraniteActivitystreamsImp.getExample();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2 = new OASComAdobeGraniteActivitystreamsImp();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3;

        System.assertEquals(false, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3));
        System.assertEquals(false, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1 = OASComAdobeGraniteActivitystreamsImp.getExample();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2 = new OASComAdobeGraniteActivitystreamsImp();

        System.assertEquals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.hashCode(), comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2.hashCode(), comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1 = OASComAdobeGraniteActivitystreamsImp.getExample();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2 = OASComAdobeGraniteActivitystreamsImp.getExample();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3 = new OASComAdobeGraniteActivitystreamsImp();
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4 = new OASComAdobeGraniteActivitystreamsImp();

        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2));
        System.assert(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3.equals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4));
        System.assertEquals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties1.hashCode(), comAdobeGraniteActivitystreamsImplActivityManagerImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteActivitystreamsImplActivityManagerImplProperties3.hashCode(), comAdobeGraniteActivitystreamsImplActivityManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteActivitystreamsImp comAdobeGraniteActivitystreamsImplActivityManagerImplProperties = new OASComAdobeGraniteActivitystreamsImp();
        Map<String, String> propertyMappings = comAdobeGraniteActivitystreamsImplActivityManagerImplProperties.getPropertyMappings();
        System.assertEquals('aggregateRelationships', propertyMappings.get('aggregate.relationships'));
        System.assertEquals('aggregateDescendVirtual', propertyMappings.get('aggregate.descend.virtual'));
    }
}
