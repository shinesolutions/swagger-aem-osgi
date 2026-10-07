-module(openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties/0]).

-type openapi_com_day_cq_dam_indd_process_indd_media_extract_process_properties() ::
    #{ 'process_label' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_indd_pages_regex' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ids_job_decoupled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'ids_job_workflow_model' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'process_label' := ProcessLabel,
          'cq_dam_indd_pages_regex' := CqDamInddPagesRegex,
          'ids_job_decoupled' := IdsJobDecoupled,
          'ids_job_workflow_model' := IdsJobWorkflowModel
        }) ->
    #{ 'process.label' => ProcessLabel,
       'cq.dam.indd.pages.regex' => CqDamInddPagesRegex,
       'ids.job.decoupled' => IdsJobDecoupled,
       'ids.job.workflow.model' => IdsJobWorkflowModel
     }.
