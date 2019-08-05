-module(openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties/0]).

-type openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'fallbackPaths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'enabled' := Enabled,
          'fallbackPaths' := FallbackPaths
        }) ->
    #{ 'enabled' => Enabled,
       'fallbackPaths' => FallbackPaths
     }.
