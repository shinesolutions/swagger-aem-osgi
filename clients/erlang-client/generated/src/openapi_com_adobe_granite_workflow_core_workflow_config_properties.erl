-module(openapi_com_adobe_granite_workflow_core_workflow_config_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_workflow_config_properties/0]).

-type openapi_com_adobe_granite_workflow_core_workflow_config_properties() ::
    #{ 'cq_workflow_config_workflow_packages_root_path' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_workflow_config_workflow_process_legacy_mode' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_workflow_config_allow_locking' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_workflow_config_workflow_packages_root_path' := CqWorkflowConfigWorkflowPackagesRootPath,
          'cq_workflow_config_workflow_process_legacy_mode' := CqWorkflowConfigWorkflowProcessLegacyMode,
          'cq_workflow_config_allow_locking' := CqWorkflowConfigAllowLocking
        }) ->
    #{ 'cq.workflow.config.workflow.packages.root.path' => CqWorkflowConfigWorkflowPackagesRootPath,
       'cq.workflow.config.workflow.process.legacy.mode' => CqWorkflowConfigWorkflowProcessLegacyMode,
       'cq.workflow.config.allow.locking' => CqWorkflowConfigAllowLocking
     }.
