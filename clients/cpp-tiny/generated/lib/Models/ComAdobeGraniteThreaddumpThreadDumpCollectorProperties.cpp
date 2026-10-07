

#include "ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.h"

using namespace Tiny;

ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::ComAdobeGraniteThreaddumpThreadDumpCollectorProperties()
{
	schedulerperiod = ConfigNodePropertyInteger();
	schedulerrunOn = ConfigNodePropertyDropDown();
	granitethreaddumpenabled = ConfigNodePropertyBoolean();
	granitethreaddumpdumpsPerFile = ConfigNodePropertyInteger();
	granitethreaddumpenableGzipCompression = ConfigNodePropertyBoolean();
	granitethreaddumpenableDirectoriesCompression = ConfigNodePropertyBoolean();
	granitethreaddumpenableJStack = ConfigNodePropertyBoolean();
	granitethreaddumpmaxBackupDays = ConfigNodePropertyInteger();
	granitethreaddumpbackupCleanTrigger = ConfigNodePropertyString();
}

ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::~ComAdobeGraniteThreaddumpThreadDumpCollectorProperties()
{

}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerperiodKey = "scheduler.period";

    if(object.has_key(schedulerperiodKey))
    {
        bourne::json value = object[schedulerperiodKey];




        ConfigNodePropertyInteger* obj = &schedulerperiod;
		obj->fromJson(value.dump());

    }

    const char *schedulerrunOnKey = "scheduler.runOn";

    if(object.has_key(schedulerrunOnKey))
    {
        bourne::json value = object[schedulerrunOnKey];




        ConfigNodePropertyDropDown* obj = &schedulerrunOn;
		obj->fromJson(value.dump());

    }

    const char *granitethreaddumpenabledKey = "granite.threaddump.enabled";

    if(object.has_key(granitethreaddumpenabledKey))
    {
        bourne::json value = object[granitethreaddumpenabledKey];




        ConfigNodePropertyBoolean* obj = &granitethreaddumpenabled;
		obj->fromJson(value.dump());

    }

    const char *granitethreaddumpdumpsPerFileKey = "granite.threaddump.dumpsPerFile";

    if(object.has_key(granitethreaddumpdumpsPerFileKey))
    {
        bourne::json value = object[granitethreaddumpdumpsPerFileKey];




        ConfigNodePropertyInteger* obj = &granitethreaddumpdumpsPerFile;
		obj->fromJson(value.dump());

    }

    const char *granitethreaddumpenableGzipCompressionKey = "granite.threaddump.enableGzipCompression";

    if(object.has_key(granitethreaddumpenableGzipCompressionKey))
    {
        bourne::json value = object[granitethreaddumpenableGzipCompressionKey];




        ConfigNodePropertyBoolean* obj = &granitethreaddumpenableGzipCompression;
		obj->fromJson(value.dump());

    }

    const char *granitethreaddumpenableDirectoriesCompressionKey = "granite.threaddump.enableDirectoriesCompression";

    if(object.has_key(granitethreaddumpenableDirectoriesCompressionKey))
    {
        bourne::json value = object[granitethreaddumpenableDirectoriesCompressionKey];




        ConfigNodePropertyBoolean* obj = &granitethreaddumpenableDirectoriesCompression;
		obj->fromJson(value.dump());

    }

    const char *granitethreaddumpenableJStackKey = "granite.threaddump.enableJStack";

    if(object.has_key(granitethreaddumpenableJStackKey))
    {
        bourne::json value = object[granitethreaddumpenableJStackKey];




        ConfigNodePropertyBoolean* obj = &granitethreaddumpenableJStack;
		obj->fromJson(value.dump());

    }

    const char *granitethreaddumpmaxBackupDaysKey = "granite.threaddump.maxBackupDays";

    if(object.has_key(granitethreaddumpmaxBackupDaysKey))
    {
        bourne::json value = object[granitethreaddumpmaxBackupDaysKey];




        ConfigNodePropertyInteger* obj = &granitethreaddumpmaxBackupDays;
		obj->fromJson(value.dump());

    }

    const char *granitethreaddumpbackupCleanTriggerKey = "granite.threaddump.backupCleanTrigger";

    if(object.has_key(granitethreaddumpbackupCleanTriggerKey))
    {
        bourne::json value = object[granitethreaddumpbackupCleanTriggerKey];




        ConfigNodePropertyString* obj = &granitethreaddumpbackupCleanTrigger;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerperiod"] = getSchedulerperiod().toJson();






	object["schedulerrunOn"] = getSchedulerrunOn().toJson();






	object["granitethreaddumpenabled"] = getGranitethreaddumpenabled().toJson();






	object["granitethreaddumpdumpsPerFile"] = getGranitethreaddumpdumpsPerFile().toJson();






	object["granitethreaddumpenableGzipCompression"] = getGranitethreaddumpenableGzipCompression().toJson();






	object["granitethreaddumpenableDirectoriesCompression"] = getGranitethreaddumpenableDirectoriesCompression().toJson();






	object["granitethreaddumpenableJStack"] = getGranitethreaddumpenableJStack().toJson();






	object["granitethreaddumpmaxBackupDays"] = getGranitethreaddumpmaxBackupDays().toJson();






	object["granitethreaddumpbackupCleanTrigger"] = getGranitethreaddumpbackupCleanTrigger().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setSchedulerperiod(ConfigNodePropertyInteger schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}

ConfigNodePropertyDropDown
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getSchedulerrunOn()
{
	return schedulerrunOn;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setSchedulerrunOn(ConfigNodePropertyDropDown schedulerrunOn)
{
	this->schedulerrunOn = schedulerrunOn;
}

ConfigNodePropertyBoolean
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpenabled()
{
	return granitethreaddumpenabled;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpenabled(ConfigNodePropertyBoolean granitethreaddumpenabled)
{
	this->granitethreaddumpenabled = granitethreaddumpenabled;
}

ConfigNodePropertyInteger
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpdumpsPerFile()
{
	return granitethreaddumpdumpsPerFile;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpdumpsPerFile(ConfigNodePropertyInteger granitethreaddumpdumpsPerFile)
{
	this->granitethreaddumpdumpsPerFile = granitethreaddumpdumpsPerFile;
}

ConfigNodePropertyBoolean
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpenableGzipCompression()
{
	return granitethreaddumpenableGzipCompression;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpenableGzipCompression(ConfigNodePropertyBoolean granitethreaddumpenableGzipCompression)
{
	this->granitethreaddumpenableGzipCompression = granitethreaddumpenableGzipCompression;
}

ConfigNodePropertyBoolean
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpenableDirectoriesCompression()
{
	return granitethreaddumpenableDirectoriesCompression;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpenableDirectoriesCompression(ConfigNodePropertyBoolean granitethreaddumpenableDirectoriesCompression)
{
	this->granitethreaddumpenableDirectoriesCompression = granitethreaddumpenableDirectoriesCompression;
}

ConfigNodePropertyBoolean
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpenableJStack()
{
	return granitethreaddumpenableJStack;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpenableJStack(ConfigNodePropertyBoolean granitethreaddumpenableJStack)
{
	this->granitethreaddumpenableJStack = granitethreaddumpenableJStack;
}

ConfigNodePropertyInteger
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpmaxBackupDays()
{
	return granitethreaddumpmaxBackupDays;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpmaxBackupDays(ConfigNodePropertyInteger granitethreaddumpmaxBackupDays)
{
	this->granitethreaddumpmaxBackupDays = granitethreaddumpmaxBackupDays;
}

ConfigNodePropertyString
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::getGranitethreaddumpbackupCleanTrigger()
{
	return granitethreaddumpbackupCleanTrigger;
}

void
ComAdobeGraniteThreaddumpThreadDumpCollectorProperties::setGranitethreaddumpbackupCleanTrigger(ConfigNodePropertyString granitethreaddumpbackupCleanTrigger)
{
	this->granitethreaddumpbackupCleanTrigger = granitethreaddumpbackupCleanTrigger;
}



