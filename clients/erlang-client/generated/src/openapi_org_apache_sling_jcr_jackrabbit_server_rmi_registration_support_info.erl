-module(openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info/0]).

-type openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties:openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties()
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
