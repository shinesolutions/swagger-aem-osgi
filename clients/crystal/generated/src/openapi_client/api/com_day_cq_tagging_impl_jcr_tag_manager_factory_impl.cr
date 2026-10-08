require "json"

module OpenAPIClient
  module Api
  class ComDayCqTaggingImplJcrTagManagerFactoryImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, validation_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqTaggingImplJcrTagManagerFactoryImplInfo)
      @conn.request(OpenAPIClient::ComDayCqTaggingImplJcrTagManagerFactoryImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "validation.enabled" => validation_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
