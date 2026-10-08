require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, mime_types : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "mime.types" => mime_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
