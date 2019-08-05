-module(openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'username' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'encryptedPassword' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'username' := Username,
          'encryptedPassword' := EncryptedPassword
        }) ->
    #{ 'name' => Name,
       'username' => Username,
       'encryptedPassword' => EncryptedPassword
     }.
