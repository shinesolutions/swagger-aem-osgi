#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties()
{
	//__init();
}

OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::~OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//type = new ConfigNodePropertyDropDown();
	//formattarget = new ConfigNodePropertyString();
	//tempFsFolder = new ConfigNodePropertyString();
	//fileThreshold = new ConfigNodePropertyInteger();
	//memoryUnit = new ConfigNodePropertyDropDown();
	//useOffHeapMemory = new ConfigNodePropertyBoolean();
	//digestAlgorithm = new ConfigNodePropertyDropDown();
	//monitoringQueueSize = new ConfigNodePropertyInteger();
	//cleanupDelay = new ConfigNodePropertyInteger();
	//packagefilters = new ConfigNodePropertyArray();
	//propertyfilters = new ConfigNodePropertyArray();
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(formattarget != NULL) {
	//
	//delete formattarget;
	//formattarget = NULL;
	//}
	//if(tempFsFolder != NULL) {
	//
	//delete tempFsFolder;
	//tempFsFolder = NULL;
	//}
	//if(fileThreshold != NULL) {
	//
	//delete fileThreshold;
	//fileThreshold = NULL;
	//}
	//if(memoryUnit != NULL) {
	//
	//delete memoryUnit;
	//memoryUnit = NULL;
	//}
	//if(useOffHeapMemory != NULL) {
	//
	//delete useOffHeapMemory;
	//useOffHeapMemory = NULL;
	//}
	//if(digestAlgorithm != NULL) {
	//
	//delete digestAlgorithm;
	//digestAlgorithm = NULL;
	//}
	//if(monitoringQueueSize != NULL) {
	//
	//delete monitoringQueueSize;
	//monitoringQueueSize = NULL;
	//}
	//if(cleanupDelay != NULL) {
	//
	//delete cleanupDelay;
	//cleanupDelay = NULL;
	//}
	//if(packagefilters != NULL) {
	//
	//delete packagefilters;
	//packagefilters = NULL;
	//}
	//if(propertyfilters != NULL) {
	//
	//delete propertyfilters;
	//propertyfilters = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&name, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&type, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *formattargetKey = "format.target";
	node = json_object_get_member(pJsonObject, formattargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&formattarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&formattarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tempFsFolderKey = "tempFsFolder";
	node = json_object_get_member(pJsonObject, tempFsFolderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&tempFsFolder, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&tempFsFolder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fileThresholdKey = "fileThreshold";
	node = json_object_get_member(pJsonObject, fileThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&fileThreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&fileThreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *memoryUnitKey = "memoryUnit";
	node = json_object_get_member(pJsonObject, memoryUnitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&memoryUnit, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&memoryUnit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *useOffHeapMemoryKey = "useOffHeapMemory";
	node = json_object_get_member(pJsonObject, useOffHeapMemoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&useOffHeapMemory, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&useOffHeapMemory);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *digestAlgorithmKey = "digestAlgorithm";
	node = json_object_get_member(pJsonObject, digestAlgorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&digestAlgorithm, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&digestAlgorithm);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *monitoringQueueSizeKey = "monitoringQueueSize";
	node = json_object_get_member(pJsonObject, monitoringQueueSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&monitoringQueueSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&monitoringQueueSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cleanupDelayKey = "cleanupDelay";
	node = json_object_get_member(pJsonObject, cleanupDelayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cleanupDelay, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cleanupDelay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *packagefiltersKey = "package.filters";
	node = json_object_get_member(pJsonObject, packagefiltersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&packagefilters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&packagefilters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propertyfiltersKey = "property.filters";
	node = json_object_get_member(pJsonObject, propertyfiltersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&propertyfilters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&propertyfilters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getType();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFormattarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFormattarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *formattargetKey = "format.target";
	json_object_set_member(pJsonObject, formattargetKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTempFsFolder();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTempFsFolder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tempFsFolderKey = "tempFsFolder";
	json_object_set_member(pJsonObject, tempFsFolderKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getFileThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getFileThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fileThresholdKey = "fileThreshold";
	json_object_set_member(pJsonObject, fileThresholdKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getMemoryUnit();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getMemoryUnit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *memoryUnitKey = "memoryUnit";
	json_object_set_member(pJsonObject, memoryUnitKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUseOffHeapMemory();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUseOffHeapMemory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *useOffHeapMemoryKey = "useOffHeapMemory";
	json_object_set_member(pJsonObject, useOffHeapMemoryKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getDigestAlgorithm();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getDigestAlgorithm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *digestAlgorithmKey = "digestAlgorithm";
	json_object_set_member(pJsonObject, digestAlgorithmKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMonitoringQueueSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMonitoringQueueSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *monitoringQueueSizeKey = "monitoringQueueSize";
	json_object_set_member(pJsonObject, monitoringQueueSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCleanupDelay();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCleanupDelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cleanupDelayKey = "cleanupDelay";
	json_object_set_member(pJsonObject, cleanupDelayKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPackagefilters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPackagefilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packagefiltersKey = "package.filters";
	json_object_set_member(pJsonObject, packagefiltersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPropertyfilters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPropertyfilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertyfiltersKey = "property.filters";
	json_object_set_member(pJsonObject, propertyfiltersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getType()
{
	return type;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setType(ConfigNodePropertyDropDown  type)
{
	this->type = type;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getFormattarget()
{
	return formattarget;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setFormattarget(ConfigNodePropertyString  formattarget)
{
	this->formattarget = formattarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getTempFsFolder()
{
	return tempFsFolder;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setTempFsFolder(ConfigNodePropertyString  tempFsFolder)
{
	this->tempFsFolder = tempFsFolder;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getFileThreshold()
{
	return fileThreshold;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setFileThreshold(ConfigNodePropertyInteger  fileThreshold)
{
	this->fileThreshold = fileThreshold;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getMemoryUnit()
{
	return memoryUnit;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setMemoryUnit(ConfigNodePropertyDropDown  memoryUnit)
{
	this->memoryUnit = memoryUnit;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getUseOffHeapMemory()
{
	return useOffHeapMemory;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setUseOffHeapMemory(ConfigNodePropertyBoolean  useOffHeapMemory)
{
	this->useOffHeapMemory = useOffHeapMemory;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getDigestAlgorithm()
{
	return digestAlgorithm;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setDigestAlgorithm(ConfigNodePropertyDropDown  digestAlgorithm)
{
	this->digestAlgorithm = digestAlgorithm;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getMonitoringQueueSize()
{
	return monitoringQueueSize;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setMonitoringQueueSize(ConfigNodePropertyInteger  monitoringQueueSize)
{
	this->monitoringQueueSize = monitoringQueueSize;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getCleanupDelay()
{
	return cleanupDelay;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setCleanupDelay(ConfigNodePropertyInteger  cleanupDelay)
{
	this->cleanupDelay = cleanupDelay;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getPackagefilters()
{
	return packagefilters;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setPackagefilters(ConfigNodePropertyArray  packagefilters)
{
	this->packagefilters = packagefilters;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getPropertyfilters()
{
	return propertyfilters;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setPropertyfilters(ConfigNodePropertyArray  propertyfilters)
{
	this->propertyfilters = propertyfilters;
}


