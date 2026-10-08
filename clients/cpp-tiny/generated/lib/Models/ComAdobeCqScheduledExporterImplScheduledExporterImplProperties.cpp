

#include "ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.h"

using namespace Tiny;

ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::ComAdobeCqScheduledExporterImplScheduledExporterImplProperties()
{
	includepaths = ConfigNodePropertyArray();
	exporteruser = ConfigNodePropertyString();
}

ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::~ComAdobeCqScheduledExporterImplScheduledExporterImplProperties()
{

}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *includepathsKey = "include.paths";

    if(object.has_key(includepathsKey))
    {
        bourne::json value = object[includepathsKey];




        ConfigNodePropertyArray* obj = &includepaths;
		obj->fromJson(value.dump());

    }

    const char *exporteruserKey = "exporter.user";

    if(object.has_key(exporteruserKey))
    {
        bourne::json value = object[exporteruserKey];




        ConfigNodePropertyString* obj = &exporteruser;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["includepaths"] = getIncludepaths().toJson();






	object["exporteruser"] = getExporteruser().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::getIncludepaths()
{
	return includepaths;
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::setIncludepaths(ConfigNodePropertyArray includepaths)
{
	this->includepaths = includepaths;
}

ConfigNodePropertyString
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::getExporteruser()
{
	return exporteruser;
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::setExporteruser(ConfigNodePropertyString exporteruser)
{
	this->exporteruser = exporteruser;
}



