

#include "ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.h"

using namespace Tiny;

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties()
{
	fullgcdays = ConfigNodePropertyArray();
}

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::~ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties()
{

}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fullgcdaysKey = "full.gc.days";

    if(object.has_key(fullgcdaysKey))
    {
        bourne::json value = object[fullgcdaysKey];




        ConfigNodePropertyArray* obj = &fullgcdays;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fullgcdays"] = getFullgcdays().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::getFullgcdays()
{
	return fullgcdays;
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::setFullgcdays(ConfigNodePropertyArray fullgcdays)
{
	this->fullgcdays = fullgcdays;
}



