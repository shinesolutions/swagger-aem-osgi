-module(openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties/0]).

-type openapi_com_day_cq_dam_ids_impl_ids_job_processor_properties() ::
    #{ 'enable_multisession' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'ids_cc_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'enable_retry' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'enable_retry_scripterror' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'externalizer_domain_cqhost' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'externalizer_domain_http' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'enable_multisession' := EnableMultisession,
          'ids_cc_enable' := IdsCcEnable,
          'enable_retry' := EnableRetry,
          'enable_retry_scripterror' := EnableRetryScripterror,
          'externalizer_domain_cqhost' := ExternalizerDomainCqhost,
          'externalizer_domain_http' := ExternalizerDomainHttp
        }) ->
    #{ 'enable.multisession' => EnableMultisession,
       'ids.cc.enable' => IdsCcEnable,
       'enable.retry' => EnableRetry,
       'enable.retry.scripterror' => EnableRetryScripterror,
       'externalizer.domain.cqhost' => ExternalizerDomainCqhost,
       'externalizer.domain.http' => ExternalizerDomainHttp
     }.
