-module(openapi_com_adobe_granite_offloading_impl_offloading_job_offloader_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_offloading_job_offloader_properties/0]).

-type openapi_com_adobe_granite_offloading_impl_offloading_job_offloader_properties() ::
    #{ 'offloading_offloader_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'offloading_offloader_enabled' := OffloadingOffloaderEnabled
        }) ->
    #{ 'offloading.offloader.enabled' => OffloadingOffloaderEnabled
     }.
