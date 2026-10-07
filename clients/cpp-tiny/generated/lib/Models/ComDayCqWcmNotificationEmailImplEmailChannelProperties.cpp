

#include "ComDayCqWcmNotificationEmailImplEmailChannelProperties.h"

using namespace Tiny;

ComDayCqWcmNotificationEmailImplEmailChannelProperties::ComDayCqWcmNotificationEmailImplEmailChannelProperties()
{
	emailfrom = ConfigNodePropertyString();
}

ComDayCqWcmNotificationEmailImplEmailChannelProperties::ComDayCqWcmNotificationEmailImplEmailChannelProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmNotificationEmailImplEmailChannelProperties::~ComDayCqWcmNotificationEmailImplEmailChannelProperties()
{

}

void
ComDayCqWcmNotificationEmailImplEmailChannelProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emailfromKey = "email.from";

    if(object.has_key(emailfromKey))
    {
        bourne::json value = object[emailfromKey];




        ConfigNodePropertyString* obj = &emailfrom;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmNotificationEmailImplEmailChannelProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["emailfrom"] = getEmailfrom().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmNotificationEmailImplEmailChannelProperties::getEmailfrom()
{
	return emailfrom;
}

void
ComDayCqWcmNotificationEmailImplEmailChannelProperties::setEmailfrom(ConfigNodePropertyString emailfrom)
{
	this->emailfrom = emailfrom;
}



