-module(openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties/0]).

-type openapi_com_adobe_granite_queries_impl_hc_async_index_health_check_properties() ::
    #{ 'indexing_critical_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'indexing_warn_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'indexing_critical_threshold' := IndexingCriticalThreshold,
          'indexing_warn_threshold' := IndexingWarnThreshold,
          'hc_tags' := HcTags
        }) ->
    #{ 'indexing.critical.threshold' => IndexingCriticalThreshold,
       'indexing.warn.threshold' => IndexingWarnThreshold,
       'hc.tags' => HcTags
     }.
