#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties()
{
	//__init();
}

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::~ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties()
{
	//__cleanup();
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::__init()
{
	//schedulerexpression = new ConfigNodePropertyString();
	//schedulerconcurrent = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::__cleanup()
{
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//if(schedulerconcurrent != NULL) {
	//
	//delete schedulerconcurrent;
	//schedulerconcurrent = NULL;
	//}
	//
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerexpressionKey = "scheduler.expression";
	node = json_object_get_member(pJsonObject, schedulerexpressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&schedulerexpression, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&schedulerexpression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedulerconcurrentKey = "scheduler.concurrent";
	node = json_object_get_member(pJsonObject, schedulerconcurrentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&schedulerconcurrent, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&schedulerconcurrent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSchedulerexpression();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSchedulerexpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerexpressionKey = "scheduler.expression";
	json_object_set_member(pJsonObject, schedulerexpressionKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSchedulerconcurrent();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSchedulerconcurrent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerconcurrentKey = "scheduler.concurrent";
	json_object_set_member(pJsonObject, schedulerconcurrentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyBoolean
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean  schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}


