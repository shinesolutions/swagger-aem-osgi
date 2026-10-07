-module(openapi_org_apache_sling_distribution_packaging_impl_importer_remote_distributi_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_importer_remote_distributi_properties/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_importer_remote_distributi_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'endpoints' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'transportSecretProvider_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'endpoints' := Endpoints,
          'transportSecretProvider_target' := TransportSecretProviderTarget
        }) ->
    #{ 'name' => Name,
       'endpoints' => Endpoints,
       'transportSecretProvider.target' => TransportSecretProviderTarget
     }.
