-module(openapi_com_adobe_granite_csrf_impl_csrf_filter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_csrf_impl_csrf_filter_properties/0]).

-type openapi_com_adobe_granite_csrf_impl_csrf_filter_properties() ::
    #{ 'filter_methods' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'filter_enable_safe_user_agents' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'filter_safe_user_agents' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'filter_excluded_paths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'filter_methods' := FilterMethods,
          'filter_enable_safe_user_agents' := FilterEnableSafeUserAgents,
          'filter_safe_user_agents' := FilterSafeUserAgents,
          'filter_excluded_paths' := FilterExcludedPaths
        }) ->
    #{ 'filter.methods' => FilterMethods,
       'filter.enable.safe.user.agents' => FilterEnableSafeUserAgents,
       'filter.safe.user.agents' => FilterSafeUserAgents,
       'filter.excluded.paths' => FilterExcludedPaths
     }.
