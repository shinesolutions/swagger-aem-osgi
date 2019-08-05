#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplReportsReportPurgeServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplReportsReportPurgeServiceProperties::ComDayCqDamCoreImplReportsReportPurgeServiceProperties()
{
	//__init();
}

ComDayCqDamCoreImplReportsReportPurgeServiceProperties::~ComDayCqDamCoreImplReportsReportPurgeServiceProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::__init()
{
	//schedulerexpression = new ConfigNodePropertyString();
	//maxSavedReports = new ConfigNodePropertyInteger();
	//timeDuration = new ConfigNodePropertyInteger();
	//enableReportPurge = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::__cleanup()
{
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//if(maxSavedReports != NULL) {
	//
	//delete maxSavedReports;
	//maxSavedReports = NULL;
	//}
	//if(timeDuration != NULL) {
	//
	//delete timeDuration;
	//timeDuration = NULL;
	//}
	//if(enableReportPurge != NULL) {
	//
	//delete enableReportPurge;
	//enableReportPurge = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::fromJson(char* jsonStr)
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
	const gchar *maxSavedReportsKey = "maxSavedReports";
	node = json_object_get_member(pJsonObject, maxSavedReportsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxSavedReports, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxSavedReports);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *timeDurationKey = "timeDuration";
	node = json_object_get_member(pJsonObject, timeDurationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&timeDuration, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&timeDuration);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableReportPurgeKey = "enableReportPurge";
	node = json_object_get_member(pJsonObject, enableReportPurgeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableReportPurge, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableReportPurge);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplReportsReportPurgeServiceProperties::ComDayCqDamCoreImplReportsReportPurgeServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxSavedReports();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxSavedReports());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxSavedReportsKey = "maxSavedReports";
	json_object_set_member(pJsonObject, maxSavedReportsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTimeDuration();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTimeDuration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timeDurationKey = "timeDuration";
	json_object_set_member(pJsonObject, timeDurationKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableReportPurge();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableReportPurge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableReportPurgeKey = "enableReportPurge";
	json_object_set_member(pJsonObject, enableReportPurgeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::getMaxSavedReports()
{
	return maxSavedReports;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::setMaxSavedReports(ConfigNodePropertyInteger  maxSavedReports)
{
	this->maxSavedReports = maxSavedReports;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::getTimeDuration()
{
	return timeDuration;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::setTimeDuration(ConfigNodePropertyInteger  timeDuration)
{
	this->timeDuration = timeDuration;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::getEnableReportPurge()
{
	return enableReportPurge;
}

void
ComDayCqDamCoreImplReportsReportPurgeServiceProperties::setEnableReportPurge(ConfigNodePropertyBoolean  enableReportPurge)
{
	this->enableReportPurge = enableReportPurge;
}


