/*
 * ComDayCqMcmImplMCMConfigurationProperties.h
 *
 * 
 */

#ifndef _ComDayCqMcmImplMCMConfigurationProperties_H_
#define _ComDayCqMcmImplMCMConfigurationProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqMcmImplMCMConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqMcmImplMCMConfigurationProperties();
	ComDayCqMcmImplMCMConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqMcmImplMCMConfigurationProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExperienceindirection();

	/*! \brief Set 
	 */
	void setExperienceindirection(ConfigNodePropertyArray  experienceindirection);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTouchpointindirection();

	/*! \brief Set 
	 */
	void setTouchpointindirection(ConfigNodePropertyArray  touchpointindirection);

private:
	ConfigNodePropertyArray experienceindirection;
	ConfigNodePropertyArray touchpointindirection;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqMcmImplMCMConfigurationProperties_H_ */
