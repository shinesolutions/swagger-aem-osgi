-module(openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se_properties/0]).

-type openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se_properties() ::
    #{ 'fieldWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'attachmentTypeBlacklist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'fieldWhitelist' := FieldWhitelist,
          'attachmentTypeBlacklist' := AttachmentTypeBlacklist
        }) ->
    #{ 'fieldWhitelist' => FieldWhitelist,
       'attachmentTypeBlacklist' => AttachmentTypeBlacklist
     }.
