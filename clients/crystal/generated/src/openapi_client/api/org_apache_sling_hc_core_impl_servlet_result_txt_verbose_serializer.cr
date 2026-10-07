require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, total_width : Int32? = nil, col_width_name : Int32? = nil, col_width_result : Int32? = nil, col_width_timing : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "totalWidth" => total_width, "colWidthName" => col_width_name, "colWidthResult" => col_width_result, "colWidthTiming" => col_width_timing },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
