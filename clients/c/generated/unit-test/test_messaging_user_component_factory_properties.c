#ifndef messaging_user_component_factory_properties_TEST
#define messaging_user_component_factory_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define messaging_user_component_factory_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/messaging_user_component_factory_properties.h"
messaging_user_component_factory_properties_t* instantiate_messaging_user_component_factory_properties(int include_optional);

#include "test_config_node_property_integer.c"


messaging_user_component_factory_properties_t* instantiate_messaging_user_component_factory_properties(int include_optional) {
  messaging_user_component_factory_properties_t* messaging_user_component_factory_properties = NULL;
  if (include_optional) {
    messaging_user_component_factory_properties = messaging_user_component_factory_properties_create(
       // false, not to have infinite recursion
      instantiate_config_node_property_integer(0)
    );
  } else {
    messaging_user_component_factory_properties = messaging_user_component_factory_properties_create(
      NULL
    );
  }

  return messaging_user_component_factory_properties;
}


#ifdef messaging_user_component_factory_properties_MAIN

void test_messaging_user_component_factory_properties(int include_optional) {
    messaging_user_component_factory_properties_t* messaging_user_component_factory_properties_1 = instantiate_messaging_user_component_factory_properties(include_optional);

	cJSON* jsonmessaging_user_component_factory_properties_1 = messaging_user_component_factory_properties_convertToJSON(messaging_user_component_factory_properties_1);
	printf("messaging_user_component_factory_properties :\n%s\n", cJSON_Print(jsonmessaging_user_component_factory_properties_1));
	messaging_user_component_factory_properties_t* messaging_user_component_factory_properties_2 = messaging_user_component_factory_properties_parseFromJSON(jsonmessaging_user_component_factory_properties_1);
	cJSON* jsonmessaging_user_component_factory_properties_2 = messaging_user_component_factory_properties_convertToJSON(messaging_user_component_factory_properties_2);
	printf("repeating messaging_user_component_factory_properties:\n%s\n", cJSON_Print(jsonmessaging_user_component_factory_properties_2));
}

int main() {
  test_messaging_user_component_factory_properties(1);
  test_messaging_user_component_factory_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // messaging_user_component_factory_properties_MAIN
#endif // messaging_user_component_factory_properties_TEST
