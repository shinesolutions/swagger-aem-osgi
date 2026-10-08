

#include "ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.h"

using namespace Tiny;

ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties()
{
	servicemax_links_per_host = ConfigNodePropertyInteger();
	servicesave_external_link_references = ConfigNodePropertyBoolean();
}

ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::~ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties()
{

}

void
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicemax_links_per_hostKey = "service.max_links_per_host";

    if(object.has_key(servicemax_links_per_hostKey))
    {
        bourne::json value = object[servicemax_links_per_hostKey];




        ConfigNodePropertyInteger* obj = &servicemax_links_per_host;
		obj->fromJson(value.dump());

    }

    const char *servicesave_external_link_referencesKey = "service.save_external_link_references";

    if(object.has_key(servicesave_external_link_referencesKey))
    {
        bourne::json value = object[servicesave_external_link_referencesKey];




        ConfigNodePropertyBoolean* obj = &servicesave_external_link_references;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["servicemax_links_per_host"] = getServicemaxLinksPerHost().toJson();






	object["servicesave_external_link_references"] = getServicesaveExternalLinkReferences().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::getServicemaxLinksPerHost()
{
	return servicemax_links_per_host;
}

void
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::setServicemaxLinksPerHost(ConfigNodePropertyInteger servicemax_links_per_host)
{
	this->servicemax_links_per_host = servicemax_links_per_host;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::getServicesaveExternalLinkReferences()
{
	return servicesave_external_link_references;
}

void
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::setServicesaveExternalLinkReferences(ConfigNodePropertyBoolean servicesave_external_link_references)
{
	this->servicesave_external_link_references = servicesave_external_link_references;
}



