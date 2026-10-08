

#include "ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties.h"

using namespace Tiny;

ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::~ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties()
{

}

void
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



