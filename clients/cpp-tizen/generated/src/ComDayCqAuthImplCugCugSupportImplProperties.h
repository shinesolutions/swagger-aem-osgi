/*
 * ComDayCqAuthImplCugCugSupportImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqAuthImplCugCugSupportImplProperties_H_
#define _ComDayCqAuthImplCugCugSupportImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqAuthImplCugCugSupportImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAuthImplCugCugSupportImplProperties();
	ComDayCqAuthImplCugCugSupportImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAuthImplCugCugSupportImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCugexemptedprincipals();

	/*! \brief Set 
	 */
	void setCugexemptedprincipals(ConfigNodePropertyArray  cugexemptedprincipals);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCugenabled();

	/*! \brief Set 
	 */
	void setCugenabled(ConfigNodePropertyBoolean  cugenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCugprincipalsregex();

	/*! \brief Set 
	 */
	void setCugprincipalsregex(ConfigNodePropertyString  cugprincipalsregex);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCugprincipalsreplacement();

	/*! \brief Set 
	 */
	void setCugprincipalsreplacement(ConfigNodePropertyString  cugprincipalsreplacement);

private:
	ConfigNodePropertyArray cugexemptedprincipals;
	ConfigNodePropertyBoolean cugenabled;
	ConfigNodePropertyString cugprincipalsregex;
	ConfigNodePropertyString cugprincipalsreplacement;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAuthImplCugCugSupportImplProperties_H_ */
