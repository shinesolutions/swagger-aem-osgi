@isTest
private class OASComDayCqDamS7damCommonVideoImplViTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1 = OASComDayCqDamS7damCommonVideoImplVi.getExample();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2 = comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1;
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3 = new OASComDayCqDamS7damCommonVideoImplVi();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4 = comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3;

        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1 = OASComDayCqDamS7damCommonVideoImplVi.getExample();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2 = OASComDayCqDamS7damCommonVideoImplVi.getExample();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3 = new OASComDayCqDamS7damCommonVideoImplVi();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4 = new OASComDayCqDamS7damCommonVideoImplVi();

        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1 = OASComDayCqDamS7damCommonVideoImplVi.getExample();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2 = new OASComDayCqDamS7damCommonVideoImplVi();

        System.assertEquals(false, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1 = OASComDayCqDamS7damCommonVideoImplVi.getExample();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2 = new OASComDayCqDamS7damCommonVideoImplVi();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3;

        System.assertEquals(false, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3));
        System.assertEquals(false, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1 = OASComDayCqDamS7damCommonVideoImplVi.getExample();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2 = new OASComDayCqDamS7damCommonVideoImplVi();

        System.assertEquals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.hashCode(), comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2.hashCode(), comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1 = OASComDayCqDamS7damCommonVideoImplVi.getExample();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2 = OASComDayCqDamS7damCommonVideoImplVi.getExample();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3 = new OASComDayCqDamS7damCommonVideoImplVi();
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4 = new OASComDayCqDamS7damCommonVideoImplVi();

        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2));
        System.assert(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3.equals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4));
        System.assertEquals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties1.hashCode(), comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties3.hashCode(), comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamS7damCommonVideoImplVi comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties = new OASComDayCqDamS7damCommonVideoImplVi();
        Map<String, String> propertyMappings = comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.getPropertyMappings();
        System.assertEquals('cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName', propertyMappings.get('cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name'));
        System.assertEquals('cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName', propertyMappings.get('cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name'));
        System.assertEquals('cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName', propertyMappings.get('cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name'));
        System.assertEquals('cqDamS7damVideoproxyclientserviceHttpReadtimeoutName', propertyMappings.get('cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name'));
        System.assertEquals('cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName', propertyMappings.get('cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name'));
        System.assertEquals('cqDamS7damVideoproxyclientserviceHttpMaxretrycountName', propertyMappings.get('cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name'));
        System.assertEquals('cqDamS7damVideoproxyclientserviceUploadprogressIntervalName', propertyMappings.get('cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name'));
    }
}
