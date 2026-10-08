# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEventImplJobsJcrPersistenceHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, job_consumermanager_disable_distribution: nil, startup_delay: nil, cleanup_period: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler',
          type: OpenapiClient::Models::OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'job.consumermanager.disableDistribution' => job_consumermanager_disable_distribution, 'startup.delay' => startup_delay, 'cleanup.period' => cleanup_period }
        )
      end
    end
  end
end
