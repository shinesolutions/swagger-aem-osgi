-module(openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties/0]).

-export([openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties/1]).

-export_type([openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties/0]).

-type openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties() ::
  [ {'max_recursion_levels', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties() ->
    openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties([]).

openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties(Fields) ->
  Default = [ {'max.recursion.levels', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

