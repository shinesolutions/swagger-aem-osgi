# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrBaseInternalLoginAdminWhitelist
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, whitelist_bypass: nil, whitelist_bundles_regexp: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist',
          type: OpenapiClient::Models::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'whitelist.bypass' => whitelist_bypass, 'whitelist.bundles.regexp' => whitelist_bundles_regexp }
        )
      end
    end
  end
end
