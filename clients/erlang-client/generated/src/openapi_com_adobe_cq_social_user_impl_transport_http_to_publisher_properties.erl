-module(openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties/0]).

-type openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties() ::
    #{ 'enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'agent_configuration' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'context_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'disabled_cipher_suites' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'enabled_cipher_suites' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'enable' := Enable,
          'agent_configuration' := AgentConfiguration,
          'context_path' := ContextPath,
          'disabled_cipher_suites' := DisabledCipherSuites,
          'enabled_cipher_suites' := EnabledCipherSuites
        }) ->
    #{ 'enable' => Enable,
       'agent.configuration' => AgentConfiguration,
       'context.path' => ContextPath,
       'disabled.cipher.suites' => DisabledCipherSuites,
       'enabled.cipher.suites' => EnabledCipherSuites
     }.
