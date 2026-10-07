

#include "ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties()
{
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::~ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties()
{

}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *priorityKey = "priority";

    if(object.has_key(priorityKey))
    {
        bourne::json value = object[priorityKey];




        ConfigNodePropertyInteger* obj = &priority;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



