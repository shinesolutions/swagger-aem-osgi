
/*
 * ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties();
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNuiEnabled();

	/*! \brief Set 
	 */
	void setNuiEnabled(ConfigNodePropertyBoolean nuiEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNuiServiceUrl();

	/*! \brief Set 
	 */
	void setNuiServiceUrl(ConfigNodePropertyString nuiServiceUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNuiApiKey();

	/*! \brief Set 
	 */
	void setNuiApiKey(ConfigNodePropertyString nuiApiKey);


    private:
    ConfigNodePropertyBoolean nuiEnabled;
    ConfigNodePropertyString nuiServiceUrl;
    ConfigNodePropertyString nuiApiKey;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_ */
