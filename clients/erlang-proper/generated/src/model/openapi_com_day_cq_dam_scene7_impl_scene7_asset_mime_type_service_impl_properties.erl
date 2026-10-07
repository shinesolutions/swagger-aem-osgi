-module(openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties/0]).

-export([openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties() ::
  [ {'cq_dam_scene7_assetmimetypeservice_mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties() ->
    openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties([]).

openapi_com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties(Fields) ->
  Default = [ {'cq.dam.scene7.assetmimetypeservice.mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

