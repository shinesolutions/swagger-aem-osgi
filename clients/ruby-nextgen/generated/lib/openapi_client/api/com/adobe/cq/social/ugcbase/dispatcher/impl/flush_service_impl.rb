# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, thread_pool_size: nil, delay_time: nil, worker_sleep_time: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'threadPoolSize' => thread_pool_size, 'delayTime' => delay_time, 'workerSleepTime' => worker_sleep_time }
        )
      end
    end
  end
end
