require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplProcessTextExtractionProcess
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, mime_types : Array(String)? = nil, max_extract : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplProcessTextExtractionProcessInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplProcessTextExtractionProcessInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "mimeTypes" => mime_types, "maxExtract" => max_extract },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
