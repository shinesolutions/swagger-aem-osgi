-module(openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties/0]).

-export([openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties/1]).

-export_type([openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties/0]).

-type openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties() ::
  [ {'granite_workflowinbox_sort_propertyName', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'granite_workflowinbox_sort_order', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_workflow_job_retry', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_workflow_superuser', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'granite_workflow_inboxQuerySize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'granite_workflow_adminUserGroupFilter', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_workflow_enforceWorkitemAssigneePermissions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_workflow_enforceWorkflowInitiatorPermissions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_workflow_injectTenantIdInJobTopics', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'granite_workflow_maxPurgeSaveThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'granite_workflow_maxPurgeQueryCount', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties() ->
    openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties([]).

openapi_com_adobe_granite_workflow_core_workflow_session_factory_properties(Fields) ->
  Default = [ {'granite.workflowinbox.sort.propertyName', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'granite.workflowinbox.sort.order', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.workflow.job.retry', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.workflow.superuser', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'granite.workflow.inboxQuerySize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'granite.workflow.adminUserGroupFilter', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.workflow.enforceWorkitemAssigneePermissions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.workflow.enforceWorkflowInitiatorPermissions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.workflow.injectTenantIdInJobTopics', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'granite.workflow.maxPurgeSaveThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'granite.workflow.maxPurgeQueryCount', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

