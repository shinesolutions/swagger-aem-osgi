-module(openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties() ::
    #{ 'enabledActions' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'userPrivilegeNames' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'groupPrivilegeNames' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'constraint' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'enabledActions' := EnabledActions,
          'userPrivilegeNames' := UserPrivilegeNames,
          'groupPrivilegeNames' := GroupPrivilegeNames,
          'constraint' := Constraint
        }) ->
    #{ 'enabledActions' => EnabledActions,
       'userPrivilegeNames' => UserPrivilegeNames,
       'groupPrivilegeNames' => GroupPrivilegeNames,
       'constraint' => Constraint
     }.
