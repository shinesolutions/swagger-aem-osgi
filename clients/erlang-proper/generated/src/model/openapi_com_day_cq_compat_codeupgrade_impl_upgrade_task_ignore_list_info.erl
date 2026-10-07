-module(openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_info/0]).

-export([openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_info/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_info/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties:openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties() }
  ].


openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_info() ->
    openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_info([]).

openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties:openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

