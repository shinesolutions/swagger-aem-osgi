@isTest
private class OASComAdobeFormsCommonServiceImplForTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1 = OASComAdobeFormsCommonServiceImplFor.getExample();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2 = comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1;
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3 = new OASComAdobeFormsCommonServiceImplFor();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4 = comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3;

        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1 = OASComAdobeFormsCommonServiceImplFor.getExample();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2 = OASComAdobeFormsCommonServiceImplFor.getExample();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3 = new OASComAdobeFormsCommonServiceImplFor();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4 = new OASComAdobeFormsCommonServiceImplFor();

        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1 = OASComAdobeFormsCommonServiceImplFor.getExample();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2 = new OASComAdobeFormsCommonServiceImplFor();

        System.assertEquals(false, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.equals('foo'));
        System.assertEquals(false, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1 = OASComAdobeFormsCommonServiceImplFor.getExample();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2 = new OASComAdobeFormsCommonServiceImplFor();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3;

        System.assertEquals(false, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3));
        System.assertEquals(false, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1 = OASComAdobeFormsCommonServiceImplFor.getExample();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2 = new OASComAdobeFormsCommonServiceImplFor();

        System.assertEquals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.hashCode(), comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.hashCode());
        System.assertEquals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2.hashCode(), comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1 = OASComAdobeFormsCommonServiceImplFor.getExample();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2 = OASComAdobeFormsCommonServiceImplFor.getExample();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3 = new OASComAdobeFormsCommonServiceImplFor();
        OASComAdobeFormsCommonServiceImplFor comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4 = new OASComAdobeFormsCommonServiceImplFor();

        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2));
        System.assert(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3.equals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4));
        System.assertEquals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties1.hashCode(), comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties2.hashCode());
        System.assertEquals(comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties3.hashCode(), comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties4.hashCode());
    }
}
