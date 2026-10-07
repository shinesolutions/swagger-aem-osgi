require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamS7imagingImplIsImageServerComponent
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, tcp_port : String? = nil, allow_remote_access : Bool? = nil, max_render_rgn_pixels : String? = nil, max_message_size : String? = nil, random_access_url_timeout : Int32? = nil, worker_threads : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqDamS7imagingImplIsImageServerComponentInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamS7imagingImplIsImageServerComponentInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "TcpPort" => tcp_port, "AllowRemoteAccess" => allow_remote_access, "MaxRenderRgnPixels" => max_render_rgn_pixels, "MaxMessageSize" => max_message_size, "RandomAccessUrlTimeout" => random_access_url_timeout, "WorkerThreads" => worker_threads },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
