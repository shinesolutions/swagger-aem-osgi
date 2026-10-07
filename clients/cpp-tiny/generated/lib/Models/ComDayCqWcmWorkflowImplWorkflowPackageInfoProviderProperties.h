
/*
 * ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_


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

class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties();
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWorkflowpackageinfoproviderfilter();

	/*! \brief Set 
	 */
	void setWorkflowpackageinfoproviderfilter(ConfigNodePropertyArray workflowpackageinfoproviderfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWorkflowpackageinfoproviderfilterrootpath();

	/*! \brief Set 
	 */
	void setWorkflowpackageinfoproviderfilterrootpath(ConfigNodePropertyString workflowpackageinfoproviderfilterrootpath);


    private:
    ConfigNodePropertyArray workflowpackageinfoproviderfilter;
    ConfigNodePropertyString workflowpackageinfoproviderfilterrootpath;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_ */
