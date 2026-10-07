-module(openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties() ::
    #{ 'path' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'path' := Path,
          'service_ranking' := ServiceRanking
        }) ->
    #{ 'path' => Path,
       'service.ranking' => ServiceRanking
     }.
