@isTest
private class OASComAdobeFormsCommonServiceImplDefTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties1 = OASComAdobeFormsCommonServiceImplDef.getExample();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties2 = comAdobeFormsCommonServiceImplDefaultDataProviderProperties1;
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties3 = new OASComAdobeFormsCommonServiceImplDef();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties4 = comAdobeFormsCommonServiceImplDefaultDataProviderProperties3;

        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties2));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties2.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties4));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties4.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties1 = OASComAdobeFormsCommonServiceImplDef.getExample();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties2 = OASComAdobeFormsCommonServiceImplDef.getExample();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties3 = new OASComAdobeFormsCommonServiceImplDef();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties4 = new OASComAdobeFormsCommonServiceImplDef();

        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties2));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties2.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties4));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties4.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties1 = OASComAdobeFormsCommonServiceImplDef.getExample();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties2 = new OASComAdobeFormsCommonServiceImplDef();

        System.assertEquals(false, comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeFormsCommonServiceImplDefaultDataProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties1 = OASComAdobeFormsCommonServiceImplDef.getExample();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties2 = new OASComAdobeFormsCommonServiceImplDef();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties3;

        System.assertEquals(false, comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3));
        System.assertEquals(false, comAdobeFormsCommonServiceImplDefaultDataProviderProperties2.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties1 = OASComAdobeFormsCommonServiceImplDef.getExample();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties2 = new OASComAdobeFormsCommonServiceImplDef();

        System.assertEquals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.hashCode(), comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.hashCode());
        System.assertEquals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties2.hashCode(), comAdobeFormsCommonServiceImplDefaultDataProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties1 = OASComAdobeFormsCommonServiceImplDef.getExample();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties2 = OASComAdobeFormsCommonServiceImplDef.getExample();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties3 = new OASComAdobeFormsCommonServiceImplDef();
        OASComAdobeFormsCommonServiceImplDef comAdobeFormsCommonServiceImplDefaultDataProviderProperties4 = new OASComAdobeFormsCommonServiceImplDef();

        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties2));
        System.assert(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3.equals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties4));
        System.assertEquals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties1.hashCode(), comAdobeFormsCommonServiceImplDefaultDataProviderProperties2.hashCode());
        System.assertEquals(comAdobeFormsCommonServiceImplDefaultDataProviderProperties3.hashCode(), comAdobeFormsCommonServiceImplDefaultDataProviderProperties4.hashCode());
    }
}
