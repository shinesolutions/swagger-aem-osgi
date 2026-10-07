/*
 * ComDayCqCommonsServletsRootMappingServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqCommonsServletsRootMappingServletProperties_H_
#define _ComDayCqCommonsServletsRootMappingServletProperties_H_


#include <string>
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

class ComDayCqCommonsServletsRootMappingServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqCommonsServletsRootMappingServletProperties();
	ComDayCqCommonsServletsRootMappingServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqCommonsServletsRootMappingServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRootmappingtarget();

	/*! \brief Set 
	 */
	void setRootmappingtarget(ConfigNodePropertyString  rootmappingtarget);

private:
	ConfigNodePropertyString rootmappingtarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqCommonsServletsRootMappingServletProperties_H_ */
