

#include "ComDayCqPollingImporterImplManagedPollConfigImplProperties.h"

using namespace Tiny;

ComDayCqPollingImporterImplManagedPollConfigImplProperties::ComDayCqPollingImporterImplManagedPollConfigImplProperties()
{
	id = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
	reference = ConfigNodePropertyBoolean();
	interval = ConfigNodePropertyInteger();
	expression = ConfigNodePropertyString();
	source = ConfigNodePropertyString();
	target = ConfigNodePropertyString();
	login = ConfigNodePropertyString();
	password = ConfigNodePropertyString();
}

ComDayCqPollingImporterImplManagedPollConfigImplProperties::ComDayCqPollingImporterImplManagedPollConfigImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqPollingImporterImplManagedPollConfigImplProperties::~ComDayCqPollingImporterImplManagedPollConfigImplProperties()
{

}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];




        ConfigNodePropertyString* obj = &id;
		obj->fromJson(value.dump());

    }

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *referenceKey = "reference";

    if(object.has_key(referenceKey))
    {
        bourne::json value = object[referenceKey];




        ConfigNodePropertyBoolean* obj = &reference;
		obj->fromJson(value.dump());

    }

    const char *intervalKey = "interval";

    if(object.has_key(intervalKey))
    {
        bourne::json value = object[intervalKey];




        ConfigNodePropertyInteger* obj = &interval;
		obj->fromJson(value.dump());

    }

    const char *expressionKey = "expression";

    if(object.has_key(expressionKey))
    {
        bourne::json value = object[expressionKey];




        ConfigNodePropertyString* obj = &expression;
		obj->fromJson(value.dump());

    }

    const char *sourceKey = "source";

    if(object.has_key(sourceKey))
    {
        bourne::json value = object[sourceKey];




        ConfigNodePropertyString* obj = &source;
		obj->fromJson(value.dump());

    }

    const char *targetKey = "target";

    if(object.has_key(targetKey))
    {
        bourne::json value = object[targetKey];




        ConfigNodePropertyString* obj = &target;
		obj->fromJson(value.dump());

    }

    const char *loginKey = "login";

    if(object.has_key(loginKey))
    {
        bourne::json value = object[loginKey];




        ConfigNodePropertyString* obj = &login;
		obj->fromJson(value.dump());

    }

    const char *passwordKey = "password";

    if(object.has_key(passwordKey))
    {
        bourne::json value = object[passwordKey];




        ConfigNodePropertyString* obj = &password;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqPollingImporterImplManagedPollConfigImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["id"] = getId().toJson();






	object["enabled"] = getEnabled().toJson();






	object["reference"] = getReference().toJson();






	object["interval"] = getInterval().toJson();






	object["expression"] = getExpression().toJson();






	object["source"] = getSource().toJson();






	object["target"] = getTarget().toJson();






	object["login"] = getLogin().toJson();






	object["password"] = getPassword().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getId()
{
	return id;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setId(ConfigNodePropertyString id)
{
	this->id = id;
}

ConfigNodePropertyBoolean
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getEnabled()
{
	return enabled;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyBoolean
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getReference()
{
	return reference;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setReference(ConfigNodePropertyBoolean reference)
{
	this->reference = reference;
}

ConfigNodePropertyInteger
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getInterval()
{
	return interval;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setInterval(ConfigNodePropertyInteger interval)
{
	this->interval = interval;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getExpression()
{
	return expression;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setExpression(ConfigNodePropertyString expression)
{
	this->expression = expression;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getSource()
{
	return source;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setSource(ConfigNodePropertyString source)
{
	this->source = source;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getTarget()
{
	return target;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setTarget(ConfigNodePropertyString target)
{
	this->target = target;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getLogin()
{
	return login;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setLogin(ConfigNodePropertyString login)
{
	this->login = login;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollConfigImplProperties::getPassword()
{
	return password;
}

void
ComDayCqPollingImporterImplManagedPollConfigImplProperties::setPassword(ConfigNodePropertyString password)
{
	this->password = password;
}



