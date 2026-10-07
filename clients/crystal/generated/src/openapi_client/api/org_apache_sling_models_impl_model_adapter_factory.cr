require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingModelsImplModelAdapterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, osgi_http_whiteboard_listener : String? = nil, osgi_http_whiteboard_context_select : String? = nil, max_recursion_depth : Int32? = nil, cleanup_job_period : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingModelsImplModelAdapterFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingModelsImplModelAdapterFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "osgi.http.whiteboard.listener" => osgi_http_whiteboard_listener, "osgi.http.whiteboard.context.select" => osgi_http_whiteboard_context_select, "max.recursion.depth" => max_recursion_depth, "cleanup.job.period" => cleanup_job_period },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
