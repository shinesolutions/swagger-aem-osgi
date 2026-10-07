-module(openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties/0]).

-type openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties() ::
    #{ 'dam_cfm_resourceTypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'dam_cfm_referenceProperties' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'dam_cfm_resourceTypes' := DamCfmResourceTypes,
          'dam_cfm_referenceProperties' := DamCfmReferenceProperties
        }) ->
    #{ 'dam.cfm.resourceTypes' => DamCfmResourceTypes,
       'dam.cfm.referenceProperties' => DamCfmReferenceProperties
     }.
