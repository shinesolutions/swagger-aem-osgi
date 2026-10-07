-module(openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties/0]).

-type openapi_com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properties() ::
    #{ 'cq_dam_image_cache_max_memory' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_image_cache_max_age' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_image_cache_max_dimension' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_dam_image_cache_max_memory' := CqDamImageCacheMaxMemory,
          'cq_dam_image_cache_max_age' := CqDamImageCacheMaxAge,
          'cq_dam_image_cache_max_dimension' := CqDamImageCacheMaxDimension
        }) ->
    #{ 'cq.dam.image.cache.max.memory' => CqDamImageCacheMaxMemory,
       'cq.dam.image.cache.max.age' => CqDamImageCacheMaxAge,
       'cq.dam.image.cache.max.dimension' => CqDamImageCacheMaxDimension
     }.
