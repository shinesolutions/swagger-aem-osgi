-module(openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties/0]).

-export([openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties/1]).

-export_type([openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties/0]).

-type openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'checkpath_prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jcrPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties() ->
    openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties([]).

openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'checkpath.prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jcrPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

