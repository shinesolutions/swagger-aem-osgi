/*
 * ComDayCqDamCoreImplDamEventRecorderImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplDamEventRecorderImplProperties_H_
#define _ComDayCqDamCoreImplDamEventRecorderImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqDamCoreImplDamEventRecorderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplDamEventRecorderImplProperties();
	ComDayCqDamCoreImplDamEventRecorderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplDamEventRecorderImplProperties();

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
	ConfigNodePropertyInteger getEventqueuelength();

	/*! \brief Set 
	 */
	void setEventqueuelength(ConfigNodePropertyInteger  eventqueuelength);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEventrecorderenabled();

	/*! \brief Set 
	 */
	void setEventrecorderenabled(ConfigNodePropertyBoolean  eventrecorderenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEventrecorderblacklist();

	/*! \brief Set 
	 */
	void setEventrecorderblacklist(ConfigNodePropertyArray  eventrecorderblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getEventrecordereventtypes();

	/*! \brief Set 
	 */
	void setEventrecordereventtypes(ConfigNodePropertyDropDown  eventrecordereventtypes);

private:
	ConfigNodePropertyString eventfilter;
	ConfigNodePropertyInteger eventqueuelength;
	ConfigNodePropertyBoolean eventrecorderenabled;
	ConfigNodePropertyArray eventrecorderblacklist;
	ConfigNodePropertyDropDown eventrecordereventtypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplDamEventRecorderImplProperties_H_ */
