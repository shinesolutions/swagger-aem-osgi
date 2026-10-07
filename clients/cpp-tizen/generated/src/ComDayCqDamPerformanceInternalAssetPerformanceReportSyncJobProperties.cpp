#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties()
{
	//__init();
}

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::~ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties()
{
	//__cleanup();
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::__init()
{
	//schedulerexpression = new ConfigNodePropertyString();
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::__cleanup()
{
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::fromJson(char* jsonStr)
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
}

ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}


