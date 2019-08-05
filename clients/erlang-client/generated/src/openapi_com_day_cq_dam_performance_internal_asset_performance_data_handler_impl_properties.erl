-module(openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties/0]).

-type openapi_com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_properties() ::
    #{ 'batch_commit_size' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'batch_commit_size' := BatchCommitSize
        }) ->
    #{ 'batch.commit.size' => BatchCommitSize
     }.
