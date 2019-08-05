using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFormsCommonServiceImplDefaultDataProviderProperties
    /// </summary>
    public sealed class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties:  IEquatable<ComAdobeFormsCommonServiceImplDefaultDataProviderProperties>
    { 
        /// <summary>
        /// AlloweddataFileLocations
        /// </summary>
        public ConfigNodePropertyArray AlloweddataFileLocations { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties()
        {
        }

        private ComAdobeFormsCommonServiceImplDefaultDataProviderProperties(ConfigNodePropertyArray AlloweddataFileLocations)
        {
            
            this.AlloweddataFileLocations = AlloweddataFileLocations;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder</returns>
        public static ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder Builder()
        {
            return new ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder</returns>
        public ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder With()
        {
            return Builder()
                .AlloweddataFileLocations(AlloweddataFileLocations);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeFormsCommonServiceImplDefaultDataProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties left, ComAdobeFormsCommonServiceImplDefaultDataProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties left, ComAdobeFormsCommonServiceImplDefaultDataProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.
        /// </summary>
        public sealed class ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder
        {
            private ConfigNodePropertyArray _AlloweddataFileLocations;

            internal ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.AlloweddataFileLocations property.
            /// </summary>
            /// <param name="value">AlloweddataFileLocations</param>
            public ComAdobeFormsCommonServiceImplDefaultDataProviderPropertiesBuilder AlloweddataFileLocations(ConfigNodePropertyArray value)
            {
                _AlloweddataFileLocations = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.
            /// </summary>
            /// <returns>ComAdobeFormsCommonServiceImplDefaultDataProviderProperties</returns>
            public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties Build()
            {
                Validate();
                return new ComAdobeFormsCommonServiceImplDefaultDataProviderProperties(
                    AlloweddataFileLocations: _AlloweddataFileLocations
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}