-module(openapi_com_day_cq_search_impl_builder_query_builder_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_search_impl_builder_query_builder_impl_properties/0]).

-type openapi_com_day_cq_search_impl_builder_query_builder_impl_properties() ::
    #{ 'excerpt_properties' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cache_max_entries' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_entry_lifetime' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'xpath_union' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'excerpt_properties' := ExcerptProperties,
          'cache_max_entries' := CacheMaxEntries,
          'cache_entry_lifetime' := CacheEntryLifetime,
          'xpath_union' := XpathUnion
        }) ->
    #{ 'excerpt.properties' => ExcerptProperties,
       'cache.max.entries' => CacheMaxEntries,
       'cache.entry.lifetime' => CacheEntryLifetime,
       'xpath.union' => XpathUnion
     }.
