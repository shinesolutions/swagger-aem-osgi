-module(openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties/0]).

-type openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties() ::
    #{ 'fieldWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'attachmentTypeBlacklist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'fieldWhitelist' := FieldWhitelist,
          'attachmentTypeBlacklist' := AttachmentTypeBlacklist
        }) ->
    #{ 'fieldWhitelist' => FieldWhitelist,
       'attachmentTypeBlacklist' => AttachmentTypeBlacklist
     }.
