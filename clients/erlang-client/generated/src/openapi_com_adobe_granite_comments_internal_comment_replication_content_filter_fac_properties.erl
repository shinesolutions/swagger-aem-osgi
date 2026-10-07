-module(openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties/0]).

-type openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties() ::
    #{ 'replicate_comment_resourceTypes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'replicate_comment_resourceTypes' := ReplicateCommentResourceTypes
        }) ->
    #{ 'replicate.comment.resourceTypes' => ReplicateCommentResourceTypes
     }.
