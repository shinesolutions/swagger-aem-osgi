-module(openapi_com_adobe_granite_auth_ims_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_ims_properties/0]).

-type openapi_com_adobe_granite_auth_ims_properties() ::
    #{ 'configid' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scope' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'configid' := Configid,
          'scope' := Scope
        }) ->
    #{ 'configid' => Configid,
       'scope' => Scope
     }.
