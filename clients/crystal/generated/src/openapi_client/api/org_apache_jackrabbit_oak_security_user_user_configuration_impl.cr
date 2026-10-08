require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, users_path : String? = nil, groups_path : String? = nil, system_relative_path : String? = nil, default_depth : Int32? = nil, import_behavior : String? = nil, password_hash_algorithm : String? = nil, password_hash_iterations : Int32? = nil, password_salt_size : Int32? = nil, omit_admin_pw : Bool? = nil, support_auto_save : Bool? = nil, password_max_age : Int32? = nil, initial_password_change : Bool? = nil, password_history_size : Int32? = nil, password_expiry_for_admin : Bool? = nil, cache_expiration : Int32? = nil, enable_rfc7613_usercase_mapped_profile : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "usersPath" => users_path, "groupsPath" => groups_path, "systemRelativePath" => system_relative_path, "defaultDepth" => default_depth, "importBehavior" => import_behavior, "passwordHashAlgorithm" => password_hash_algorithm, "passwordHashIterations" => password_hash_iterations, "passwordSaltSize" => password_salt_size, "omitAdminPw" => omit_admin_pw, "supportAutoSave" => support_auto_save, "passwordMaxAge" => password_max_age, "initialPasswordChange" => initial_password_change, "passwordHistorySize" => password_history_size, "passwordExpiryForAdmin" => password_expiry_for_admin, "cacheExpiration" => cache_expiration, "enableRFC7613UsercaseMappedProfile" => enable_rfc7613_usercase_mapped_profile },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
