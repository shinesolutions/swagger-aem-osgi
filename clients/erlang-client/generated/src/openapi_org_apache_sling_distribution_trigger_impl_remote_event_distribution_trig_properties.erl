-module(openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'endpoint' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'transportSecretProvider_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'endpoint' := Endpoint,
          'transportSecretProvider_target' := TransportSecretProviderTarget
        }) ->
    #{ 'name' => Name,
       'endpoint' => Endpoint,
       'transportSecretProvider.target' => TransportSecretProviderTarget
     }.
