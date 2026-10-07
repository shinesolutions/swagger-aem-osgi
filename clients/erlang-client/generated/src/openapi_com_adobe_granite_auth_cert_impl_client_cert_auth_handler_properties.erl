-module(openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties/0]).

-type openapi_com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'path' := Path,
          'service_ranking' := ServiceRanking
        }) ->
    #{ 'path' => Path,
       'service.ranking' => ServiceRanking
     }.
