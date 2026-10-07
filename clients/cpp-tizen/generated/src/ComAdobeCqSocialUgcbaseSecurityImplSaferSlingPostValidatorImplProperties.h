/*
 * ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties_H_
#define _ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties_H_


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

class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties();
	ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getParameterwhitelist();

	/*! \brief Set 
	 */
	void setParameterwhitelist(ConfigNodePropertyArray  parameterwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getParameterwhitelistprefixes();

	/*! \brief Set 
	 */
	void setParameterwhitelistprefixes(ConfigNodePropertyArray  parameterwhitelistprefixes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getBinaryparameterwhitelist();

	/*! \brief Set 
	 */
	void setBinaryparameterwhitelist(ConfigNodePropertyArray  binaryparameterwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getModifierwhitelist();

	/*! \brief Set 
	 */
	void setModifierwhitelist(ConfigNodePropertyArray  modifierwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOperationwhitelist();

	/*! \brief Set 
	 */
	void setOperationwhitelist(ConfigNodePropertyArray  operationwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOperationwhitelistprefixes();

	/*! \brief Set 
	 */
	void setOperationwhitelistprefixes(ConfigNodePropertyArray  operationwhitelistprefixes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTypehintwhitelist();

	/*! \brief Set 
	 */
	void setTypehintwhitelist(ConfigNodePropertyArray  typehintwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourcetypewhitelist();

	/*! \brief Set 
	 */
	void setResourcetypewhitelist(ConfigNodePropertyArray  resourcetypewhitelist);

private:
	ConfigNodePropertyArray parameterwhitelist;
	ConfigNodePropertyArray parameterwhitelistprefixes;
	ConfigNodePropertyArray binaryparameterwhitelist;
	ConfigNodePropertyArray modifierwhitelist;
	ConfigNodePropertyArray operationwhitelist;
	ConfigNodePropertyArray operationwhitelistprefixes;
	ConfigNodePropertyArray typehintwhitelist;
	ConfigNodePropertyArray resourcetypewhitelist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties_H_ */
