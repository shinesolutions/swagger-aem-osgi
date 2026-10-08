

#include "ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.h"

using namespace Tiny;

ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties()
{
	disabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::~ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties()
{

}

void
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *disabledKey = "disabled";

    if(object.has_key(disabledKey))
    {
        bourne::json value = object[disabledKey];




        ConfigNodePropertyBoolean* obj = &disabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["disabled"] = getDisabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::getDisabled()
{
	return disabled;
}

void
ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties::setDisabled(ConfigNodePropertyBoolean disabled)
{
	this->disabled = disabled;
}



