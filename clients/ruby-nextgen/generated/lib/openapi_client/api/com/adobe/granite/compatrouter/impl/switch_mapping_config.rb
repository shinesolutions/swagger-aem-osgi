# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteCompatrouterImplSwitchMappingConfig
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, group: nil, ids: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig',
          type: OpenapiClient::Models::ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'group' => group, 'ids' => ids }
        )
      end
    end
  end
end
