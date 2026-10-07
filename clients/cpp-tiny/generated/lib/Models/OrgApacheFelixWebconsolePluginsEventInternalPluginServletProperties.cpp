

#include "OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.h"

using namespace Tiny;

OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties()
{
	maxsize = ConfigNodePropertyInteger();
}

OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::~OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties()
{

}

void
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxsizeKey = "max.size";

    if(object.has_key(maxsizeKey))
    {
        bourne::json value = object[maxsizeKey];




        ConfigNodePropertyInteger* obj = &maxsize;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxsize"] = getMaxsize().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::getMaxsize()
{
	return maxsize;
}

void
OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties::setMaxsize(ConfigNodePropertyInteger maxsize)
{
	this->maxsize = maxsize;
}



