#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqPollingImporterImplManagedPollConfigImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqPollingImporterImplManagedPollConfigImplProperties::ComDayCqPollingImporterImplManagedPollConfigImplProperties()
{
	//__init();
}

ComDayCqPollingImporterImplManagedPollConfigImplProperties::~ComDayCqPollingImporterImplManagedPollConfigImplProperties()
{
	//__cleanup();
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::__init()
{
	//id = new ConfigNodePropertyString();
	//enabled = new ConfigNodePropertyBoolean();
	//reference = new ConfigNodePropertyBoolean();
	//interval = new ConfigNodePropertyInteger();
	//expression = new ConfigNodePropertyString();
	//source = new ConfigNodePropertyString();
	//target = new ConfigNodePropertyString();
	//login = new ConfigNodePropertyString();
	//password = new ConfigNodePropertyString();
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(reference != NULL) {
	//
	//delete reference;
	//reference = NULL;
	//}
	//if(interval != NULL) {
	//
	//delete interval;
	//interval = NULL;
	//}
	//if(expression != NULL) {
	//
	//delete expression;
	//expression = NULL;
	//}
	//if(source != NULL) {
	//
	//delete source;
	//source = NULL;
	//}
	//if(target != NULL) {
	//
	//delete target;
	//target = NULL;
	//}
	//if(login != NULL) {
	//
	//delete login;
	//login = NULL;
	//}
	//if(password != NULL) {
	//
	//delete password;
	//password = NULL;
	//}
	//
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&id, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *referenceKey = "reference";
	node = json_object_get_member(pJsonObject, referenceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&reference, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&reference);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *intervalKey = "interval";
	node = json_object_get_member(pJsonObject, intervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&interval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&interval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *expressionKey = "expression";
	node = json_object_get_member(pJsonObject, expressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&expression, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&expression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sourceKey = "source";
	node = json_object_get_member(pJsonObject, sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&source, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&source);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targetKey = "target";
	node = json_object_get_member(pJsonObject, targetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&target, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&target);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *loginKey = "login";
	node = json_object_get_member(pJsonObject, loginKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&login, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&login);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordKey = "password";
	node = json_object_get_member(pJsonObject, passwordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&password, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&password);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqPollingImporterImplManagedPollConfigImplProperties::ComDayCqPollingImporterImplManagedPollConfigImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqPollingImporterImplManagedPollConfigImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getId();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getReference();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getReference());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *referenceKey = "reference";
	json_object_set_member(pJsonObject, referenceKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *intervalKey = "interval";
	json_object_set_member(pJsonObject, intervalKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getExpression();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getExpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *expressionKey = "expression";
	json_object_set_member(pJsonObject, expressionKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSource();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sourceKey = "source";
	json_object_set_member(pJsonObject, sourceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targetKey = "target";
	json_object_set_member(pJsonObject, targetKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLogin();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLogin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *loginKey = "login";
	json_object_set_member(pJsonObject, loginKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordKey = "password";
	json_object_set_member(pJsonObject, passwordKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getId()
{
	return id;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setId(ConfigNodePropertyString  id)
{
	this->id = id;
}

ConfigNodePropertyBoolean
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getEnabled()
{
	return enabled;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyBoolean
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getReference()
{
	return reference;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setReference(ConfigNodePropertyBoolean  reference)
{
	this->reference = reference;
}

ConfigNodePropertyInteger
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getInterval()
{
	return interval;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setInterval(ConfigNodePropertyInteger  interval)
{
	this->interval = interval;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getExpression()
{
	return expression;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setExpression(ConfigNodePropertyString  expression)
{
	this->expression = expression;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getSource()
{
	return source;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setSource(ConfigNodePropertyString  source)
{
	this->source = source;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getTarget()
{
	return target;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setTarget(ConfigNodePropertyString  target)
{
	this->target = target;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getLogin()
{
	return login;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setLogin(ConfigNodePropertyString  login)
{
	this->login = login;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getPassword()
{
	return password;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setPassword(ConfigNodePropertyString  password)
{
	this->password = password;
}


