/*
 * ComDayCqWcmCoreWCMRequestFilterProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreWCMRequestFilterProperties_H_
#define _ComDayCqWcmCoreWCMRequestFilterProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
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

class ComDayCqWcmCoreWCMRequestFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreWCMRequestFilterProperties();
	ComDayCqWcmCoreWCMRequestFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreWCMRequestFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getWcmfiltermode();

	/*! \brief Set 
	 */
	void setWcmfiltermode(ConfigNodePropertyDropDown  wcmfiltermode);

private:
	ConfigNodePropertyDropDown wcmfiltermode;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreWCMRequestFilterProperties_H_ */
