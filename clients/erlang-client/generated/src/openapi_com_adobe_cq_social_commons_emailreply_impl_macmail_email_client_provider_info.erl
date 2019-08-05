-module(openapi_com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider_info/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider_properties:openapi_com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
