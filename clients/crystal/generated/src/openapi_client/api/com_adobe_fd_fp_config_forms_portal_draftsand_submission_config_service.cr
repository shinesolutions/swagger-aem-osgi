require "json"

module OpenAPIClient
  module Api
  class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, portal_outboxes : Array(String)? = nil, draft_data_service : String? = nil, draft_metadata_service : String? = nil, submit_data_service : String? = nil, submit_metadata_service : String? = nil, pending_sign_data_service : String? = nil, pending_sign_metadata_service : String? = nil) : Response(OpenAPIClient::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "portal.outboxes" => portal_outboxes, "draft.data.service" => draft_data_service, "draft.metadata.service" => draft_metadata_service, "submit.data.service" => submit_data_service, "submit.metadata.service" => submit_metadata_service, "pendingSign.data.service" => pending_sign_data_service, "pendingSign.metadata.service" => pending_sign_metadata_service },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
