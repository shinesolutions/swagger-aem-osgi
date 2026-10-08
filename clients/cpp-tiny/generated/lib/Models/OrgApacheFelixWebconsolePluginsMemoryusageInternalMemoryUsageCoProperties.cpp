

#include "OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.h"

using namespace Tiny;

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties()
{
	felixmemoryusagedumpthreshold = ConfigNodePropertyInteger();
	felixmemoryusagedumpinterval = ConfigNodePropertyInteger();
	felixmemoryusagedumplocation = ConfigNodePropertyString();
}

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::~OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties()
{

}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *felixmemoryusagedumpthresholdKey = "felix.memoryusage.dump.threshold";

    if(object.has_key(felixmemoryusagedumpthresholdKey))
    {
        bourne::json value = object[felixmemoryusagedumpthresholdKey];




        ConfigNodePropertyInteger* obj = &felixmemoryusagedumpthreshold;
		obj->fromJson(value.dump());

    }

    const char *felixmemoryusagedumpintervalKey = "felix.memoryusage.dump.interval";

    if(object.has_key(felixmemoryusagedumpintervalKey))
    {
        bourne::json value = object[felixmemoryusagedumpintervalKey];




        ConfigNodePropertyInteger* obj = &felixmemoryusagedumpinterval;
		obj->fromJson(value.dump());

    }

    const char *felixmemoryusagedumplocationKey = "felix.memoryusage.dump.location";

    if(object.has_key(felixmemoryusagedumplocationKey))
    {
        bourne::json value = object[felixmemoryusagedumplocationKey];




        ConfigNodePropertyString* obj = &felixmemoryusagedumplocation;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["felixmemoryusagedumpthreshold"] = getFelixmemoryusagedumpthreshold().toJson();






	object["felixmemoryusagedumpinterval"] = getFelixmemoryusagedumpinterval().toJson();






	object["felixmemoryusagedumplocation"] = getFelixmemoryusagedumplocation().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::getFelixmemoryusagedumpthreshold()
{
	return felixmemoryusagedumpthreshold;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::setFelixmemoryusagedumpthreshold(ConfigNodePropertyInteger felixmemoryusagedumpthreshold)
{
	this->felixmemoryusagedumpthreshold = felixmemoryusagedumpthreshold;
}

ConfigNodePropertyInteger
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::getFelixmemoryusagedumpinterval()
{
	return felixmemoryusagedumpinterval;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::setFelixmemoryusagedumpinterval(ConfigNodePropertyInteger felixmemoryusagedumpinterval)
{
	this->felixmemoryusagedumpinterval = felixmemoryusagedumpinterval;
}

ConfigNodePropertyString
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::getFelixmemoryusagedumplocation()
{
	return felixmemoryusagedumplocation;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::setFelixmemoryusagedumplocation(ConfigNodePropertyString felixmemoryusagedumplocation)
{
	this->felixmemoryusagedumplocation = felixmemoryusagedumplocation;
}



