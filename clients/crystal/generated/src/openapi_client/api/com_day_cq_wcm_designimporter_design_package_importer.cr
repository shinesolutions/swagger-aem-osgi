require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmDesignimporterDesignPackageImporter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, extract_filter : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmDesignimporterDesignPackageImporterInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmDesignimporterDesignPackageImporterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "extract.filter" => extract_filter },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
