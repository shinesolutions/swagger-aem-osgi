#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::ComAdobeCqSocialSrpImplSocialSolrConnectorProperties()
{
	//__init();
}

ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::~ComAdobeCqSocialSrpImplSocialSolrConnectorProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::__init()
{
	//srptype = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::__cleanup()
{
	//if(srptype != NULL) {
	//
	//delete srptype;
	//srptype = NULL;
	//}
	//
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *srptypeKey = "srp.type";
	node = json_object_get_member(pJsonObject, srptypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&srptype, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&srptype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::ComAdobeCqSocialSrpImplSocialSolrConnectorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSrptype();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSrptype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *srptypeKey = "srp.type";
	json_object_set_member(pJsonObject, srptypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::getSrptype()
{
	return srptype;
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorProperties::setSrptype(ConfigNodePropertyString  srptype)
{
	this->srptype = srptype;
}


