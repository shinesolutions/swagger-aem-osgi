-module(openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties() ::
    #{ 'timeoutInMs' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'longRunningFutureThresholdForCriticalMs' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'resultCacheTtlInMs' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'timeoutInMs' := TimeoutInMs,
          'longRunningFutureThresholdForCriticalMs' := LongRunningFutureThresholdForCriticalMs,
          'resultCacheTtlInMs' := ResultCacheTtlInMs
        }) ->
    #{ 'timeoutInMs' => TimeoutInMs,
       'longRunningFutureThresholdForCriticalMs' => LongRunningFutureThresholdForCriticalMs,
       'resultCacheTtlInMs' => ResultCacheTtlInMs
     }.
