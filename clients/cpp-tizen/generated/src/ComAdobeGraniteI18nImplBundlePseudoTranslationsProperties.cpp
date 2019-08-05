#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties()
{
	//__init();
}

ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::~ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::__init()
{
	//pseudopatterns = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::__cleanup()
{
	//if(pseudopatterns != NULL) {
	//
	//delete pseudopatterns;
	//pseudopatterns = NULL;
	//}
	//
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pseudopatternsKey = "pseudo.patterns";
	node = json_object_get_member(pJsonObject, pseudopatternsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&pseudopatterns, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&pseudopatterns);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPseudopatterns();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPseudopatterns());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pseudopatternsKey = "pseudo.patterns";
	json_object_set_member(pJsonObject, pseudopatternsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::getPseudopatterns()
{
	return pseudopatterns;
}

void
ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties::setPseudopatterns(ConfigNodePropertyArray  pseudopatterns)
{
	this->pseudopatterns = pseudopatterns;
}


