-module(openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_info/0]).

-export([openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_info/1]).

-export_type([openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_info/0]).

-type openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties:openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties() }
  ].


openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_info() ->
    openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_info([]).

openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties:openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

