require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqCdnRewriterImplCDNRewriter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, cdnrewriter_attributes : Array(String)? = nil, cdn_rewriter_distribution_domain : String? = nil) : Response(OpenAPIClient::ComAdobeCqCdnRewriterImplCDNRewriterInfo)
      @conn.request(OpenAPIClient::ComAdobeCqCdnRewriterImplCDNRewriterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "cdnrewriter.attributes" => cdnrewriter_attributes, "cdn.rewriter.distribution.domain" => cdn_rewriter_distribution_domain },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
