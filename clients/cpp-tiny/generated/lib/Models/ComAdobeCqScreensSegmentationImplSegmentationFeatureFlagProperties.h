
/*
 * ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties();
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableDataTriggeredContent();

	/*! \brief Set 
	 */
	void setEnableDataTriggeredContent(ConfigNodePropertyBoolean enableDataTriggeredContent);


    private:
    ConfigNodePropertyBoolean enableDataTriggeredContent;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties_H_ */
