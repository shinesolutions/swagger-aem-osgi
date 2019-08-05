-module(openapi_com_adobe_cq_projects_purge_scheduler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_projects_purge_scheduler_properties/0]).

-type openapi_com_adobe_cq_projects_purge_scheduler_properties() ::
    #{ 'scheduledpurge_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scheduledpurge_purgeActive' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'scheduledpurge_templates' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'scheduledpurge_purgeGroups' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'scheduledpurge_purgeAssets' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'scheduledpurge_terminateRunningWorkflows' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'scheduledpurge_daysold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'scheduledpurge_saveThreshold' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'scheduledpurge_name' := ScheduledpurgeName,
          'scheduledpurge_purgeActive' := ScheduledpurgePurgeActive,
          'scheduledpurge_templates' := ScheduledpurgeTemplates,
          'scheduledpurge_purgeGroups' := ScheduledpurgePurgeGroups,
          'scheduledpurge_purgeAssets' := ScheduledpurgePurgeAssets,
          'scheduledpurge_terminateRunningWorkflows' := ScheduledpurgeTerminateRunningWorkflows,
          'scheduledpurge_daysold' := ScheduledpurgeDaysold,
          'scheduledpurge_saveThreshold' := ScheduledpurgeSaveThreshold
        }) ->
    #{ 'scheduledpurge.name' => ScheduledpurgeName,
       'scheduledpurge.purgeActive' => ScheduledpurgePurgeActive,
       'scheduledpurge.templates' => ScheduledpurgeTemplates,
       'scheduledpurge.purgeGroups' => ScheduledpurgePurgeGroups,
       'scheduledpurge.purgeAssets' => ScheduledpurgePurgeAssets,
       'scheduledpurge.terminateRunningWorkflows' => ScheduledpurgeTerminateRunningWorkflows,
       'scheduledpurge.daysold' => ScheduledpurgeDaysold,
       'scheduledpurge.saveThreshold' => ScheduledpurgeSaveThreshold
     }.
