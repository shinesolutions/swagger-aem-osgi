

#include "ComDayCqMailerImplCqMailingServiceProperties.h"

using namespace Tiny;

ComDayCqMailerImplCqMailingServiceProperties::ComDayCqMailerImplCqMailingServiceProperties()
{
	maxrecipientcount = ConfigNodePropertyString();
}

ComDayCqMailerImplCqMailingServiceProperties::ComDayCqMailerImplCqMailingServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMailerImplCqMailingServiceProperties::~ComDayCqMailerImplCqMailingServiceProperties()
{

}

void
ComDayCqMailerImplCqMailingServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxrecipientcountKey = "max.recipient.count";

    if(object.has_key(maxrecipientcountKey))
    {
        bourne::json value = object[maxrecipientcountKey];




        ConfigNodePropertyString* obj = &maxrecipientcount;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMailerImplCqMailingServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxrecipientcount"] = getMaxrecipientcount().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqMailerImplCqMailingServiceProperties::getMaxrecipientcount()
{
	return maxrecipientcount;
}

void
ComDayCqMailerImplCqMailingServiceProperties::setMaxrecipientcount(ConfigNodePropertyString maxrecipientcount)
{
	this->maxrecipientcount = maxrecipientcount;
}



