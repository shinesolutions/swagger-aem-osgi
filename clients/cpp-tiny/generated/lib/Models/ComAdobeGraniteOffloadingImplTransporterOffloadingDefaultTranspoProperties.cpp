

#include "ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.h"

using namespace Tiny;

ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties()
{
	defaulttransportagenttoworkerprefix = ConfigNodePropertyString();
	defaulttransportagenttomasterprefix = ConfigNodePropertyString();
	defaulttransportinputpackage = ConfigNodePropertyString();
	defaulttransportoutputpackage = ConfigNodePropertyString();
	defaulttransportreplicationsynchronous = ConfigNodePropertyBoolean();
	defaulttransportcontentpackage = ConfigNodePropertyBoolean();
	offloadingtransporterdefaultenabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::~ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties()
{

}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *defaulttransportagenttoworkerprefixKey = "default.transport.agent-to-worker.prefix";

    if(object.has_key(defaulttransportagenttoworkerprefixKey))
    {
        bourne::json value = object[defaulttransportagenttoworkerprefixKey];




        ConfigNodePropertyString* obj = &defaulttransportagenttoworkerprefix;
		obj->fromJson(value.dump());

    }

    const char *defaulttransportagenttomasterprefixKey = "default.transport.agent-to-master.prefix";

    if(object.has_key(defaulttransportagenttomasterprefixKey))
    {
        bourne::json value = object[defaulttransportagenttomasterprefixKey];




        ConfigNodePropertyString* obj = &defaulttransportagenttomasterprefix;
		obj->fromJson(value.dump());

    }

    const char *defaulttransportinputpackageKey = "default.transport.input.package";

    if(object.has_key(defaulttransportinputpackageKey))
    {
        bourne::json value = object[defaulttransportinputpackageKey];




        ConfigNodePropertyString* obj = &defaulttransportinputpackage;
		obj->fromJson(value.dump());

    }

    const char *defaulttransportoutputpackageKey = "default.transport.output.package";

    if(object.has_key(defaulttransportoutputpackageKey))
    {
        bourne::json value = object[defaulttransportoutputpackageKey];




        ConfigNodePropertyString* obj = &defaulttransportoutputpackage;
		obj->fromJson(value.dump());

    }

    const char *defaulttransportreplicationsynchronousKey = "default.transport.replication.synchronous";

    if(object.has_key(defaulttransportreplicationsynchronousKey))
    {
        bourne::json value = object[defaulttransportreplicationsynchronousKey];




        ConfigNodePropertyBoolean* obj = &defaulttransportreplicationsynchronous;
		obj->fromJson(value.dump());

    }

    const char *defaulttransportcontentpackageKey = "default.transport.contentpackage";

    if(object.has_key(defaulttransportcontentpackageKey))
    {
        bourne::json value = object[defaulttransportcontentpackageKey];




        ConfigNodePropertyBoolean* obj = &defaulttransportcontentpackage;
		obj->fromJson(value.dump());

    }

    const char *offloadingtransporterdefaultenabledKey = "offloading.transporter.default.enabled";

    if(object.has_key(offloadingtransporterdefaultenabledKey))
    {
        bourne::json value = object[offloadingtransporterdefaultenabledKey];




        ConfigNodePropertyBoolean* obj = &offloadingtransporterdefaultenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["defaulttransportagenttoworkerprefix"] = getDefaulttransportagenttoworkerprefix().toJson();






	object["defaulttransportagenttomasterprefix"] = getDefaulttransportagenttomasterprefix().toJson();






	object["defaulttransportinputpackage"] = getDefaulttransportinputpackage().toJson();






	object["defaulttransportoutputpackage"] = getDefaulttransportoutputpackage().toJson();






	object["defaulttransportreplicationsynchronous"] = getDefaulttransportreplicationsynchronous().toJson();






	object["defaulttransportcontentpackage"] = getDefaulttransportcontentpackage().toJson();






	object["offloadingtransporterdefaultenabled"] = getOffloadingtransporterdefaultenabled().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportagenttoworkerprefix()
{
	return defaulttransportagenttoworkerprefix;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportagenttoworkerprefix(ConfigNodePropertyString defaulttransportagenttoworkerprefix)
{
	this->defaulttransportagenttoworkerprefix = defaulttransportagenttoworkerprefix;
}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportagenttomasterprefix()
{
	return defaulttransportagenttomasterprefix;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportagenttomasterprefix(ConfigNodePropertyString defaulttransportagenttomasterprefix)
{
	this->defaulttransportagenttomasterprefix = defaulttransportagenttomasterprefix;
}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportinputpackage()
{
	return defaulttransportinputpackage;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportinputpackage(ConfigNodePropertyString defaulttransportinputpackage)
{
	this->defaulttransportinputpackage = defaulttransportinputpackage;
}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportoutputpackage()
{
	return defaulttransportoutputpackage;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportoutputpackage(ConfigNodePropertyString defaulttransportoutputpackage)
{
	this->defaulttransportoutputpackage = defaulttransportoutputpackage;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportreplicationsynchronous()
{
	return defaulttransportreplicationsynchronous;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportreplicationsynchronous(ConfigNodePropertyBoolean defaulttransportreplicationsynchronous)
{
	this->defaulttransportreplicationsynchronous = defaulttransportreplicationsynchronous;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getDefaulttransportcontentpackage()
{
	return defaulttransportcontentpackage;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setDefaulttransportcontentpackage(ConfigNodePropertyBoolean defaulttransportcontentpackage)
{
	this->defaulttransportcontentpackage = defaulttransportcontentpackage;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::getOffloadingtransporterdefaultenabled()
{
	return offloadingtransporterdefaultenabled;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties::setOffloadingtransporterdefaultenabled(ConfigNodePropertyBoolean offloadingtransporterdefaultenabled)
{
	this->offloadingtransporterdefaultenabled = offloadingtransporterdefaultenabled;
}



