-module(openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties/0]).

-type openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'types' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'name' := Name,
          'types' := Types
        }) ->
    #{ 'name' => Name,
       'types' => Types
     }.
