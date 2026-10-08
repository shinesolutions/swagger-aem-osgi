#ifndef config_node_property_boolean_TEST
#define config_node_property_boolean_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define config_node_property_boolean_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/config_node_property_boolean.h"
config_node_property_boolean_t* instantiate_config_node_property_boolean(int include_optional);



config_node_property_boolean_t* instantiate_config_node_property_boolean(int include_optional) {
  config_node_property_boolean_t* config_node_property_boolean = NULL;
  if (include_optional) {
    config_node_property_boolean = config_node_property_boolean_create(
      "0",
      1,
      1,
      56,
      1,
      "0"
    );
  } else {
    config_node_property_boolean = config_node_property_boolean_create(
      "0",
      1,
      1,
      56,
      1,
      "0"
    );
  }

  return config_node_property_boolean;
}


#ifdef config_node_property_boolean_MAIN

void test_config_node_property_boolean(int include_optional) {
    config_node_property_boolean_t* config_node_property_boolean_1 = instantiate_config_node_property_boolean(include_optional);

	cJSON* jsonconfig_node_property_boolean_1 = config_node_property_boolean_convertToJSON(config_node_property_boolean_1);
	printf("config_node_property_boolean :\n%s\n", cJSON_Print(jsonconfig_node_property_boolean_1));
	config_node_property_boolean_t* config_node_property_boolean_2 = config_node_property_boolean_parseFromJSON(jsonconfig_node_property_boolean_1);
	cJSON* jsonconfig_node_property_boolean_2 = config_node_property_boolean_convertToJSON(config_node_property_boolean_2);
	printf("repeating config_node_property_boolean:\n%s\n", cJSON_Print(jsonconfig_node_property_boolean_2));
}

int main() {
  test_config_node_property_boolean(1);
  test_config_node_property_boolean(0);

  printf("Hello world \n");
  return 0;
}

#endif // config_node_property_boolean_MAIN
#endif // config_node_property_boolean_TEST
