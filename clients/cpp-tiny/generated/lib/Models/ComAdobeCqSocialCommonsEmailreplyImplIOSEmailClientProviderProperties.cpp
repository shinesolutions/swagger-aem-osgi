

#include "ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties()
{
	priorityOrder = ConfigNodePropertyInteger();
	replyEmailPatterns = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::~ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *priorityOrderKey = "priorityOrder";

    if(object.has_key(priorityOrderKey))
    {
        bourne::json value = object[priorityOrderKey];




        ConfigNodePropertyInteger* obj = &priorityOrder;
		obj->fromJson(value.dump());

    }

    const char *replyEmailPatternsKey = "replyEmailPatterns";

    if(object.has_key(replyEmailPatternsKey))
    {
        bourne::json value = object[replyEmailPatternsKey];




        ConfigNodePropertyArray* obj = &replyEmailPatterns;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priorityOrder"] = getPriorityOrder().toJson();






	object["replyEmailPatterns"] = getReplyEmailPatterns().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::getPriorityOrder()
{
	return priorityOrder;
}

void
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::setPriorityOrder(ConfigNodePropertyInteger priorityOrder)
{
	this->priorityOrder = priorityOrder;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::getReplyEmailPatterns()
{
	return replyEmailPatterns;
}

void
ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties::setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns)
{
	this->replyEmailPatterns = replyEmailPatterns;
}



