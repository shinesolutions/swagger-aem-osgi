# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, portal_outboxes: nil, draft_data_service: nil, draft_metadata_service: nil, submit_data_service: nil, submit_metadata_service: nil, pending_sign_data_service: nil, pending_sign_metadata_service: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService',
          type: OpenapiClient::Models::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfiHe3a2ce06,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'portal.outboxes' => portal_outboxes, 'draft.data.service' => draft_data_service, 'draft.metadata.service' => draft_metadata_service, 'submit.data.service' => submit_data_service, 'submit.metadata.service' => submit_metadata_service, 'pendingSign.data.service' => pending_sign_data_service, 'pendingSign.metadata.service' => pending_sign_metadata_service }
        )
      end
    end
  end
end
