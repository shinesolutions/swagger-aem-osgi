/*
 * ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_
#define _ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties();
	ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCacheenable();

	/*! \brief Set 
	 */
	void setCacheenable(ConfigNodePropertyBoolean  cacheenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCacherootPaths();

	/*! \brief Set 
	 */
	void setCacherootPaths(ConfigNodePropertyArray  cacherootPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachemaxSize();

	/*! \brief Set 
	 */
	void setCachemaxSize(ConfigNodePropertyInteger  cachemaxSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachemaxEntries();

	/*! \brief Set 
	 */
	void setCachemaxEntries(ConfigNodePropertyInteger  cachemaxEntries);

private:
	ConfigNodePropertyBoolean cacheenable;
	ConfigNodePropertyArray cacherootPaths;
	ConfigNodePropertyInteger cachemaxSize;
	ConfigNodePropertyInteger cachemaxEntries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_ */
