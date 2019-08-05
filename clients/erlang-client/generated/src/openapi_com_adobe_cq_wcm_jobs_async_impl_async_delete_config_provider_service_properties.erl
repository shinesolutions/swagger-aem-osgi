-module(openapi_com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service_properties/0]).

-type openapi_com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service_properties() ::
    #{ 'threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'jobTopicName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'emailEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'threshold' := Threshold,
          'jobTopicName' := JobTopicName,
          'emailEnabled' := EmailEnabled
        }) ->
    #{ 'threshold' => Threshold,
       'jobTopicName' => JobTopicName,
       'emailEnabled' => EmailEnabled
     }.
