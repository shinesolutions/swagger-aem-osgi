/*
 * ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamCfmImplComponentComponentConfigImplProperties_H_
#define _ComAdobeCqDamCfmImplComponentComponentConfigImplProperties_H_


#include <string>
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

class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamCfmImplComponentComponentConfigImplProperties();
	ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamCfmImplComponentComponentConfigImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamcfmcomponentresourceType();

	/*! \brief Set 
	 */
	void setDamcfmcomponentresourceType(ConfigNodePropertyString  damcfmcomponentresourceType);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamcfmcomponentfileReferenceProp();

	/*! \brief Set 
	 */
	void setDamcfmcomponentfileReferenceProp(ConfigNodePropertyString  damcfmcomponentfileReferenceProp);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamcfmcomponentelementsProp();

	/*! \brief Set 
	 */
	void setDamcfmcomponentelementsProp(ConfigNodePropertyString  damcfmcomponentelementsProp);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDamcfmcomponentvariationProp();

	/*! \brief Set 
	 */
	void setDamcfmcomponentvariationProp(ConfigNodePropertyString  damcfmcomponentvariationProp);

private:
	ConfigNodePropertyString damcfmcomponentresourceType;
	ConfigNodePropertyString damcfmcomponentfileReferenceProp;
	ConfigNodePropertyString damcfmcomponentelementsProp;
	ConfigNodePropertyString damcfmcomponentvariationProp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamCfmImplComponentComponentConfigImplProperties_H_ */
