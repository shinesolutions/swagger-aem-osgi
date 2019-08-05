#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties()
{
	//__init();
}

ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::~ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::__init()
{
	//cdnconfigdistributiondomain = new ConfigNodePropertyString();
	//cdnconfigenablerewriting = new ConfigNodePropertyBoolean();
	//cdnconfigpathprefixes = new ConfigNodePropertyArray();
	//cdnconfigcdnttl = new ConfigNodePropertyInteger();
	//cdnconfigapplicationprotocol = new ConfigNodePropertyString();
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::__cleanup()
{
	//if(cdnconfigdistributiondomain != NULL) {
	//
	//delete cdnconfigdistributiondomain;
	//cdnconfigdistributiondomain = NULL;
	//}
	//if(cdnconfigenablerewriting != NULL) {
	//
	//delete cdnconfigenablerewriting;
	//cdnconfigenablerewriting = NULL;
	//}
	//if(cdnconfigpathprefixes != NULL) {
	//
	//delete cdnconfigpathprefixes;
	//cdnconfigpathprefixes = NULL;
	//}
	//if(cdnconfigcdnttl != NULL) {
	//
	//delete cdnconfigcdnttl;
	//cdnconfigcdnttl = NULL;
	//}
	//if(cdnconfigapplicationprotocol != NULL) {
	//
	//delete cdnconfigapplicationprotocol;
	//cdnconfigapplicationprotocol = NULL;
	//}
	//
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cdnconfigdistributiondomainKey = "cdn.config.distribution.domain";
	node = json_object_get_member(pJsonObject, cdnconfigdistributiondomainKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cdnconfigdistributiondomain, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cdnconfigdistributiondomain);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cdnconfigenablerewritingKey = "cdn.config.enable.rewriting";
	node = json_object_get_member(pJsonObject, cdnconfigenablerewritingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cdnconfigenablerewriting, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cdnconfigenablerewriting);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cdnconfigpathprefixesKey = "cdn.config.path.prefixes";
	node = json_object_get_member(pJsonObject, cdnconfigpathprefixesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cdnconfigpathprefixes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cdnconfigpathprefixes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cdnconfigcdnttlKey = "cdn.config.cdnttl";
	node = json_object_get_member(pJsonObject, cdnconfigcdnttlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cdnconfigcdnttl, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cdnconfigcdnttl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cdnconfigapplicationprotocolKey = "cdn.config.application.protocol";
	node = json_object_get_member(pJsonObject, cdnconfigapplicationprotocolKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cdnconfigapplicationprotocol, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cdnconfigapplicationprotocol);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCdnconfigdistributiondomain();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCdnconfigdistributiondomain());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cdnconfigdistributiondomainKey = "cdn.config.distribution.domain";
	json_object_set_member(pJsonObject, cdnconfigdistributiondomainKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCdnconfigenablerewriting();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCdnconfigenablerewriting());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cdnconfigenablerewritingKey = "cdn.config.enable.rewriting";
	json_object_set_member(pJsonObject, cdnconfigenablerewritingKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCdnconfigpathprefixes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCdnconfigpathprefixes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cdnconfigpathprefixesKey = "cdn.config.path.prefixes";
	json_object_set_member(pJsonObject, cdnconfigpathprefixesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCdnconfigcdnttl();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCdnconfigcdnttl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cdnconfigcdnttlKey = "cdn.config.cdnttl";
	json_object_set_member(pJsonObject, cdnconfigcdnttlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCdnconfigapplicationprotocol();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCdnconfigapplicationprotocol());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cdnconfigapplicationprotocolKey = "cdn.config.application.protocol";
	json_object_set_member(pJsonObject, cdnconfigapplicationprotocolKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigdistributiondomain()
{
	return cdnconfigdistributiondomain;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigdistributiondomain(ConfigNodePropertyString  cdnconfigdistributiondomain)
{
	this->cdnconfigdistributiondomain = cdnconfigdistributiondomain;
}

ConfigNodePropertyBoolean
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigenablerewriting()
{
	return cdnconfigenablerewriting;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigenablerewriting(ConfigNodePropertyBoolean  cdnconfigenablerewriting)
{
	this->cdnconfigenablerewriting = cdnconfigenablerewriting;
}

ConfigNodePropertyArray
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigpathprefixes()
{
	return cdnconfigpathprefixes;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigpathprefixes(ConfigNodePropertyArray  cdnconfigpathprefixes)
{
	this->cdnconfigpathprefixes = cdnconfigpathprefixes;
}

ConfigNodePropertyInteger
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigcdnttl()
{
	return cdnconfigcdnttl;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigcdnttl(ConfigNodePropertyInteger  cdnconfigcdnttl)
{
	this->cdnconfigcdnttl = cdnconfigcdnttl;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigapplicationprotocol()
{
	return cdnconfigapplicationprotocol;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigapplicationprotocol(ConfigNodePropertyString  cdnconfigapplicationprotocol)
{
	this->cdnconfigapplicationprotocol = cdnconfigapplicationprotocol;
}


