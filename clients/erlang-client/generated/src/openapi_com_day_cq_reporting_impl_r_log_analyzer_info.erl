-module(openapi_com_day_cq_reporting_impl_r_log_analyzer_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_reporting_impl_r_log_analyzer_info/0]).

-type openapi_com_day_cq_reporting_impl_r_log_analyzer_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_reporting_impl_r_log_analyzer_properties:openapi_com_day_cq_reporting_impl_r_log_analyzer_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
