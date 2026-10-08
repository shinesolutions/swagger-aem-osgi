

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties()
{
	enabled = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



