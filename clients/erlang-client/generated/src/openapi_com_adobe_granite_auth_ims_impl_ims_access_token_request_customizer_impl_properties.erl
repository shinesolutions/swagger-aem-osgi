-module(openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties() ::
    #{ 'auth_ims_client_secret' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'customizer_type' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'auth_ims_client_secret' := AuthImsClientSecret,
          'customizer_type' := CustomizerType
        }) ->
    #{ 'auth.ims.client.secret' => AuthImsClientSecret,
       'customizer.type' => CustomizerType
     }.
