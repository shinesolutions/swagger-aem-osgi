-module(openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties/0]).

-export([openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties/1]).

-export_type([openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties/0]).

-type openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties() ->
    openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties([]).

openapi_com_day_cq_tagging_impl_tag_garbage_collector_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

