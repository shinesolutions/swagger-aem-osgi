@isTest
private class OASComDayCqImageInternalFontFontHelpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties1 = OASComDayCqImageInternalFontFontHelp.getExample();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties2 = comDayCqImageInternalFontFontHelperProperties1;
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties3 = new OASComDayCqImageInternalFontFontHelp();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties4 = comDayCqImageInternalFontFontHelperProperties3;

        System.assert(comDayCqImageInternalFontFontHelperProperties1.equals(comDayCqImageInternalFontFontHelperProperties2));
        System.assert(comDayCqImageInternalFontFontHelperProperties2.equals(comDayCqImageInternalFontFontHelperProperties1));
        System.assert(comDayCqImageInternalFontFontHelperProperties1.equals(comDayCqImageInternalFontFontHelperProperties1));
        System.assert(comDayCqImageInternalFontFontHelperProperties3.equals(comDayCqImageInternalFontFontHelperProperties4));
        System.assert(comDayCqImageInternalFontFontHelperProperties4.equals(comDayCqImageInternalFontFontHelperProperties3));
        System.assert(comDayCqImageInternalFontFontHelperProperties3.equals(comDayCqImageInternalFontFontHelperProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties1 = OASComDayCqImageInternalFontFontHelp.getExample();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties2 = OASComDayCqImageInternalFontFontHelp.getExample();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties3 = new OASComDayCqImageInternalFontFontHelp();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties4 = new OASComDayCqImageInternalFontFontHelp();

        System.assert(comDayCqImageInternalFontFontHelperProperties1.equals(comDayCqImageInternalFontFontHelperProperties2));
        System.assert(comDayCqImageInternalFontFontHelperProperties2.equals(comDayCqImageInternalFontFontHelperProperties1));
        System.assert(comDayCqImageInternalFontFontHelperProperties3.equals(comDayCqImageInternalFontFontHelperProperties4));
        System.assert(comDayCqImageInternalFontFontHelperProperties4.equals(comDayCqImageInternalFontFontHelperProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties1 = OASComDayCqImageInternalFontFontHelp.getExample();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties2 = new OASComDayCqImageInternalFontFontHelp();

        System.assertEquals(false, comDayCqImageInternalFontFontHelperProperties1.equals('foo'));
        System.assertEquals(false, comDayCqImageInternalFontFontHelperProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties1 = OASComDayCqImageInternalFontFontHelp.getExample();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties2 = new OASComDayCqImageInternalFontFontHelp();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties3;

        System.assertEquals(false, comDayCqImageInternalFontFontHelperProperties1.equals(comDayCqImageInternalFontFontHelperProperties3));
        System.assertEquals(false, comDayCqImageInternalFontFontHelperProperties2.equals(comDayCqImageInternalFontFontHelperProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties1 = OASComDayCqImageInternalFontFontHelp.getExample();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties2 = new OASComDayCqImageInternalFontFontHelp();

        System.assertEquals(comDayCqImageInternalFontFontHelperProperties1.hashCode(), comDayCqImageInternalFontFontHelperProperties1.hashCode());
        System.assertEquals(comDayCqImageInternalFontFontHelperProperties2.hashCode(), comDayCqImageInternalFontFontHelperProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties1 = OASComDayCqImageInternalFontFontHelp.getExample();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties2 = OASComDayCqImageInternalFontFontHelp.getExample();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties3 = new OASComDayCqImageInternalFontFontHelp();
        OASComDayCqImageInternalFontFontHelp comDayCqImageInternalFontFontHelperProperties4 = new OASComDayCqImageInternalFontFontHelp();

        System.assert(comDayCqImageInternalFontFontHelperProperties1.equals(comDayCqImageInternalFontFontHelperProperties2));
        System.assert(comDayCqImageInternalFontFontHelperProperties3.equals(comDayCqImageInternalFontFontHelperProperties4));
        System.assertEquals(comDayCqImageInternalFontFontHelperProperties1.hashCode(), comDayCqImageInternalFontFontHelperProperties2.hashCode());
        System.assertEquals(comDayCqImageInternalFontFontHelperProperties3.hashCode(), comDayCqImageInternalFontFontHelperProperties4.hashCode());
    }
}
