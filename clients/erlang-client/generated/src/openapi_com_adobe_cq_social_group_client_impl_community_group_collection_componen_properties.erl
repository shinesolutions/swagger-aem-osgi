-module(openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties/0]).

-type openapi_com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties() ::
    #{ 'group_listing_pagination_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'group_listing_lazyloading_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'page_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'priority' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'group_listing_pagination_enable' := GroupListingPaginationEnable,
          'group_listing_lazyloading_enable' := GroupListingLazyloadingEnable,
          'page_size' := PageSize,
          'priority' := Priority
        }) ->
    #{ 'group.listing.pagination.enable' => GroupListingPaginationEnable,
       'group.listing.lazyloading.enable' => GroupListingLazyloadingEnable,
       'page.size' => PageSize,
       'priority' => Priority
     }.
