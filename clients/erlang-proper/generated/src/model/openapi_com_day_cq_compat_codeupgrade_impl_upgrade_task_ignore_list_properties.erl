-module(openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties/0]).

-export([openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties() ::
  [ {'upgradeTaskIgnoreList', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties() ->
    openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties([]).

openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties(Fields) ->
  Default = [ {'upgradeTaskIgnoreList', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

