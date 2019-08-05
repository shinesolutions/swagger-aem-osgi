using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties
    /// </summary>
    public sealed class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties:  IEquatable<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties>
    { 
        /// <summary>
        /// TempStorageConfig
        /// </summary>
        public ConfigNodePropertyDropDown TempStorageConfig { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties()
        {
        }

        private ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(ConfigNodePropertyDropDown TempStorageConfig)
        {
            
            this.TempStorageConfig = TempStorageConfig;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder</returns>
        public static ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder Builder()
        {
            return new ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder</returns>
        public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder With()
        {
            return Builder()
                .TempStorageConfig(TempStorageConfig);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties left, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties left, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.
        /// </summary>
        public sealed class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _TempStorageConfig;

            internal ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.TempStorageConfig property.
            /// </summary>
            /// <param name="value">TempStorageConfig</param>
            public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesBuilder TempStorageConfig(ConfigNodePropertyDropDown value)
            {
                _TempStorageConfig = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.
            /// </summary>
            /// <returns>ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties</returns>
            public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties Build()
            {
                Validate();
                return new ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(
                    TempStorageConfig: _TempStorageConfig
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}