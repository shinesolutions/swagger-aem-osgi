require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigurationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, token_expiration : String? = nil, token_length : String? = nil, token_refresh : Bool? = nil, token_cleanup_threshold : Int32? = nil, password_hash_algorithm : String? = nil, password_hash_iterations : Int32? = nil, password_salt_size : Int32? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "tokenExpiration" => token_expiration, "tokenLength" => token_length, "tokenRefresh" => token_refresh, "tokenCleanupThreshold" => token_cleanup_threshold, "passwordHashAlgorithm" => password_hash_algorithm, "passwordHashIterations" => password_hash_iterations, "passwordSaltSize" => password_salt_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
