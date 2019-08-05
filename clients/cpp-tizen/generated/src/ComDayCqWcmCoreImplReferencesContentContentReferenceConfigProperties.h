/*
 * ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties_H_
#define _ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties();
	ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getContentReferenceConfigresourceTypes();

	/*! \brief Set 
	 */
	void setContentReferenceConfigresourceTypes(ConfigNodePropertyArray  contentReferenceConfigresourceTypes);

private:
	ConfigNodePropertyArray contentReferenceConfigresourceTypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties_H_ */
