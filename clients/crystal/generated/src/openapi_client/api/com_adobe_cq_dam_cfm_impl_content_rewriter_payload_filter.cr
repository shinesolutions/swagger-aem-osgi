require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamCfmImplContentRewriterPayloadFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, pipeline_type : String? = nil) : Response(OpenAPIClient::ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "pipeline.type" => pipeline_type },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
