-module(openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties/0]).

-type openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'dispatcher_address' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'dispatcher_filter_allowed' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'dispatcher_filter_blocked' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_tags' := HcTags,
          'dispatcher_address' := DispatcherAddress,
          'dispatcher_filter_allowed' := DispatcherFilterAllowed,
          'dispatcher_filter_blocked' := DispatcherFilterBlocked
        }) ->
    #{ 'hc.tags' => HcTags,
       'dispatcher.address' => DispatcherAddress,
       'dispatcher.filter.allowed' => DispatcherFilterAllowed,
       'dispatcher.filter.blocked' => DispatcherFilterBlocked
     }.
