/*
 * ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties_H_
#define _ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties_H_


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

class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties();
	ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultexternalizerdomain();

	/*! \brief Set 
	 */
	void setDefaultexternalizerdomain(ConfigNodePropertyString  defaultexternalizerdomain);

private:
	ConfigNodePropertyString defaultexternalizerdomain;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties_H_ */
