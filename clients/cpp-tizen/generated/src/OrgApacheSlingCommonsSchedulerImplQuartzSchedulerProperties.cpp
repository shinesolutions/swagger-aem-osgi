#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties()
{
	//__init();
}

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::~OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::__init()
{
	//poolName = new ConfigNodePropertyString();
	//allowedPoolNames = new ConfigNodePropertyArray();
	//scheduleruseleaderforsingle = new ConfigNodePropertyBoolean();
	//metricsfilters = new ConfigNodePropertyArray();
	//slowThresholdMillis = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::__cleanup()
{
	//if(poolName != NULL) {
	//
	//delete poolName;
	//poolName = NULL;
	//}
	//if(allowedPoolNames != NULL) {
	//
	//delete allowedPoolNames;
	//allowedPoolNames = NULL;
	//}
	//if(scheduleruseleaderforsingle != NULL) {
	//
	//delete scheduleruseleaderforsingle;
	//scheduleruseleaderforsingle = NULL;
	//}
	//if(metricsfilters != NULL) {
	//
	//delete metricsfilters;
	//metricsfilters = NULL;
	//}
	//if(slowThresholdMillis != NULL) {
	//
	//delete slowThresholdMillis;
	//slowThresholdMillis = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *poolNameKey = "poolName";
	node = json_object_get_member(pJsonObject, poolNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&poolName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&poolName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowedPoolNamesKey = "allowedPoolNames";
	node = json_object_get_member(pJsonObject, allowedPoolNamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&allowedPoolNames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&allowedPoolNames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scheduleruseleaderforsingleKey = "scheduler.useleaderforsingle";
	node = json_object_get_member(pJsonObject, scheduleruseleaderforsingleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&scheduleruseleaderforsingle, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&scheduleruseleaderforsingle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *metricsfiltersKey = "metrics.filters";
	node = json_object_get_member(pJsonObject, metricsfiltersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&metricsfilters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&metricsfilters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slowThresholdMillisKey = "slowThresholdMillis";
	node = json_object_get_member(pJsonObject, slowThresholdMillisKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&slowThresholdMillis, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&slowThresholdMillis);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPoolName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPoolName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *poolNameKey = "poolName";
	json_object_set_member(pJsonObject, poolNameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAllowedPoolNames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAllowedPoolNames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowedPoolNamesKey = "allowedPoolNames";
	json_object_set_member(pJsonObject, allowedPoolNamesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getScheduleruseleaderforsingle();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getScheduleruseleaderforsingle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scheduleruseleaderforsingleKey = "scheduler.useleaderforsingle";
	json_object_set_member(pJsonObject, scheduleruseleaderforsingleKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getMetricsfilters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getMetricsfilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metricsfiltersKey = "metrics.filters";
	json_object_set_member(pJsonObject, metricsfiltersKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSlowThresholdMillis();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSlowThresholdMillis());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slowThresholdMillisKey = "slowThresholdMillis";
	json_object_set_member(pJsonObject, slowThresholdMillisKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getPoolName()
{
	return poolName;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setPoolName(ConfigNodePropertyString  poolName)
{
	this->poolName = poolName;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getAllowedPoolNames()
{
	return allowedPoolNames;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setAllowedPoolNames(ConfigNodePropertyArray  allowedPoolNames)
{
	this->allowedPoolNames = allowedPoolNames;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getScheduleruseleaderforsingle()
{
	return scheduleruseleaderforsingle;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setScheduleruseleaderforsingle(ConfigNodePropertyBoolean  scheduleruseleaderforsingle)
{
	this->scheduleruseleaderforsingle = scheduleruseleaderforsingle;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getMetricsfilters()
{
	return metricsfilters;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setMetricsfilters(ConfigNodePropertyArray  metricsfilters)
{
	this->metricsfilters = metricsfilters;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::getSlowThresholdMillis()
{
	return slowThresholdMillis;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties::setSlowThresholdMillis(ConfigNodePropertyInteger  slowThresholdMillis)
{
	this->slowThresholdMillis = slowThresholdMillis;
}


