# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialSyncImplUserSyncListenerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, nodetypes: nil, ignorableprops: nil, ignorablenodes: nil, enabled: nil, distfolders: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialSyncImplUserSyncListenerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'nodetypes' => nodetypes, 'ignorableprops' => ignorableprops, 'ignorablenodes' => ignorablenodes, 'enabled' => enabled, 'distfolders' => distfolders }
        )
      end
    end
  end
end
