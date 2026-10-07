/*
 * ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties_H_
#define _ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties_H_


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

class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties();
	ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludesearchpath();

	/*! \brief Set 
	 */
	void setExcludesearchpath(ConfigNodePropertyArray  excludesearchpath);

private:
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyArray excludesearchpath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties_H_ */
