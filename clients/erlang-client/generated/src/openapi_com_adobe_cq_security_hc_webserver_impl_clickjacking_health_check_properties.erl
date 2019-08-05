-module(openapi_com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check_properties/0]).

-type openapi_com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'webserver_address' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'hc_tags' := HcTags,
          'webserver_address' := WebserverAddress
        }) ->
    #{ 'hc.tags' => HcTags,
       'webserver.address' => WebserverAddress
     }.
