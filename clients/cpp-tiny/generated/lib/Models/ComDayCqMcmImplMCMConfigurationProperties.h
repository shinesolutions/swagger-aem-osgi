
/*
 * ComDayCqMcmImplMCMConfigurationProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqMcmImplMCMConfigurationProperties_H_
#define TINY_CPP_CLIENT_ComDayCqMcmImplMCMConfigurationProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqMcmImplMCMConfigurationProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqMcmImplMCMConfigurationProperties();
    ComDayCqMcmImplMCMConfigurationProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqMcmImplMCMConfigurationProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExperienceindirection();

	/*! \brief Set 
	 */
	void setExperienceindirection(ConfigNodePropertyArray experienceindirection);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTouchpointindirection();

	/*! \brief Set 
	 */
	void setTouchpointindirection(ConfigNodePropertyArray touchpointindirection);


    private:
    ConfigNodePropertyArray experienceindirection;
    ConfigNodePropertyArray touchpointindirection;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqMcmImplMCMConfigurationProperties_H_ */
