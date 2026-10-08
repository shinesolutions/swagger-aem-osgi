#ifndef com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_TEST
#define com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info.h"
com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_t* instantiate_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info(int include_optional);

#include "test_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties.c"


com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_t* instantiate_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info(int include_optional) {
  com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_t* com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info = NULL;
  if (include_optional) {
    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info = com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties(0)
    );
  } else {
    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info = com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info;
}


#ifdef com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_MAIN

void test_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info(int include_optional) {
    com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_t* com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_1 = instantiate_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info(include_optional);

	cJSON* jsoncom_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_1 = com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_convertToJSON(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_1);
	printf("com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info :\n%s\n", cJSON_Print(jsoncom_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_1));
	com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_t* com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_2 = com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_parseFromJSON(jsoncom_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_1);
	cJSON* jsoncom_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_2 = com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_convertToJSON(com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_2);
	printf("repeating com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info:\n%s\n", cJSON_Print(jsoncom_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_2));
}

int main() {
  test_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info(1);
  test_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_MAIN
#endif // com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info_TEST
