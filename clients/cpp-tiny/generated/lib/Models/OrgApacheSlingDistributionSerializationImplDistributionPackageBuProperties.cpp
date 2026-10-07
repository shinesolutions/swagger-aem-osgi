

#include "OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties()
{
	name = ConfigNodePropertyString();
	type = ConfigNodePropertyDropDown();
	formattarget = ConfigNodePropertyString();
	tempFsFolder = ConfigNodePropertyString();
	fileThreshold = ConfigNodePropertyInteger();
	memoryUnit = ConfigNodePropertyDropDown();
	useOffHeapMemory = ConfigNodePropertyBoolean();
	digestAlgorithm = ConfigNodePropertyDropDown();
	monitoringQueueSize = ConfigNodePropertyInteger();
	cleanupDelay = ConfigNodePropertyInteger();
	packagefilters = ConfigNodePropertyArray();
	propertyfilters = ConfigNodePropertyArray();
}

OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::~OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties()
{

}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::fromJson(std::string jsonObj)
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

    const char *formattargetKey = "format.target";

    if(object.has_key(formattargetKey))
    {
        bourne::json value = object[formattargetKey];




        ConfigNodePropertyString* obj = &formattarget;
		obj->fromJson(value.dump());

    }

    const char *tempFsFolderKey = "tempFsFolder";

    if(object.has_key(tempFsFolderKey))
    {
        bourne::json value = object[tempFsFolderKey];




        ConfigNodePropertyString* obj = &tempFsFolder;
		obj->fromJson(value.dump());

    }

    const char *fileThresholdKey = "fileThreshold";

    if(object.has_key(fileThresholdKey))
    {
        bourne::json value = object[fileThresholdKey];




        ConfigNodePropertyInteger* obj = &fileThreshold;
		obj->fromJson(value.dump());

    }

    const char *memoryUnitKey = "memoryUnit";

    if(object.has_key(memoryUnitKey))
    {
        bourne::json value = object[memoryUnitKey];




        ConfigNodePropertyDropDown* obj = &memoryUnit;
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

    const char *cleanupDelayKey = "cleanupDelay";

    if(object.has_key(cleanupDelayKey))
    {
        bourne::json value = object[cleanupDelayKey];




        ConfigNodePropertyInteger* obj = &cleanupDelay;
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


}

bourne::json
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["type"] = getType().toJson();






	object["formattarget"] = getFormattarget().toJson();






	object["tempFsFolder"] = getTempFsFolder().toJson();






	object["fileThreshold"] = getFileThreshold().toJson();






	object["memoryUnit"] = getMemoryUnit().toJson();






	object["useOffHeapMemory"] = getUseOffHeapMemory().toJson();






	object["digestAlgorithm"] = getDigestAlgorithm().toJson();






	object["monitoringQueueSize"] = getMonitoringQueueSize().toJson();






	object["cleanupDelay"] = getCleanupDelay().toJson();






	object["packagefilters"] = getPackagefilters().toJson();






	object["propertyfilters"] = getPropertyfilters().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getType()
{
	return type;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setType(ConfigNodePropertyDropDown type)
{
	this->type = type;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getFormattarget()
{
	return formattarget;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setFormattarget(ConfigNodePropertyString formattarget)
{
	this->formattarget = formattarget;
}

ConfigNodePropertyString
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getTempFsFolder()
{
	return tempFsFolder;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setTempFsFolder(ConfigNodePropertyString tempFsFolder)
{
	this->tempFsFolder = tempFsFolder;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getFileThreshold()
{
	return fileThreshold;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setFileThreshold(ConfigNodePropertyInteger fileThreshold)
{
	this->fileThreshold = fileThreshold;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getMemoryUnit()
{
	return memoryUnit;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setMemoryUnit(ConfigNodePropertyDropDown memoryUnit)
{
	this->memoryUnit = memoryUnit;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getUseOffHeapMemory()
{
	return useOffHeapMemory;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory)
{
	this->useOffHeapMemory = useOffHeapMemory;
}

ConfigNodePropertyDropDown
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getDigestAlgorithm()
{
	return digestAlgorithm;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm)
{
	this->digestAlgorithm = digestAlgorithm;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getMonitoringQueueSize()
{
	return monitoringQueueSize;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize)
{
	this->monitoringQueueSize = monitoringQueueSize;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getCleanupDelay()
{
	return cleanupDelay;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setCleanupDelay(ConfigNodePropertyInteger cleanupDelay)
{
	this->cleanupDelay = cleanupDelay;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getPackagefilters()
{
	return packagefilters;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setPackagefilters(ConfigNodePropertyArray packagefilters)
{
	this->packagefilters = packagefilters;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::getPropertyfilters()
{
	return propertyfilters;
}

void
OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties::setPropertyfilters(ConfigNodePropertyArray propertyfilters)
{
	this->propertyfilters = propertyfilters;
}



