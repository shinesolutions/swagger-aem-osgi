-module(openapi_com_day_crx_security_token_impl_token_cleanup_task_properties).

-include("openapi.hrl").

-export([openapi_com_day_crx_security_token_impl_token_cleanup_task_properties/0]).

-export([openapi_com_day_crx_security_token_impl_token_cleanup_task_properties/1]).

-export_type([openapi_com_day_crx_security_token_impl_token_cleanup_task_properties/0]).

-type openapi_com_day_crx_security_token_impl_token_cleanup_task_properties() ::
  [ {'enable_token_cleanup_task', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'batch_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_crx_security_token_impl_token_cleanup_task_properties() ->
    openapi_com_day_crx_security_token_impl_token_cleanup_task_properties([]).

openapi_com_day_crx_security_token_impl_token_cleanup_task_properties(Fields) ->
  Default = [ {'enable.token.cleanup.task', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'batch.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

