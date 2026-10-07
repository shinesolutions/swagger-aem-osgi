require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamWebdavImplIoAssetIOHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, path_prefix : String? = nil, create_version : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "pathPrefix" => path_prefix, "createVersion" => create_version },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
