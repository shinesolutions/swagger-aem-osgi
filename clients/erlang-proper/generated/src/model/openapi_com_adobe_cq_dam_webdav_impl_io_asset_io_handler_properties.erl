-module(openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties/0]).

-export([openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties/1]).

-export_type([openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties/0]).

-type openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'pathPrefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'createVersion', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties() ->
    openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties([]).

openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'pathPrefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'createVersion', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

