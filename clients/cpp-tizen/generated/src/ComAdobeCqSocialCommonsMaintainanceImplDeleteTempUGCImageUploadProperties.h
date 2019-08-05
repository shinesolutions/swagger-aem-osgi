/*
 * ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_
#define _ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_


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

class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties();
	ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumberOfDays();

	/*! \brief Set 
	 */
	void setNumberOfDays(ConfigNodePropertyInteger  numberOfDays);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAgeOfFile();

	/*! \brief Set 
	 */
	void setAgeOfFile(ConfigNodePropertyInteger  ageOfFile);

private:
	ConfigNodePropertyInteger numberOfDays;
	ConfigNodePropertyInteger ageOfFile;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_ */
