-module(openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties/0]).

-type openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties() ::
    #{ 'org_apache_sling_commons_log_file' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_commons_log_file_number' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'org_apache_sling_commons_log_file_size' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_commons_log_file_buffered' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'org_apache_sling_commons_log_file' := OrgApacheSlingCommonsLogFile,
          'org_apache_sling_commons_log_file_number' := OrgApacheSlingCommonsLogFileNumber,
          'org_apache_sling_commons_log_file_size' := OrgApacheSlingCommonsLogFileSize,
          'org_apache_sling_commons_log_file_buffered' := OrgApacheSlingCommonsLogFileBuffered
        }) ->
    #{ 'org.apache.sling.commons.log.file' => OrgApacheSlingCommonsLogFile,
       'org.apache.sling.commons.log.file.number' => OrgApacheSlingCommonsLogFileNumber,
       'org.apache.sling.commons.log.file.size' => OrgApacheSlingCommonsLogFileSize,
       'org.apache.sling.commons.log.file.buffered' => OrgApacheSlingCommonsLogFileBuffered
     }.
