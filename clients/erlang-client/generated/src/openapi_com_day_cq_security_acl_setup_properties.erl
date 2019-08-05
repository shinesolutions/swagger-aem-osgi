-module(openapi_com_day_cq_security_acl_setup_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_security_acl_setup_properties/0]).

-type openapi_com_day_cq_security_acl_setup_properties() ::
    #{ 'cq_aclsetup_rules' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_aclsetup_rules' := CqAclsetupRules
        }) ->
    #{ 'cq.aclsetup.rules' => CqAclsetupRules
     }.
