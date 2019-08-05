-module(openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties() ::
    #{ 'email_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'email_createPostFromReply' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'email_addCommentIdTo' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'email_subjectMaximumLength' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'email_replyToAddress' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'email_replyToDelimiter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'email_trackerIdPrefixInSubject' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'email_trackerIdPrefixInBody' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'email_asHTML' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'email_defaultUserName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'email_templates_rootPath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'email_name' := EmailName,
          'email_createPostFromReply' := EmailCreatePostFromReply,
          'email_addCommentIdTo' := EmailAddCommentIdTo,
          'email_subjectMaximumLength' := EmailSubjectMaximumLength,
          'email_replyToAddress' := EmailReplyToAddress,
          'email_replyToDelimiter' := EmailReplyToDelimiter,
          'email_trackerIdPrefixInSubject' := EmailTrackerIdPrefixInSubject,
          'email_trackerIdPrefixInBody' := EmailTrackerIdPrefixInBody,
          'email_asHTML' := EmailAsHTML,
          'email_defaultUserName' := EmailDefaultUserName,
          'email_templates_rootPath' := EmailTemplatesRootPath
        }) ->
    #{ 'email.name' => EmailName,
       'email.createPostFromReply' => EmailCreatePostFromReply,
       'email.addCommentIdTo' => EmailAddCommentIdTo,
       'email.subjectMaximumLength' => EmailSubjectMaximumLength,
       'email.replyToAddress' => EmailReplyToAddress,
       'email.replyToDelimiter' => EmailReplyToDelimiter,
       'email.trackerIdPrefixInSubject' => EmailTrackerIdPrefixInSubject,
       'email.trackerIdPrefixInBody' => EmailTrackerIdPrefixInBody,
       'email.asHTML' => EmailAsHTML,
       'email.defaultUserName' => EmailDefaultUserName,
       'email.templates.rootPath' => EmailTemplatesRootPath
     }.
