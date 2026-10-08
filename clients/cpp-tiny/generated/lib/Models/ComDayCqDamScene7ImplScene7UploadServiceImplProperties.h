
/*
 * ComDayCqDamScene7ImplScene7UploadServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7UploadServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7UploadServiceImplProperties_H_


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

class ComDayCqDamScene7ImplScene7UploadServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties();
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamScene7ImplScene7UploadServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamscene7uploadserviceactivejobtimeoutlabel();

	/*! \brief Set 
	 */
	void setCqdamscene7uploadserviceactivejobtimeoutlabel(ConfigNodePropertyInteger cqdamscene7uploadserviceactivejobtimeoutlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamscene7uploadserviceconnectionmaxperroutelabel();

	/*! \brief Set 
	 */
	void setCqdamscene7uploadserviceconnectionmaxperroutelabel(ConfigNodePropertyInteger cqdamscene7uploadserviceconnectionmaxperroutelabel);


    private:
    ConfigNodePropertyInteger cqdamscene7uploadserviceactivejobtimeoutlabel;
    ConfigNodePropertyInteger cqdamscene7uploadserviceconnectionmaxperroutelabel;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7UploadServiceImplProperties_H_ */
