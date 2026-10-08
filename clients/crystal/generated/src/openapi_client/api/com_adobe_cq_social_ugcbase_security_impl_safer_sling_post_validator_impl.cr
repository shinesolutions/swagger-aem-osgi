require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, parameter_whitelist : Array(String)? = nil, parameter_whitelist_prefixes : Array(String)? = nil, binary_parameter_whitelist : Array(String)? = nil, modifier_whitelist : Array(String)? = nil, operation_whitelist : Array(String)? = nil, operation_whitelist_prefixes : Array(String)? = nil, typehint_whitelist : Array(String)? = nil, resourcetype_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "parameter.whitelist" => parameter_whitelist, "parameter.whitelist.prefixes" => parameter_whitelist_prefixes, "binary.parameter.whitelist" => binary_parameter_whitelist, "modifier.whitelist" => modifier_whitelist, "operation.whitelist" => operation_whitelist, "operation.whitelist.prefixes" => operation_whitelist_prefixes, "typehint.whitelist" => typehint_whitelist, "resourcetype.whitelist" => resourcetype_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
