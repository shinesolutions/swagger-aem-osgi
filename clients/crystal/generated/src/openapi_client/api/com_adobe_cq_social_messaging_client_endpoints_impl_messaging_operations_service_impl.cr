require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, message_properties : Array(String)? = nil, message_box_size_limit : Int32? = nil, message_count_limit : Int32? = nil, notify_failure : Bool? = nil, failure_message_from : String? = nil, failure_template_path : String? = nil, max_retries : Int32? = nil, min_wait_between_retries : Int32? = nil, count_update_pool_size : Int32? = nil, inbox_path : String? = nil, sentitems_path : String? = nil, support_attachments : Bool? = nil, support_group_messaging : Bool? = nil, max_total_recipients : Int32? = nil, batch_size : Int32? = nil, max_total_attachment_size : Int32? = nil, attachment_type_blacklist : Array(String)? = nil, allowed_attachment_types : Array(String)? = nil, service_selector : String? = nil, field_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "message.properties" => message_properties, "messageBoxSizeLimit" => message_box_size_limit, "messageCountLimit" => message_count_limit, "notifyFailure" => notify_failure, "failureMessageFrom" => failure_message_from, "failureTemplatePath" => failure_template_path, "maxRetries" => max_retries, "minWaitBetweenRetries" => min_wait_between_retries, "countUpdatePoolSize" => count_update_pool_size, "inbox.path" => inbox_path, "sentitems.path" => sentitems_path, "supportAttachments" => support_attachments, "supportGroupMessaging" => support_group_messaging, "maxTotalRecipients" => max_total_recipients, "batchSize" => batch_size, "maxTotalAttachmentSize" => max_total_attachment_size, "attachmentTypeBlacklist" => attachment_type_blacklist, "allowedAttachmentTypes" => allowed_attachment_types, "serviceSelector" => service_selector, "fieldWhitelist" => field_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
