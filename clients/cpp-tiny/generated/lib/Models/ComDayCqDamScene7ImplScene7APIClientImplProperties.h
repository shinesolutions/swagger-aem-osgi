
/*
 * ComDayCqDamScene7ImplScene7APIClientImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7APIClientImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7APIClientImplProperties_H_


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

class ComDayCqDamScene7ImplScene7APIClientImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamScene7ImplScene7APIClientImplProperties();
    ComDayCqDamScene7ImplScene7APIClientImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamScene7ImplScene7APIClientImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamscene7apiclientrecordsperpagenofiltername();

	/*! \brief Set 
	 */
	void setCqdamscene7apiclientrecordsperpagenofiltername(ConfigNodePropertyInteger cqdamscene7apiclientrecordsperpagenofiltername);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamscene7apiclientrecordsperpagewithfiltername();

	/*! \brief Set 
	 */
	void setCqdamscene7apiclientrecordsperpagewithfiltername(ConfigNodePropertyInteger cqdamscene7apiclientrecordsperpagewithfiltername);


    private:
    ConfigNodePropertyInteger cqdamscene7apiclientrecordsperpagenofiltername;
    ConfigNodePropertyInteger cqdamscene7apiclientrecordsperpagewithfiltername;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7APIClientImplProperties_H_ */
