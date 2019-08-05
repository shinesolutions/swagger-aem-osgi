-module(openapi_com_day_cq_wcm_msm_impl_actions_references_update_action_factory_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_msm_impl_actions_references_update_action_factory_properties/0]).

-type openapi_com_day_cq_wcm_msm_impl_actions_references_update_action_factory_properties() ::
    #{ 'cq_wcm_msm_action_excludednodetypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_wcm_msm_action_excludedparagraphitems' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_wcm_msm_action_excludedprops' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_wcm_msm_impl_action_referencesupdate_prop_updateNested' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_wcm_msm_action_excludednodetypes' := CqWcmMsmActionExcludednodetypes,
          'cq_wcm_msm_action_excludedparagraphitems' := CqWcmMsmActionExcludedparagraphitems,
          'cq_wcm_msm_action_excludedprops' := CqWcmMsmActionExcludedprops,
          'cq_wcm_msm_impl_action_referencesupdate_prop_updateNested' := CqWcmMsmImplActionReferencesupdatePropUpdateNested
        }) ->
    #{ 'cq.wcm.msm.action.excludednodetypes' => CqWcmMsmActionExcludednodetypes,
       'cq.wcm.msm.action.excludedparagraphitems' => CqWcmMsmActionExcludedparagraphitems,
       'cq.wcm.msm.action.excludedprops' => CqWcmMsmActionExcludedprops,
       'cq.wcm.msm.impl.action.referencesupdate.prop_updateNested' => CqWcmMsmImplActionReferencesupdatePropUpdateNested
     }.
