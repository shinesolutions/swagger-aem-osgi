/*
 * ComAdobeGraniteAcpPlatformPlatformServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAcpPlatformPlatformServletProperties_H_
#define _ComAdobeGraniteAcpPlatformPlatformServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteAcpPlatformPlatformServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAcpPlatformPlatformServletProperties();
	ComAdobeGraniteAcpPlatformPlatformServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAcpPlatformPlatformServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQuerylimit();

	/*! \brief Set 
	 */
	void setQuerylimit(ConfigNodePropertyInteger  querylimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFiletypeextensionmap();

	/*! \brief Set 
	 */
	void setFiletypeextensionmap(ConfigNodePropertyArray  filetypeextensionmap);

private:
	ConfigNodePropertyInteger querylimit;
	ConfigNodePropertyArray filetypeextensionmap;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAcpPlatformPlatformServletProperties_H_ */
