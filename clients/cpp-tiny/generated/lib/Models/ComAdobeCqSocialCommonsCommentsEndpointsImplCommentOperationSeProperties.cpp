

#include "ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::~ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties()
{

}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



