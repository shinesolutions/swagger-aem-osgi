-module(openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties/0]).

-type openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties() ::
    #{ 'group' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ids' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'group' := Group,
          'ids' := Ids
        }) ->
    #{ 'group' => Group,
       'ids' => Ids
     }.
