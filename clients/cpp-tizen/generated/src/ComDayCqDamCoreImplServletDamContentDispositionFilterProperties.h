/*
 * ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletDamContentDispositionFilterProperties_H_
#define _ComDayCqDamCoreImplServletDamContentDispositionFilterProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletDamContentDispositionFilterProperties();
	ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletDamContentDispositionFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqmimetypeblacklist();

	/*! \brief Set 
	 */
	void setCqmimetypeblacklist(ConfigNodePropertyArray  cqmimetypeblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamemptymime();

	/*! \brief Set 
	 */
	void setCqdamemptymime(ConfigNodePropertyBoolean  cqdamemptymime);

private:
	ConfigNodePropertyArray cqmimetypeblacklist;
	ConfigNodePropertyBoolean cqdamemptymime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletDamContentDispositionFilterProperties_H_ */
