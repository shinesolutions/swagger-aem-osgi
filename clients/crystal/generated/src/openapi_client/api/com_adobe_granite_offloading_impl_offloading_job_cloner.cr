require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOffloadingImplOffloadingJobCloner
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, offloading_jobcloner_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "offloading.jobcloner.enabled" => offloading_jobcloner_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
