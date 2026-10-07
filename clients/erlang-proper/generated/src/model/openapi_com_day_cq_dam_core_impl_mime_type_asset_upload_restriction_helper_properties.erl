-module(openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties/0]).

-type openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties() ::
  [ {'cq_dam_allow_all_mime', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_dam_allowed_asset_mimes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties() ->
    openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties([]).

openapi_com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties(Fields) ->
  Default = [ {'cq.dam.allow.all.mime', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.dam.allowed.asset.mimes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

