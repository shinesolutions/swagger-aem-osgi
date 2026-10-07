-module(openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_info/0]).

-type openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties:openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_properties()
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
