require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, payload_move_white_list : Array(String)? = nil, payload_move_handle_from_workflow_process : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "payload.move.white.list" => payload_move_white_list, "payload.move.handle.from.workflow.process" => payload_move_handle_from_workflow_process },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
