-module(openapi_com_day_cq_replication_impl_transport_binary_less_transport_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_transport_binary_less_transport_handler_properties/0]).

-type openapi_com_day_cq_replication_impl_transport_binary_less_transport_handler_properties() ::
    #{ 'disabled_cipher_suites' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'enabled_cipher_suites' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'disabled_cipher_suites' := DisabledCipherSuites,
          'enabled_cipher_suites' := EnabledCipherSuites
        }) ->
    #{ 'disabled.cipher.suites' => DisabledCipherSuites,
       'enabled.cipher.suites' => EnabledCipherSuites
     }.
