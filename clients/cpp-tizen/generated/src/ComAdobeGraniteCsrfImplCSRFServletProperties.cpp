#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteCsrfImplCSRFServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteCsrfImplCSRFServletProperties::ComAdobeGraniteCsrfImplCSRFServletProperties()
{
	//__init();
}

ComAdobeGraniteCsrfImplCSRFServletProperties::~ComAdobeGraniteCsrfImplCSRFServletProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteCsrfImplCSRFServletProperties::__init()
{
	//csrftokenexpiresin = new ConfigNodePropertyInteger();
	//slingauthrequirements = new ConfigNodePropertyString();
}

void
ComAdobeGraniteCsrfImplCSRFServletProperties::__cleanup()
{
	//if(csrftokenexpiresin != NULL) {
	//
	//delete csrftokenexpiresin;
	//csrftokenexpiresin = NULL;
	//}
	//if(slingauthrequirements != NULL) {
	//
	//delete slingauthrequirements;
	//slingauthrequirements = NULL;
	//}
	//
}

void
ComAdobeGraniteCsrfImplCSRFServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *csrftokenexpiresinKey = "csrf.token.expires.in";
	node = json_object_get_member(pJsonObject, csrftokenexpiresinKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&csrftokenexpiresin, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&csrftokenexpiresin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingauthrequirementsKey = "sling.auth.requirements";
	node = json_object_get_member(pJsonObject, slingauthrequirementsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingauthrequirements, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingauthrequirements);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteCsrfImplCSRFServletProperties::ComAdobeGraniteCsrfImplCSRFServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteCsrfImplCSRFServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCsrftokenexpiresin();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCsrftokenexpiresin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *csrftokenexpiresinKey = "csrf.token.expires.in";
	json_object_set_member(pJsonObject, csrftokenexpiresinKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingauthrequirements();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingauthrequirements());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingauthrequirementsKey = "sling.auth.requirements";
	json_object_set_member(pJsonObject, slingauthrequirementsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteCsrfImplCSRFServletProperties::getCsrftokenexpiresin()
{
	return csrftokenexpiresin;
}

void
ComAdobeGraniteCsrfImplCSRFServletProperties::setCsrftokenexpiresin(ConfigNodePropertyInteger  csrftokenexpiresin)
{
	this->csrftokenexpiresin = csrftokenexpiresin;
}

ConfigNodePropertyString
ComAdobeGraniteCsrfImplCSRFServletProperties::getSlingauthrequirements()
{
	return slingauthrequirements;
}

void
ComAdobeGraniteCsrfImplCSRFServletProperties::setSlingauthrequirements(ConfigNodePropertyString  slingauthrequirements)
{
	this->slingauthrequirements = slingauthrequirements;
}


