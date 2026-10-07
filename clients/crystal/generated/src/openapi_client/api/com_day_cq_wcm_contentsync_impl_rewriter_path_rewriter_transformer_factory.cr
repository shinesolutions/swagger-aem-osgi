require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_contentsync_pathrewritertransformer_mapping_links : Array(String)? = nil, cq_contentsync_pathrewritertransformer_mapping_clientlibs : Array(String)? = nil, cq_contentsync_pathrewritertransformer_mapping_images : Array(String)? = nil, cq_contentsync_pathrewritertransformer_attribute_pattern : String? = nil, cq_contentsync_pathrewritertransformer_clientlibrary_pattern : String? = nil, cq_contentsync_pathrewritertransformer_clientlibrary_replace : String? = nil) : Response(OpenAPIClient::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.contentsync.pathrewritertransformer.mapping.links" => cq_contentsync_pathrewritertransformer_mapping_links, "cq.contentsync.pathrewritertransformer.mapping.clientlibs" => cq_contentsync_pathrewritertransformer_mapping_clientlibs, "cq.contentsync.pathrewritertransformer.mapping.images" => cq_contentsync_pathrewritertransformer_mapping_images, "cq.contentsync.pathrewritertransformer.attribute.pattern" => cq_contentsync_pathrewritertransformer_attribute_pattern, "cq.contentsync.pathrewritertransformer.clientlibrary.pattern" => cq_contentsync_pathrewritertransformer_clientlibrary_pattern, "cq.contentsync.pathrewritertransformer.clientlibrary.replace" => cq_contentsync_pathrewritertransformer_clientlibrary_replace },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
