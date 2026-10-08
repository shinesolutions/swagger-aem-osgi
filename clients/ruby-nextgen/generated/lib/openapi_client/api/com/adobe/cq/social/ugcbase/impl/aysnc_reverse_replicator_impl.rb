# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, pool_size: nil, max_pool_size: nil, queue_size: nil, keep_alive_time: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'poolSize' => pool_size, 'maxPoolSize' => max_pool_size, 'queueSize' => queue_size, 'keepAliveTime' => keep_alive_time }
        )
      end
    end
  end
end
