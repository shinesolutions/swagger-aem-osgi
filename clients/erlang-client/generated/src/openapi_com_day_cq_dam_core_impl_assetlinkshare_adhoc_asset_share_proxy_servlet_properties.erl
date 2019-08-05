-module(openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_properties() ::
    #{ 'cq_dam_adhoc_asset_share_prezip_maxcontentsize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_adhoc_asset_share_prezip_maxcontentsize' := CqDamAdhocAssetSharePrezipMaxcontentsize
        }) ->
    #{ 'cq.dam.adhoc.asset.share.prezip.maxcontentsize' => CqDamAdhocAssetSharePrezipMaxcontentsize
     }.
