#ifndef org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_TEST
#define org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties.h"
org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t* instantiate_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties(int include_optional);

#include "test_config_node_property_string.c"
#include "test_config_node_property_string.c"
#include "test_config_node_property_boolean.c"
#include "test_config_node_property_integer.c"
#include "test_config_node_property_string.c"
#include "test_config_node_property_integer.c"
#include "test_config_node_property_integer.c"


org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t* instantiate_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties(int include_optional) {
  org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t* org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties = NULL;
  if (include_optional) {
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties = org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_create(
       // false, not to have infinite recursion
      instantiate_config_node_property_string(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_string(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_boolean(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_integer(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_string(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_integer(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_integer(0)
    );
  } else {
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties = org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_create(
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties;
}


#ifdef org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_MAIN

void test_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties(int include_optional) {
    org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t* org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_1 = instantiate_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties(include_optional);

	cJSON* jsonorg_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_1 = org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_1);
	printf("org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties :\n%s\n", cJSON_Print(jsonorg_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_1));
	org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_t* org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_2 = org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_parseFromJSON(jsonorg_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_1);
	cJSON* jsonorg_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_2 = org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_convertToJSON(org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_2);
	printf("repeating org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties:\n%s\n", cJSON_Print(jsonorg_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_2));
}

int main() {
  test_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties(1);
  test_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_MAIN
#endif // org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties_TEST
