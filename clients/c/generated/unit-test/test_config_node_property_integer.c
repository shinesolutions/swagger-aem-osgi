#ifndef config_node_property_integer_TEST
#define config_node_property_integer_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define config_node_property_integer_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/config_node_property_integer.h"
config_node_property_integer_t* instantiate_config_node_property_integer(int include_optional);



config_node_property_integer_t* instantiate_config_node_property_integer(int include_optional) {
  config_node_property_integer_t* config_node_property_integer = NULL;
  if (include_optional) {
    config_node_property_integer = config_node_property_integer_create(
      "0",
      1,
      1,
      56,
      56,
      "0"
    );
  } else {
    config_node_property_integer = config_node_property_integer_create(
      "0",
      1,
      1,
      56,
      56,
      "0"
    );
  }

  return config_node_property_integer;
}


#ifdef config_node_property_integer_MAIN

void test_config_node_property_integer(int include_optional) {
    config_node_property_integer_t* config_node_property_integer_1 = instantiate_config_node_property_integer(include_optional);

	cJSON* jsonconfig_node_property_integer_1 = config_node_property_integer_convertToJSON(config_node_property_integer_1);
	printf("config_node_property_integer :\n%s\n", cJSON_Print(jsonconfig_node_property_integer_1));
	config_node_property_integer_t* config_node_property_integer_2 = config_node_property_integer_parseFromJSON(jsonconfig_node_property_integer_1);
	cJSON* jsonconfig_node_property_integer_2 = config_node_property_integer_convertToJSON(config_node_property_integer_2);
	printf("repeating config_node_property_integer:\n%s\n", cJSON_Print(jsonconfig_node_property_integer_2));
}

int main() {
  test_config_node_property_integer(1);
  test_config_node_property_integer(0);

  printf("Hello world \n");
  return 0;
}

#endif // config_node_property_integer_MAIN
#endif // config_node_property_integer_TEST
