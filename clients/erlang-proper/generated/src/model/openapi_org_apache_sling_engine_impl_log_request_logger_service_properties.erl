-module(openapi_org_apache_sling_engine_impl_log_request_logger_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_impl_log_request_logger_service_properties/0]).

-export([openapi_org_apache_sling_engine_impl_log_request_logger_service_properties/1]).

-export_type([openapi_org_apache_sling_engine_impl_log_request_logger_service_properties/0]).

-type openapi_org_apache_sling_engine_impl_log_request_logger_service_properties() ::
  [ {'request_log_service_format', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'request_log_service_output', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'request_log_service_outputtype', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'request_log_service_onentry', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_engine_impl_log_request_logger_service_properties() ->
    openapi_org_apache_sling_engine_impl_log_request_logger_service_properties([]).

openapi_org_apache_sling_engine_impl_log_request_logger_service_properties(Fields) ->
  Default = [ {'request.log.service.format', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'request.log.service.output', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'request.log.service.outputtype', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'request.log.service.onentry', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

