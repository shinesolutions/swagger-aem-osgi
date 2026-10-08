-module(openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties/0]).

-export([openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties/1]).

-export_type([openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties/0]).

-type openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties() ::
  [ {'message_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'messageBoxSizeLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'messageCountLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'notifyFailure', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'failureMessageFrom', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'failureTemplatePath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'maxRetries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'minWaitBetweenRetries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'countUpdatePoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'inbox_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sentitems_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'supportAttachments', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'supportGroupMessaging', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'maxTotalRecipients', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'batchSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxTotalAttachmentSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'attachmentTypeBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'allowedAttachmentTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'serviceSelector', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties() ->
    openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties([]).

openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties(Fields) ->
  Default = [ {'message.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'messageBoxSizeLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'messageCountLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'notifyFailure', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'failureMessageFrom', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'failureTemplatePath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'maxRetries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'minWaitBetweenRetries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'countUpdatePoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'inbox.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sentitems.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'supportAttachments', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'supportGroupMessaging', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'maxTotalRecipients', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'batchSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxTotalAttachmentSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'attachmentTypeBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'allowedAttachmentTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'serviceSelector', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

