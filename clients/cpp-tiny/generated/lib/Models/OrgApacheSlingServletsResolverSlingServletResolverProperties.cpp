

#include "OrgApacheSlingServletsResolverSlingServletResolverProperties.h"

using namespace Tiny;

OrgApacheSlingServletsResolverSlingServletResolverProperties::OrgApacheSlingServletsResolverSlingServletResolverProperties()
{
	servletresolverservletRoot = ConfigNodePropertyString();
	servletresolvercacheSize = ConfigNodePropertyInteger();
	servletresolverpaths = ConfigNodePropertyArray();
	servletresolverdefaultExtensions = ConfigNodePropertyArray();
}

OrgApacheSlingServletsResolverSlingServletResolverProperties::OrgApacheSlingServletsResolverSlingServletResolverProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServletsResolverSlingServletResolverProperties::~OrgApacheSlingServletsResolverSlingServletResolverProperties()
{

}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servletresolverservletRootKey = "servletresolver.servletRoot";

    if(object.has_key(servletresolverservletRootKey))
    {
        bourne::json value = object[servletresolverservletRootKey];




        ConfigNodePropertyString* obj = &servletresolverservletRoot;
		obj->fromJson(value.dump());

    }

    const char *servletresolvercacheSizeKey = "servletresolver.cacheSize";

    if(object.has_key(servletresolvercacheSizeKey))
    {
        bourne::json value = object[servletresolvercacheSizeKey];




        ConfigNodePropertyInteger* obj = &servletresolvercacheSize;
		obj->fromJson(value.dump());

    }

    const char *servletresolverpathsKey = "servletresolver.paths";

    if(object.has_key(servletresolverpathsKey))
    {
        bourne::json value = object[servletresolverpathsKey];




        ConfigNodePropertyArray* obj = &servletresolverpaths;
		obj->fromJson(value.dump());

    }

    const char *servletresolverdefaultExtensionsKey = "servletresolver.defaultExtensions";

    if(object.has_key(servletresolverdefaultExtensionsKey))
    {
        bourne::json value = object[servletresolverdefaultExtensionsKey];




        ConfigNodePropertyArray* obj = &servletresolverdefaultExtensions;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServletsResolverSlingServletResolverProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["servletresolverservletRoot"] = getServletresolverservletRoot().toJson();






	object["servletresolvercacheSize"] = getServletresolvercacheSize().toJson();






	object["servletresolverpaths"] = getServletresolverpaths().toJson();






	object["servletresolverdefaultExtensions"] = getServletresolverdefaultExtensions().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverservletRoot()
{
	return servletresolverservletRoot;
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverservletRoot(ConfigNodePropertyString servletresolverservletRoot)
{
	this->servletresolverservletRoot = servletresolverservletRoot;
}

ConfigNodePropertyInteger
OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolvercacheSize()
{
	return servletresolvercacheSize;
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolvercacheSize(ConfigNodePropertyInteger servletresolvercacheSize)
{
	this->servletresolvercacheSize = servletresolvercacheSize;
}

ConfigNodePropertyArray
OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverpaths()
{
	return servletresolverpaths;
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverpaths(ConfigNodePropertyArray servletresolverpaths)
{
	this->servletresolverpaths = servletresolverpaths;
}

ConfigNodePropertyArray
OrgApacheSlingServletsResolverSlingServletResolverProperties::getServletresolverdefaultExtensions()
{
	return servletresolverdefaultExtensions;
}

void
OrgApacheSlingServletsResolverSlingServletResolverProperties::setServletresolverdefaultExtensions(ConfigNodePropertyArray servletresolverdefaultExtensions)
{
	this->servletresolverdefaultExtensions = servletresolverdefaultExtensions;
}



