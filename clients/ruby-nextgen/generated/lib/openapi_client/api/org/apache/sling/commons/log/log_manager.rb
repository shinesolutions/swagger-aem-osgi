# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsLogLogManager
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_sling_commons_log_level: nil, org_apache_sling_commons_log_file: nil, org_apache_sling_commons_log_file_number: nil, org_apache_sling_commons_log_file_size: nil, org_apache_sling_commons_log_pattern: nil, org_apache_sling_commons_log_configuration_file: nil, org_apache_sling_commons_log_packaging_data_enabled: nil, org_apache_sling_commons_log_max_caller_data_depth: nil, org_apache_sling_commons_log_max_old_file_count_in_dump: nil, org_apache_sling_commons_log_num_of_lines: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.log.LogManager',
          type: OpenapiClient::Models::OrgApacheSlingCommonsLogLogManagerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.sling.commons.log.level' => org_apache_sling_commons_log_level, 'org.apache.sling.commons.log.file' => org_apache_sling_commons_log_file, 'org.apache.sling.commons.log.file.number' => org_apache_sling_commons_log_file_number, 'org.apache.sling.commons.log.file.size' => org_apache_sling_commons_log_file_size, 'org.apache.sling.commons.log.pattern' => org_apache_sling_commons_log_pattern, 'org.apache.sling.commons.log.configurationFile' => org_apache_sling_commons_log_configuration_file, 'org.apache.sling.commons.log.packagingDataEnabled' => org_apache_sling_commons_log_packaging_data_enabled, 'org.apache.sling.commons.log.maxCallerDataDepth' => org_apache_sling_commons_log_max_caller_data_depth, 'org.apache.sling.commons.log.maxOldFileCountInDump' => org_apache_sling_commons_log_max_old_file_count_in_dump, 'org.apache.sling.commons.log.numOfLines' => org_apache_sling_commons_log_num_of_lines }
        )
      end
    end
  end
end
