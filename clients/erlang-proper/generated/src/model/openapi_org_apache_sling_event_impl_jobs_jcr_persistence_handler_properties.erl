-module(openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties/0]).

-export([openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties/1]).

-export_type([openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties/0]).

-type openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties() ::
  [ {'job_consumermanager_disableDistribution', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'startup_delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cleanup_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties() ->
    openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties([]).

openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties(Fields) ->
  Default = [ {'job.consumermanager.disableDistribution', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'startup.delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cleanup.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

