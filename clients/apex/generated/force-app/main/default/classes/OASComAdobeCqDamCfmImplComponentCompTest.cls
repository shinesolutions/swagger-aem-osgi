@isTest
private class OASComAdobeCqDamCfmImplComponentCompTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties1 = OASComAdobeCqDamCfmImplComponentComp.getExample();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties2 = comAdobeCqDamCfmImplComponentComponentConfigImplProperties1;
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties3 = new OASComAdobeCqDamCfmImplComponentComp();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties4 = comAdobeCqDamCfmImplComponentComponentConfigImplProperties3;

        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties2));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties2.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties4));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties4.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties1 = OASComAdobeCqDamCfmImplComponentComp.getExample();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties2 = OASComAdobeCqDamCfmImplComponentComp.getExample();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties3 = new OASComAdobeCqDamCfmImplComponentComp();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties4 = new OASComAdobeCqDamCfmImplComponentComp();

        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties2));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties2.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties4));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties4.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties1 = OASComAdobeCqDamCfmImplComponentComp.getExample();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties2 = new OASComAdobeCqDamCfmImplComponentComp();

        System.assertEquals(false, comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamCfmImplComponentComponentConfigImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties1 = OASComAdobeCqDamCfmImplComponentComp.getExample();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties2 = new OASComAdobeCqDamCfmImplComponentComp();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties3;

        System.assertEquals(false, comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3));
        System.assertEquals(false, comAdobeCqDamCfmImplComponentComponentConfigImplProperties2.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties1 = OASComAdobeCqDamCfmImplComponentComp.getExample();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties2 = new OASComAdobeCqDamCfmImplComponentComp();

        System.assertEquals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.hashCode(), comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.hashCode());
        System.assertEquals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties2.hashCode(), comAdobeCqDamCfmImplComponentComponentConfigImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties1 = OASComAdobeCqDamCfmImplComponentComp.getExample();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties2 = OASComAdobeCqDamCfmImplComponentComp.getExample();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties3 = new OASComAdobeCqDamCfmImplComponentComp();
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties4 = new OASComAdobeCqDamCfmImplComponentComp();

        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties2));
        System.assert(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3.equals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties4));
        System.assertEquals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties1.hashCode(), comAdobeCqDamCfmImplComponentComponentConfigImplProperties2.hashCode());
        System.assertEquals(comAdobeCqDamCfmImplComponentComponentConfigImplProperties3.hashCode(), comAdobeCqDamCfmImplComponentComponentConfigImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamCfmImplComponentComp comAdobeCqDamCfmImplComponentComponentConfigImplProperties = new OASComAdobeCqDamCfmImplComponentComp();
        Map<String, String> propertyMappings = comAdobeCqDamCfmImplComponentComponentConfigImplProperties.getPropertyMappings();
        System.assertEquals('damCfmComponentResourceType', propertyMappings.get('dam.cfm.component.resourceType'));
        System.assertEquals('damCfmComponentFileReferenceProp', propertyMappings.get('dam.cfm.component.fileReferenceProp'));
        System.assertEquals('damCfmComponentElementsProp', propertyMappings.get('dam.cfm.component.elementsProp'));
        System.assertEquals('damCfmComponentVariationProp', propertyMappings.get('dam.cfm.component.variationProp'));
    }
}
