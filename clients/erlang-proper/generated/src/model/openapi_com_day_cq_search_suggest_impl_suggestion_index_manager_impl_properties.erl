-module(openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties/0]).

-export([openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties/0]).

-type openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties() ::
  [ {'pathBuilder_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'suggest_basepath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties() ->
    openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties([]).

openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties(Fields) ->
  Default = [ {'pathBuilder.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'suggest.basepath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

