-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties:openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties()
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
