-module(openapi_org_apache_sling_engine_impl_log_request_logger_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_engine_impl_log_request_logger_properties/0]).

-type openapi_org_apache_sling_engine_impl_log_request_logger_properties() ::
    #{ 'request_log_output' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'request_log_outputtype' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'request_log_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'access_log_output' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'access_log_outputtype' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'access_log_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'request_log_output' := RequestLogOutput,
          'request_log_outputtype' := RequestLogOutputtype,
          'request_log_enabled' := RequestLogEnabled,
          'access_log_output' := AccessLogOutput,
          'access_log_outputtype' := AccessLogOutputtype,
          'access_log_enabled' := AccessLogEnabled
        }) ->
    #{ 'request.log.output' => RequestLogOutput,
       'request.log.outputtype' => RequestLogOutputtype,
       'request.log.enabled' => RequestLogEnabled,
       'access.log.output' => AccessLogOutput,
       'access.log.outputtype' => AccessLogOutputtype,
       'access.log.enabled' => AccessLogEnabled
     }.
