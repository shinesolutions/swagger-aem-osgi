
/*
 * ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties();
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumberOfDays();

	/*! \brief Set 
	 */
	void setNumberOfDays(ConfigNodePropertyInteger numberOfDays);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAgeOfFile();

	/*! \brief Set 
	 */
	void setAgeOfFile(ConfigNodePropertyInteger ageOfFile);


    private:
    ConfigNodePropertyInteger numberOfDays;
    ConfigNodePropertyInteger ageOfFile;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_ */
