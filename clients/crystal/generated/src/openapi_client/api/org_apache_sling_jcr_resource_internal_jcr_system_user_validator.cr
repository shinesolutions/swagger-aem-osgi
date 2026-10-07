require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrResourceInternalJcrSystemUserValidator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, allow_only_system_user : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "allow.only.system.user" => allow_only_system_user },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
