/*
 * ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties_H_
#define _ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties();
	ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDeletezipfile();

	/*! \brief Set 
	 */
	void setDeletezipfile(ConfigNodePropertyBoolean  deletezipfile);

private:
	ConfigNodePropertyBoolean deletezipfile;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties_H_ */
