
/*
 * ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadMapCacheProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadMapCacheProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCorePayloadMapCacheProperties();
    ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCorePayloadMapCacheProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGetSystemWorkflowModels();

	/*! \brief Set 
	 */
	void setGetSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGetPackageRootPath();

	/*! \brief Set 
	 */
	void setGetPackageRootPath(ConfigNodePropertyString getPackageRootPath);


    private:
    ConfigNodePropertyArray getSystemWorkflowModels;
    ConfigNodePropertyString getPackageRootPath;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadMapCacheProperties_H_ */
