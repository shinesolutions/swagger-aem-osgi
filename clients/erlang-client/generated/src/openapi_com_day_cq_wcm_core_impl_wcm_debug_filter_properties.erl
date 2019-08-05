-module(openapi_com_day_cq_wcm_core_impl_wcm_debug_filter_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_wcm_debug_filter_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_wcm_debug_filter_properties() ::
    #{ 'wcmdbgfilter_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'wcmdbgfilter_jspDebug' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'wcmdbgfilter_enabled' := WcmdbgfilterEnabled,
          'wcmdbgfilter_jspDebug' := WcmdbgfilterJspDebug
        }) ->
    #{ 'wcmdbgfilter.enabled' => WcmdbgfilterEnabled,
       'wcmdbgfilter.jspDebug' => WcmdbgfilterJspDebug
     }.
