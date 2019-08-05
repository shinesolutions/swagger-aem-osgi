/*
 * ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties_H_
#define _ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties_H_


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

class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties();
	ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOffloadingtransporter();

	/*! \brief Set 
	 */
	void setOffloadingtransporter(ConfigNodePropertyString  offloadingtransporter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingcleanuppayload();

	/*! \brief Set 
	 */
	void setOffloadingcleanuppayload(ConfigNodePropertyBoolean  offloadingcleanuppayload);

private:
	ConfigNodePropertyString offloadingtransporter;
	ConfigNodePropertyBoolean offloadingcleanuppayload;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties_H_ */
