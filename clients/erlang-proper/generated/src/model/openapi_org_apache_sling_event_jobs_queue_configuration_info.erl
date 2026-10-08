-module(openapi_org_apache_sling_event_jobs_queue_configuration_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_event_jobs_queue_configuration_info/0]).

-export([openapi_org_apache_sling_event_jobs_queue_configuration_info/1]).

-export_type([openapi_org_apache_sling_event_jobs_queue_configuration_info/0]).

-type openapi_org_apache_sling_event_jobs_queue_configuration_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_event_jobs_queue_configuration_properties:openapi_org_apache_sling_event_jobs_queue_configuration_properties() }
  ].


openapi_org_apache_sling_event_jobs_queue_configuration_info() ->
    openapi_org_apache_sling_event_jobs_queue_configuration_info([]).

openapi_org_apache_sling_event_jobs_queue_configuration_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_event_jobs_queue_configuration_properties:openapi_org_apache_sling_event_jobs_queue_configuration_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

