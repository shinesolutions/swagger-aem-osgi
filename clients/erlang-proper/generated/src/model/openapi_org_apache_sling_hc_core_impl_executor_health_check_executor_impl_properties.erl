-module(openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties/0]).

-export([openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties() ::
  [ {'timeoutInMs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'longRunningFutureThresholdForCriticalMs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'resultCacheTtlInMs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties() ->
    openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties([]).

openapi_org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties(Fields) ->
  Default = [ {'timeoutInMs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'longRunningFutureThresholdForCriticalMs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'resultCacheTtlInMs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

