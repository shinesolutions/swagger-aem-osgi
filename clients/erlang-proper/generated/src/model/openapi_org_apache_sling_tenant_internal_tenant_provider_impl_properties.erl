-module(openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties/0]).

-export([openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties/1]).

-export_type([openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties/0]).

-type openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties() ::
  [ {'tenant_root', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'tenant_path_matcher', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties() ->
    openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties([]).

openapi_org_apache_sling_tenant_internal_tenant_provider_impl_properties(Fields) ->
  Default = [ {'tenant.root', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'tenant.path.matcher', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

