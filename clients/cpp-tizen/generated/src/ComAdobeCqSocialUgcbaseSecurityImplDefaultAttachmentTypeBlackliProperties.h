/*
 * ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties_H_
#define _ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties_H_


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

class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties();
	ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDefaultattachmenttypeblacklist();

	/*! \brief Set 
	 */
	void setDefaultattachmenttypeblacklist(ConfigNodePropertyArray  defaultattachmenttypeblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getBaselineattachmenttypeblacklist();

	/*! \brief Set 
	 */
	void setBaselineattachmenttypeblacklist(ConfigNodePropertyArray  baselineattachmenttypeblacklist);

private:
	ConfigNodePropertyArray defaultattachmenttypeblacklist;
	ConfigNodePropertyArray baselineattachmenttypeblacklist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties_H_ */
