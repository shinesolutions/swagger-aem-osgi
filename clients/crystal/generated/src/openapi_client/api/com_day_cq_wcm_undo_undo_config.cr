require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmUndoUndoConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_wcm_undo_enabled : Bool? = nil, cq_wcm_undo_path : String? = nil, cq_wcm_undo_validity : Int32? = nil, cq_wcm_undo_steps : Int32? = nil, cq_wcm_undo_persistence : String? = nil, cq_wcm_undo_persistence_mode : Bool? = nil, cq_wcm_undo_markermode : String? = nil, cq_wcm_undo_whitelist : Array(String)? = nil, cq_wcm_undo_blacklist : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmUndoUndoConfigInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmUndoUndoConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.undo.UndoConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.wcm.undo.enabled" => cq_wcm_undo_enabled, "cq.wcm.undo.path" => cq_wcm_undo_path, "cq.wcm.undo.validity" => cq_wcm_undo_validity, "cq.wcm.undo.steps" => cq_wcm_undo_steps, "cq.wcm.undo.persistence" => cq_wcm_undo_persistence, "cq.wcm.undo.persistence.mode" => cq_wcm_undo_persistence_mode, "cq.wcm.undo.markermode" => cq_wcm_undo_markermode, "cq.wcm.undo.whitelist" => cq_wcm_undo_whitelist, "cq.wcm.undo.blacklist" => cq_wcm_undo_blacklist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
