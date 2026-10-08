-module(openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_info/0]).

-export([openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_info/1]).

-export_type([openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_info/0]).

-type openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties:openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties() }
  ].


openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_info() ->
    openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_info([]).

openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties:openapi_org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

