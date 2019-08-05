-module(openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties/0]).

-type openapi_com_adobe_granite_queries_impl_hc_large_index_health_check_properties() ::
    #{ 'large_index_critical_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'large_index_warn_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'large_index_critical_threshold' := LargeIndexCriticalThreshold,
          'large_index_warn_threshold' := LargeIndexWarnThreshold,
          'hc_tags' := HcTags
        }) ->
    #{ 'large.index.critical.threshold' => LargeIndexCriticalThreshold,
       'large.index.warn.threshold' => LargeIndexWarnThreshold,
       'hc.tags' => HcTags
     }.
