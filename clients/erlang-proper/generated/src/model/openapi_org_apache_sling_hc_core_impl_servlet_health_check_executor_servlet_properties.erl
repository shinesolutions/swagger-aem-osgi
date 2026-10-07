-module(openapi_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties/0]).

-export([openapi_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties() ::
  [ {'servletPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'disabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cors_accessControlAllowOrigin', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties() ->
    openapi_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties([]).

openapi_org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_properties(Fields) ->
  Default = [ {'servletPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'disabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cors.accessControlAllowOrigin', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

