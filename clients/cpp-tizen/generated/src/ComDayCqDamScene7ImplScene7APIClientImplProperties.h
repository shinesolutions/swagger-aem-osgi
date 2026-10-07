/*
 * ComDayCqDamScene7ImplScene7APIClientImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamScene7ImplScene7APIClientImplProperties_H_
#define _ComDayCqDamScene7ImplScene7APIClientImplProperties_H_


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

class ComDayCqDamScene7ImplScene7APIClientImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamScene7ImplScene7APIClientImplProperties();
	ComDayCqDamScene7ImplScene7APIClientImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamScene7ImplScene7APIClientImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamscene7apiclientrecordsperpagenofiltername();

	/*! \brief Set 
	 */
	void setCqdamscene7apiclientrecordsperpagenofiltername(ConfigNodePropertyInteger  cqdamscene7apiclientrecordsperpagenofiltername);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamscene7apiclientrecordsperpagewithfiltername();

	/*! \brief Set 
	 */
	void setCqdamscene7apiclientrecordsperpagewithfiltername(ConfigNodePropertyInteger  cqdamscene7apiclientrecordsperpagewithfiltername);

private:
	ConfigNodePropertyInteger cqdamscene7apiclientrecordsperpagenofiltername;
	ConfigNodePropertyInteger cqdamscene7apiclientrecordsperpagewithfiltername;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamScene7ImplScene7APIClientImplProperties_H_ */
