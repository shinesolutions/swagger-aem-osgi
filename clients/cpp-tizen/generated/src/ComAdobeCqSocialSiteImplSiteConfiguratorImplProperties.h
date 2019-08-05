/*
 * ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties_H_
#define _ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties_H_


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

class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties();
	ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComponentsUsingTags();

	/*! \brief Set 
	 */
	void setComponentsUsingTags(ConfigNodePropertyArray  componentsUsingTags);

private:
	ConfigNodePropertyArray componentsUsingTags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties_H_ */
