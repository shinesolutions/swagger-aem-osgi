#ifndef config_node_property_string_TEST
#define config_node_property_string_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define config_node_property_string_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/config_node_property_string.h"
config_node_property_string_t* instantiate_config_node_property_string(int include_optional);



config_node_property_string_t* instantiate_config_node_property_string(int include_optional) {
  config_node_property_string_t* config_node_property_string = NULL;
  if (include_optional) {
    config_node_property_string = config_node_property_string_create(
      "0",
      1,
      1,
      56,
      "0",
      "0"
    );
  } else {
    config_node_property_string = config_node_property_string_create(
      "0",
      1,
      1,
      56,
      "0",
      "0"
    );
  }

  return config_node_property_string;
}


#ifdef config_node_property_string_MAIN

void test_config_node_property_string(int include_optional) {
    config_node_property_string_t* config_node_property_string_1 = instantiate_config_node_property_string(include_optional);

	cJSON* jsonconfig_node_property_string_1 = config_node_property_string_convertToJSON(config_node_property_string_1);
	printf("config_node_property_string :\n%s\n", cJSON_Print(jsonconfig_node_property_string_1));
	config_node_property_string_t* config_node_property_string_2 = config_node_property_string_parseFromJSON(jsonconfig_node_property_string_1);
	cJSON* jsonconfig_node_property_string_2 = config_node_property_string_convertToJSON(config_node_property_string_2);
	printf("repeating config_node_property_string:\n%s\n", cJSON_Print(jsonconfig_node_property_string_2));
}

int main() {
  test_config_node_property_string(1);
  test_config_node_property_string(0);

  printf("Hello world \n");
  return 0;
}

#endif // config_node_property_string_MAIN
#endif // config_node_property_string_TEST
