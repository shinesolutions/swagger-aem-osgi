-module(openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties/0]).

-type openapi_com_day_cq_dam_core_impl_reports_report_export_service_properties() ::
    #{ 'queryBatchSize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'queryBatchSize' := QueryBatchSize
        }) ->
    #{ 'queryBatchSize' => QueryBatchSize
     }.
