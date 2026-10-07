# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteBundlesHcImplJobsHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil, max_queued_jobs: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags, 'max.queued.jobs' => max_queued_jobs }
        )
      end
    end
  end
end
