/*
 * ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties_H_
#define _ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties();
	ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobedammacsyncclientsotimeout();

	/*! \brief Set 
	 */
	void setComadobedammacsyncclientsotimeout(ConfigNodePropertyInteger  comadobedammacsyncclientsotimeout);

private:
	ConfigNodePropertyInteger comadobedammacsyncclientsotimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties_H_ */
