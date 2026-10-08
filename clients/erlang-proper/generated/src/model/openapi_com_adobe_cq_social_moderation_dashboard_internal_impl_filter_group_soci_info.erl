-module(openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info/0]).

-export([openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info/1]).

-export_type([openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info/0]).

-type openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties:openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties() }
  ].


openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info() ->
    openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info([]).

openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties:openapi_com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

