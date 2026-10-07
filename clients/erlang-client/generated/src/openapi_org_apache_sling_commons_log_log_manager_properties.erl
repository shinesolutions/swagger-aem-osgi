-module(openapi_org_apache_sling_commons_log_log_manager_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_log_log_manager_properties/0]).

-type openapi_org_apache_sling_commons_log_log_manager_properties() ::
    #{ 'org_apache_sling_commons_log_level' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'org_apache_sling_commons_log_file' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_commons_log_file_number' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'org_apache_sling_commons_log_file_size' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_commons_log_pattern' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_commons_log_configurationFile' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_commons_log_packagingDataEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'org_apache_sling_commons_log_maxCallerDataDepth' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'org_apache_sling_commons_log_maxOldFileCountInDump' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'org_apache_sling_commons_log_numOfLines' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'org_apache_sling_commons_log_level' := OrgApacheSlingCommonsLogLevel,
          'org_apache_sling_commons_log_file' := OrgApacheSlingCommonsLogFile,
          'org_apache_sling_commons_log_file_number' := OrgApacheSlingCommonsLogFileNumber,
          'org_apache_sling_commons_log_file_size' := OrgApacheSlingCommonsLogFileSize,
          'org_apache_sling_commons_log_pattern' := OrgApacheSlingCommonsLogPattern,
          'org_apache_sling_commons_log_configurationFile' := OrgApacheSlingCommonsLogConfigurationFile,
          'org_apache_sling_commons_log_packagingDataEnabled' := OrgApacheSlingCommonsLogPackagingDataEnabled,
          'org_apache_sling_commons_log_maxCallerDataDepth' := OrgApacheSlingCommonsLogMaxCallerDataDepth,
          'org_apache_sling_commons_log_maxOldFileCountInDump' := OrgApacheSlingCommonsLogMaxOldFileCountInDump,
          'org_apache_sling_commons_log_numOfLines' := OrgApacheSlingCommonsLogNumOfLines
        }) ->
    #{ 'org.apache.sling.commons.log.level' => OrgApacheSlingCommonsLogLevel,
       'org.apache.sling.commons.log.file' => OrgApacheSlingCommonsLogFile,
       'org.apache.sling.commons.log.file.number' => OrgApacheSlingCommonsLogFileNumber,
       'org.apache.sling.commons.log.file.size' => OrgApacheSlingCommonsLogFileSize,
       'org.apache.sling.commons.log.pattern' => OrgApacheSlingCommonsLogPattern,
       'org.apache.sling.commons.log.configurationFile' => OrgApacheSlingCommonsLogConfigurationFile,
       'org.apache.sling.commons.log.packagingDataEnabled' => OrgApacheSlingCommonsLogPackagingDataEnabled,
       'org.apache.sling.commons.log.maxCallerDataDepth' => OrgApacheSlingCommonsLogMaxCallerDataDepth,
       'org.apache.sling.commons.log.maxOldFileCountInDump' => OrgApacheSlingCommonsLogMaxOldFileCountInDump,
       'org.apache.sling.commons.log.numOfLines' => OrgApacheSlingCommonsLogNumOfLines
     }.
