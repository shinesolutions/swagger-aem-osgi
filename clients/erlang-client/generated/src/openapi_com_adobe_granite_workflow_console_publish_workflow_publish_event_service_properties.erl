-module(openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties/0]).

-type openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties() ::
    #{ 'granite_workflow_WorkflowPublishEventService_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'granite_workflow_WorkflowPublishEventService_enabled' := GraniteWorkflowWorkflowPublishEventServiceEnabled
        }) ->
    #{ 'granite.workflow.WorkflowPublishEventService.enabled' => GraniteWorkflowWorkflowPublishEventServiceEnabled
     }.
