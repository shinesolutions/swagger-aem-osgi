
/*
 * ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties();
    ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getParameterwhitelist();

	/*! \brief Set 
	 */
	void setParameterwhitelist(ConfigNodePropertyArray parameterwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getParameterwhitelistprefixes();

	/*! \brief Set 
	 */
	void setParameterwhitelistprefixes(ConfigNodePropertyArray parameterwhitelistprefixes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getBinaryparameterwhitelist();

	/*! \brief Set 
	 */
	void setBinaryparameterwhitelist(ConfigNodePropertyArray binaryparameterwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getModifierwhitelist();

	/*! \brief Set 
	 */
	void setModifierwhitelist(ConfigNodePropertyArray modifierwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOperationwhitelist();

	/*! \brief Set 
	 */
	void setOperationwhitelist(ConfigNodePropertyArray operationwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOperationwhitelistprefixes();

	/*! \brief Set 
	 */
	void setOperationwhitelistprefixes(ConfigNodePropertyArray operationwhitelistprefixes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTypehintwhitelist();

	/*! \brief Set 
	 */
	void setTypehintwhitelist(ConfigNodePropertyArray typehintwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourcetypewhitelist();

	/*! \brief Set 
	 */
	void setResourcetypewhitelist(ConfigNodePropertyArray resourcetypewhitelist);


    private:
    ConfigNodePropertyArray parameterwhitelist;
    ConfigNodePropertyArray parameterwhitelistprefixes;
    ConfigNodePropertyArray binaryparameterwhitelist;
    ConfigNodePropertyArray modifierwhitelist;
    ConfigNodePropertyArray operationwhitelist;
    ConfigNodePropertyArray operationwhitelistprefixes;
    ConfigNodePropertyArray typehintwhitelist;
    ConfigNodePropertyArray resourcetypewhitelist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties_H_ */
