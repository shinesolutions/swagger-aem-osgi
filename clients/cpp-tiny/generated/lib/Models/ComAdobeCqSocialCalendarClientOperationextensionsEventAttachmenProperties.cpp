

#include "ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.h"

using namespace Tiny;

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties()
{
	attachmentTypeBlacklist = ConfigNodePropertyString();
	extensionorder = ConfigNodePropertyInteger();
}

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::~ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties()
{

}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attachmentTypeBlacklistKey = "attachmentTypeBlacklist";

    if(object.has_key(attachmentTypeBlacklistKey))
    {
        bourne::json value = object[attachmentTypeBlacklistKey];




        ConfigNodePropertyString* obj = &attachmentTypeBlacklist;
		obj->fromJson(value.dump());

    }

    const char *extensionorderKey = "extension.order";

    if(object.has_key(extensionorderKey))
    {
        bourne::json value = object[extensionorderKey];




        ConfigNodePropertyInteger* obj = &extensionorder;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["attachmentTypeBlacklist"] = getAttachmentTypeBlacklist().toJson();






	object["extensionorder"] = getExtensionorder().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::getAttachmentTypeBlacklist()
{
	return attachmentTypeBlacklist;
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::setAttachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist)
{
	this->attachmentTypeBlacklist = attachmentTypeBlacklist;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::getExtensionorder()
{
	return extensionorder;
}

void
ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties::setExtensionorder(ConfigNodePropertyInteger extensionorder)
{
	this->extensionorder = extensionorder;
}



