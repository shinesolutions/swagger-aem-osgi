-module(openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties/0]).

-export([openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties() ::
  [ {'event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'rolloutmgr_excludedprops_default', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'rolloutmgr_excludedparagraphprops_default', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'rolloutmgr_excludednodetypes_default', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'rolloutmgr_threadpool_maxsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'rolloutmgr_threadpool_maxshutdowntime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'rolloutmgr_threadpool_priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'rolloutmgr_commit_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'rolloutmgr_conflicthandling_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties() ->
    openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties([]).

openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties(Fields) ->
  Default = [ {'event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'rolloutmgr.excludedprops.default', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'rolloutmgr.excludedparagraphprops.default', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'rolloutmgr.excludednodetypes.default', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'rolloutmgr.threadpool.maxsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'rolloutmgr.threadpool.maxshutdowntime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'rolloutmgr.threadpool.priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'rolloutmgr.commit.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'rolloutmgr.conflicthandling.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

