-module(openapi_org_apache_sling_featureflags_impl_configured_feature_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_featureflags_impl_configured_feature_info/0]).

-type openapi_org_apache_sling_featureflags_impl_configured_feature_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_featureflags_impl_configured_feature_properties:openapi_org_apache_sling_featureflags_impl_configured_feature_properties()
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
