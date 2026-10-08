

#include "ComDayCqReportingImplRLogAnalyzerProperties.h"

using namespace Tiny;

ComDayCqReportingImplRLogAnalyzerProperties::ComDayCqReportingImplRLogAnalyzerProperties()
{
	requestlogoutput = ConfigNodePropertyString();
}

ComDayCqReportingImplRLogAnalyzerProperties::ComDayCqReportingImplRLogAnalyzerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReportingImplRLogAnalyzerProperties::~ComDayCqReportingImplRLogAnalyzerProperties()
{

}

void
ComDayCqReportingImplRLogAnalyzerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *requestlogoutputKey = "request.log.output";

    if(object.has_key(requestlogoutputKey))
    {
        bourne::json value = object[requestlogoutputKey];




        ConfigNodePropertyString* obj = &requestlogoutput;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReportingImplRLogAnalyzerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["requestlogoutput"] = getRequestlogoutput().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqReportingImplRLogAnalyzerProperties::getRequestlogoutput()
{
	return requestlogoutput;
}

void
ComDayCqReportingImplRLogAnalyzerProperties::setRequestlogoutput(ConfigNodePropertyString requestlogoutput)
{
	this->requestlogoutput = requestlogoutput;
}



