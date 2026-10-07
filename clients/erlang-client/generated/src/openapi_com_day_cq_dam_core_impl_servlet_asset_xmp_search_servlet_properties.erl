-module(openapi_com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_properties() ::
    #{ 'cq_dam_batch_indesign_maxassets' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_batch_indesign_maxassets' := CqDamBatchIndesignMaxassets
        }) ->
    #{ 'cq.dam.batch.indesign.maxassets' => CqDamBatchIndesignMaxassets
     }.
