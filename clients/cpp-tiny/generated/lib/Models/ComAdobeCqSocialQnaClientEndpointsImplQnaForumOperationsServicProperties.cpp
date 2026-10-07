

#include "ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties.h"

using namespace Tiny;

ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::~ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties()
{

}

void
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



