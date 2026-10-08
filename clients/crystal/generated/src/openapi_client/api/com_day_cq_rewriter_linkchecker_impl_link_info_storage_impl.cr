require "json"

module OpenAPIClient
  module Api
  class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_max_links_per_host : Int32? = nil, service_save_external_link_references : Bool? = nil) : Response(OpenAPIClient::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo)
      @conn.request(OpenAPIClient::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.max_links_per_host" => service_max_links_per_host, "service.save_external_link_references" => service_save_external_link_references },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
