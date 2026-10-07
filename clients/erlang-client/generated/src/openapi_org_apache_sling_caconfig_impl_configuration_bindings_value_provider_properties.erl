-module(openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'enabled' := Enabled
        }) ->
    #{ 'enabled' => Enabled
     }.
