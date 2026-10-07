-module(openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties/0]).

-export([openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties() ::
  [ {'effectiveBundleListPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties() ->
    openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties([]).

openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties(Fields) ->
  Default = [ {'effectiveBundleListPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

