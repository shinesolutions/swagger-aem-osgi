-module(openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties/0]).

-export([openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties/1]).

-export_type([openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties/0]).

-type openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties() ::
  [ {'dam_cfm_resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'dam_cfm_referenceProperties', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties() ->
    openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties([]).

openapi_com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_properties(Fields) ->
  Default = [ {'dam.cfm.resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'dam.cfm.referenceProperties', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

