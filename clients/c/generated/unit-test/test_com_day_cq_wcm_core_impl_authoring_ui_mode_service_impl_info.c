#ifndef com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_TEST
#define com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info.h"
com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_t* instantiate_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info(int include_optional);

#include "test_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties.c"


com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_t* instantiate_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info(int include_optional) {
  com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_t* com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info = NULL;
  if (include_optional) {
    com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info = com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties(0),
      "0",
      "0",
      "0"
    );
  } else {
    com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info = com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_create(
      "0",
      "0",
      "0",
      NULL,
      "0",
      "0",
      "0"
    );
  }

  return com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info;
}


#ifdef com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_MAIN

void test_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info(int include_optional) {
    com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_t* com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_1 = instantiate_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info(include_optional);

	cJSON* jsoncom_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_1 = com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_convertToJSON(com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_1);
	printf("com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info :\n%s\n", cJSON_Print(jsoncom_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_1));
	com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_t* com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_2 = com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_parseFromJSON(jsoncom_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_1);
	cJSON* jsoncom_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_2 = com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_convertToJSON(com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_2);
	printf("repeating com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info:\n%s\n", cJSON_Print(jsoncom_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_2));
}

int main() {
  test_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info(1);
  test_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_MAIN
#endif // com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info_TEST
