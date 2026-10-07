#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCdnRewriterImplCDNRewriterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCdnRewriterImplCDNRewriterProperties::ComAdobeCqCdnRewriterImplCDNRewriterProperties()
{
	//__init();
}

ComAdobeCqCdnRewriterImplCDNRewriterProperties::~ComAdobeCqCdnRewriterImplCDNRewriterProperties()
{
	//__cleanup();
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
	//cdnrewriterattributes = new ConfigNodePropertyArray();
	//cdnrewriterdistributiondomain = new ConfigNodePropertyString();
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(cdnrewriterattributes != NULL) {
	//
	//delete cdnrewriterattributes;
	//cdnrewriterattributes = NULL;
	//}
	//if(cdnrewriterdistributiondomain != NULL) {
	//
	//delete cdnrewriterdistributiondomain;
	//cdnrewriterdistributiondomain = NULL;
	//}
	//
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cdnrewriterattributesKey = "cdnrewriter.attributes";
	node = json_object_get_member(pJsonObject, cdnrewriterattributesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cdnrewriterattributes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cdnrewriterattributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cdnrewriterdistributiondomainKey = "cdn.rewriter.distribution.domain";
	node = json_object_get_member(pJsonObject, cdnrewriterdistributiondomainKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cdnrewriterdistributiondomain, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cdnrewriterdistributiondomain);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCdnRewriterImplCDNRewriterProperties::ComAdobeCqCdnRewriterImplCDNRewriterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCdnRewriterImplCDNRewriterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCdnrewriterattributes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCdnrewriterattributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cdnrewriterattributesKey = "cdnrewriter.attributes";
	json_object_set_member(pJsonObject, cdnrewriterattributesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCdnrewriterdistributiondomain();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCdnrewriterdistributiondomain());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cdnrewriterdistributiondomainKey = "cdn.rewriter.distribution.domain";
	json_object_set_member(pJsonObject, cdnrewriterdistributiondomainKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqCdnRewriterImplCDNRewriterProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyArray
ComAdobeCqCdnRewriterImplCDNRewriterProperties::getCdnrewriterattributes()
{
	return cdnrewriterattributes;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::setCdnrewriterattributes(ConfigNodePropertyArray  cdnrewriterattributes)
{
	this->cdnrewriterattributes = cdnrewriterattributes;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplCDNRewriterProperties::getCdnrewriterdistributiondomain()
{
	return cdnrewriterdistributiondomain;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::setCdnrewriterdistributiondomain(ConfigNodePropertyString  cdnrewriterdistributiondomain)
{
	this->cdnrewriterdistributiondomain = cdnrewriterdistributiondomain;
}


