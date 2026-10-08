-module(openapi_org_apache_felix_systemready_system_ready_monitor_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_systemready_system_ready_monitor_properties/0]).

-export([openapi_org_apache_felix_systemready_system_ready_monitor_properties/1]).

-export_type([openapi_org_apache_felix_systemready_system_ready_monitor_properties/0]).

-type openapi_org_apache_felix_systemready_system_ready_monitor_properties() ::
  [ {'poll_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_felix_systemready_system_ready_monitor_properties() ->
    openapi_org_apache_felix_systemready_system_ready_monitor_properties([]).

openapi_org_apache_felix_systemready_system_ready_monitor_properties(Fields) ->
  Default = [ {'poll.interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

