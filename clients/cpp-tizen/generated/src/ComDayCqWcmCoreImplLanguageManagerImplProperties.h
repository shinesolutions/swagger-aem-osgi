/*
 * ComDayCqWcmCoreImplLanguageManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplLanguageManagerImplProperties_H_
#define _ComDayCqWcmCoreImplLanguageManagerImplProperties_H_


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

class ComDayCqWcmCoreImplLanguageManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplLanguageManagerImplProperties();
	ComDayCqWcmCoreImplLanguageManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplLanguageManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getLangmgrlistpath();

	/*! \brief Set 
	 */
	void setLangmgrlistpath(ConfigNodePropertyString  langmgrlistpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLangmgrcountrydefault();

	/*! \brief Set 
	 */
	void setLangmgrcountrydefault(ConfigNodePropertyArray  langmgrcountrydefault);

private:
	ConfigNodePropertyString langmgrlistpath;
	ConfigNodePropertyArray langmgrcountrydefault;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplLanguageManagerImplProperties_H_ */
