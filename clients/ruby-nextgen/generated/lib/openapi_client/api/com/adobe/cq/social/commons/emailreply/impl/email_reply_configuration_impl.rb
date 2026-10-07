# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, email_name: nil, email_create_post_from_reply: nil, email_add_comment_id_to: nil, email_subject_maximum_length: nil, email_reply_to_address: nil, email_reply_to_delimiter: nil, email_tracker_id_prefix_in_subject: nil, email_tracker_id_prefix_in_body: nil, email_as_html: nil, email_default_user_name: nil, email_templates_root_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigH77a884b2,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'email.name' => email_name, 'email.createPostFromReply' => email_create_post_from_reply, 'email.addCommentIdTo' => email_add_comment_id_to, 'email.subjectMaximumLength' => email_subject_maximum_length, 'email.replyToAddress' => email_reply_to_address, 'email.replyToDelimiter' => email_reply_to_delimiter, 'email.trackerIdPrefixInSubject' => email_tracker_id_prefix_in_subject, 'email.trackerIdPrefixInBody' => email_tracker_id_prefix_in_body, 'email.asHTML' => email_as_html, 'email.defaultUserName' => email_default_user_name, 'email.templates.rootPath' => email_templates_root_path }
        )
      end
    end
  end
end
