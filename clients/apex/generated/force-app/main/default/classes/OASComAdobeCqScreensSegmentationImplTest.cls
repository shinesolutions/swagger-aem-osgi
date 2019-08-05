@isTest
private class OASComAdobeCqScreensSegmentationImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1 = OASComAdobeCqScreensSegmentationImpl.getExample();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2 = comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1;
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3 = new OASComAdobeCqScreensSegmentationImpl();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4 = comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3;

        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1 = OASComAdobeCqScreensSegmentationImpl.getExample();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2 = OASComAdobeCqScreensSegmentationImpl.getExample();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3 = new OASComAdobeCqScreensSegmentationImpl();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4 = new OASComAdobeCqScreensSegmentationImpl();

        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1 = OASComAdobeCqScreensSegmentationImpl.getExample();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2 = new OASComAdobeCqScreensSegmentationImpl();

        System.assertEquals(false, comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1 = OASComAdobeCqScreensSegmentationImpl.getExample();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2 = new OASComAdobeCqScreensSegmentationImpl();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3;

        System.assertEquals(false, comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3));
        System.assertEquals(false, comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1 = OASComAdobeCqScreensSegmentationImpl.getExample();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2 = new OASComAdobeCqScreensSegmentationImpl();

        System.assertEquals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.hashCode(), comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2.hashCode(), comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1 = OASComAdobeCqScreensSegmentationImpl.getExample();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2 = OASComAdobeCqScreensSegmentationImpl.getExample();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3 = new OASComAdobeCqScreensSegmentationImpl();
        OASComAdobeCqScreensSegmentationImpl comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4 = new OASComAdobeCqScreensSegmentationImpl();

        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2));
        System.assert(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3.equals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4));
        System.assertEquals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties1.hashCode(), comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties3.hashCode(), comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties4.hashCode());
    }
}
