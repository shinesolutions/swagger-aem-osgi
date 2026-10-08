-module(openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties/0]).

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties() ::
  [ {'email_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'email_createPostFromReply', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'email_addCommentIdTo', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'email_subjectMaximumLength', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'email_replyToAddress', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'email_replyToDelimiter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'email_trackerIdPrefixInSubject', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'email_trackerIdPrefixInBody', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'email_asHTML', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'email_defaultUserName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'email_templates_rootPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties() ->
    openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties([]).

openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties(Fields) ->
  Default = [ {'email.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'email.createPostFromReply', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'email.addCommentIdTo', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'email.subjectMaximumLength', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'email.replyToAddress', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'email.replyToDelimiter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'email.trackerIdPrefixInSubject', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'email.trackerIdPrefixInBody', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'email.asHTML', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'email.defaultUserName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'email.templates.rootPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

