-module(openapi_org_apache_sling_commons_log_log_manager_factory_config_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_log_log_manager_factory_config_properties/0]).

-type openapi_org_apache_sling_commons_log_log_manager_factory_config_properties() ::
    #{ 'org_apache_sling_commons_log_level' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'org_apache_sling_commons_log_file' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_commons_log_pattern' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_commons_log_names' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'org_apache_sling_commons_log_additiv' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'org_apache_sling_commons_log_level' := OrgApacheSlingCommonsLogLevel,
          'org_apache_sling_commons_log_file' := OrgApacheSlingCommonsLogFile,
          'org_apache_sling_commons_log_pattern' := OrgApacheSlingCommonsLogPattern,
          'org_apache_sling_commons_log_names' := OrgApacheSlingCommonsLogNames,
          'org_apache_sling_commons_log_additiv' := OrgApacheSlingCommonsLogAdditiv
        }) ->
    #{ 'org.apache.sling.commons.log.level' => OrgApacheSlingCommonsLogLevel,
       'org.apache.sling.commons.log.file' => OrgApacheSlingCommonsLogFile,
       'org.apache.sling.commons.log.pattern' => OrgApacheSlingCommonsLogPattern,
       'org.apache.sling.commons.log.names' => OrgApacheSlingCommonsLogNames,
       'org.apache.sling.commons.log.additiv' => OrgApacheSlingCommonsLogAdditiv
     }.
