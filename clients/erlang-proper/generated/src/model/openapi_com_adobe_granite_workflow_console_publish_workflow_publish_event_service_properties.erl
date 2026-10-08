-module(openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties/0]).

-export([openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties/0]).

-type openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties() ::
  [ {'granite_workflow_WorkflowPublishEventService_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties() ->
    openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties([]).

openapi_com_adobe_granite_workflow_console_publish_workflow_publish_event_service_properties(Fields) ->
  Default = [ {'granite.workflow.WorkflowPublishEventService.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

