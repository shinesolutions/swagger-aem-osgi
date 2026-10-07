-module(openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties/0]).

-type openapi_com_adobe_granite_logging_impl_log_analyser_impl_properties() ::
    #{ 'messages_queue_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'logger_config' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'messages_size' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'messages_queue_size' := MessagesQueueSize,
          'logger_config' := LoggerConfig,
          'messages_size' := MessagesSize
        }) ->
    #{ 'messages.queue.size' => MessagesQueueSize,
       'logger.config' => LoggerConfig,
       'messages.size' => MessagesSize
     }.
