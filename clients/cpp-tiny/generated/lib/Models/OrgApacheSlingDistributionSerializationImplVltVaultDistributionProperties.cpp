

#include "OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties()
{
	name = ConfigNodePropertyString();
	type = ConfigNodePropertyDropDown();
	importMode = ConfigNodePropertyString();
	aclHandling = ConfigNodePropertyString();
	packageroots = ConfigNodePropertyString();
	packagefilters = ConfigNodePropertyArray();
	propertyfilters = ConfigNodePropertyArray();
	tempFsFolder = ConfigNodePropertyString();
	useBinaryReferences = ConfigNodePropertyBoolean();
	autoSaveThreshold = ConfigNodePropertyInteger();
	cleanupDelay = ConfigNodePropertyInteger();
	fileThreshold = ConfigNodePropertyInteger();
	mEGA_BYTES = ConfigNodePropertyDropDown();
	useOffHeapMemory = ConfigNodePropertyBoolean();
	digestAlgorithm = ConfigNodePropertyDropDown();
	monitoringQueueSize = ConfigNodePropertyInteger();
	pathsMapping = ConfigNodePropertyArray();
	strictImport = ConfigNodePropertyBoolean();
}

OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::~OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties()
{

}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        ConfigNodePropertyDropDown* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *importModeKey = "importMode";

    if(object.has_key(importModeKey))
    {
        bourne::json value = object[importModeKey];




        ConfigNodePropertyString* obj = &importMode;
		obj->fromJson(value.dump());

    }

    const char *aclHandlingKey = "aclHandling";

    if(object.has_key(aclHandlingKey))
    {
        bourne::json value = object[aclHandlingKey];




        ConfigNodePropertyString* obj = &aclHandling;
		obj->fromJson(value.dump());

    }

    const char *packagerootsKey = "package.roots";

    if(object.has_key(packagerootsKey))
    {
        bourne::json value = object[packagerootsKey];




        ConfigNodePropertyString* obj = &packageroots;
		obj->fromJson(value.dump());

    }

    const char *packagefiltersKey = "package.filters";

    if(object.has_key(packagefiltersKey))
    {
        bourne::json value = object[packagefiltersKey];




        ConfigNodePropertyArray* obj = &packagefilters;
		obj->fromJson(value.dump());

    }

    const char *propertyfiltersKey = "property.filters";

    if(object.has_key(propertyfiltersKey))
    {
        bourne::json value = object[propertyfiltersKey];




        ConfigNodePropertyArray* obj = &propertyfilters;
		obj->fromJson(value.dump());

    }

    const char *tempFsFolderKey = "tempFsFolder";

    if(object.has_key(tempFsFolderKey))
    {
        bourne::json value = object[tempFsFolderKey];




        ConfigNodePropertyString* obj = &tempFsFolder;
		obj->fromJson(value.dump());

    }

    const char *useBinaryReferencesKey = "useBinaryReferences";

    if(object.has_key(useBinaryReferencesKey))
    {
        bourne::json value = object[useBinaryReferencesKey];




        ConfigNodePropertyBoolean* obj = &useBinaryReferences;
		obj->fromJson(value.dump());

    }

    const char *autoSaveThresholdKey = "autoSaveThreshold";

    if(object.has_key(autoSaveThresholdKey))
    {
        bourne::json value = object[autoSaveThresholdKey];




        ConfigNodePropertyInteger* obj = &autoSaveThreshold;
		obj->fromJson(value.dump());

    }

    const char *cleanupDelayKey = "cleanupDelay";

    if(object.has_key(cleanupDelayKey))
    {
        bourne::json value = object[cleanupDelayKey];




        ConfigNodePropertyInteger* obj = &cleanupDelay;
		obj->fromJson(value.dump());

    }

    const char *fileThresholdKey = "fileThreshold";

    if(object.has_key(fileThresholdKey))
    {
        bourne::json value = object[fileThresholdKey];




        ConfigNodePropertyInteger* obj = &fileThreshold;
		obj->fromJson(value.dump());

    }

    const char *mEGA_BYTESKey = "MEGA_BYTES";

    if(object.has_key(mEGA_BYTESKey))
    {
        bourne::json value = object[mEGA_BYTESKey];




        ConfigNodePropertyDropDown* obj = &mEGA_BYTES;
		obj->fromJson(value.dump());

    }

    const char *useOffHeapMemoryKey = "useOffHeapMemory";

    if(object.has_key(useOffHeapMemoryKey))
    {
        bourne::json value = object[useOffHeapMemoryKey];




        ConfigNodePropertyBoolean* obj = &useOffHeapMemory;
		obj->fromJson(value.dump());

    }

    const char *digestAlgorithmKey = "digestAlgorithm";

    if(object.has_key(digestAlgorithmKey))
    {
        bourne::json value = object[digestAlgorithmKey];




        ConfigNodePropertyDropDown* obj = &digestAlgorithm;
		obj->fromJson(value.dump());

    }

    const char *monitoringQueueSizeKey = "monitoringQueueSize";

    if(object.has_key(monitoringQueueSizeKey))
    {
        bourne::json value = object[monitoringQueueSizeKey];




        ConfigNodePropertyInteger* obj = &monitoringQueueSize;
		obj->fromJson(value.dump());

    }

    const char *pathsMappingKey = "pathsMapping";

    if(object.has_key(pathsMappingKey))
    {
        bourne::json value = object[pathsMappingKey];




        ConfigNodePropertyArray* obj = &pathsMapping;
		obj->fromJson(value.dump());

    }

    const char *strictImportKey = "strictImport";

    if(object.has_key(strictImportKey))
    {
        bourne::json value = object[strictImportKey];




        ConfigNodePropertyBoolean* obj = &strictImport;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["type"] = getType().toJson();






	object["importMode"] = getImportMode().toJson();






	object["aclHandling"] = getAclHandling().toJson();






	object["packageroots"] = getPackageroots().toJson();






	object["packagefilters"] = getPackagefilters().toJson();






	object["propertyfilters"] = getPropertyfilters().toJson();






	object["tempFsFolder"] = getTempFsFolder().toJson();






	object["useBinaryReferences"] = getUseBinaryReferences().toJson();






	object["autoSaveThreshold"] = getAutoSaveThreshold().toJson();






	object["cleanupDelay"] = getCleanupDelay().toJson();






	object["fileThreshold"] = getFileThreshold().toJson();






	object["mEGA_BYTES"] = getMEGABYTES().toJson();






	object["useOffHeapMemory"] = getUseOffHeapMemory().toJson();






	object["digestAlgorithm"] = getDigestAlgorithm().toJson();






	object["monitoringQueueSize"] = getMonitoringQueueSize().toJson();






	object["pathsMapping"] = getPathsMapping().toJson();






	object["strictImport"] = getStrictImport().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getType()
{
	return type;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setType(ConfigNodePropertyDropDown type)
{
	this->type = type;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getImportMode()
{
	return importMode;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setImportMode(ConfigNodePropertyString importMode)
{
	this->importMode = importMode;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getAclHandling()
{
	return aclHandling;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setAclHandling(ConfigNodePropertyString aclHandling)
{
	this->aclHandling = aclHandling;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getPackageroots()
{
	return packageroots;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setPackageroots(ConfigNodePropertyString packageroots)
{
	this->packageroots = packageroots;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getPackagefilters()
{
	return packagefilters;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setPackagefilters(ConfigNodePropertyArray packagefilters)
{
	this->packagefilters = packagefilters;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getPropertyfilters()
{
	return propertyfilters;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setPropertyfilters(ConfigNodePropertyArray propertyfilters)
{
	this->propertyfilters = propertyfilters;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getTempFsFolder()
{
	return tempFsFolder;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setTempFsFolder(ConfigNodePropertyString tempFsFolder)
{
	this->tempFsFolder = tempFsFolder;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getUseBinaryReferences()
{
	return useBinaryReferences;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences)
{
	this->useBinaryReferences = useBinaryReferences;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getAutoSaveThreshold()
{
	return autoSaveThreshold;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold)
{
	this->autoSaveThreshold = autoSaveThreshold;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getCleanupDelay()
{
	return cleanupDelay;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setCleanupDelay(ConfigNodePropertyInteger cleanupDelay)
{
	this->cleanupDelay = cleanupDelay;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getFileThreshold()
{
	return fileThreshold;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setFileThreshold(ConfigNodePropertyInteger fileThreshold)
{
	this->fileThreshold = fileThreshold;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getMEGABYTES()
{
	return mEGA_BYTES;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setMEGABYTES(ConfigNodePropertyDropDown mEGA_BYTES)
{
	this->mEGA_BYTES = mEGA_BYTES;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getUseOffHeapMemory()
{
	return useOffHeapMemory;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory)
{
	this->useOffHeapMemory = useOffHeapMemory;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getDigestAlgorithm()
{
	return digestAlgorithm;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm)
{
	this->digestAlgorithm = digestAlgorithm;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getMonitoringQueueSize()
{
	return monitoringQueueSize;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize)
{
	this->monitoringQueueSize = monitoringQueueSize;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getPathsMapping()
{
	return pathsMapping;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setPathsMapping(ConfigNodePropertyArray pathsMapping)
{
	this->pathsMapping = pathsMapping;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::getStrictImport()
{
	return strictImport;
}

void
OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties::setStrictImport(ConfigNodePropertyBoolean strictImport)
{
	this->strictImport = strictImport;
}



