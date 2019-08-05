@isTest
private class OASComAdobeCqProjectsImplServletProjTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties1 = OASComAdobeCqProjectsImplServletProj.getExample();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties2 = comAdobeCqProjectsImplServletProjectImageServletProperties1;
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties3 = new OASComAdobeCqProjectsImplServletProj();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties4 = comAdobeCqProjectsImplServletProjectImageServletProperties3;

        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties1.equals(comAdobeCqProjectsImplServletProjectImageServletProperties2));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties2.equals(comAdobeCqProjectsImplServletProjectImageServletProperties1));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties1.equals(comAdobeCqProjectsImplServletProjectImageServletProperties1));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties3.equals(comAdobeCqProjectsImplServletProjectImageServletProperties4));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties4.equals(comAdobeCqProjectsImplServletProjectImageServletProperties3));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties3.equals(comAdobeCqProjectsImplServletProjectImageServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties1 = OASComAdobeCqProjectsImplServletProj.getExample();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties2 = OASComAdobeCqProjectsImplServletProj.getExample();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties3 = new OASComAdobeCqProjectsImplServletProj();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties4 = new OASComAdobeCqProjectsImplServletProj();

        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties1.equals(comAdobeCqProjectsImplServletProjectImageServletProperties2));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties2.equals(comAdobeCqProjectsImplServletProjectImageServletProperties1));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties3.equals(comAdobeCqProjectsImplServletProjectImageServletProperties4));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties4.equals(comAdobeCqProjectsImplServletProjectImageServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties1 = OASComAdobeCqProjectsImplServletProj.getExample();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties2 = new OASComAdobeCqProjectsImplServletProj();

        System.assertEquals(false, comAdobeCqProjectsImplServletProjectImageServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqProjectsImplServletProjectImageServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties1 = OASComAdobeCqProjectsImplServletProj.getExample();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties2 = new OASComAdobeCqProjectsImplServletProj();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties3;

        System.assertEquals(false, comAdobeCqProjectsImplServletProjectImageServletProperties1.equals(comAdobeCqProjectsImplServletProjectImageServletProperties3));
        System.assertEquals(false, comAdobeCqProjectsImplServletProjectImageServletProperties2.equals(comAdobeCqProjectsImplServletProjectImageServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties1 = OASComAdobeCqProjectsImplServletProj.getExample();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties2 = new OASComAdobeCqProjectsImplServletProj();

        System.assertEquals(comAdobeCqProjectsImplServletProjectImageServletProperties1.hashCode(), comAdobeCqProjectsImplServletProjectImageServletProperties1.hashCode());
        System.assertEquals(comAdobeCqProjectsImplServletProjectImageServletProperties2.hashCode(), comAdobeCqProjectsImplServletProjectImageServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties1 = OASComAdobeCqProjectsImplServletProj.getExample();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties2 = OASComAdobeCqProjectsImplServletProj.getExample();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties3 = new OASComAdobeCqProjectsImplServletProj();
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties4 = new OASComAdobeCqProjectsImplServletProj();

        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties1.equals(comAdobeCqProjectsImplServletProjectImageServletProperties2));
        System.assert(comAdobeCqProjectsImplServletProjectImageServletProperties3.equals(comAdobeCqProjectsImplServletProjectImageServletProperties4));
        System.assertEquals(comAdobeCqProjectsImplServletProjectImageServletProperties1.hashCode(), comAdobeCqProjectsImplServletProjectImageServletProperties2.hashCode());
        System.assertEquals(comAdobeCqProjectsImplServletProjectImageServletProperties3.hashCode(), comAdobeCqProjectsImplServletProjectImageServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqProjectsImplServletProj comAdobeCqProjectsImplServletProjectImageServletProperties = new OASComAdobeCqProjectsImplServletProj();
        Map<String, String> propertyMappings = comAdobeCqProjectsImplServletProjectImageServletProperties.getPropertyMappings();
        System.assertEquals('imageQuality', propertyMappings.get('image.quality'));
        System.assertEquals('imageSupportedResolutions', propertyMappings.get('image.supported.resolutions'));
    }
}
