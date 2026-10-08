

#include "ComDayCqWcmDesignimporterDesignPackageImporterProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterDesignPackageImporterProperties::ComDayCqWcmDesignimporterDesignPackageImporterProperties()
{
	extractfilter = ConfigNodePropertyArray();
}

ComDayCqWcmDesignimporterDesignPackageImporterProperties::ComDayCqWcmDesignimporterDesignPackageImporterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterDesignPackageImporterProperties::~ComDayCqWcmDesignimporterDesignPackageImporterProperties()
{

}

void
ComDayCqWcmDesignimporterDesignPackageImporterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *extractfilterKey = "extract.filter";

    if(object.has_key(extractfilterKey))
    {
        bourne::json value = object[extractfilterKey];




        ConfigNodePropertyArray* obj = &extractfilter;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterDesignPackageImporterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["extractfilter"] = getExtractfilter().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmDesignimporterDesignPackageImporterProperties::getExtractfilter()
{
	return extractfilter;
}

void
ComDayCqWcmDesignimporterDesignPackageImporterProperties::setExtractfilter(ConfigNodePropertyArray extractfilter)
{
	this->extractfilter = extractfilter;
}



