-module(openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties() ::
    #{ 'cq_dam_sync_workflow_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_sync_folder_types' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_dam_sync_workflow_id' := CqDamSyncWorkflowId,
          'cq_dam_sync_folder_types' := CqDamSyncFolderTypes
        }) ->
    #{ 'cq.dam.sync.workflow.id' => CqDamSyncWorkflowId,
       'cq.dam.sync.folder.types' => CqDamSyncFolderTypes
     }.
