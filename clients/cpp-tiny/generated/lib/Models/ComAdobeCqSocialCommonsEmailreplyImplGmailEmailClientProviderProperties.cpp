

#include "ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties()
{
	priorityOrder = ConfigNodePropertyInteger();
	replyEmailPatterns = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::~ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priorityOrder"] = getPriorityOrder().toJson();






	object["replyEmailPatterns"] = getReplyEmailPatterns().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::getPriorityOrder()
{
	return priorityOrder;
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::setPriorityOrder(ConfigNodePropertyInteger priorityOrder)
{
	this->priorityOrder = priorityOrder;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::getReplyEmailPatterns()
{
	return replyEmailPatterns;
}

void
ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties::setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns)
{
	this->replyEmailPatterns = replyEmailPatterns;
}



