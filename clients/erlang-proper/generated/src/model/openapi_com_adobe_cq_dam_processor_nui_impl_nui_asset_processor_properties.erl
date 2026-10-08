-module(openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties/0]).

-export([openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties/1]).

-export_type([openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties/0]).

-type openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties() ::
  [ {'nuiEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'nuiServiceUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'nuiApiKey', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties() ->
    openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties([]).

openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties(Fields) ->
  Default = [ {'nuiEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'nuiServiceUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'nuiApiKey', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

