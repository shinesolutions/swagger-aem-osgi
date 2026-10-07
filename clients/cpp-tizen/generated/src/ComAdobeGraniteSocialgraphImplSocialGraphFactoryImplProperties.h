/*
 * ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties_H_
#define _ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties_H_


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

class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties();
	ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroup2memberrelationshipoutgoing();

	/*! \brief Set 
	 */
	void setGroup2memberrelationshipoutgoing(ConfigNodePropertyString  group2memberrelationshipoutgoing);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroup2memberexcludedoutgoing();

	/*! \brief Set 
	 */
	void setGroup2memberexcludedoutgoing(ConfigNodePropertyArray  group2memberexcludedoutgoing);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroup2memberrelationshipincoming();

	/*! \brief Set 
	 */
	void setGroup2memberrelationshipincoming(ConfigNodePropertyString  group2memberrelationshipincoming);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroup2memberexcludedincoming();

	/*! \brief Set 
	 */
	void setGroup2memberexcludedincoming(ConfigNodePropertyArray  group2memberexcludedincoming);

private:
	ConfigNodePropertyString group2memberrelationshipoutgoing;
	ConfigNodePropertyArray group2memberexcludedoutgoing;
	ConfigNodePropertyString group2memberrelationshipincoming;
	ConfigNodePropertyArray group2memberexcludedincoming;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties_H_ */
