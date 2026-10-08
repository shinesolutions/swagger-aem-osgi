-module(openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_info/0]).

-export([openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_info/1]).

-export_type([openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_info/0]).

-type openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_properties:openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_properties() }
  ].


openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_info() ->
    openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_info([]).

openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_properties:openapi_com_adobe_cq_social_sync_impl_diff_changes_observer_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

