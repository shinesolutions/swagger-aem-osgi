-module(openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_info/0]).

-export([openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_info/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_info/0]).

-type openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties:openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties() }
  ].


openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_info() ->
    openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_info([]).

openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties:openapi_com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

