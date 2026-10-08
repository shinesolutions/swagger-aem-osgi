-module(openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties/0]).

-export([openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties/1]).

-export_type([openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties/0]).

-type openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties() ::
  [ {'replicate_comment_resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties() ->
    openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties([]).

openapi_com_adobe_granite_comments_internal_comment_replication_content_filter_fac_properties(Fields) ->
  Default = [ {'replicate.comment.resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

