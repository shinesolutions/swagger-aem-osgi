-module(openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties/0]).

-type openapi_com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties() ::
    #{ 'redirect_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'redirect_stats_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'redirect_extensions' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'redirect_paths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'redirect_enabled' := RedirectEnabled,
          'redirect_stats_enabled' := RedirectStatsEnabled,
          'redirect_extensions' := RedirectExtensions,
          'redirect_paths' := RedirectPaths
        }) ->
    #{ 'redirect.enabled' => RedirectEnabled,
       'redirect.stats.enabled' => RedirectStatsEnabled,
       'redirect.extensions' => RedirectExtensions,
       'redirect.paths' => RedirectPaths
     }.
