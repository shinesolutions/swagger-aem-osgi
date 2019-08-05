-module(openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties/0]).

-type openapi_com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties() ::
    #{ 'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'minThreadPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxThreadPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_wcm_workflow_terminate_on_activate' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_wcm_worklfow_terminate_exclusion_list' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'event_filter' := EventFilter,
          'minThreadPoolSize' := MinThreadPoolSize,
          'maxThreadPoolSize' := MaxThreadPoolSize,
          'cq_wcm_workflow_terminate_on_activate' := CqWcmWorkflowTerminateOnActivate,
          'cq_wcm_worklfow_terminate_exclusion_list' := CqWcmWorklfowTerminateExclusionList
        }) ->
    #{ 'event.filter' => EventFilter,
       'minThreadPoolSize' => MinThreadPoolSize,
       'maxThreadPoolSize' => MaxThreadPoolSize,
       'cq.wcm.workflow.terminate.on.activate' => CqWcmWorkflowTerminateOnActivate,
       'cq.wcm.worklfow.terminate.exclusion.list' => CqWcmWorklfowTerminateExclusionList
     }.
