-module(openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties/0]).

-export([openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties/0]).

-type openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties() ::
  [ {'numUserLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties() ->
    openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties([]).

openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties(Fields) ->
  Default = [ {'numUserLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

