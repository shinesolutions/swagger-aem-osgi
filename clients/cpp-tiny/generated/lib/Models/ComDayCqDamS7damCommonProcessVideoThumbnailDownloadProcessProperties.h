
/*
 * ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties();
    ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString processlabel);


    private:
    ConfigNodePropertyString processlabel;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties_H_ */
