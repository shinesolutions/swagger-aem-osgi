-module(openapi_org_apache_felix_systemready_system_ready_monitor_info).

-include("openapi.hrl").

-export([openapi_org_apache_felix_systemready_system_ready_monitor_info/0]).

-export([openapi_org_apache_felix_systemready_system_ready_monitor_info/1]).

-export_type([openapi_org_apache_felix_systemready_system_ready_monitor_info/0]).

-type openapi_org_apache_felix_systemready_system_ready_monitor_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_felix_systemready_system_ready_monitor_properties:openapi_org_apache_felix_systemready_system_ready_monitor_properties() }
  ].


openapi_org_apache_felix_systemready_system_ready_monitor_info() ->
    openapi_org_apache_felix_systemready_system_ready_monitor_info([]).

openapi_org_apache_felix_systemready_system_ready_monitor_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_felix_systemready_system_ready_monitor_properties:openapi_org_apache_felix_systemready_system_ready_monitor_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

