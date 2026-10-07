-module(openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_msm_impl_rollout_manager_impl_properties() ::
    #{ 'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'rolloutmgr_excludedprops_default' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'rolloutmgr_excludedparagraphprops_default' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'rolloutmgr_excludednodetypes_default' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'rolloutmgr_threadpool_maxsize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'rolloutmgr_threadpool_maxshutdowntime' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'rolloutmgr_threadpool_priority' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'rolloutmgr_commit_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'rolloutmgr_conflicthandling_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'event_filter' := EventFilter,
          'rolloutmgr_excludedprops_default' := RolloutmgrExcludedpropsDefault,
          'rolloutmgr_excludedparagraphprops_default' := RolloutmgrExcludedparagraphpropsDefault,
          'rolloutmgr_excludednodetypes_default' := RolloutmgrExcludednodetypesDefault,
          'rolloutmgr_threadpool_maxsize' := RolloutmgrThreadpoolMaxsize,
          'rolloutmgr_threadpool_maxshutdowntime' := RolloutmgrThreadpoolMaxshutdowntime,
          'rolloutmgr_threadpool_priority' := RolloutmgrThreadpoolPriority,
          'rolloutmgr_commit_size' := RolloutmgrCommitSize,
          'rolloutmgr_conflicthandling_enabled' := RolloutmgrConflicthandlingEnabled
        }) ->
    #{ 'event.filter' => EventFilter,
       'rolloutmgr.excludedprops.default' => RolloutmgrExcludedpropsDefault,
       'rolloutmgr.excludedparagraphprops.default' => RolloutmgrExcludedparagraphpropsDefault,
       'rolloutmgr.excludednodetypes.default' => RolloutmgrExcludednodetypesDefault,
       'rolloutmgr.threadpool.maxsize' => RolloutmgrThreadpoolMaxsize,
       'rolloutmgr.threadpool.maxshutdowntime' => RolloutmgrThreadpoolMaxshutdowntime,
       'rolloutmgr.threadpool.priority' => RolloutmgrThreadpoolPriority,
       'rolloutmgr.commit.size' => RolloutmgrCommitSize,
       'rolloutmgr.conflicthandling.enabled' => RolloutmgrConflicthandlingEnabled
     }.
