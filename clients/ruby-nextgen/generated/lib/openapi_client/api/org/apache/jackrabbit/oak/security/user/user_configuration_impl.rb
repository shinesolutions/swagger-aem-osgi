# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, users_path: nil, groups_path: nil, system_relative_path: nil, default_depth: nil, import_behavior: nil, password_hash_algorithm: nil, password_hash_iterations: nil, password_salt_size: nil, omit_admin_pw: nil, support_auto_save: nil, password_max_age: nil, initial_password_change: nil, password_history_size: nil, password_expiry_for_admin: nil, cache_expiration: nil, enable_rfc7613_usercase_mapped_profile: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'usersPath' => users_path, 'groupsPath' => groups_path, 'systemRelativePath' => system_relative_path, 'defaultDepth' => default_depth, 'importBehavior' => import_behavior, 'passwordHashAlgorithm' => password_hash_algorithm, 'passwordHashIterations' => password_hash_iterations, 'passwordSaltSize' => password_salt_size, 'omitAdminPw' => omit_admin_pw, 'supportAutoSave' => support_auto_save, 'passwordMaxAge' => password_max_age, 'initialPasswordChange' => initial_password_change, 'passwordHistorySize' => password_history_size, 'passwordExpiryForAdmin' => password_expiry_for_admin, 'cacheExpiration' => cache_expiration, 'enableRFC7613UsercaseMappedProfile' => enable_rfc7613_usercase_mapped_profile }
        )
      end
    end
  end
end
