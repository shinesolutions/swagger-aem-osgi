require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplUtilsDefaultPageNameValidator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, non_valid_chars : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "nonValidChars" => non_valid_chars },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
