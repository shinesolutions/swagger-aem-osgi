

#include "ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.h"

using namespace Tiny;

ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties()
{
	disabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties::~ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties()
{

}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["disabled"] = getDisabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties::getDisabled()
{
	return disabled;
}

void
ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties::setDisabled(ConfigNodePropertyBoolean disabled)
{
	this->disabled = disabled;
}



