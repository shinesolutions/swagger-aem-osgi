#ifndef adaptive_form_and_interactive_communication_web_channel_configuration_properties_TEST
#define adaptive_form_and_interactive_communication_web_channel_configuration_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define adaptive_form_and_interactive_communication_web_channel_configuration_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/adaptive_form_and_interactive_communication_web_channel_configuration_properties.h"
adaptive_form_and_interactive_communication_web_channel_configuration_properties_t* instantiate_adaptive_form_and_interactive_communication_web_channel_configuration_properties(int include_optional);

#include "test_config_node_property_boolean.c"
#include "test_config_node_property_integer.c"
#include "test_config_node_property_drop_down.c"
#include "test_config_node_property_boolean.c"
#include "test_config_node_property_boolean.c"


adaptive_form_and_interactive_communication_web_channel_configuration_properties_t* instantiate_adaptive_form_and_interactive_communication_web_channel_configuration_properties(int include_optional) {
  adaptive_form_and_interactive_communication_web_channel_configuration_properties_t* adaptive_form_and_interactive_communication_web_channel_configuration_properties = NULL;
  if (include_optional) {
    adaptive_form_and_interactive_communication_web_channel_configuration_properties = adaptive_form_and_interactive_communication_web_channel_configuration_properties_create(
       // false, not to have infinite recursion
      instantiate_config_node_property_boolean(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_integer(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_drop_down(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_boolean(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_boolean(0)
    );
  } else {
    adaptive_form_and_interactive_communication_web_channel_configuration_properties = adaptive_form_and_interactive_communication_web_channel_configuration_properties_create(
      NULL,
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return adaptive_form_and_interactive_communication_web_channel_configuration_properties;
}


#ifdef adaptive_form_and_interactive_communication_web_channel_configuration_properties_MAIN

void test_adaptive_form_and_interactive_communication_web_channel_configuration_properties(int include_optional) {
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_t* adaptive_form_and_interactive_communication_web_channel_configuration_properties_1 = instantiate_adaptive_form_and_interactive_communication_web_channel_configuration_properties(include_optional);

	cJSON* jsonadaptive_form_and_interactive_communication_web_channel_configuration_properties_1 = adaptive_form_and_interactive_communication_web_channel_configuration_properties_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_properties_1);
	printf("adaptive_form_and_interactive_communication_web_channel_configuration_properties :\n%s\n", cJSON_Print(jsonadaptive_form_and_interactive_communication_web_channel_configuration_properties_1));
	adaptive_form_and_interactive_communication_web_channel_configuration_properties_t* adaptive_form_and_interactive_communication_web_channel_configuration_properties_2 = adaptive_form_and_interactive_communication_web_channel_configuration_properties_parseFromJSON(jsonadaptive_form_and_interactive_communication_web_channel_configuration_properties_1);
	cJSON* jsonadaptive_form_and_interactive_communication_web_channel_configuration_properties_2 = adaptive_form_and_interactive_communication_web_channel_configuration_properties_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_properties_2);
	printf("repeating adaptive_form_and_interactive_communication_web_channel_configuration_properties:\n%s\n", cJSON_Print(jsonadaptive_form_and_interactive_communication_web_channel_configuration_properties_2));
}

int main() {
  test_adaptive_form_and_interactive_communication_web_channel_configuration_properties(1);
  test_adaptive_form_and_interactive_communication_web_channel_configuration_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // adaptive_form_and_interactive_communication_web_channel_configuration_properties_MAIN
#endif // adaptive_form_and_interactive_communication_web_channel_configuration_properties_TEST
