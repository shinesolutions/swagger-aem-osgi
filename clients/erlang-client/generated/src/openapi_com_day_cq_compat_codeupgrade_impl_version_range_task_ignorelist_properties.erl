-module(openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties() ::
    #{ 'effectiveBundleListPath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'effectiveBundleListPath' := EffectiveBundleListPath
        }) ->
    #{ 'effectiveBundleListPath' => EffectiveBundleListPath
     }.
