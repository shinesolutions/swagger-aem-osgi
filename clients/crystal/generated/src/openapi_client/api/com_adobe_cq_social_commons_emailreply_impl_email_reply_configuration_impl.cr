require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, email_name : String? = nil, email_create_post_from_reply : Bool? = nil, email_add_comment_id_to : String? = nil, email_subject_maximum_length : Int32? = nil, email_reply_to_address : String? = nil, email_reply_to_delimiter : String? = nil, email_tracker_id_prefix_in_subject : String? = nil, email_tracker_id_prefix_in_body : String? = nil, email_as_html : Bool? = nil, email_default_user_name : String? = nil, email_templates_root_path : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "email.name" => email_name, "email.createPostFromReply" => email_create_post_from_reply, "email.addCommentIdTo" => email_add_comment_id_to, "email.subjectMaximumLength" => email_subject_maximum_length, "email.replyToAddress" => email_reply_to_address, "email.replyToDelimiter" => email_reply_to_delimiter, "email.trackerIdPrefixInSubject" => email_tracker_id_prefix_in_subject, "email.trackerIdPrefixInBody" => email_tracker_id_prefix_in_body, "email.asHTML" => email_as_html, "email.defaultUserName" => email_default_user_name, "email.templates.rootPath" => email_templates_root_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
