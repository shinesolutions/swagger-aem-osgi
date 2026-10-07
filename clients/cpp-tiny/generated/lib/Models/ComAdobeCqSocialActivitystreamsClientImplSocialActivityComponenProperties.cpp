

#include "ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties()
{
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::~ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties()
{

}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



