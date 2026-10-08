-module(openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties/0]).

-export([openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties() ::
  [ {'importer_name', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties() ->
    openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties([]).

openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties(Fields) ->
  Default = [ {'importer.name', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

