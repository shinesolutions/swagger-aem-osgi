-module(openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties/0]).

-type openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties() ::
    #{ 'numUserLimit' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'numUserLimit' := NumUserLimit
        }) ->
    #{ 'numUserLimit' => NumUserLimit
     }.
