

#include "ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.h"

using namespace Tiny;

ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::ComAdobeCqSocialSrpImplSocialSolrConnectorProperties()
{
	srptype = ConfigNodePropertyString();
}

ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::ComAdobeCqSocialSrpImplSocialSolrConnectorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::~ComAdobeCqSocialSrpImplSocialSolrConnectorProperties()
{

}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *srptypeKey = "srp.type";

    if(object.has_key(srptypeKey))
    {
        bourne::json value = object[srptypeKey];




        ConfigNodePropertyString* obj = &srptype;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["srptype"] = getSrptype().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::getSrptype()
{
	return srptype;
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::setSrptype(ConfigNodePropertyString srptype)
{
	this->srptype = srptype;
}



