require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, type_collections : String? = nil, type_noncollections : String? = nil, type_content : String? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "type.collections" => type_collections, "type.noncollections" => type_noncollections, "type.content" => type_content },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
