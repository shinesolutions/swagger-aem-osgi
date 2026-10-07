-module(openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties/0]).

-type openapi_org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties() ::
    #{ 'job_consumermanager_disableDistribution' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'startup_delay' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cleanup_period' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'job_consumermanager_disableDistribution' := JobConsumermanagerDisableDistribution,
          'startup_delay' := StartupDelay,
          'cleanup_period' := CleanupPeriod
        }) ->
    #{ 'job.consumermanager.disableDistribution' => JobConsumermanagerDisableDistribution,
       'startup.delay' => StartupDelay,
       'cleanup.period' => CleanupPeriod
     }.
