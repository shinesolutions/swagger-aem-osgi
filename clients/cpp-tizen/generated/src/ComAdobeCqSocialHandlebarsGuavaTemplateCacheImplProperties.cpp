#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties()
{
	//__init();
}

ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::~ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::__init()
{
	//parameterguavacacheenabled = new ConfigNodePropertyBoolean();
	//parameterguavacacheparams = new ConfigNodePropertyString();
	//parameterguavacachereload = new ConfigNodePropertyBoolean();
	//serviceranking = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::__cleanup()
{
	//if(parameterguavacacheenabled != NULL) {
	//
	//delete parameterguavacacheenabled;
	//parameterguavacacheenabled = NULL;
	//}
	//if(parameterguavacacheparams != NULL) {
	//
	//delete parameterguavacacheparams;
	//parameterguavacacheparams = NULL;
	//}
	//if(parameterguavacachereload != NULL) {
	//
	//delete parameterguavacachereload;
	//parameterguavacachereload = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *parameterguavacacheenabledKey = "parameter.guava.cache.enabled";
	node = json_object_get_member(pJsonObject, parameterguavacacheenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&parameterguavacacheenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&parameterguavacacheenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parameterguavacacheparamsKey = "parameter.guava.cache.params";
	node = json_object_get_member(pJsonObject, parameterguavacacheparamsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&parameterguavacacheparams, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&parameterguavacacheparams);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parameterguavacachereloadKey = "parameter.guava.cache.reload";
	node = json_object_get_member(pJsonObject, parameterguavacachereloadKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&parameterguavacachereload, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&parameterguavacachereload);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
}

ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getParameterguavacacheenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getParameterguavacacheenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parameterguavacacheenabledKey = "parameter.guava.cache.enabled";
	json_object_set_member(pJsonObject, parameterguavacacheenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getParameterguavacacheparams();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getParameterguavacacheparams());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parameterguavacacheparamsKey = "parameter.guava.cache.params";
	json_object_set_member(pJsonObject, parameterguavacacheparamsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getParameterguavacachereload();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getParameterguavacachereload());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parameterguavacachereloadKey = "parameter.guava.cache.reload";
	json_object_set_member(pJsonObject, parameterguavacachereloadKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::getParameterguavacacheenabled()
{
	return parameterguavacacheenabled;
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::setParameterguavacacheenabled(ConfigNodePropertyBoolean  parameterguavacacheenabled)
{
	this->parameterguavacacheenabled = parameterguavacacheenabled;
}

ConfigNodePropertyString
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::getParameterguavacacheparams()
{
	return parameterguavacacheparams;
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::setParameterguavacacheparams(ConfigNodePropertyString  parameterguavacacheparams)
{
	this->parameterguavacacheparams = parameterguavacacheparams;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::getParameterguavacachereload()
{
	return parameterguavacachereload;
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::setParameterguavacachereload(ConfigNodePropertyBoolean  parameterguavacachereload)
{
	this->parameterguavacachereload = parameterguavacachereload;
}

ConfigNodePropertyInteger
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}


