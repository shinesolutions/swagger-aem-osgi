-module(openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_info/0]).

-export([openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_info/1]).

-export_type([openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_info/0]).

-type openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties:openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties() }
  ].


openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_info() ->
    openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_info([]).

openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties:openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

