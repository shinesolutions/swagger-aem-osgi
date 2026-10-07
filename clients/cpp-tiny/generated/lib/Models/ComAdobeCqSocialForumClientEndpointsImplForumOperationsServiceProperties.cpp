

#include "ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.h"

using namespace Tiny;

ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::~ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties()
{

}

void
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



