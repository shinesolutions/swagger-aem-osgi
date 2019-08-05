/*
 * ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties_H_
#define _ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
	ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString  eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLauncheseventhandlerthreadpoolmaxsize();

	/*! \brief Set 
	 */
	void setLauncheseventhandlerthreadpoolmaxsize(ConfigNodePropertyInteger  launcheseventhandlerthreadpoolmaxsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getLauncheseventhandlerthreadpoolpriority();

	/*! \brief Set 
	 */
	void setLauncheseventhandlerthreadpoolpriority(ConfigNodePropertyDropDown  launcheseventhandlerthreadpoolpriority);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLauncheseventhandlerupdatelastmodification();

	/*! \brief Set 
	 */
	void setLauncheseventhandlerupdatelastmodification(ConfigNodePropertyBoolean  launcheseventhandlerupdatelastmodification);

private:
	ConfigNodePropertyString eventfilter;
	ConfigNodePropertyInteger launcheseventhandlerthreadpoolmaxsize;
	ConfigNodePropertyDropDown launcheseventhandlerthreadpoolpriority;
	ConfigNodePropertyBoolean launcheseventhandlerupdatelastmodification;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties_H_ */
