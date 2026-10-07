

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties()
{
	queryaggregation = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *queryaggregationKey = "query.aggregation";

    if(object.has_key(queryaggregationKey))
    {
        bourne::json value = object[queryaggregationKey];




        ConfigNodePropertyBoolean* obj = &queryaggregation;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["queryaggregation"] = getQueryaggregation().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::getQueryaggregation()
{
	return queryaggregation;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties::setQueryaggregation(ConfigNodePropertyBoolean queryaggregation)
{
	this->queryaggregation = queryaggregation;
}



