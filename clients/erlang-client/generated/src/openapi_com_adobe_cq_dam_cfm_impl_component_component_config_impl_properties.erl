-module(openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties/0]).

-type openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties() ::
    #{ 'dam_cfm_component_resourceType' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'dam_cfm_component_fileReferenceProp' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'dam_cfm_component_elementsProp' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'dam_cfm_component_variationProp' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'dam_cfm_component_resourceType' := DamCfmComponentResourceType,
          'dam_cfm_component_fileReferenceProp' := DamCfmComponentFileReferenceProp,
          'dam_cfm_component_elementsProp' := DamCfmComponentElementsProp,
          'dam_cfm_component_variationProp' := DamCfmComponentVariationProp
        }) ->
    #{ 'dam.cfm.component.resourceType' => DamCfmComponentResourceType,
       'dam.cfm.component.fileReferenceProp' => DamCfmComponentFileReferenceProp,
       'dam.cfm.component.elementsProp' => DamCfmComponentElementsProp,
       'dam.cfm.component.variationProp' => DamCfmComponentVariationProp
     }.
