/*
 * ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties_H_
#define _ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties_H_


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

class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties();
	ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties();

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
	ConfigNodePropertyArray getAccountlogins();

	/*! \brief Set 
	 */
	void setAccountlogins(ConfigNodePropertyArray  accountlogins);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConsolelogins();

	/*! \brief Set 
	 */
	void setConsolelogins(ConfigNodePropertyArray  consolelogins);

private:
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyArray accountlogins;
	ConfigNodePropertyArray consolelogins;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties_H_ */
