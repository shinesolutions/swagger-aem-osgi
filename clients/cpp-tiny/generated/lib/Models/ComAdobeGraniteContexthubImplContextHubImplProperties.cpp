

#include "ComAdobeGraniteContexthubImplContextHubImplProperties.h"

using namespace Tiny;

ComAdobeGraniteContexthubImplContextHubImplProperties::ComAdobeGraniteContexthubImplContextHubImplProperties()
{
	comadobegranitecontexthubsilent_mode = ConfigNodePropertyBoolean();
	comadobegranitecontexthubshow_ui = ConfigNodePropertyBoolean();
}

ComAdobeGraniteContexthubImplContextHubImplProperties::ComAdobeGraniteContexthubImplContextHubImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteContexthubImplContextHubImplProperties::~ComAdobeGraniteContexthubImplContextHubImplProperties()
{

}

void
ComAdobeGraniteContexthubImplContextHubImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobegranitecontexthubsilent_modeKey = "com.adobe.granite.contexthub.silent_mode";

    if(object.has_key(comadobegranitecontexthubsilent_modeKey))
    {
        bourne::json value = object[comadobegranitecontexthubsilent_modeKey];




        ConfigNodePropertyBoolean* obj = &comadobegranitecontexthubsilent_mode;
		obj->fromJson(value.dump());

    }

    const char *comadobegranitecontexthubshow_uiKey = "com.adobe.granite.contexthub.show_ui";

    if(object.has_key(comadobegranitecontexthubshow_uiKey))
    {
        bourne::json value = object[comadobegranitecontexthubshow_uiKey];




        ConfigNodePropertyBoolean* obj = &comadobegranitecontexthubshow_ui;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteContexthubImplContextHubImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobegranitecontexthubsilent_mode"] = getComadobegranitecontexthubsilentMode().toJson();






	object["comadobegranitecontexthubshow_ui"] = getComadobegranitecontexthubshowUi().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteContexthubImplContextHubImplProperties::getComadobegranitecontexthubsilentMode()
{
	return comadobegranitecontexthubsilent_mode;
}

void
ComAdobeGraniteContexthubImplContextHubImplProperties::setComadobegranitecontexthubsilentMode(ConfigNodePropertyBoolean comadobegranitecontexthubsilent_mode)
{
	this->comadobegranitecontexthubsilent_mode = comadobegranitecontexthubsilent_mode;
}

ConfigNodePropertyBoolean
ComAdobeGraniteContexthubImplContextHubImplProperties::getComadobegranitecontexthubshowUi()
{
	return comadobegranitecontexthubshow_ui;
}

void
ComAdobeGraniteContexthubImplContextHubImplProperties::setComadobegranitecontexthubshowUi(ConfigNodePropertyBoolean comadobegranitecontexthubshow_ui)
{
	this->comadobegranitecontexthubshow_ui = comadobegranitecontexthubshow_ui;
}



