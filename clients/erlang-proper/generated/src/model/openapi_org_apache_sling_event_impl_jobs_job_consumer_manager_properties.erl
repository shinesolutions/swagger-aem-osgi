-module(openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties/0]).

-export([openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties/1]).

-export_type([openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties/0]).

-type openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties() ::
  [ {'org_apache_sling_installer_configuration_persist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'job_consumermanager_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'job_consumermanager_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties() ->
    openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties([]).

openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties(Fields) ->
  Default = [ {'org.apache.sling.installer.configuration.persist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'job.consumermanager.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'job.consumermanager.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

