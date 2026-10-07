
#include "OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_pid_is_assigned_from_json()
{


    bourne::json input =
    {
        "pid", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPid().c_str());






}


void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}


void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_bundle_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "bundle_location", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBundleLocation().c_str());






}


void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_service_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "service_location", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getServiceLocation().c_str());






}



void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_pid_is_converted_to_json()
{

    bourne::json input =
    {
        "pid", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pid"] == output["pid"]);



}


void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_bundle_location_is_converted_to_json()
{

    bourne::json input =
    {
        "bundle_location", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bundle_location"] == output["bundle_location"]);



}


void test_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo_service_location_is_converted_to_json()
{

    bourne::json input =
    {
        "service_location", "hello"
    };

    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["service_location"] == output["service_location"]);



}


