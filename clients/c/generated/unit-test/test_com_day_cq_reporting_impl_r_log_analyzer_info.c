#ifndef com_day_cq_reporting_impl_r_log_analyzer_info_TEST
#define com_day_cq_reporting_impl_r_log_analyzer_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define com_day_cq_reporting_impl_r_log_analyzer_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/com_day_cq_reporting_impl_r_log_analyzer_info.h"
com_day_cq_reporting_impl_r_log_analyzer_info_t* instantiate_com_day_cq_reporting_impl_r_log_analyzer_info(int include_optional);

#include "test_com_day_cq_reporting_impl_r_log_analyzer_properties.c"


com_day_cq_reporting_impl_r_log_analyzer_info_t* instantiate_com_day_cq_reporting_impl_r_log_analyzer_info(int include_optional) {
  com_day_cq_reporting_impl_r_log_analyzer_info_t* com_day_cq_reporting_impl_r_log_analyzer_info = NULL;
  if (include_optional) {
    com_day_cq_reporting_impl_r_log_analyzer_info = com_day_cq_reporting_impl_r_log_analyzer_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_com_day_cq_reporting_impl_r_log_analyzer_properties(0)
    );
  } else {
    com_day_cq_reporting_impl_r_log_analyzer_info = com_day_cq_reporting_impl_r_log_analyzer_info_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return com_day_cq_reporting_impl_r_log_analyzer_info;
}


#ifdef com_day_cq_reporting_impl_r_log_analyzer_info_MAIN

void test_com_day_cq_reporting_impl_r_log_analyzer_info(int include_optional) {
    com_day_cq_reporting_impl_r_log_analyzer_info_t* com_day_cq_reporting_impl_r_log_analyzer_info_1 = instantiate_com_day_cq_reporting_impl_r_log_analyzer_info(include_optional);

	cJSON* jsoncom_day_cq_reporting_impl_r_log_analyzer_info_1 = com_day_cq_reporting_impl_r_log_analyzer_info_convertToJSON(com_day_cq_reporting_impl_r_log_analyzer_info_1);
	printf("com_day_cq_reporting_impl_r_log_analyzer_info :\n%s\n", cJSON_Print(jsoncom_day_cq_reporting_impl_r_log_analyzer_info_1));
	com_day_cq_reporting_impl_r_log_analyzer_info_t* com_day_cq_reporting_impl_r_log_analyzer_info_2 = com_day_cq_reporting_impl_r_log_analyzer_info_parseFromJSON(jsoncom_day_cq_reporting_impl_r_log_analyzer_info_1);
	cJSON* jsoncom_day_cq_reporting_impl_r_log_analyzer_info_2 = com_day_cq_reporting_impl_r_log_analyzer_info_convertToJSON(com_day_cq_reporting_impl_r_log_analyzer_info_2);
	printf("repeating com_day_cq_reporting_impl_r_log_analyzer_info:\n%s\n", cJSON_Print(jsoncom_day_cq_reporting_impl_r_log_analyzer_info_2));
}

int main() {
  test_com_day_cq_reporting_impl_r_log_analyzer_info(1);
  test_com_day_cq_reporting_impl_r_log_analyzer_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // com_day_cq_reporting_impl_r_log_analyzer_info_MAIN
#endif // com_day_cq_reporting_impl_r_log_analyzer_info_TEST
