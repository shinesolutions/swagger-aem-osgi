-module(openapi_com_day_cq_statistics_impl_statistics_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_statistics_impl_statistics_service_impl_properties/0]).

-type openapi_com_day_cq_statistics_impl_statistics_service_impl_properties() ::
    #{ 'scheduler_period' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'scheduler_concurrent' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'workspace' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'keywordsPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'asyncEntries' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'scheduler_period' := SchedulerPeriod,
          'scheduler_concurrent' := SchedulerConcurrent,
          'path' := Path,
          'workspace' := Workspace,
          'keywordsPath' := KeywordsPath,
          'asyncEntries' := AsyncEntries
        }) ->
    #{ 'scheduler.period' => SchedulerPeriod,
       'scheduler.concurrent' => SchedulerConcurrent,
       'path' => Path,
       'workspace' => Workspace,
       'keywordsPath' => KeywordsPath,
       'asyncEntries' => AsyncEntries
     }.
