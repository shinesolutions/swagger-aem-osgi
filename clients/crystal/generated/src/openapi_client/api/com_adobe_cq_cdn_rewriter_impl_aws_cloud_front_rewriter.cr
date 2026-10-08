require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, keypair_id : String? = nil, keypair_alias : String? = nil, cdnrewriter_attributes : Array(String)? = nil, cdn_rewriter_distribution_domain : String? = nil) : Response(OpenAPIClient::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo)
      @conn.request(OpenAPIClient::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "keypair.id" => keypair_id, "keypair.alias" => keypair_alias, "cdnrewriter.attributes" => cdnrewriter_attributes, "cdn.rewriter.distribution.domain" => cdn_rewriter_distribution_domain },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
