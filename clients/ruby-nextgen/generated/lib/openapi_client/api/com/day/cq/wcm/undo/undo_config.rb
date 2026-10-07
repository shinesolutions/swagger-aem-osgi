# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmUndoUndoConfig
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_wcm_undo_enabled: nil, cq_wcm_undo_path: nil, cq_wcm_undo_validity: nil, cq_wcm_undo_steps: nil, cq_wcm_undo_persistence: nil, cq_wcm_undo_persistence_mode: nil, cq_wcm_undo_markermode: nil, cq_wcm_undo_whitelist: nil, cq_wcm_undo_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.undo.UndoConfig',
          type: OpenapiClient::Models::ComDayCqWcmUndoUndoConfigInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.wcm.undo.enabled' => cq_wcm_undo_enabled, 'cq.wcm.undo.path' => cq_wcm_undo_path, 'cq.wcm.undo.validity' => cq_wcm_undo_validity, 'cq.wcm.undo.steps' => cq_wcm_undo_steps, 'cq.wcm.undo.persistence' => cq_wcm_undo_persistence, 'cq.wcm.undo.persistence.mode' => cq_wcm_undo_persistence_mode, 'cq.wcm.undo.markermode' => cq_wcm_undo_markermode, 'cq.wcm.undo.whitelist' => cq_wcm_undo_whitelist, 'cq.wcm.undo.blacklist' => cq_wcm_undo_blacklist }
        )
      end
    end
  end
end
