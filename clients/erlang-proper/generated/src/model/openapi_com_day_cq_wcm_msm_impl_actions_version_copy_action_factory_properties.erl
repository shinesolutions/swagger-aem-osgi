-module(openapi_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties/0]).

-export([openapi_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties/1]).

-export_type([openapi_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties/0]).

-type openapi_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties() ::
  [ {'cq_wcm_msm_action_excludednodetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_wcm_msm_action_excludedparagraphitems', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_wcm_msm_action_excludedprops', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties() ->
    openapi_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties([]).

openapi_com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_properties(Fields) ->
  Default = [ {'cq.wcm.msm.action.excludednodetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.wcm.msm.action.excludedparagraphitems', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.wcm.msm.action.excludedprops', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

