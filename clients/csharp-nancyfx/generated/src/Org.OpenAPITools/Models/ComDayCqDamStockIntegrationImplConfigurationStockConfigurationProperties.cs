using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
    /// </summary>
    public sealed class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties:  IEquatable<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Locale
        /// </summary>
        public ConfigNodePropertyString Locale { get; private set; }

        /// <summary>
        /// ImsConfig
        /// </summary>
        public ConfigNodePropertyString ImsConfig { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties()
        {
        }

        private ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Locale, ConfigNodePropertyString ImsConfig)
        {
            
            this.Name = Name;
            
            this.Locale = Locale;
            
            this.ImsConfig = ImsConfig;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.
        /// </summary>
        /// <returns>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder</returns>
        public static ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder Builder()
        {
            return new ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder</returns>
        public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Locale(Locale)
                .ImsConfig(ImsConfig);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties</param>
        /// <param name="right">Compared (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties left, ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties</param>
        /// <param name="right">Compared (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties left, ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.
        /// </summary>
        public sealed class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Locale;
            private ConfigNodePropertyString _ImsConfig;

            internal ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.Locale property.
            /// </summary>
            /// <param name="value">Locale</param>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder Locale(ConfigNodePropertyString value)
            {
                _Locale = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.ImsConfig property.
            /// </summary>
            /// <param name="value">ImsConfig</param>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder ImsConfig(ConfigNodePropertyString value)
            {
                _ImsConfig = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.
            /// </summary>
            /// <returns>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties</returns>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties Build()
            {
                Validate();
                return new ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(
                    Name: _Name,
                    Locale: _Locale,
                    ImsConfig: _ImsConfig
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}