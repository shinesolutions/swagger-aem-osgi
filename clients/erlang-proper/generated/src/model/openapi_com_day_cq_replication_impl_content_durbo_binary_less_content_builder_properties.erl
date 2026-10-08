-module(openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties/0]).

-export([openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties/1]).

-export_type([openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties/0]).

-type openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties() ::
  [ {'binary_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties() ->
    openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties([]).

openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties(Fields) ->
  Default = [ {'binary.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

