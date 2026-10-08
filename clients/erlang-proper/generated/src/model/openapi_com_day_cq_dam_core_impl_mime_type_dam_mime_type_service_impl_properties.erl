-module(openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties() ::
  [ {'cq_dam_detect_asset_mime_from_content', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties() ->
    openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties([]).

openapi_com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_properties(Fields) ->
  Default = [ {'cq.dam.detect.asset.mime.from.content', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

