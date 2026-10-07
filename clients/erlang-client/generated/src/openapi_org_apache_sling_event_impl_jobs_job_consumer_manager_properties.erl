-module(openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties/0]).

-type openapi_org_apache_sling_event_impl_jobs_job_consumer_manager_properties() ::
    #{ 'org_apache_sling_installer_configuration_persist' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'job_consumermanager_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'job_consumermanager_blacklist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'org_apache_sling_installer_configuration_persist' := OrgApacheSlingInstallerConfigurationPersist,
          'job_consumermanager_whitelist' := JobConsumermanagerWhitelist,
          'job_consumermanager_blacklist' := JobConsumermanagerBlacklist
        }) ->
    #{ 'org.apache.sling.installer.configuration.persist' => OrgApacheSlingInstallerConfigurationPersist,
       'job.consumermanager.whitelist' => JobConsumermanagerWhitelist,
       'job.consumermanager.blacklist' => JobConsumermanagerBlacklist
     }.
