-module(openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties() ::
    #{ 'archiving_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'archive_since_days_completed' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'archiving_enabled' := ArchivingEnabled,
          'scheduler_expression' := SchedulerExpression,
          'archive_since_days_completed' := ArchiveSinceDaysCompleted
        }) ->
    #{ 'archiving.enabled' => ArchivingEnabled,
       'scheduler.expression' => SchedulerExpression,
       'archive.since.days.completed' => ArchiveSinceDaysCompleted
     }.
