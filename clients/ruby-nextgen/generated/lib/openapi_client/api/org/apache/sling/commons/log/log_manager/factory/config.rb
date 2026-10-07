# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsLogLogManagerFactoryConfig
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_sling_commons_log_level: nil, org_apache_sling_commons_log_file: nil, org_apache_sling_commons_log_pattern: nil, org_apache_sling_commons_log_names: nil, org_apache_sling_commons_log_additiv: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config',
          type: OpenapiClient::Models::OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.sling.commons.log.level' => org_apache_sling_commons_log_level, 'org.apache.sling.commons.log.file' => org_apache_sling_commons_log_file, 'org.apache.sling.commons.log.pattern' => org_apache_sling_commons_log_pattern, 'org.apache.sling.commons.log.names' => org_apache_sling_commons_log_names, 'org.apache.sling.commons.log.additiv' => org_apache_sling_commons_log_additiv }
        )
      end
    end
  end
end
