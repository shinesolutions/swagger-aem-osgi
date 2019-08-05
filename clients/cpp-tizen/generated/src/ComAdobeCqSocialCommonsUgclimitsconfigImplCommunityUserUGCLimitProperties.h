/*
 * ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties_H_
#define _ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties();
	ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnable();

	/*! \brief Set 
	 */
	void setEnable(ConfigNodePropertyBoolean  enable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getUGCLimit();

	/*! \brief Set 
	 */
	void setUGCLimit(ConfigNodePropertyInteger  uGCLimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getUgcLimitDuration();

	/*! \brief Set 
	 */
	void setUgcLimitDuration(ConfigNodePropertyInteger  ugcLimitDuration);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDomains();

	/*! \brief Set 
	 */
	void setDomains(ConfigNodePropertyArray  domains);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getToList();

	/*! \brief Set 
	 */
	void setToList(ConfigNodePropertyArray  toList);

private:
	ConfigNodePropertyBoolean enable;
	ConfigNodePropertyInteger uGCLimit;
	ConfigNodePropertyInteger ugcLimitDuration;
	ConfigNodePropertyArray domains;
	ConfigNodePropertyArray toList;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties_H_ */
