using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryServiceUserConfigurationProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryServiceUserConfigurationProperties:  IEquatable<ComAdobeGraniteRepositoryServiceUserConfigurationProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// ServiceusersSimpleSubjectPopulation
        /// </summary>
        public ConfigNodePropertyBoolean ServiceusersSimpleSubjectPopulation { get; private set; }

        /// <summary>
        /// ServiceusersList
        /// </summary>
        public ConfigNodePropertyArray ServiceusersList { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryServiceUserConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryServiceUserConfigurationProperties()
        {
        }

        private ComAdobeGraniteRepositoryServiceUserConfigurationProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyBoolean ServiceusersSimpleSubjectPopulation, ConfigNodePropertyArray ServiceusersList)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.ServiceusersSimpleSubjectPopulation = ServiceusersSimpleSubjectPopulation;
            
            this.ServiceusersList = ServiceusersList;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryServiceUserConfigurationProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .ServiceusersSimpleSubjectPopulation(ServiceusersSimpleSubjectPopulation)
                .ServiceusersList(ServiceusersList);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRepositoryServiceUserConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryServiceUserConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryServiceUserConfigurationProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryServiceUserConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryServiceUserConfigurationProperties left, ComAdobeGraniteRepositoryServiceUserConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryServiceUserConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryServiceUserConfigurationProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryServiceUserConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryServiceUserConfigurationProperties left, ComAdobeGraniteRepositoryServiceUserConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryServiceUserConfigurationProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyBoolean _ServiceusersSimpleSubjectPopulation;
            private ConfigNodePropertyArray _ServiceusersList;

            internal ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryServiceUserConfigurationProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryServiceUserConfigurationProperties.ServiceusersSimpleSubjectPopulation property.
            /// </summary>
            /// <param name="value">ServiceusersSimpleSubjectPopulation</param>
            public ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder ServiceusersSimpleSubjectPopulation(ConfigNodePropertyBoolean value)
            {
                _ServiceusersSimpleSubjectPopulation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryServiceUserConfigurationProperties.ServiceusersList property.
            /// </summary>
            /// <param name="value">ServiceusersList</param>
            public ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder ServiceusersList(ConfigNodePropertyArray value)
            {
                _ServiceusersList = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryServiceUserConfigurationProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryServiceUserConfigurationProperties</returns>
            public ComAdobeGraniteRepositoryServiceUserConfigurationProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryServiceUserConfigurationProperties(
                    ServiceRanking: _ServiceRanking,
                    ServiceusersSimpleSubjectPopulation: _ServiceusersSimpleSubjectPopulation,
                    ServiceusersList: _ServiceusersList
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}