-module(openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_info/0]).

-type openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties:openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
