-module(openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties() ::
    #{ 'purgeCompleted' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'completedAge' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'purgeActive' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'activeAge' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'saveThreshold' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'purgeCompleted' := PurgeCompleted,
          'completedAge' := CompletedAge,
          'purgeActive' := PurgeActive,
          'activeAge' := ActiveAge,
          'saveThreshold' := SaveThreshold
        }) ->
    #{ 'purgeCompleted' => PurgeCompleted,
       'completedAge' => CompletedAge,
       'purgeActive' => PurgeActive,
       'activeAge' => ActiveAge,
       'saveThreshold' => SaveThreshold
     }.
