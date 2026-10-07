# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDeserfwImplDeserializationFirewallImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, firewall_deserialization_whitelist: nil, firewall_deserialization_blacklist: nil, firewall_deserialization_diagnostics: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl',
          type: OpenapiClient::Models::ComAdobeCqDeserfwImplDeserializationFirewallImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'firewall.deserialization.whitelist' => firewall_deserialization_whitelist, 'firewall.deserialization.blacklist' => firewall_deserialization_blacklist, 'firewall.deserialization.diagnostics' => firewall_deserialization_diagnostics }
        )
      end
    end
  end
end
