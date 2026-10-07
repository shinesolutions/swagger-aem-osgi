/*
 * ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo_H_
#define _ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo_H_


#include <string>
#include "ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.h"
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

class ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo();
	ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo();

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
	ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo_H_ */
