-module(openapi_org_apache_sling_engine_impl_log_request_logger_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_impl_log_request_logger_properties/0]).

-export([openapi_org_apache_sling_engine_impl_log_request_logger_properties/1]).

-export_type([openapi_org_apache_sling_engine_impl_log_request_logger_properties/0]).

-type openapi_org_apache_sling_engine_impl_log_request_logger_properties() ::
  [ {'request_log_output', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'request_log_outputtype', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'request_log_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'access_log_output', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'access_log_outputtype', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'access_log_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_engine_impl_log_request_logger_properties() ->
    openapi_org_apache_sling_engine_impl_log_request_logger_properties([]).

openapi_org_apache_sling_engine_impl_log_request_logger_properties(Fields) ->
  Default = [ {'request.log.output', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'request.log.outputtype', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'request.log.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'access.log.output', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'access.log.outputtype', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'access.log.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

