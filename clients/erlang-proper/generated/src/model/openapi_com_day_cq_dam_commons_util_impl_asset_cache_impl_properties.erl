-module(openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties/0]).

-export([openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties/0]).

-type openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties() ::
  [ {'large_file_min', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cache_apply', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'mime_types', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties() ->
    openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties([]).

openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties(Fields) ->
  Default = [ {'large.file.min', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cache.apply', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'mime.types', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

