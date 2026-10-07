# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, dmreplicateonmodify_enabled: nil, dmreplicateonmodify_forcesyncdeletes: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker',
          type: OpenapiClient::Models::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModH3a3b82bd,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'dmreplicateonmodify.enabled' => dmreplicateonmodify_enabled, 'dmreplicateonmodify.forcesyncdeletes' => dmreplicateonmodify_forcesyncdeletes }
        )
      end
    end
  end
end
