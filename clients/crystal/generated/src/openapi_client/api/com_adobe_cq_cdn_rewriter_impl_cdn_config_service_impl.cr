require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqCdnRewriterImplCDNConfigServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cdn_config_distribution_domain : String? = nil, cdn_config_enable_rewriting : Bool? = nil, cdn_config_path_prefixes : Array(String)? = nil, cdn_config_cdnttl : Int32? = nil, cdn_config_application_protocol : String? = nil) : Response(OpenAPIClient::ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cdn.config.distribution.domain" => cdn_config_distribution_domain, "cdn.config.enable.rewriting" => cdn_config_enable_rewriting, "cdn.config.path.prefixes" => cdn_config_path_prefixes, "cdn.config.cdnttl" => cdn_config_cdnttl, "cdn.config.application.protocol" => cdn_config_application_protocol },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
