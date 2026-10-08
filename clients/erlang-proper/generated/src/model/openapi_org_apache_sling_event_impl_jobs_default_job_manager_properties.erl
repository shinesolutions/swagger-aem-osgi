-module(openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties/0]).

-export([openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties/1]).

-export_type([openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties/0]).

-type openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties() ::
  [ {'queue_priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'queue_retries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queue_retrydelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queue_maxparallel', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties() ->
    openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties([]).

openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties(Fields) ->
  Default = [ {'queue.priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'queue.retries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queue.retrydelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queue.maxparallel', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

