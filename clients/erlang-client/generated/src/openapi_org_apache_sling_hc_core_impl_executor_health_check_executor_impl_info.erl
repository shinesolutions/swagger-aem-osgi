-module(openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_info/0]).

-type openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties:openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties()
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
