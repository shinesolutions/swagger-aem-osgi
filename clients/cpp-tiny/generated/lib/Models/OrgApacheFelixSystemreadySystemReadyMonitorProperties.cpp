

#include "OrgApacheFelixSystemreadySystemReadyMonitorProperties.h"

using namespace Tiny;

OrgApacheFelixSystemreadySystemReadyMonitorProperties::OrgApacheFelixSystemreadySystemReadyMonitorProperties()
{
	pollinterval = ConfigNodePropertyInteger();
}

OrgApacheFelixSystemreadySystemReadyMonitorProperties::OrgApacheFelixSystemreadySystemReadyMonitorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadySystemReadyMonitorProperties::~OrgApacheFelixSystemreadySystemReadyMonitorProperties()
{

}

void
OrgApacheFelixSystemreadySystemReadyMonitorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pollintervalKey = "poll.interval";

    if(object.has_key(pollintervalKey))
    {
        bourne::json value = object[pollintervalKey];




        ConfigNodePropertyInteger* obj = &pollinterval;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixSystemreadySystemReadyMonitorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pollinterval"] = getPollinterval().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheFelixSystemreadySystemReadyMonitorProperties::getPollinterval()
{
	return pollinterval;
}

void
OrgApacheFelixSystemreadySystemReadyMonitorProperties::setPollinterval(ConfigNodePropertyInteger pollinterval)
{
	this->pollinterval = pollinterval;
}



