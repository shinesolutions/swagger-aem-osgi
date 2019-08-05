-module(openapi_org_apache_sling_engine_impl_log_request_logger_service_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_engine_impl_log_request_logger_service_properties/0]).

-type openapi_org_apache_sling_engine_impl_log_request_logger_service_properties() ::
    #{ 'request_log_service_format' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'request_log_service_output' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'request_log_service_outputtype' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'request_log_service_onentry' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'request_log_service_format' := RequestLogServiceFormat,
          'request_log_service_output' := RequestLogServiceOutput,
          'request_log_service_outputtype' := RequestLogServiceOutputtype,
          'request_log_service_onentry' := RequestLogServiceOnentry
        }) ->
    #{ 'request.log.service.format' => RequestLogServiceFormat,
       'request.log.service.output' => RequestLogServiceOutput,
       'request.log.service.outputtype' => RequestLogServiceOutputtype,
       'request.log.service.onentry' => RequestLogServiceOnentry
     }.
