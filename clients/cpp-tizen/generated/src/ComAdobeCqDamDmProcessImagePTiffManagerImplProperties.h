/*
 * ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamDmProcessImagePTiffManagerImplProperties_H_
#define _ComAdobeCqDamDmProcessImagePTiffManagerImplProperties_H_


#include <string>
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

class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamDmProcessImagePTiffManagerImplProperties();
	ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamDmProcessImagePTiffManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxMemory();

	/*! \brief Set 
	 */
	void setMaxMemory(ConfigNodePropertyInteger  maxMemory);

private:
	ConfigNodePropertyInteger maxMemory;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamDmProcessImagePTiffManagerImplProperties_H_ */
