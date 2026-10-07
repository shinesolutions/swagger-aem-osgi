

#include "ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties()
{
	priorityOrder = ConfigNodePropertyInteger();
	replyEmailPatterns = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::~ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priorityOrder"] = getPriorityOrder().toJson();






	object["replyEmailPatterns"] = getReplyEmailPatterns().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::getPriorityOrder()
{
	return priorityOrder;
}

void
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::setPriorityOrder(ConfigNodePropertyInteger priorityOrder)
{
	this->priorityOrder = priorityOrder;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::getReplyEmailPatterns()
{
	return replyEmailPatterns;
}

void
ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties::setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns)
{
	this->replyEmailPatterns = replyEmailPatterns;
}



