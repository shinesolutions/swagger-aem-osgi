/*
 * ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties_H_
#define _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties();
	ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath();

	/*! \brief Set 
	 */
	void setComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath(ConfigNodePropertyArray  comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency();

	/*! \brief Set 
	 */
	void setComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency(ConfigNodePropertyString  comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency);

private:
	ConfigNodePropertyArray comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath;
	ConfigNodePropertyString comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties_H_ */
