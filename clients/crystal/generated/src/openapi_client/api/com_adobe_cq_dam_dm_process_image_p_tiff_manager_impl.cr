require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamDmProcessImagePTiffManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_memory : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqDamDmProcessImagePTiffManagerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamDmProcessImagePTiffManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "maxMemory" => max_memory },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
