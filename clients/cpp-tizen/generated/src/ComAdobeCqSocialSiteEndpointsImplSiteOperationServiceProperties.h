/*
 * ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H_
#define _ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H_


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

class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties();
	ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFieldWhitelist();

	/*! \brief Set 
	 */
	void setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSitePathFilters();

	/*! \brief Set 
	 */
	void setSitePathFilters(ConfigNodePropertyArray  sitePathFilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSitePackageGroup();

	/*! \brief Set 
	 */
	void setSitePackageGroup(ConfigNodePropertyString  sitePackageGroup);

private:
	ConfigNodePropertyArray fieldWhitelist;
	ConfigNodePropertyArray sitePathFilters;
	ConfigNodePropertyString sitePackageGroup;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H_ */
