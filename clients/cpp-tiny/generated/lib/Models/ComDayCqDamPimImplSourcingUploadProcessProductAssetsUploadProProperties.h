
/*
 * ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties();
    ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDeletezipfile();

	/*! \brief Set 
	 */
	void setDeletezipfile(ConfigNodePropertyBoolean deletezipfile);


    private:
    ConfigNodePropertyBoolean deletezipfile;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties_H_ */
