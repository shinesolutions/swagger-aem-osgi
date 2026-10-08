

#include "ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties.h"

using namespace Tiny;

ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
	attachmentTypeBlacklist = ConfigNodePropertyArray();
}

ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::~ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties()
{

}

void
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}

ConfigNodePropertyArray
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties::setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}



