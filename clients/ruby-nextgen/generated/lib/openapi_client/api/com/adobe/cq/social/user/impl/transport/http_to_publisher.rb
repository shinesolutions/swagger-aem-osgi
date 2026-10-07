# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUserImplTransportHttpToPublisher
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enable: nil, agent_configuration: nil, context_path: nil, disabled_cipher_suites: nil, enabled_cipher_suites: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher',
          type: OpenapiClient::Models::ComAdobeCqSocialUserImplTransportHttpToPublisherInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enable' => enable, 'agent.configuration' => agent_configuration, 'context.path' => context_path, 'disabled.cipher.suites' => disabled_cipher_suites, 'enabled.cipher.suites' => enabled_cipher_suites }
        )
      end
    end
  end
end
