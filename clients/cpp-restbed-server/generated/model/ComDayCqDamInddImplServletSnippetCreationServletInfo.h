/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ComDayCqDamInddImplServletSnippetCreationServletInfo.h
 *
 * 
 */

#ifndef ComDayCqDamInddImplServletSnippetCreationServletInfo_H_
#define ComDayCqDamInddImplServletSnippetCreationServletInfo_H_



#include <string>
#include "ComDayCqDamInddImplServletSnippetCreationServletProperties.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamInddImplServletSnippetCreationServletInfo
{
public:
    ComDayCqDamInddImplServletSnippetCreationServletInfo();
    virtual ~ComDayCqDamInddImplServletSnippetCreationServletInfo();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComDayCqDamInddImplServletSnippetCreationServletInfo members
    
    /// <summary>
    /// 
    /// </summary>
    std::string getPid() const;
    void setPid(std::string value);
    /// <summary>
    /// 
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string value);
    /// <summary>
    /// 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ComDayCqDamInddImplServletSnippetCreationServletProperties> getProperties() const;
    void setProperties(std::shared_ptr<ComDayCqDamInddImplServletSnippetCreationServletProperties> value);

protected:
    std::string m_Pid;
    std::string m_Title;
    std::string m_Description;
    std::shared_ptr<ComDayCqDamInddImplServletSnippetCreationServletProperties> m_Properties;
};

}
}
}
}

#endif /* ComDayCqDamInddImplServletSnippetCreationServletInfo_H_ */