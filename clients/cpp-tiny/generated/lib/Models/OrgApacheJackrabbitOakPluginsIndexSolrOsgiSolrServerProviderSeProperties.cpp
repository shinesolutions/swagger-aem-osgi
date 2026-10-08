

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties()
{
	servertype = ConfigNodePropertyDropDown();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servertypeKey = "server.type";

    if(object.has_key(servertypeKey))
    {
        bourne::json value = object[servertypeKey];




        ConfigNodePropertyDropDown* obj = &servertype;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["servertype"] = getServertype().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::getServertype()
{
	return servertype;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::setServertype(ConfigNodePropertyDropDown servertype)
{
	this->servertype = servertype;
}



