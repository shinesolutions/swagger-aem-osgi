-module(openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties/0]).

-type openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties() ::
    #{ 'firewall_deserialization_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'firewall_deserialization_blacklist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'firewall_deserialization_diagnostics' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'firewall_deserialization_whitelist' := FirewallDeserializationWhitelist,
          'firewall_deserialization_blacklist' := FirewallDeserializationBlacklist,
          'firewall_deserialization_diagnostics' := FirewallDeserializationDiagnostics
        }) ->
    #{ 'firewall.deserialization.whitelist' => FirewallDeserializationWhitelist,
       'firewall.deserialization.blacklist' => FirewallDeserializationBlacklist,
       'firewall.deserialization.diagnostics' => FirewallDeserializationDiagnostics
     }.
