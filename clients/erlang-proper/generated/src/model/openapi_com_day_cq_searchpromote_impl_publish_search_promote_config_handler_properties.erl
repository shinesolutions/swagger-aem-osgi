-module(openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties/0]).

-export([openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties/1]).

-export_type([openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties/0]).

-type openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties() ::
  [ {'cq_searchpromote_confighandler_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties() ->
    openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties([]).

openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties(Fields) ->
  Default = [ {'cq.searchpromote.confighandler.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

