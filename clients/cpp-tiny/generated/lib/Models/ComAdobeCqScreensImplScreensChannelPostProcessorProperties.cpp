

#include "ComAdobeCqScreensImplScreensChannelPostProcessorProperties.h"

using namespace Tiny;

ComAdobeCqScreensImplScreensChannelPostProcessorProperties::ComAdobeCqScreensImplScreensChannelPostProcessorProperties()
{
	screenschannelspropertiestoremove = ConfigNodePropertyArray();
}

ComAdobeCqScreensImplScreensChannelPostProcessorProperties::ComAdobeCqScreensImplScreensChannelPostProcessorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensImplScreensChannelPostProcessorProperties::~ComAdobeCqScreensImplScreensChannelPostProcessorProperties()
{

}

void
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *screenschannelspropertiestoremoveKey = "screens.channels.properties.to.remove";

    if(object.has_key(screenschannelspropertiestoremoveKey))
    {
        bourne::json value = object[screenschannelspropertiestoremoveKey];




        ConfigNodePropertyArray* obj = &screenschannelspropertiestoremove;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["screenschannelspropertiestoremove"] = getScreenschannelspropertiestoremove().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::getScreenschannelspropertiestoremove()
{
	return screenschannelspropertiestoremove;
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::setScreenschannelspropertiestoremove(ConfigNodePropertyArray screenschannelspropertiestoremove)
{
	this->screenschannelspropertiestoremove = screenschannelspropertiestoremove;
}



