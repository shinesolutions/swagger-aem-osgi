require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmMsmImplActionsPageMoveActionFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_wcm_msm_action_excludednodetypes : Array(String)? = nil, cq_wcm_msm_action_excludedparagraphitems : Array(String)? = nil, cq_wcm_msm_action_excludedprops : Array(String)? = nil, cq_wcm_msm_impl_actions_pagemove_prop_reference_update : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.wcm.msm.action.excludednodetypes" => cq_wcm_msm_action_excludednodetypes, "cq.wcm.msm.action.excludedparagraphitems" => cq_wcm_msm_action_excludedparagraphitems, "cq.wcm.msm.action.excludedprops" => cq_wcm_msm_action_excludedprops, "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate" => cq_wcm_msm_impl_actions_pagemove_prop_reference_update },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
