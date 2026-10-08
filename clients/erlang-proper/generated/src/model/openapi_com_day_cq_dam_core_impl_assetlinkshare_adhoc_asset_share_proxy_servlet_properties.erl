-module(openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties() ::
  [ {'cq_dam_adhoc_asset_share_prezip_maxcontentsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties(Fields) ->
  Default = [ {'cq.dam.adhoc.asset.share.prezip.maxcontentsize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

