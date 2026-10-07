

#include "ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.h"

using namespace Tiny;

ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::ComAdobeCqSocialCalendarServletsTimeZoneServletProperties()
{
	timezonesexpirytime = ConfigNodePropertyInteger();
}

ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::ComAdobeCqSocialCalendarServletsTimeZoneServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::~ComAdobeCqSocialCalendarServletsTimeZoneServletProperties()
{

}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *timezonesexpirytimeKey = "timezones.expirytime";

    if(object.has_key(timezonesexpirytimeKey))
    {
        bourne::json value = object[timezonesexpirytimeKey];




        ConfigNodePropertyInteger* obj = &timezonesexpirytime;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["timezonesexpirytime"] = getTimezonesexpirytime().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::getTimezonesexpirytime()
{
	return timezonesexpirytime;
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::setTimezonesexpirytime(ConfigNodePropertyInteger timezonesexpirytime)
{
	this->timezonesexpirytime = timezonesexpirytime;
}



