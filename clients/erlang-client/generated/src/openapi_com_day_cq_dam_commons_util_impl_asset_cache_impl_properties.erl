-module(openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties/0]).

-type openapi_com_day_cq_dam_commons_util_impl_asset_cache_impl_properties() ::
    #{ 'large_file_min' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_apply' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'mime_types' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'large_file_min' := LargeFileMin,
          'cache_apply' := CacheApply,
          'mime_types' := MimeTypes
        }) ->
    #{ 'large.file.min' => LargeFileMin,
       'cache.apply' => CacheApply,
       'mime.types' => MimeTypes
     }.
