/*
 * ComDayCqDamScene7ImplScene7UploadServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamScene7ImplScene7UploadServiceImplProperties_H_
#define _ComDayCqDamScene7ImplScene7UploadServiceImplProperties_H_


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

class ComDayCqDamScene7ImplScene7UploadServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamScene7ImplScene7UploadServiceImplProperties();
	ComDayCqDamScene7ImplScene7UploadServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamScene7ImplScene7UploadServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamscene7uploadserviceactivejobtimeoutlabel();

	/*! \brief Set 
	 */
	void setCqdamscene7uploadserviceactivejobtimeoutlabel(ConfigNodePropertyInteger  cqdamscene7uploadserviceactivejobtimeoutlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamscene7uploadserviceconnectionmaxperroutelabel();

	/*! \brief Set 
	 */
	void setCqdamscene7uploadserviceconnectionmaxperroutelabel(ConfigNodePropertyInteger  cqdamscene7uploadserviceconnectionmaxperroutelabel);

private:
	ConfigNodePropertyInteger cqdamscene7uploadserviceactivejobtimeoutlabel;
	ConfigNodePropertyInteger cqdamscene7uploadserviceconnectionmaxperroutelabel;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamScene7ImplScene7UploadServiceImplProperties_H_ */
