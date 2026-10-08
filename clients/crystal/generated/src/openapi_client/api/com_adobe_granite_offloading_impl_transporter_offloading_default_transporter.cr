require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, default_transport_agent_to_worker_prefix : String? = nil, default_transport_agent_to_master_prefix : String? = nil, default_transport_input_package : String? = nil, default_transport_output_package : String? = nil, default_transport_replication_synchronous : Bool? = nil, default_transport_contentpackage : Bool? = nil, offloading_transporter_default_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "default.transport.agent-to-worker.prefix" => default_transport_agent_to_worker_prefix, "default.transport.agent-to-master.prefix" => default_transport_agent_to_master_prefix, "default.transport.input.package" => default_transport_input_package, "default.transport.output.package" => default_transport_output_package, "default.transport.replication.synchronous" => default_transport_replication_synchronous, "default.transport.contentpackage" => default_transport_contentpackage, "offloading.transporter.default.enabled" => offloading_transporter_default_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
