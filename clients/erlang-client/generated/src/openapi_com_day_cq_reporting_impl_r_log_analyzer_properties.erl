-module(openapi_com_day_cq_reporting_impl_r_log_analyzer_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_reporting_impl_r_log_analyzer_properties/0]).

-type openapi_com_day_cq_reporting_impl_r_log_analyzer_properties() ::
    #{ 'request_log_output' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'request_log_output' := RequestLogOutput
        }) ->
    #{ 'request.log.output' => RequestLogOutput
     }.
