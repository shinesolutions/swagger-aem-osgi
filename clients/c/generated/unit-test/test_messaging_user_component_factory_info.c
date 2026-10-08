#ifndef messaging_user_component_factory_info_TEST
#define messaging_user_component_factory_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define messaging_user_component_factory_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/messaging_user_component_factory_info.h"
messaging_user_component_factory_info_t* instantiate_messaging_user_component_factory_info(int include_optional);

#include "test_messaging_user_component_factory_properties.c"


messaging_user_component_factory_info_t* instantiate_messaging_user_component_factory_info(int include_optional) {
  messaging_user_component_factory_info_t* messaging_user_component_factory_info = NULL;
  if (include_optional) {
    messaging_user_component_factory_info = messaging_user_component_factory_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_messaging_user_component_factory_properties(0)
    );
  } else {
    messaging_user_component_factory_info = messaging_user_component_factory_info_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return messaging_user_component_factory_info;
}


#ifdef messaging_user_component_factory_info_MAIN

void test_messaging_user_component_factory_info(int include_optional) {
    messaging_user_component_factory_info_t* messaging_user_component_factory_info_1 = instantiate_messaging_user_component_factory_info(include_optional);

	cJSON* jsonmessaging_user_component_factory_info_1 = messaging_user_component_factory_info_convertToJSON(messaging_user_component_factory_info_1);
	printf("messaging_user_component_factory_info :\n%s\n", cJSON_Print(jsonmessaging_user_component_factory_info_1));
	messaging_user_component_factory_info_t* messaging_user_component_factory_info_2 = messaging_user_component_factory_info_parseFromJSON(jsonmessaging_user_component_factory_info_1);
	cJSON* jsonmessaging_user_component_factory_info_2 = messaging_user_component_factory_info_convertToJSON(messaging_user_component_factory_info_2);
	printf("repeating messaging_user_component_factory_info:\n%s\n", cJSON_Print(jsonmessaging_user_component_factory_info_2));
}

int main() {
  test_messaging_user_component_factory_info(1);
  test_messaging_user_component_factory_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // messaging_user_component_factory_info_MAIN
#endif // messaging_user_component_factory_info_TEST
