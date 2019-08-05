-module(openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties() ::
    #{ 'context_path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'context_path' := ContextPath
        }) ->
    #{ 'context.path' => ContextPath
     }.
