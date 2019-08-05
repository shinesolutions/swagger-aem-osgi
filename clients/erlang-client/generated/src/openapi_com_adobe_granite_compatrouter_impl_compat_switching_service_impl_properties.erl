-module(openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties/0]).

-type openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties() ::
    #{ 'compatgroups' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'compatgroups' := Compatgroups,
          'enabled' := Enabled
        }) ->
    #{ 'compatgroups' => Compatgroups,
       'enabled' => Enabled
     }.
