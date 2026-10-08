-module(openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties/0]).

-export([openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties/1]).

-export_type([openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties/0]).

-type openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties() ->
    openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties([]).

openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

