-module(openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties() ::
    #{ 'org_apache_sling_installer_configuration_persist' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'mode' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'port' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'primary_host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'primary_allowed_client_ip_ranges' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'secure' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'standby_readtimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'standby_autoclean' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'org_apache_sling_installer_configuration_persist' := OrgApacheSlingInstallerConfigurationPersist,
          'mode' := Mode,
          'port' := Port,
          'primary_host' := PrimaryHost,
          'interval' := Interval,
          'primary_allowed_client_ip_ranges' := PrimaryAllowedClientIpRanges,
          'secure' := Secure,
          'standby_readtimeout' := StandbyReadtimeout,
          'standby_autoclean' := StandbyAutoclean
        }) ->
    #{ 'org.apache.sling.installer.configuration.persist' => OrgApacheSlingInstallerConfigurationPersist,
       'mode' => Mode,
       'port' => Port,
       'primary.host' => PrimaryHost,
       'interval' => Interval,
       'primary.allowed-client-ip-ranges' => PrimaryAllowedClientIpRanges,
       'secure' => Secure,
       'standby.readtimeout' => StandbyReadtimeout,
       'standby.autoclean' => StandbyAutoclean
     }.
