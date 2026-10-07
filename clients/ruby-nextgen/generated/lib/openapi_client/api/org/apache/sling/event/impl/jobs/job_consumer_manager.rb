# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEventImplJobsJobConsumerManager
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_sling_installer_configuration_persist: nil, job_consumermanager_whitelist: nil, job_consumermanager_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager',
          type: OpenapiClient::Models::OrgApacheSlingEventImplJobsJobConsumerManagerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.sling.installer.configuration.persist' => org_apache_sling_installer_configuration_persist, 'job.consumermanager.whitelist' => job_consumermanager_whitelist, 'job.consumermanager.blacklist' => job_consumermanager_blacklist }
        )
      end
    end
  end
end
