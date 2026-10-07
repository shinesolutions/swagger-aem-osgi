-module(openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties() ::
    #{ 'automoderation_sequence' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'automoderation_onfailurestop' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'automoderation_sequence' := AutomoderationSequence,
          'automoderation_onfailurestop' := AutomoderationOnfailurestop
        }) ->
    #{ 'automoderation.sequence' => AutomoderationSequence,
       'automoderation.onfailurestop' => AutomoderationOnfailurestop
     }.
