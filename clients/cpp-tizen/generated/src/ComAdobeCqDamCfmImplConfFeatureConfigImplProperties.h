/*
 * ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamCfmImplConfFeatureConfigImplProperties_H_
#define _ComAdobeCqDamCfmImplConfFeatureConfigImplProperties_H_


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

class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamCfmImplConfFeatureConfigImplProperties();
	ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamCfmImplConfFeatureConfigImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDamcfmresourceTypes();

	/*! \brief Set 
	 */
	void setDamcfmresourceTypes(ConfigNodePropertyArray  damcfmresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDamcfmreferenceProperties();

	/*! \brief Set 
	 */
	void setDamcfmreferenceProperties(ConfigNodePropertyArray  damcfmreferenceProperties);

private:
	ConfigNodePropertyArray damcfmresourceTypes;
	ConfigNodePropertyArray damcfmreferenceProperties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamCfmImplConfFeatureConfigImplProperties_H_ */
