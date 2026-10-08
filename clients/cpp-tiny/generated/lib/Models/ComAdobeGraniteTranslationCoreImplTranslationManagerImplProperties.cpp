

#include "ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.h"

using namespace Tiny;

ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties()
{
	defaultConnectorName = ConfigNodePropertyString();
	defaultCategory = ConfigNodePropertyString();
}

ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::~ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties()
{

}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *defaultConnectorNameKey = "defaultConnectorName";

    if(object.has_key(defaultConnectorNameKey))
    {
        bourne::json value = object[defaultConnectorNameKey];




        ConfigNodePropertyString* obj = &defaultConnectorName;
		obj->fromJson(value.dump());

    }

    const char *defaultCategoryKey = "defaultCategory";

    if(object.has_key(defaultCategoryKey))
    {
        bourne::json value = object[defaultCategoryKey];




        ConfigNodePropertyString* obj = &defaultCategory;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["defaultConnectorName"] = getDefaultConnectorName().toJson();






	object["defaultCategory"] = getDefaultCategory().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::getDefaultConnectorName()
{
	return defaultConnectorName;
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::setDefaultConnectorName(ConfigNodePropertyString defaultConnectorName)
{
	this->defaultConnectorName = defaultConnectorName;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::getDefaultCategory()
{
	return defaultCategory;
}

void
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties::setDefaultCategory(ConfigNodePropertyString defaultCategory)
{
	this->defaultCategory = defaultCategory;
}



