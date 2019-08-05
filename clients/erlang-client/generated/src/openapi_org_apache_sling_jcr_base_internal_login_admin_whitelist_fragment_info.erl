-module(openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info/0]).

-type openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties:openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties()
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
