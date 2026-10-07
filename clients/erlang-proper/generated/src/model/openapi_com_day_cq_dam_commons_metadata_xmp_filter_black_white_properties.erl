-module(openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties/0]).

-export([openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties/1]).

-export_type([openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties/0]).

-type openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties() ::
  [ {'xmp_filter_apply_whitelist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'xmp_filter_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'xmp_filter_apply_blacklist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'xmp_filter_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties() ->
    openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties([]).

openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties(Fields) ->
  Default = [ {'xmp.filter.apply_whitelist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'xmp.filter.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'xmp.filter.apply_blacklist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'xmp.filter.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

