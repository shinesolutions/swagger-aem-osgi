-module(openapi_com_adobe_granite_bundles_hc_impl_jobs_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_bundles_hc_impl_jobs_health_check_properties/0]).

-type openapi_com_adobe_granite_bundles_hc_impl_jobs_health_check_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'max_queued_jobs' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'hc_tags' := HcTags,
          'max_queued_jobs' := MaxQueuedJobs
        }) ->
    #{ 'hc.tags' => HcTags,
       'max.queued.jobs' => MaxQueuedJobs
     }.
