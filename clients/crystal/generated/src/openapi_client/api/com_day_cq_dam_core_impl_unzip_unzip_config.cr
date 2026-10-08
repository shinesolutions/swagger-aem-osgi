require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplUnzipUnzipConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_config_unzip_maxuncompressedsize : Int32? = nil, cq_dam_config_unzip_encoding : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplUnzipUnzipConfigInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplUnzipUnzipConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.config.unzip.maxuncompressedsize" => cq_dam_config_unzip_maxuncompressedsize, "cq.dam.config.unzip.encoding" => cq_dam_config_unzip_encoding },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
