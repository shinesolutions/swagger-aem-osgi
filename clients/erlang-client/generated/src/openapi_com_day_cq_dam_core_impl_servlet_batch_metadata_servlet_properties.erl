-module(openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties() ::
    #{ 'cq_dam_batch_metadata_asset_default' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_dam_batch_metadata_collection_default' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_dam_batch_metadata_maxresources' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_batch_metadata_asset_default' := CqDamBatchMetadataAssetDefault,
          'cq_dam_batch_metadata_collection_default' := CqDamBatchMetadataCollectionDefault,
          'cq_dam_batch_metadata_maxresources' := CqDamBatchMetadataMaxresources
        }) ->
    #{ 'cq.dam.batch.metadata.asset.default' => CqDamBatchMetadataAssetDefault,
       'cq.dam.batch.metadata.collection.default' => CqDamBatchMetadataCollectionDefault,
       'cq.dam.batch.metadata.maxresources' => CqDamBatchMetadataMaxresources
     }.
