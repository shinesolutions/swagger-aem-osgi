-module(openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info/0]).

-export([openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties:openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties() }
  ].


openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info() ->
    openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info([]).

openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties:openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

