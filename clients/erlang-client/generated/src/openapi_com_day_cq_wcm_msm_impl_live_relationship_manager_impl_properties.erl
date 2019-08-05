-module(openapi_com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_msm_impl_live_relationship_manager_impl_properties() ::
    #{ 'liverelationshipmgr_relationsconfig_default' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'liverelationshipmgr_relationsconfig_default' := LiverelationshipmgrRelationsconfigDefault
        }) ->
    #{ 'liverelationshipmgr.relationsconfig.default' => LiverelationshipmgrRelationsconfigDefault
     }.
