#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsMetricsInternalLogReporterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsMetricsInternalLogReporterProperties::OrgApacheSlingCommonsMetricsInternalLogReporterProperties()
{
	//__init();
}

OrgApacheSlingCommonsMetricsInternalLogReporterProperties::~OrgApacheSlingCommonsMetricsInternalLogReporterProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::__init()
{
	//period = new ConfigNodePropertyInteger();
	//timeUnit = new ConfigNodePropertyDropDown();
	//level = new ConfigNodePropertyDropDown();
	//loggerName = new ConfigNodePropertyString();
	//prefix = new ConfigNodePropertyString();
	//pattern = new ConfigNodePropertyString();
	//registryName = new ConfigNodePropertyString();
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::__cleanup()
{
	//if(period != NULL) {
	//
	//delete period;
	//period = NULL;
	//}
	//if(timeUnit != NULL) {
	//
	//delete timeUnit;
	//timeUnit = NULL;
	//}
	//if(level != NULL) {
	//
	//delete level;
	//level = NULL;
	//}
	//if(loggerName != NULL) {
	//
	//delete loggerName;
	//loggerName = NULL;
	//}
	//if(prefix != NULL) {
	//
	//delete prefix;
	//prefix = NULL;
	//}
	//if(pattern != NULL) {
	//
	//delete pattern;
	//pattern = NULL;
	//}
	//if(registryName != NULL) {
	//
	//delete registryName;
	//registryName = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *periodKey = "period";
	node = json_object_get_member(pJsonObject, periodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&period, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&period);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *timeUnitKey = "timeUnit";
	node = json_object_get_member(pJsonObject, timeUnitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&timeUnit, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&timeUnit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *levelKey = "level";
	node = json_object_get_member(pJsonObject, levelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&level, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&level);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *loggerNameKey = "loggerName";
	node = json_object_get_member(pJsonObject, loggerNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&loggerName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&loggerName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *prefixKey = "prefix";
	node = json_object_get_member(pJsonObject, prefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&prefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&prefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *patternKey = "pattern";
	node = json_object_get_member(pJsonObject, patternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *registryNameKey = "registryName";
	node = json_object_get_member(pJsonObject, registryNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&registryName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&registryName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsMetricsInternalLogReporterProperties::OrgApacheSlingCommonsMetricsInternalLogReporterProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPeriod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPeriod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *periodKey = "period";
	json_object_set_member(pJsonObject, periodKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getTimeUnit();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getTimeUnit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timeUnitKey = "timeUnit";
	json_object_set_member(pJsonObject, timeUnitKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getLevel();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getLevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLoggerName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLoggerName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *loggerNameKey = "loggerName";
	json_object_set_member(pJsonObject, loggerNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPrefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPrefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *prefixKey = "prefix";
	json_object_set_member(pJsonObject, prefixKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patternKey = "pattern";
	json_object_set_member(pJsonObject, patternKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRegistryName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRegistryName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *registryNameKey = "registryName";
	json_object_set_member(pJsonObject, registryNameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getPeriod()
{
	return period;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setPeriod(ConfigNodePropertyInteger  period)
{
	this->period = period;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getTimeUnit()
{
	return timeUnit;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setTimeUnit(ConfigNodePropertyDropDown  timeUnit)
{
	this->timeUnit = timeUnit;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getLevel()
{
	return level;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setLevel(ConfigNodePropertyDropDown  level)
{
	this->level = level;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getLoggerName()
{
	return loggerName;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setLoggerName(ConfigNodePropertyString  loggerName)
{
	this->loggerName = loggerName;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getPrefix()
{
	return prefix;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setPrefix(ConfigNodePropertyString  prefix)
{
	this->prefix = prefix;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getPattern()
{
	return pattern;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setPattern(ConfigNodePropertyString  pattern)
{
	this->pattern = pattern;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::getRegistryName()
{
	return registryName;
}

void
OrgApacheSlingCommonsMetricsInternalLogReporterProperties::setRegistryName(ConfigNodePropertyString  registryName)
{
	this->registryName = registryName;
}


