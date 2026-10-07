#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::ComAdobeGraniteThreaddumpThreadDumpCollectorProperties()
{
	//__init();
}

ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::~ComAdobeGraniteThreaddumpThreadDumpCollectorProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::__init()
{
	//schedulerperiod = new ConfigNodePropertyInteger();
	//schedulerrunOn = new ConfigNodePropertyDropDown();
	//granitethreaddumpenabled = new ConfigNodePropertyBoolean();
	//granitethreaddumpdumpsPerFile = new ConfigNodePropertyInteger();
	//granitethreaddumpenableGzipCompression = new ConfigNodePropertyBoolean();
	//granitethreaddumpenableDirectoriesCompression = new ConfigNodePropertyBoolean();
	//granitethreaddumpenableJStack = new ConfigNodePropertyBoolean();
	//granitethreaddumpmaxBackupDays = new ConfigNodePropertyInteger();
	//granitethreaddumpbackupCleanTrigger = new ConfigNodePropertyString();
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::__cleanup()
{
	//if(schedulerperiod != NULL) {
	//
	//delete schedulerperiod;
	//schedulerperiod = NULL;
	//}
	//if(schedulerrunOn != NULL) {
	//
	//delete schedulerrunOn;
	//schedulerrunOn = NULL;
	//}
	//if(granitethreaddumpenabled != NULL) {
	//
	//delete granitethreaddumpenabled;
	//granitethreaddumpenabled = NULL;
	//}
	//if(granitethreaddumpdumpsPerFile != NULL) {
	//
	//delete granitethreaddumpdumpsPerFile;
	//granitethreaddumpdumpsPerFile = NULL;
	//}
	//if(granitethreaddumpenableGzipCompression != NULL) {
	//
	//delete granitethreaddumpenableGzipCompression;
	//granitethreaddumpenableGzipCompression = NULL;
	//}
	//if(granitethreaddumpenableDirectoriesCompression != NULL) {
	//
	//delete granitethreaddumpenableDirectoriesCompression;
	//granitethreaddumpenableDirectoriesCompression = NULL;
	//}
	//if(granitethreaddumpenableJStack != NULL) {
	//
	//delete granitethreaddumpenableJStack;
	//granitethreaddumpenableJStack = NULL;
	//}
	//if(granitethreaddumpmaxBackupDays != NULL) {
	//
	//delete granitethreaddumpmaxBackupDays;
	//granitethreaddumpmaxBackupDays = NULL;
	//}
	//if(granitethreaddumpbackupCleanTrigger != NULL) {
	//
	//delete granitethreaddumpbackupCleanTrigger;
	//granitethreaddumpbackupCleanTrigger = NULL;
	//}
	//
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerperiodKey = "scheduler.period";
	node = json_object_get_member(pJsonObject, schedulerperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&schedulerperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&schedulerperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedulerrunOnKey = "scheduler.runOn";
	node = json_object_get_member(pJsonObject, schedulerrunOnKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&schedulerrunOn, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&schedulerrunOn);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *granitethreaddumpenabledKey = "granite.threaddump.enabled";
	node = json_object_get_member(pJsonObject, granitethreaddumpenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&granitethreaddumpenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&granitethreaddumpenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *granitethreaddumpdumpsPerFileKey = "granite.threaddump.dumpsPerFile";
	node = json_object_get_member(pJsonObject, granitethreaddumpdumpsPerFileKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&granitethreaddumpdumpsPerFile, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&granitethreaddumpdumpsPerFile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *granitethreaddumpenableGzipCompressionKey = "granite.threaddump.enableGzipCompression";
	node = json_object_get_member(pJsonObject, granitethreaddumpenableGzipCompressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&granitethreaddumpenableGzipCompression, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&granitethreaddumpenableGzipCompression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *granitethreaddumpenableDirectoriesCompressionKey = "granite.threaddump.enableDirectoriesCompression";
	node = json_object_get_member(pJsonObject, granitethreaddumpenableDirectoriesCompressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&granitethreaddumpenableDirectoriesCompression, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&granitethreaddumpenableDirectoriesCompression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *granitethreaddumpenableJStackKey = "granite.threaddump.enableJStack";
	node = json_object_get_member(pJsonObject, granitethreaddumpenableJStackKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&granitethreaddumpenableJStack, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&granitethreaddumpenableJStack);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *granitethreaddumpmaxBackupDaysKey = "granite.threaddump.maxBackupDays";
	node = json_object_get_member(pJsonObject, granitethreaddumpmaxBackupDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&granitethreaddumpmaxBackupDays, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&granitethreaddumpmaxBackupDays);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *granitethreaddumpbackupCleanTriggerKey = "granite.threaddump.backupCleanTrigger";
	node = json_object_get_member(pJsonObject, granitethreaddumpbackupCleanTriggerKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&granitethreaddumpbackupCleanTrigger, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&granitethreaddumpbackupCleanTrigger);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSchedulerperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSchedulerperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerperiodKey = "scheduler.period";
	json_object_set_member(pJsonObject, schedulerperiodKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getSchedulerrunOn();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getSchedulerrunOn());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerrunOnKey = "scheduler.runOn";
	json_object_set_member(pJsonObject, schedulerrunOnKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGranitethreaddumpenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGranitethreaddumpenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitethreaddumpenabledKey = "granite.threaddump.enabled";
	json_object_set_member(pJsonObject, granitethreaddumpenabledKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getGranitethreaddumpdumpsPerFile();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getGranitethreaddumpdumpsPerFile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitethreaddumpdumpsPerFileKey = "granite.threaddump.dumpsPerFile";
	json_object_set_member(pJsonObject, granitethreaddumpdumpsPerFileKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGranitethreaddumpenableGzipCompression();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGranitethreaddumpenableGzipCompression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitethreaddumpenableGzipCompressionKey = "granite.threaddump.enableGzipCompression";
	json_object_set_member(pJsonObject, granitethreaddumpenableGzipCompressionKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGranitethreaddumpenableDirectoriesCompression();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGranitethreaddumpenableDirectoriesCompression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitethreaddumpenableDirectoriesCompressionKey = "granite.threaddump.enableDirectoriesCompression";
	json_object_set_member(pJsonObject, granitethreaddumpenableDirectoriesCompressionKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGranitethreaddumpenableJStack();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGranitethreaddumpenableJStack());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitethreaddumpenableJStackKey = "granite.threaddump.enableJStack";
	json_object_set_member(pJsonObject, granitethreaddumpenableJStackKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getGranitethreaddumpmaxBackupDays();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getGranitethreaddumpmaxBackupDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitethreaddumpmaxBackupDaysKey = "granite.threaddump.maxBackupDays";
	json_object_set_member(pJsonObject, granitethreaddumpmaxBackupDaysKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGranitethreaddumpbackupCleanTrigger();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGranitethreaddumpbackupCleanTrigger());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitethreaddumpbackupCleanTriggerKey = "granite.threaddump.backupCleanTrigger";
	json_object_set_member(pJsonObject, granitethreaddumpbackupCleanTriggerKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}

ConfigNodePropertyDropDown
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getSchedulerrunOn()
{
	return schedulerrunOn;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setSchedulerrunOn(ConfigNodePropertyDropDown  schedulerrunOn)
{
	this->schedulerrunOn = schedulerrunOn;
}

ConfigNodePropertyBoolean
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpenabled()
{
	return granitethreaddumpenabled;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpenabled(ConfigNodePropertyBoolean  granitethreaddumpenabled)
{
	this->granitethreaddumpenabled = granitethreaddumpenabled;
}

ConfigNodePropertyInteger
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpdumpsPerFile()
{
	return granitethreaddumpdumpsPerFile;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpdumpsPerFile(ConfigNodePropertyInteger  granitethreaddumpdumpsPerFile)
{
	this->granitethreaddumpdumpsPerFile = granitethreaddumpdumpsPerFile;
}

ConfigNodePropertyBoolean
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpenableGzipCompression()
{
	return granitethreaddumpenableGzipCompression;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpenableGzipCompression(ConfigNodePropertyBoolean  granitethreaddumpenableGzipCompression)
{
	this->granitethreaddumpenableGzipCompression = granitethreaddumpenableGzipCompression;
}

ConfigNodePropertyBoolean
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpenableDirectoriesCompression()
{
	return granitethreaddumpenableDirectoriesCompression;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpenableDirectoriesCompression(ConfigNodePropertyBoolean  granitethreaddumpenableDirectoriesCompression)
{
	this->granitethreaddumpenableDirectoriesCompression = granitethreaddumpenableDirectoriesCompression;
}

ConfigNodePropertyBoolean
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpenableJStack()
{
	return granitethreaddumpenableJStack;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpenableJStack(ConfigNodePropertyBoolean  granitethreaddumpenableJStack)
{
	this->granitethreaddumpenableJStack = granitethreaddumpenableJStack;
}

ConfigNodePropertyInteger
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpmaxBackupDays()
{
	return granitethreaddumpmaxBackupDays;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpmaxBackupDays(ConfigNodePropertyInteger  granitethreaddumpmaxBackupDays)
{
	this->granitethreaddumpmaxBackupDays = granitethreaddumpmaxBackupDays;
}

ConfigNodePropertyString
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpbackupCleanTrigger()
{
	return granitethreaddumpbackupCleanTrigger;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpbackupCleanTrigger(ConfigNodePropertyString  granitethreaddumpbackupCleanTrigger)
{
	this->granitethreaddumpbackupCleanTrigger = granitethreaddumpbackupCleanTrigger;
}


