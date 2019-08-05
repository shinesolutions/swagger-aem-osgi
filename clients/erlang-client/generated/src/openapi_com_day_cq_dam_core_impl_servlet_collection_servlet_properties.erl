-module(openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_collection_servlet_properties() ::
    #{ 'cq_dam_batch_collection_properties' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_dam_batch_collection_maxcollections' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_batch_collection_properties' := CqDamBatchCollectionProperties,
          'cq_dam_batch_collection_maxcollections' := CqDamBatchCollectionMaxcollections
        }) ->
    #{ 'cq.dam.batch.collection.properties' => CqDamBatchCollectionProperties,
       'cq.dam.batch.collection.maxcollections' => CqDamBatchCollectionMaxcollections
     }.
