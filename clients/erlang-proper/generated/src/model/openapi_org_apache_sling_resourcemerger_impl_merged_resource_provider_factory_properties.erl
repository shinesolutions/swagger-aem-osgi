-module(openapi_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties/0]).

-export([openapi_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties/1]).

-export_type([openapi_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties/0]).

-type openapi_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties() ::
  [ {'merge_root', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'merge_readOnly', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties() ->
    openapi_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties([]).

openapi_org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties(Fields) ->
  Default = [ {'merge.root', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'merge.readOnly', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

