# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqRewriterLinkcheckerImplLinkCheckerTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_period: nil, scheduler_concurrent: nil, good_link_test_interval: nil, bad_link_test_interval: nil, link_unused_interval: nil, connection_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask',
          type: OpenapiClient::Models::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.period' => scheduler_period, 'scheduler.concurrent' => scheduler_concurrent, 'good_link_test_interval' => good_link_test_interval, 'bad_link_test_interval' => bad_link_test_interval, 'link_unused_interval' => link_unused_interval, 'connection.timeout' => connection_timeout }
        )
      end
    end
  end
end
