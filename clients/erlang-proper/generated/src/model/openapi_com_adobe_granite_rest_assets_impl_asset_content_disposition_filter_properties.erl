-module(openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties/0]).

-export([openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties/1]).

-export_type([openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties/0]).

-type openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties() ::
  [ {'mime_allowEmpty', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'mime_allowed', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties() ->
    openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties([]).

openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties(Fields) ->
  Default = [ {'mime.allowEmpty', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'mime.allowed', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

