require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, filepattern : String? = nil, device_groups : Array(String)? = nil, build_page_nodes : Bool? = nil, build_client_libs : Bool? = nil, build_canvas_component : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "filepattern" => filepattern, "device.groups" => device_groups, "build.page.nodes" => build_page_nodes, "build.client.libs" => build_client_libs, "build.canvas.component" => build_canvas_component },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
