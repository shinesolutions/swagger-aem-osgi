

#include "ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties()
{
	connectProtocol = ConfigNodePropertyDropDown();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *connectProtocolKey = "connectProtocol";

    if(object.has_key(connectProtocolKey))
    {
        bourne::json value = object[connectProtocolKey];




        ConfigNodePropertyDropDown* obj = &connectProtocol;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["connectProtocol"] = getConnectProtocol().toJson();


    return object;

}

ConfigNodePropertyDropDown
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::getConnectProtocol()
{
	return connectProtocol;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::setConnectProtocol(ConfigNodePropertyDropDown connectProtocol)
{
	this->connectProtocol = connectProtocol;
}



