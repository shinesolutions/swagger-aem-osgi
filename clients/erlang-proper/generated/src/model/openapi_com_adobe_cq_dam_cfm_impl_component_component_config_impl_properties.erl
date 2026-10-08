-module(openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties/0]).

-export([openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties/1]).

-export_type([openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties/0]).

-type openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties() ::
  [ {'dam_cfm_component_resourceType', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'dam_cfm_component_fileReferenceProp', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'dam_cfm_component_elementsProp', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'dam_cfm_component_variationProp', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties() ->
    openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties([]).

openapi_com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties(Fields) ->
  Default = [ {'dam.cfm.component.resourceType', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'dam.cfm.component.fileReferenceProp', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'dam.cfm.component.elementsProp', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'dam.cfm.component.variationProp', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

