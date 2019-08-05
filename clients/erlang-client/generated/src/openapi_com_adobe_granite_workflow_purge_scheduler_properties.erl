-module(openapi_com_adobe_granite_workflow_purge_scheduler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_purge_scheduler_properties/0]).

-type openapi_com_adobe_granite_workflow_purge_scheduler_properties() ::
    #{ 'scheduledpurge_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scheduledpurge_workflowStatus' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'scheduledpurge_modelIds' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'scheduledpurge_daysold' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'scheduledpurge_name' := ScheduledpurgeName,
          'scheduledpurge_workflowStatus' := ScheduledpurgeWorkflowStatus,
          'scheduledpurge_modelIds' := ScheduledpurgeModelIds,
          'scheduledpurge_daysold' := ScheduledpurgeDaysold
        }) ->
    #{ 'scheduledpurge.name' => ScheduledpurgeName,
       'scheduledpurge.workflowStatus' => ScheduledpurgeWorkflowStatus,
       'scheduledpurge.modelIds' => ScheduledpurgeModelIds,
       'scheduledpurge.daysold' => ScheduledpurgeDaysold
     }.
