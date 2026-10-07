-module(openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties/0]).

-type openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties() ::
    #{ 'tenant_root' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'tenant_path_matcher' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'tenant_root' := TenantRoot,
          'tenant_path_matcher' := TenantPathMatcher
        }) ->
    #{ 'tenant.root' => TenantRoot,
       'tenant.path.matcher' => TenantPathMatcher
     }.
