-module(openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties/0]).

-export([openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties/1]).

-export_type([openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties/0]).

-type openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties() ::
  [ {'cq_searchpromote_configuration_server_uri', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_searchpromote_configuration_environment', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'connection_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'socket_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties() ->
    openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties([]).

openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties(Fields) ->
  Default = [ {'cq.searchpromote.configuration.server.uri', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.searchpromote.configuration.environment', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'connection.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'socket.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

