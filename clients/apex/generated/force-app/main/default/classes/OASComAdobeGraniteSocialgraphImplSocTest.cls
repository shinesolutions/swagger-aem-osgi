@isTest
private class OASComAdobeGraniteSocialgraphImplSocTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1 = OASComAdobeGraniteSocialgraphImplSoc.getExample();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2 = comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1;
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3 = new OASComAdobeGraniteSocialgraphImplSoc();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4 = comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3;

        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1 = OASComAdobeGraniteSocialgraphImplSoc.getExample();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2 = OASComAdobeGraniteSocialgraphImplSoc.getExample();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3 = new OASComAdobeGraniteSocialgraphImplSoc();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4 = new OASComAdobeGraniteSocialgraphImplSoc();

        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1 = OASComAdobeGraniteSocialgraphImplSoc.getExample();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2 = new OASComAdobeGraniteSocialgraphImplSoc();

        System.assertEquals(false, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1 = OASComAdobeGraniteSocialgraphImplSoc.getExample();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2 = new OASComAdobeGraniteSocialgraphImplSoc();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3;

        System.assertEquals(false, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3));
        System.assertEquals(false, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1 = OASComAdobeGraniteSocialgraphImplSoc.getExample();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2 = new OASComAdobeGraniteSocialgraphImplSoc();

        System.assertEquals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.hashCode(), comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2.hashCode(), comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1 = OASComAdobeGraniteSocialgraphImplSoc.getExample();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2 = OASComAdobeGraniteSocialgraphImplSoc.getExample();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3 = new OASComAdobeGraniteSocialgraphImplSoc();
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4 = new OASComAdobeGraniteSocialgraphImplSoc();

        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2));
        System.assert(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3.equals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4));
        System.assertEquals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties1.hashCode(), comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties3.hashCode(), comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteSocialgraphImplSoc comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties = new OASComAdobeGraniteSocialgraphImplSoc();
        Map<String, String> propertyMappings = comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.getPropertyMappings();
        System.assertEquals('group2memberRelationshipOutgoing', propertyMappings.get('group2member.relationship.outgoing'));
        System.assertEquals('group2memberExcludedOutgoing', propertyMappings.get('group2member.excluded.outgoing'));
        System.assertEquals('group2memberRelationshipIncoming', propertyMappings.get('group2member.relationship.incoming'));
        System.assertEquals('group2memberExcludedIncoming', propertyMappings.get('group2member.excluded.incoming'));
    }
}
