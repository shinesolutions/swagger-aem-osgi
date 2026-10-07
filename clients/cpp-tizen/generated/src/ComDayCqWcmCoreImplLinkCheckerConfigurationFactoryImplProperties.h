/*
 * ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties_H_
#define _ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties();
	ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkexpiredprefix();

	/*! \brief Set 
	 */
	void setLinkexpiredprefix(ConfigNodePropertyString  linkexpiredprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkexpiredremove();

	/*! \brief Set 
	 */
	void setLinkexpiredremove(ConfigNodePropertyBoolean  linkexpiredremove);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkexpiredsuffix();

	/*! \brief Set 
	 */
	void setLinkexpiredsuffix(ConfigNodePropertyString  linkexpiredsuffix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkinvalidprefix();

	/*! \brief Set 
	 */
	void setLinkinvalidprefix(ConfigNodePropertyString  linkinvalidprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkinvalidremove();

	/*! \brief Set 
	 */
	void setLinkinvalidremove(ConfigNodePropertyBoolean  linkinvalidremove);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkinvalidsuffix();

	/*! \brief Set 
	 */
	void setLinkinvalidsuffix(ConfigNodePropertyString  linkinvalidsuffix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkpredatedprefix();

	/*! \brief Set 
	 */
	void setLinkpredatedprefix(ConfigNodePropertyString  linkpredatedprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkpredatedremove();

	/*! \brief Set 
	 */
	void setLinkpredatedremove(ConfigNodePropertyBoolean  linkpredatedremove);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLinkpredatedsuffix();

	/*! \brief Set 
	 */
	void setLinkpredatedsuffix(ConfigNodePropertyString  linkpredatedsuffix);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLinkwcmmodes();

	/*! \brief Set 
	 */
	void setLinkwcmmodes(ConfigNodePropertyArray  linkwcmmodes);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties_H_ */
