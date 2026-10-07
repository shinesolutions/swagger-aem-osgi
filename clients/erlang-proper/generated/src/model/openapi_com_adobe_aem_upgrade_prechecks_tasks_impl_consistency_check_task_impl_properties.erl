-module(openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties/0]).

-export([openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties/1]).

-export_type([openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties/0]).

-type openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties() ::
  [ {'root_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'fix_inconsistencies', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties() ->
    openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties([]).

openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties(Fields) ->
  Default = [ {'root.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'fix.inconsistencies', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

