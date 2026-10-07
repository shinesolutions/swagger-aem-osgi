-module(openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties/0]).

-export([openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties/1]).

-export_type([openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties/0]).

-type openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties() ::
  [ {'messages_queue_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'logger_config', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'messages_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties() ->
    openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties([]).

openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties(Fields) ->
  Default = [ {'messages.queue.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'logger.config', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'messages.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

