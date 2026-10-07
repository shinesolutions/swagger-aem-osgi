
#include "OrgApacheSlingResourcemergerPickerOverridingInfo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrgApacheSlingResourcemergerPickerOverridingInfo_pid_is_assigned_from_json()
{


    bourne::json input =
    {
        "pid", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPid().c_str());






}


void test_OrgApacheSlingResourcemergerPickerOverridingInfo_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}


void test_OrgApacheSlingResourcemergerPickerOverridingInfo_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_OrgApacheSlingResourcemergerPickerOverridingInfo_additionalProperties_is_assigned_from_json()
{


    bourne::json input =
    {
        "additionalProperties", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdditionalProperties().c_str());






}


void test_OrgApacheSlingResourcemergerPickerOverridingInfo_bundle_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "bundle_location", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBundleLocation().c_str());






}


void test_OrgApacheSlingResourcemergerPickerOverridingInfo_service_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "service_location", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getServiceLocation().c_str());






}



void test_OrgApacheSlingResourcemergerPickerOverridingInfo_pid_is_converted_to_json()
{

    bourne::json input =
    {
        "pid", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pid"] == output["pid"]);



}


void test_OrgApacheSlingResourcemergerPickerOverridingInfo_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


void test_OrgApacheSlingResourcemergerPickerOverridingInfo_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_OrgApacheSlingResourcemergerPickerOverridingInfo_additionalProperties_is_converted_to_json()
{

    bourne::json input =
    {
        "additionalProperties", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["additionalProperties"] == output["additionalProperties"]);



}


void test_OrgApacheSlingResourcemergerPickerOverridingInfo_bundle_location_is_converted_to_json()
{

    bourne::json input =
    {
        "bundle_location", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bundle_location"] == output["bundle_location"]);



}


void test_OrgApacheSlingResourcemergerPickerOverridingInfo_service_location_is_converted_to_json()
{

    bourne::json input =
    {
        "service_location", "hello"
    };

    OrgApacheSlingResourcemergerPickerOverridingInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["service_location"] == output["service_location"]);



}


