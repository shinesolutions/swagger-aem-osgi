-module(openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties() ::
    #{ 'cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name' := CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName,
          'cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name' := CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName,
          'cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name' := CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName,
          'cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name' := CqDamS7damVideoproxyclientserviceHttpReadtimeoutName,
          'cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name' := CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName,
          'cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name' := CqDamS7damVideoproxyclientserviceHttpMaxretrycountName,
          'cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name' := CqDamS7damVideoproxyclientserviceUploadprogressIntervalName
        }) ->
    #{ 'cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name' => CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName,
       'cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name' => CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName,
       'cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name' => CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName,
       'cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name' => CqDamS7damVideoproxyclientserviceHttpReadtimeoutName,
       'cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name' => CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName,
       'cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name' => CqDamS7damVideoproxyclientserviceHttpMaxretrycountName,
       'cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name' => CqDamS7damVideoproxyclientserviceUploadprogressIntervalName
     }.
