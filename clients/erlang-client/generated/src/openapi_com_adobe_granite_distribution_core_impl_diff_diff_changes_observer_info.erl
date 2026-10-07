-module(openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_info/0]).

-type openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties:openapi_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
