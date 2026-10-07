# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, handler_name: nil, user_expiration_time: nil, user_auto_membership: nil, user_property_mapping: nil, user_path_prefix: nil, user_membership_exp_time: nil, user_membership_nesting_depth: nil, user_dynamic_membership: nil, user_disable_missing: nil, group_expiration_time: nil, group_auto_membership: nil, group_property_mapping: nil, group_path_prefix: nil, enable_rfc7613_usercase_mapped_profile: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalHb74914c5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'handler.name' => handler_name, 'user.expirationTime' => user_expiration_time, 'user.autoMembership' => user_auto_membership, 'user.propertyMapping' => user_property_mapping, 'user.pathPrefix' => user_path_prefix, 'user.membershipExpTime' => user_membership_exp_time, 'user.membershipNestingDepth' => user_membership_nesting_depth, 'user.dynamicMembership' => user_dynamic_membership, 'user.disableMissing' => user_disable_missing, 'group.expirationTime' => group_expiration_time, 'group.autoMembership' => group_auto_membership, 'group.propertyMapping' => group_property_mapping, 'group.pathPrefix' => group_path_prefix, 'enableRFC7613UsercaseMappedProfile' => enable_rfc7613_usercase_mapped_profile }
        )
      end
    end
  end
end
