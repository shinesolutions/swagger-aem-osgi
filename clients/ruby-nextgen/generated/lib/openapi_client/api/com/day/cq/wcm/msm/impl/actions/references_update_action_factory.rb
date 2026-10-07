# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_wcm_msm_action_excludednodetypes: nil, cq_wcm_msm_action_excludedparagraphitems: nil, cq_wcm_msm_action_excludedprops: nil, cq_wcm_msm_impl_action_referencesupdate_prop_update_nested: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory',
          type: OpenapiClient::Models::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.wcm.msm.action.excludednodetypes' => cq_wcm_msm_action_excludednodetypes, 'cq.wcm.msm.action.excludedparagraphitems' => cq_wcm_msm_action_excludedparagraphitems, 'cq.wcm.msm.action.excludedprops' => cq_wcm_msm_action_excludedprops, 'cq.wcm.msm.impl.action.referencesupdate.prop_updateNested' => cq_wcm_msm_impl_action_referencesupdate_prop_update_nested }
        )
      end
    end
  end
end
