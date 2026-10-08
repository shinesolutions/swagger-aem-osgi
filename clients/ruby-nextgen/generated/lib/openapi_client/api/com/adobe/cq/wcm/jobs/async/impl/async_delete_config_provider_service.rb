# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, threshold: nil, job_topic_name: nil, email_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService',
          type: OpenapiClient::Models::ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderSH5c8a65e7,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'threshold' => threshold, 'jobTopicName' => job_topic_name, 'emailEnabled' => email_enabled }
        )
      end
    end
  end
end
