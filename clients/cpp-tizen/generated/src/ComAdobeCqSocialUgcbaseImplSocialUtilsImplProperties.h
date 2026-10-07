/*
 * ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties_H_
#define _ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties_H_


#include <string>
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

class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties();
	ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLegacyCloudUGCPathMapping();

	/*! \brief Set 
	 */
	void setLegacyCloudUGCPathMapping(ConfigNodePropertyBoolean  legacyCloudUGCPathMapping);

private:
	ConfigNodePropertyBoolean legacyCloudUGCPathMapping;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties_H_ */
