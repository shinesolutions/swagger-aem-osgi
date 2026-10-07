/*
 * ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_
#define _ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
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

class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties();
	ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNuiEnabled();

	/*! \brief Set 
	 */
	void setNuiEnabled(ConfigNodePropertyBoolean  nuiEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNuiServiceUrl();

	/*! \brief Set 
	 */
	void setNuiServiceUrl(ConfigNodePropertyString  nuiServiceUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNuiApiKey();

	/*! \brief Set 
	 */
	void setNuiApiKey(ConfigNodePropertyString  nuiApiKey);

private:
	ConfigNodePropertyBoolean nuiEnabled;
	ConfigNodePropertyString nuiServiceUrl;
	ConfigNodePropertyString nuiApiKey;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties_H_ */
