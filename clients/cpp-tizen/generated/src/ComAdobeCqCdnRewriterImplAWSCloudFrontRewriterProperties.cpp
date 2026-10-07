#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties()
{
	//__init();
}

ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::~ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties()
{
	//__cleanup();
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::__init()
{
	//serviceranking = new ConfigNodePropertyInteger();
	//keypairid = new ConfigNodePropertyString();
	//keypairalias = new ConfigNodePropertyString();
	//cdnrewriterattributes = new ConfigNodePropertyArray();
	//cdnrewriterdistributiondomain = new ConfigNodePropertyString();
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::__cleanup()
{
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(keypairid != NULL) {
	//
	//delete keypairid;
	//keypairid = NULL;
	//}
	//if(keypairalias != NULL) {
	//
	//delete keypairalias;
	//keypairalias = NULL;
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
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::fromJson(char* jsonStr)
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
	const gchar *keypairidKey = "keypair.id";
	node = json_object_get_member(pJsonObject, keypairidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&keypairid, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&keypairid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *keypairaliasKey = "keypair.alias";
	node = json_object_get_member(pJsonObject, keypairaliasKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&keypairalias, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&keypairalias);
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

ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getKeypairid();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getKeypairid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *keypairidKey = "keypair.id";
	json_object_set_member(pJsonObject, keypairidKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getKeypairalias();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getKeypairalias());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *keypairaliasKey = "keypair.alias";
	json_object_set_member(pJsonObject, keypairaliasKey, node);
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
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getKeypairid()
{
	return keypairid;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setKeypairid(ConfigNodePropertyString  keypairid)
{
	this->keypairid = keypairid;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getKeypairalias()
{
	return keypairalias;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setKeypairalias(ConfigNodePropertyString  keypairalias)
{
	this->keypairalias = keypairalias;
}

ConfigNodePropertyArray
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getCdnrewriterattributes()
{
	return cdnrewriterattributes;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setCdnrewriterattributes(ConfigNodePropertyArray  cdnrewriterattributes)
{
	this->cdnrewriterattributes = cdnrewriterattributes;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getCdnrewriterdistributiondomain()
{
	return cdnrewriterdistributiondomain;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setCdnrewriterdistributiondomain(ConfigNodePropertyString  cdnrewriterdistributiondomain)
{
	this->cdnrewriterdistributiondomain = cdnrewriterdistributiondomain;
}


