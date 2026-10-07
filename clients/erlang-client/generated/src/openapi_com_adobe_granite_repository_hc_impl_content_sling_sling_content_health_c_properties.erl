-module(openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties/0]).

-type openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'exclude_search_path' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_tags' := HcTags,
          'exclude_search_path' := ExcludeSearchPath
        }) ->
    #{ 'hc.tags' => HcTags,
       'exclude.search.path' => ExcludeSearchPath
     }.
