-module(openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties/0]).

-type openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties() ::
    #{ 'provider_roots' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'kind' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'provider_roots' := ProviderRoots,
          'kind' := Kind
        }) ->
    #{ 'provider.roots' => ProviderRoots,
       'kind' => Kind
     }.
