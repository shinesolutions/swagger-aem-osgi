#ifndef adaptive_form_and_interactive_communication_web_channel_configuration_info_TEST
#define adaptive_form_and_interactive_communication_web_channel_configuration_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define adaptive_form_and_interactive_communication_web_channel_configuration_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/adaptive_form_and_interactive_communication_web_channel_configuration_info.h"
adaptive_form_and_interactive_communication_web_channel_configuration_info_t* instantiate_adaptive_form_and_interactive_communication_web_channel_configuration_info(int include_optional);

#include "test_adaptive_form_and_interactive_communication_web_channel_configuration_properties.c"


adaptive_form_and_interactive_communication_web_channel_configuration_info_t* instantiate_adaptive_form_and_interactive_communication_web_channel_configuration_info(int include_optional) {
  adaptive_form_and_interactive_communication_web_channel_configuration_info_t* adaptive_form_and_interactive_communication_web_channel_configuration_info = NULL;
  if (include_optional) {
    adaptive_form_and_interactive_communication_web_channel_configuration_info = adaptive_form_and_interactive_communication_web_channel_configuration_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_adaptive_form_and_interactive_communication_web_channel_configuration_properties(0)
    );
  } else {
    adaptive_form_and_interactive_communication_web_channel_configuration_info = adaptive_form_and_interactive_communication_web_channel_configuration_info_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return adaptive_form_and_interactive_communication_web_channel_configuration_info;
}


#ifdef adaptive_form_and_interactive_communication_web_channel_configuration_info_MAIN

void test_adaptive_form_and_interactive_communication_web_channel_configuration_info(int include_optional) {
    adaptive_form_and_interactive_communication_web_channel_configuration_info_t* adaptive_form_and_interactive_communication_web_channel_configuration_info_1 = instantiate_adaptive_form_and_interactive_communication_web_channel_configuration_info(include_optional);

	cJSON* jsonadaptive_form_and_interactive_communication_web_channel_configuration_info_1 = adaptive_form_and_interactive_communication_web_channel_configuration_info_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_info_1);
	printf("adaptive_form_and_interactive_communication_web_channel_configuration_info :\n%s\n", cJSON_Print(jsonadaptive_form_and_interactive_communication_web_channel_configuration_info_1));
	adaptive_form_and_interactive_communication_web_channel_configuration_info_t* adaptive_form_and_interactive_communication_web_channel_configuration_info_2 = adaptive_form_and_interactive_communication_web_channel_configuration_info_parseFromJSON(jsonadaptive_form_and_interactive_communication_web_channel_configuration_info_1);
	cJSON* jsonadaptive_form_and_interactive_communication_web_channel_configuration_info_2 = adaptive_form_and_interactive_communication_web_channel_configuration_info_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_info_2);
	printf("repeating adaptive_form_and_interactive_communication_web_channel_configuration_info:\n%s\n", cJSON_Print(jsonadaptive_form_and_interactive_communication_web_channel_configuration_info_2));
}

int main() {
  test_adaptive_form_and_interactive_communication_web_channel_configuration_info(1);
  test_adaptive_form_and_interactive_communication_web_channel_configuration_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // adaptive_form_and_interactive_communication_web_channel_configuration_info_MAIN
#endif // adaptive_form_and_interactive_communication_web_channel_configuration_info_TEST
