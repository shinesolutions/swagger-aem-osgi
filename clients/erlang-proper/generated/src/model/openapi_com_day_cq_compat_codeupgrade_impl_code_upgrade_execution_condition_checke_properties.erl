-module(openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties/0]).

-export([openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties() ::
  [ {'codeupgradetasks', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'codeupgradetaskfilters', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties() ->
    openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties([]).

openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties(Fields) ->
  Default = [ {'codeupgradetasks', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'codeupgradetaskfilters', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

