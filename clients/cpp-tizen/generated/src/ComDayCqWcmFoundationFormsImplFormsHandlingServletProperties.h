/*
 * ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties_H_
#define _ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties_H_


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

class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties();
	ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getNamewhitelist();

	/*! \brief Set 
	 */
	void setNamewhitelist(ConfigNodePropertyString  namewhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowexpressions();

	/*! \brief Set 
	 */
	void setAllowexpressions(ConfigNodePropertyBoolean  allowexpressions);

private:
	ConfigNodePropertyString namewhitelist;
	ConfigNodePropertyBoolean allowexpressions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties_H_ */
