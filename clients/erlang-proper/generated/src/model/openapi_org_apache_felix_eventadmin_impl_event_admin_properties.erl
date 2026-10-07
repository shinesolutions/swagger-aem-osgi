-module(openapi_org_apache_felix_eventadmin_impl_event_admin_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_eventadmin_impl_event_admin_properties/0]).

-export([openapi_org_apache_felix_eventadmin_impl_event_admin_properties/1]).

-export_type([openapi_org_apache_felix_eventadmin_impl_event_admin_properties/0]).

-type openapi_org_apache_felix_eventadmin_impl_event_admin_properties() ::
  [ {'org_apache_felix_eventadmin_ThreadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_eventadmin_AsyncToSyncThreadRatio', openapi_config_node_property_float:openapi_config_node_property_float() }
  | {'org_apache_felix_eventadmin_Timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_felix_eventadmin_RequireTopic', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_felix_eventadmin_IgnoreTimeout', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_felix_eventadmin_IgnoreTopic', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_felix_eventadmin_impl_event_admin_properties() ->
    openapi_org_apache_felix_eventadmin_impl_event_admin_properties([]).

openapi_org_apache_felix_eventadmin_impl_event_admin_properties(Fields) ->
  Default = [ {'org.apache.felix.eventadmin.ThreadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.eventadmin.AsyncToSyncThreadRatio', openapi_config_node_property_float:openapi_config_node_property_float() }
            , {'org.apache.felix.eventadmin.Timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.felix.eventadmin.RequireTopic', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.felix.eventadmin.IgnoreTimeout', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.felix.eventadmin.IgnoreTopic', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

