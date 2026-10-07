-module(openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties() ::
  [ {'providerType', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties(Fields) ->
  Default = [ {'providerType', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

