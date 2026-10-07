-module(openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_info/0]).

-export([openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_info/1]).

-export_type([openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_info/0]).

-type openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties:openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_info() ->
    openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_info([]).

openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties:openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

