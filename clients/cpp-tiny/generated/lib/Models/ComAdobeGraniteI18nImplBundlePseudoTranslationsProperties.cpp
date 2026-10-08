

#include "ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.h"

using namespace Tiny;

ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties()
{
	pseudopatterns = ConfigNodePropertyArray();
}

ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::~ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties()
{

}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pseudopatternsKey = "pseudo.patterns";

    if(object.has_key(pseudopatternsKey))
    {
        bourne::json value = object[pseudopatternsKey];




        ConfigNodePropertyArray* obj = &pseudopatterns;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pseudopatterns"] = getPseudopatterns().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::getPseudopatterns()
{
	return pseudopatterns;
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::setPseudopatterns(ConfigNodePropertyArray pseudopatterns)
{
	this->pseudopatterns = pseudopatterns;
}



