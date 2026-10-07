-module(openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties/0]).

-export([openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties/1]).

-export_type([openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties/0]).

-type openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'minPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxThreadAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'keepAliveTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'blockPolicy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'shutdownGraceful', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'daemon', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'shutdownWaitTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties() ->
    openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties([]).

openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'minPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxThreadAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'keepAliveTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'blockPolicy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'shutdownGraceful', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'daemon', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'shutdownWaitTime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

