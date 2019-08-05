/*
 * ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_
#define _ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_


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

class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties();
	ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties();

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

#endif /* _ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties_H_ */
