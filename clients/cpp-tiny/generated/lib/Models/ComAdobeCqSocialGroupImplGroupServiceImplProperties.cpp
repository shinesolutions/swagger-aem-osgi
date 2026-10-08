

#include "ComAdobeCqSocialGroupImplGroupServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialGroupImplGroupServiceImplProperties::ComAdobeCqSocialGroupImplGroupServiceImplProperties()
{
	maxWaitTime = ConfigNodePropertyInteger();
	minWaitBetweenRetries = ConfigNodePropertyInteger();
}

ComAdobeCqSocialGroupImplGroupServiceImplProperties::ComAdobeCqSocialGroupImplGroupServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialGroupImplGroupServiceImplProperties::~ComAdobeCqSocialGroupImplGroupServiceImplProperties()
{

}

void
ComAdobeCqSocialGroupImplGroupServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxWaitTimeKey = "maxWaitTime";

    if(object.has_key(maxWaitTimeKey))
    {
        bourne::json value = object[maxWaitTimeKey];




        ConfigNodePropertyInteger* obj = &maxWaitTime;
		obj->fromJson(value.dump());

    }

    const char *minWaitBetweenRetriesKey = "minWaitBetweenRetries";

    if(object.has_key(minWaitBetweenRetriesKey))
    {
        bourne::json value = object[minWaitBetweenRetriesKey];




        ConfigNodePropertyInteger* obj = &minWaitBetweenRetries;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialGroupImplGroupServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxWaitTime"] = getMaxWaitTime().toJson();






	object["minWaitBetweenRetries"] = getMinWaitBetweenRetries().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialGroupImplGroupServiceImplProperties::getMaxWaitTime()
{
	return maxWaitTime;
}

void
ComAdobeCqSocialGroupImplGroupServiceImplProperties::setMaxWaitTime(ConfigNodePropertyInteger maxWaitTime)
{
	this->maxWaitTime = maxWaitTime;
}

ConfigNodePropertyInteger
ComAdobeCqSocialGroupImplGroupServiceImplProperties::getMinWaitBetweenRetries()
{
	return minWaitBetweenRetries;
}

void
ComAdobeCqSocialGroupImplGroupServiceImplProperties::setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries)
{
	this->minWaitBetweenRetries = minWaitBetweenRetries;
}



