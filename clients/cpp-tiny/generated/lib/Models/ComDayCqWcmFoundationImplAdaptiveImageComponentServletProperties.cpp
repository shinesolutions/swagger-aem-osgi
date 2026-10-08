

#include "ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties()
{
	adaptsupportedwidths = ConfigNodePropertyArray();
}

ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::~ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties()
{

}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *adaptsupportedwidthsKey = "adapt.supported.widths";

    if(object.has_key(adaptsupportedwidthsKey))
    {
        bourne::json value = object[adaptsupportedwidthsKey];




        ConfigNodePropertyArray* obj = &adaptsupportedwidths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["adaptsupportedwidths"] = getAdaptsupportedwidths().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::getAdaptsupportedwidths()
{
	return adaptsupportedwidths;
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::setAdaptsupportedwidths(ConfigNodePropertyArray adaptsupportedwidths)
{
	this->adaptsupportedwidths = adaptsupportedwidths;
}



