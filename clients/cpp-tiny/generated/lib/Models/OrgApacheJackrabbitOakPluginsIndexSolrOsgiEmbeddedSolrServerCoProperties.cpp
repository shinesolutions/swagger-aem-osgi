

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties()
{
	solrhomepath = ConfigNodePropertyString();
	solrcorename = ConfigNodePropertyString();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *solrhomepathKey = "solr.home.path";

    if(object.has_key(solrhomepathKey))
    {
        bourne::json value = object[solrhomepathKey];




        ConfigNodePropertyString* obj = &solrhomepath;
		obj->fromJson(value.dump());

    }

    const char *solrcorenameKey = "solr.core.name";

    if(object.has_key(solrcorenameKey))
    {
        bourne::json value = object[solrcorenameKey];




        ConfigNodePropertyString* obj = &solrcorename;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["solrhomepath"] = getSolrhomepath().toJson();






	object["solrcorename"] = getSolrcorename().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::getSolrhomepath()
{
	return solrhomepath;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::setSolrhomepath(ConfigNodePropertyString solrhomepath)
{
	this->solrhomepath = solrhomepath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::getSolrcorename()
{
	return solrcorename;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::setSolrcorename(ConfigNodePropertyString solrcorename)
{
	this->solrcorename = solrcorename;
}



