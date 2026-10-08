require "json"

module OpenAPIClient
  module Api
  class ApacheSlingHealthCheckResultHTMLSerializer
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, style_string : String? = nil) : Response(OpenAPIClient::ApacheSlingHealthCheckResultHTMLSerializerInfo)
      @conn.request(OpenAPIClient::ApacheSlingHealthCheckResultHTMLSerializerInfo,
        method: :POST,
        path: "/system/console/configMgr/Apache Sling Health Check Result HTML Serializer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "styleString" => style_string },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
