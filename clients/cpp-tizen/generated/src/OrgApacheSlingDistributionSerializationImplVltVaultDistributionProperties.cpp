#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties()
{
	//__init();
}

OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::~OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//type = new ConfigNodePropertyDropDown();
	//importMode = new ConfigNodePropertyString();
	//aclHandling = new ConfigNodePropertyString();
	//packageroots = new ConfigNodePropertyString();
	//packagefilters = new ConfigNodePropertyArray();
	//propertyfilters = new ConfigNodePropertyArray();
	//tempFsFolder = new ConfigNodePropertyString();
	//useBinaryReferences = new ConfigNodePropertyBoolean();
	//autoSaveThreshold = new ConfigNodePropertyInteger();
	//cleanupDelay = new ConfigNodePropertyInteger();
	//fileThreshold = new ConfigNodePropertyInteger();
	//mEGA_BYTES = new ConfigNodePropertyDropDown();
	//useOffHeapMemory = new ConfigNodePropertyBoolean();
	//digestAlgorithm = new ConfigNodePropertyDropDown();
	//monitoringQueueSize = new ConfigNodePropertyInteger();
	//pathsMapping = new ConfigNodePropertyArray();
	//strictImport = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::__cleanup()
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
	//if(importMode != NULL) {
	//
	//delete importMode;
	//importMode = NULL;
	//}
	//if(aclHandling != NULL) {
	//
	//delete aclHandling;
	//aclHandling = NULL;
	//}
	//if(packageroots != NULL) {
	//
	//delete packageroots;
	//packageroots = NULL;
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
	//if(tempFsFolder != NULL) {
	//
	//delete tempFsFolder;
	//tempFsFolder = NULL;
	//}
	//if(useBinaryReferences != NULL) {
	//
	//delete useBinaryReferences;
	//useBinaryReferences = NULL;
	//}
	//if(autoSaveThreshold != NULL) {
	//
	//delete autoSaveThreshold;
	//autoSaveThreshold = NULL;
	//}
	//if(cleanupDelay != NULL) {
	//
	//delete cleanupDelay;
	//cleanupDelay = NULL;
	//}
	//if(fileThreshold != NULL) {
	//
	//delete fileThreshold;
	//fileThreshold = NULL;
	//}
	//if(mEGA_BYTES != NULL) {
	//
	//delete mEGA_BYTES;
	//mEGA_BYTES = NULL;
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
	//if(pathsMapping != NULL) {
	//
	//delete pathsMapping;
	//pathsMapping = NULL;
	//}
	//if(strictImport != NULL) {
	//
	//delete strictImport;
	//strictImport = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::fromJson(char* jsonStr)
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
	const gchar *importModeKey = "importMode";
	node = json_object_get_member(pJsonObject, importModeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&importMode, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&importMode);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *aclHandlingKey = "aclHandling";
	node = json_object_get_member(pJsonObject, aclHandlingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&aclHandling, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&aclHandling);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *packagerootsKey = "package.roots";
	node = json_object_get_member(pJsonObject, packagerootsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&packageroots, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&packageroots);
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
	const gchar *useBinaryReferencesKey = "useBinaryReferences";
	node = json_object_get_member(pJsonObject, useBinaryReferencesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&useBinaryReferences, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&useBinaryReferences);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *autoSaveThresholdKey = "autoSaveThreshold";
	node = json_object_get_member(pJsonObject, autoSaveThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&autoSaveThreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&autoSaveThreshold);
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
	const gchar *mEGA_BYTESKey = "MEGA_BYTES";
	node = json_object_get_member(pJsonObject, mEGA_BYTESKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&mEGA_BYTES, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&mEGA_BYTES);
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
	const gchar *pathsMappingKey = "pathsMapping";
	node = json_object_get_member(pJsonObject, pathsMappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&pathsMapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&pathsMapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *strictImportKey = "strictImport";
	node = json_object_get_member(pJsonObject, strictImportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&strictImport, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&strictImport);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::toJson()
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
		ConfigNodePropertyString obj = getImportMode();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImportMode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *importModeKey = "importMode";
	json_object_set_member(pJsonObject, importModeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAclHandling();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAclHandling());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aclHandlingKey = "aclHandling";
	json_object_set_member(pJsonObject, aclHandlingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPackageroots();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPackageroots());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packagerootsKey = "package.roots";
	json_object_set_member(pJsonObject, packagerootsKey, node);
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
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUseBinaryReferences();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUseBinaryReferences());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *useBinaryReferencesKey = "useBinaryReferences";
	json_object_set_member(pJsonObject, useBinaryReferencesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getAutoSaveThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getAutoSaveThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *autoSaveThresholdKey = "autoSaveThreshold";
	json_object_set_member(pJsonObject, autoSaveThresholdKey, node);
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
		ConfigNodePropertyDropDown obj = getMEGABYTES();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getMEGABYTES());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mEGA_BYTESKey = "MEGA_BYTES";
	json_object_set_member(pJsonObject, mEGA_BYTESKey, node);
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPathsMapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPathsMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathsMappingKey = "pathsMapping";
	json_object_set_member(pJsonObject, pathsMappingKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getStrictImport();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getStrictImport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *strictImportKey = "strictImport";
	json_object_set_member(pJsonObject, strictImportKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getType()
{
	return type;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setType(ConfigNodePropertyDropDown  type)
{
	this->type = type;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getImportMode()
{
	return importMode;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setImportMode(ConfigNodePropertyString  importMode)
{
	this->importMode = importMode;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getAclHandling()
{
	return aclHandling;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setAclHandling(ConfigNodePropertyString  aclHandling)
{
	this->aclHandling = aclHandling;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getPackageroots()
{
	return packageroots;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setPackageroots(ConfigNodePropertyString  packageroots)
{
	this->packageroots = packageroots;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getPackagefilters()
{
	return packagefilters;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setPackagefilters(ConfigNodePropertyArray  packagefilters)
{
	this->packagefilters = packagefilters;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getPropertyfilters()
{
	return propertyfilters;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setPropertyfilters(ConfigNodePropertyArray  propertyfilters)
{
	this->propertyfilters = propertyfilters;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getTempFsFolder()
{
	return tempFsFolder;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setTempFsFolder(ConfigNodePropertyString  tempFsFolder)
{
	this->tempFsFolder = tempFsFolder;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getUseBinaryReferences()
{
	return useBinaryReferences;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setUseBinaryReferences(ConfigNodePropertyBoolean  useBinaryReferences)
{
	this->useBinaryReferences = useBinaryReferences;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getAutoSaveThreshold()
{
	return autoSaveThreshold;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setAutoSaveThreshold(ConfigNodePropertyInteger  autoSaveThreshold)
{
	this->autoSaveThreshold = autoSaveThreshold;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getCleanupDelay()
{
	return cleanupDelay;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setCleanupDelay(ConfigNodePropertyInteger  cleanupDelay)
{
	this->cleanupDelay = cleanupDelay;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getFileThreshold()
{
	return fileThreshold;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setFileThreshold(ConfigNodePropertyInteger  fileThreshold)
{
	this->fileThreshold = fileThreshold;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getMEGABYTES()
{
	return mEGA_BYTES;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setMEGABYTES(ConfigNodePropertyDropDown  mEGA_BYTES)
{
	this->mEGA_BYTES = mEGA_BYTES;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getUseOffHeapMemory()
{
	return useOffHeapMemory;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setUseOffHeapMemory(ConfigNodePropertyBoolean  useOffHeapMemory)
{
	this->useOffHeapMemory = useOffHeapMemory;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getDigestAlgorithm()
{
	return digestAlgorithm;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setDigestAlgorithm(ConfigNodePropertyDropDown  digestAlgorithm)
{
	this->digestAlgorithm = digestAlgorithm;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getMonitoringQueueSize()
{
	return monitoringQueueSize;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setMonitoringQueueSize(ConfigNodePropertyInteger  monitoringQueueSize)
{
	this->monitoringQueueSize = monitoringQueueSize;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getPathsMapping()
{
	return pathsMapping;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setPathsMapping(ConfigNodePropertyArray  pathsMapping)
{
	this->pathsMapping = pathsMapping;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getStrictImport()
{
	return strictImport;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setStrictImport(ConfigNodePropertyBoolean  strictImport)
{
	this->strictImport = strictImport;
}


