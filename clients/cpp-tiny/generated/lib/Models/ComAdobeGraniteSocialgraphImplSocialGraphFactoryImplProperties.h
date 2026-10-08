
/*
 * ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties();
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroup2memberrelationshipoutgoing();

	/*! \brief Set 
	 */
	void setGroup2memberrelationshipoutgoing(ConfigNodePropertyString group2memberrelationshipoutgoing);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroup2memberexcludedoutgoing();

	/*! \brief Set 
	 */
	void setGroup2memberexcludedoutgoing(ConfigNodePropertyArray group2memberexcludedoutgoing);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroup2memberrelationshipincoming();

	/*! \brief Set 
	 */
	void setGroup2memberrelationshipincoming(ConfigNodePropertyString group2memberrelationshipincoming);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGroup2memberexcludedincoming();

	/*! \brief Set 
	 */
	void setGroup2memberexcludedincoming(ConfigNodePropertyArray group2memberexcludedincoming);


    private:
    ConfigNodePropertyString group2memberrelationshipoutgoing;
    ConfigNodePropertyArray group2memberexcludedoutgoing;
    ConfigNodePropertyString group2memberrelationshipincoming;
    ConfigNodePropertyArray group2memberexcludedincoming;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties_H_ */
