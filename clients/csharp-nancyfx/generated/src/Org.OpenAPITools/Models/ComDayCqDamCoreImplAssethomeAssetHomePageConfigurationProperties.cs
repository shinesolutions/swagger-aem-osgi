using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties:  IEquatable<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties>
    { 
        /// <summary>
        /// IsEnabled
        /// </summary>
        public ConfigNodePropertyBoolean IsEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties()
        {
        }

        private ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties(ConfigNodePropertyBoolean IsEnabled)
        {
            
            this.IsEnabled = IsEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder</returns>
        public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder With()
        {
            return Builder()
                .IsEnabled(IsEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties left, ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties left, ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _IsEnabled;

            internal ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.IsEnabled property.
            /// </summary>
            /// <param name="value">IsEnabled</param>
            public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder IsEnabled(ConfigNodePropertyBoolean value)
            {
                _IsEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties</returns>
            public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties(
                    IsEnabled: _IsEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}