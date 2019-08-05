-module(openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties/0]).

-type openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_tags' := HcTags
        }) ->
    #{ 'hc.tags' => HcTags
     }.
