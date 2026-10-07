

#include "ApacheSlingHealthCheckResultHTMLSerializerProperties.h"

using namespace Tiny;

ApacheSlingHealthCheckResultHTMLSerializerProperties::ApacheSlingHealthCheckResultHTMLSerializerProperties()
{
	styleString = ConfigNodePropertyString();
}

ApacheSlingHealthCheckResultHTMLSerializerProperties::ApacheSlingHealthCheckResultHTMLSerializerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ApacheSlingHealthCheckResultHTMLSerializerProperties::~ApacheSlingHealthCheckResultHTMLSerializerProperties()
{

}

void
ApacheSlingHealthCheckResultHTMLSerializerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *styleStringKey = "styleString";

    if(object.has_key(styleStringKey))
    {
        bourne::json value = object[styleStringKey];




        ConfigNodePropertyString* obj = &styleString;
		obj->fromJson(value.dump());

    }


}

bourne::json
ApacheSlingHealthCheckResultHTMLSerializerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["styleString"] = getStyleString().toJson();


    return object;

}

ConfigNodePropertyString
ApacheSlingHealthCheckResultHTMLSerializerProperties::getStyleString()
{
	return styleString;
}

void
ApacheSlingHealthCheckResultHTMLSerializerProperties::setStyleString(ConfigNodePropertyString styleString)
{
	this->styleString = styleString;
}



