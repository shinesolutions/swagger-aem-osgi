/*
 * ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo_H_
#define _ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo_H_


#include <string>
#include "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.h"
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

class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo();
	ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo_H_ */
