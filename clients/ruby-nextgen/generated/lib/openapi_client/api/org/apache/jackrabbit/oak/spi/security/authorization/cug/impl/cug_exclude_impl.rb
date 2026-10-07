# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcludeImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, principal_names: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCHd827ad31,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'principalNames' => principal_names }
        )
      end
    end
  end
end
