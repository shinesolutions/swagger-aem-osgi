

#include "ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.h"

using namespace Tiny;

ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties()
{
	formsManagerConfigincludeOOTBTemplates = ConfigNodePropertyBoolean();
	formsManagerConfigincludeDeprecatedTemplates = ConfigNodePropertyBoolean();
}

ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::~ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties()
{

}

void
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *formsManagerConfigincludeOOTBTemplatesKey = "formsManagerConfig.includeOOTBTemplates";

    if(object.has_key(formsManagerConfigincludeOOTBTemplatesKey))
    {
        bourne::json value = object[formsManagerConfigincludeOOTBTemplatesKey];




        ConfigNodePropertyBoolean* obj = &formsManagerConfigincludeOOTBTemplates;
		obj->fromJson(value.dump());

    }

    const char *formsManagerConfigincludeDeprecatedTemplatesKey = "formsManagerConfig.includeDeprecatedTemplates";

    if(object.has_key(formsManagerConfigincludeDeprecatedTemplatesKey))
    {
        bourne::json value = object[formsManagerConfigincludeDeprecatedTemplatesKey];




        ConfigNodePropertyBoolean* obj = &formsManagerConfigincludeDeprecatedTemplates;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["formsManagerConfigincludeOOTBTemplates"] = getFormsManagerConfigincludeOOTBTemplates().toJson();






	object["formsManagerConfigincludeDeprecatedTemplates"] = getFormsManagerConfigincludeDeprecatedTemplates().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::getFormsManagerConfigincludeOOTBTemplates()
{
	return formsManagerConfigincludeOOTBTemplates;
}

void
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::setFormsManagerConfigincludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigincludeOOTBTemplates)
{
	this->formsManagerConfigincludeOOTBTemplates = formsManagerConfigincludeOOTBTemplates;
}

ConfigNodePropertyBoolean
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::getFormsManagerConfigincludeDeprecatedTemplates()
{
	return formsManagerConfigincludeDeprecatedTemplates;
}

void
ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties::setFormsManagerConfigincludeDeprecatedTemplates(ConfigNodePropertyBoolean formsManagerConfigincludeDeprecatedTemplates)
{
	this->formsManagerConfigincludeDeprecatedTemplates = formsManagerConfigincludeDeprecatedTemplates;
}



