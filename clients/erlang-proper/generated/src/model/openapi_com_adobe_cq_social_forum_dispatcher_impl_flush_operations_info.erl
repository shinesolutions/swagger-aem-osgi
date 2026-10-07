-module(openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info/0]).

-export([openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info/1]).

-export_type([openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info/0]).

-type openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties:openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties() }
  ].


openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info() ->
    openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info([]).

openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties:openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

