# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmMsmImplActionsContentUpdateActionFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_wcm_msm_action_excludednodetypes: nil, cq_wcm_msm_action_excludedparagraphitems: nil, cq_wcm_msm_action_excludedprops: nil, cq_wcm_msm_action_ignored_mixin: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory',
          type: OpenapiClient::Models::ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.wcm.msm.action.excludednodetypes' => cq_wcm_msm_action_excludednodetypes, 'cq.wcm.msm.action.excludedparagraphitems' => cq_wcm_msm_action_excludedparagraphitems, 'cq.wcm.msm.action.excludedprops' => cq_wcm_msm_action_excludedprops, 'cq.wcm.msm.action.ignoredMixin' => cq_wcm_msm_action_ignored_mixin }
        )
      end
    end
  end
end
