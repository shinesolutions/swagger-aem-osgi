# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, message_properties: nil, message_box_size_limit: nil, message_count_limit: nil, notify_failure: nil, failure_message_from: nil, failure_template_path: nil, max_retries: nil, min_wait_between_retries: nil, count_update_pool_size: nil, inbox_path: nil, sentitems_path: nil, support_attachments: nil, support_group_messaging: nil, max_total_recipients: nil, batch_size: nil, max_total_attachment_size: nil, attachment_type_blacklist: nil, allowed_attachment_types: nil, service_selector: nil, field_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOH89fa48a2,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'message.properties' => message_properties, 'messageBoxSizeLimit' => message_box_size_limit, 'messageCountLimit' => message_count_limit, 'notifyFailure' => notify_failure, 'failureMessageFrom' => failure_message_from, 'failureTemplatePath' => failure_template_path, 'maxRetries' => max_retries, 'minWaitBetweenRetries' => min_wait_between_retries, 'countUpdatePoolSize' => count_update_pool_size, 'inbox.path' => inbox_path, 'sentitems.path' => sentitems_path, 'supportAttachments' => support_attachments, 'supportGroupMessaging' => support_group_messaging, 'maxTotalRecipients' => max_total_recipients, 'batchSize' => batch_size, 'maxTotalAttachmentSize' => max_total_attachment_size, 'attachmentTypeBlacklist' => attachment_type_blacklist, 'allowedAttachmentTypes' => allowed_attachment_types, 'serviceSelector' => service_selector, 'fieldWhitelist' => field_whitelist }
        )
      end
    end
  end
end
