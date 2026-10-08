

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties()
{
	solrhttpurl = ConfigNodePropertyString();
	solrzkhost = ConfigNodePropertyString();
	solrcollection = ConfigNodePropertyString();
	solrsockettimeout = ConfigNodePropertyInteger();
	solrconnectiontimeout = ConfigNodePropertyInteger();
	solrshardsno = ConfigNodePropertyInteger();
	solrreplicationfactor = ConfigNodePropertyInteger();
	solrconfdir = ConfigNodePropertyString();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *solrhttpurlKey = "solr.http.url";

    if(object.has_key(solrhttpurlKey))
    {
        bourne::json value = object[solrhttpurlKey];




        ConfigNodePropertyString* obj = &solrhttpurl;
		obj->fromJson(value.dump());

    }

    const char *solrzkhostKey = "solr.zk.host";

    if(object.has_key(solrzkhostKey))
    {
        bourne::json value = object[solrzkhostKey];




        ConfigNodePropertyString* obj = &solrzkhost;
		obj->fromJson(value.dump());

    }

    const char *solrcollectionKey = "solr.collection";

    if(object.has_key(solrcollectionKey))
    {
        bourne::json value = object[solrcollectionKey];




        ConfigNodePropertyString* obj = &solrcollection;
		obj->fromJson(value.dump());

    }

    const char *solrsockettimeoutKey = "solr.socket.timeout";

    if(object.has_key(solrsockettimeoutKey))
    {
        bourne::json value = object[solrsockettimeoutKey];




        ConfigNodePropertyInteger* obj = &solrsockettimeout;
		obj->fromJson(value.dump());

    }

    const char *solrconnectiontimeoutKey = "solr.connection.timeout";

    if(object.has_key(solrconnectiontimeoutKey))
    {
        bourne::json value = object[solrconnectiontimeoutKey];




        ConfigNodePropertyInteger* obj = &solrconnectiontimeout;
		obj->fromJson(value.dump());

    }

    const char *solrshardsnoKey = "solr.shards.no";

    if(object.has_key(solrshardsnoKey))
    {
        bourne::json value = object[solrshardsnoKey];




        ConfigNodePropertyInteger* obj = &solrshardsno;
		obj->fromJson(value.dump());

    }

    const char *solrreplicationfactorKey = "solr.replication.factor";

    if(object.has_key(solrreplicationfactorKey))
    {
        bourne::json value = object[solrreplicationfactorKey];




        ConfigNodePropertyInteger* obj = &solrreplicationfactor;
		obj->fromJson(value.dump());

    }

    const char *solrconfdirKey = "solr.conf.dir";

    if(object.has_key(solrconfdirKey))
    {
        bourne::json value = object[solrconfdirKey];




        ConfigNodePropertyString* obj = &solrconfdir;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["solrhttpurl"] = getSolrhttpurl().toJson();






	object["solrzkhost"] = getSolrzkhost().toJson();






	object["solrcollection"] = getSolrcollection().toJson();






	object["solrsockettimeout"] = getSolrsockettimeout().toJson();






	object["solrconnectiontimeout"] = getSolrconnectiontimeout().toJson();






	object["solrshardsno"] = getSolrshardsno().toJson();






	object["solrreplicationfactor"] = getSolrreplicationfactor().toJson();






	object["solrconfdir"] = getSolrconfdir().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrhttpurl()
{
	return solrhttpurl;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrhttpurl(ConfigNodePropertyString solrhttpurl)
{
	this->solrhttpurl = solrhttpurl;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrzkhost()
{
	return solrzkhost;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrzkhost(ConfigNodePropertyString solrzkhost)
{
	this->solrzkhost = solrzkhost;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrcollection()
{
	return solrcollection;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrcollection(ConfigNodePropertyString solrcollection)
{
	this->solrcollection = solrcollection;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrsockettimeout()
{
	return solrsockettimeout;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrsockettimeout(ConfigNodePropertyInteger solrsockettimeout)
{
	this->solrsockettimeout = solrsockettimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrconnectiontimeout()
{
	return solrconnectiontimeout;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrconnectiontimeout(ConfigNodePropertyInteger solrconnectiontimeout)
{
	this->solrconnectiontimeout = solrconnectiontimeout;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrshardsno()
{
	return solrshardsno;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrshardsno(ConfigNodePropertyInteger solrshardsno)
{
	this->solrshardsno = solrshardsno;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrreplicationfactor()
{
	return solrreplicationfactor;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrreplicationfactor(ConfigNodePropertyInteger solrreplicationfactor)
{
	this->solrreplicationfactor = solrreplicationfactor;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::getSolrconfdir()
{
	return solrconfdir;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties::setSolrconfdir(ConfigNodePropertyString solrconfdir)
{
	this->solrconfdir = solrconfdir;
}



