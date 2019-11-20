/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ComDayCqWcmDesignimporterDesignPackageImporterProperties.h
 *
 * 
 */

#ifndef ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_
#define ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmDesignimporterDesignPackageImporterProperties
    : public ModelBase
{
public:
    ComDayCqWcmDesignimporterDesignPackageImporterProperties();
    virtual ~ComDayCqWcmDesignimporterDesignPackageImporterProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqWcmDesignimporterDesignPackageImporterProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getExtractFilter() const;
    void setExtractFilter(ConfigNodePropertyArray const& value);
    bool extractFilterIsSet() const;
    void unsetExtract_filter();

protected:
    ConfigNodePropertyArray m_Extract_filter;
    bool m_Extract_filterIsSet;
};

}
}
}
}

#endif /* ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_ */