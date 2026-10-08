

#include "ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.h"

using namespace Tiny;

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties()
{
	maxRetry = ConfigNodePropertyInteger();
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::~ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties()
{

}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxRetryKey = "MaxRetry";

    if(object.has_key(maxRetryKey))
    {
        bourne::json value = object[maxRetryKey];




        ConfigNodePropertyInteger* obj = &maxRetry;
		obj->fromJson(value.dump());

    }

    const char *fieldWhitelistKey = "fieldWhitelist";

    if(object.has_key(fieldWhitelistKey))
    {
        bourne::json value = object[fieldWhitelistKey];




        ConfigNodePropertyArray* obj = &fieldWhitelist;
		obj->fromJson(value.dump());

    }

    const char *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";

    if(object.has_key(attachmentTypeBlacklistKey))
    {
        bourne::json value = object[attachmentTypeBlacklistKey];




        ConfigNodePropertyArray* obj = &attachmentTypeBlacklist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxRetry"] = getMaxRetry().toJson();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::getMaxRetry()
{
	return maxRetry;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::setMaxRetry(ConfigNodePropertyInteger maxRetry)
{
	this->maxRetry = maxRetry;
}

ConfigNodePropertyArray
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



