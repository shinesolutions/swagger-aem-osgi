
/*
 * ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties();
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkexpiredprefix();

	/*! \brief Set 
	 */
	void setLinkexpiredprefix(ConfigNodePropertyString linkexpiredprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkexpiredremove();

	/*! \brief Set 
	 */
	void setLinkexpiredremove(ConfigNodePropertyBoolean linkexpiredremove);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkexpiredsuffix();

	/*! \brief Set 
	 */
	void setLinkexpiredsuffix(ConfigNodePropertyString linkexpiredsuffix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkinvalidprefix();

	/*! \brief Set 
	 */
	void setLinkinvalidprefix(ConfigNodePropertyString linkinvalidprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkinvalidremove();

	/*! \brief Set 
	 */
	void setLinkinvalidremove(ConfigNodePropertyBoolean linkinvalidremove);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkinvalidsuffix();

	/*! \brief Set 
	 */
	void setLinkinvalidsuffix(ConfigNodePropertyString linkinvalidsuffix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkpredatedprefix();

	/*! \brief Set 
	 */
	void setLinkpredatedprefix(ConfigNodePropertyString linkpredatedprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkpredatedremove();

	/*! \brief Set 
	 */
	void setLinkpredatedremove(ConfigNodePropertyBoolean linkpredatedremove);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkpredatedsuffix();

	/*! \brief Set 
	 */
	void setLinkpredatedsuffix(ConfigNodePropertyString linkpredatedsuffix);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLinkwcmmodes();

	/*! \brief Set 
	 */
	void setLinkwcmmodes(ConfigNodePropertyArray linkwcmmodes);


    private:
    ConfigNodePropertyString linkexpiredprefix;
    ConfigNodePropertyBoolean linkexpiredremove;
    ConfigNodePropertyString linkexpiredsuffix;
    ConfigNodePropertyString linkinvalidprefix;
    ConfigNodePropertyBoolean linkinvalidremove;
    ConfigNodePropertyString linkinvalidsuffix;
    ConfigNodePropertyString linkpredatedprefix;
    ConfigNodePropertyBoolean linkpredatedremove;
    ConfigNodePropertyString linkpredatedsuffix;
    ConfigNodePropertyArray linkwcmmodes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties_H_ */
