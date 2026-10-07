# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsLogLogManagerFactoryWriter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_sling_commons_log_file: nil, org_apache_sling_commons_log_file_number: nil, org_apache_sling_commons_log_file_size: nil, org_apache_sling_commons_log_file_buffered: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer',
          type: OpenapiClient::Models::OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.sling.commons.log.file' => org_apache_sling_commons_log_file, 'org.apache.sling.commons.log.file.number' => org_apache_sling_commons_log_file_number, 'org.apache.sling.commons.log.file.size' => org_apache_sling_commons_log_file_size, 'org.apache.sling.commons.log.file.buffered' => org_apache_sling_commons_log_file_buffered }
        )
      end
    end
  end
end
