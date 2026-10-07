@isTest
private class OASComDayCqCompatCodeupgradeImplVersTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1 = OASComDayCqCompatCodeupgradeImplVers.getExample();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2 = comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1;
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3 = new OASComDayCqCompatCodeupgradeImplVers();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4 = comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3;

        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1 = OASComDayCqCompatCodeupgradeImplVers.getExample();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2 = OASComDayCqCompatCodeupgradeImplVers.getExample();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3 = new OASComDayCqCompatCodeupgradeImplVers();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4 = new OASComDayCqCompatCodeupgradeImplVers();

        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1 = OASComDayCqCompatCodeupgradeImplVers.getExample();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2 = new OASComDayCqCompatCodeupgradeImplVers();

        System.assertEquals(false, comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.equals('foo'));
        System.assertEquals(false, comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1 = OASComDayCqCompatCodeupgradeImplVers.getExample();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2 = new OASComDayCqCompatCodeupgradeImplVers();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3;

        System.assertEquals(false, comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3));
        System.assertEquals(false, comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1 = OASComDayCqCompatCodeupgradeImplVers.getExample();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2 = new OASComDayCqCompatCodeupgradeImplVers();

        System.assertEquals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.hashCode(), comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.hashCode());
        System.assertEquals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2.hashCode(), comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1 = OASComDayCqCompatCodeupgradeImplVers.getExample();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2 = OASComDayCqCompatCodeupgradeImplVers.getExample();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3 = new OASComDayCqCompatCodeupgradeImplVers();
        OASComDayCqCompatCodeupgradeImplVers comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4 = new OASComDayCqCompatCodeupgradeImplVers();

        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2));
        System.assert(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3.equals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4));
        System.assertEquals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties1.hashCode(), comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties2.hashCode());
        System.assertEquals(comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties3.hashCode(), comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties4.hashCode());
    }
}
