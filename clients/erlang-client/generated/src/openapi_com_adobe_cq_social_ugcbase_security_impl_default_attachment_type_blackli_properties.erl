-module(openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties() ::
    #{ 'default_attachment_type_blacklist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'baseline_attachment_type_blacklist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'default_attachment_type_blacklist' := DefaultAttachmentTypeBlacklist,
          'baseline_attachment_type_blacklist' := BaselineAttachmentTypeBlacklist
        }) ->
    #{ 'default.attachment.type.blacklist' => DefaultAttachmentTypeBlacklist,
       'baseline.attachment.type.blacklist' => BaselineAttachmentTypeBlacklist
     }.
