using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
    /// </summary>
    public sealed class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties:  IEquatable<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties>
    { 
        /// <summary>
        /// NuiEnabled
        /// </summary>
        public ConfigNodePropertyBoolean NuiEnabled { get; private set; }

        /// <summary>
        /// NuiServiceUrl
        /// </summary>
        public ConfigNodePropertyString NuiServiceUrl { get; private set; }

        /// <summary>
        /// NuiApiKey
        /// </summary>
        public ConfigNodePropertyString NuiApiKey { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties()
        {
        }

        private ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(ConfigNodePropertyBoolean NuiEnabled, ConfigNodePropertyString NuiServiceUrl, ConfigNodePropertyString NuiApiKey)
        {
            
            this.NuiEnabled = NuiEnabled;
            
            this.NuiServiceUrl = NuiServiceUrl;
            
            this.NuiApiKey = NuiApiKey;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder</returns>
        public static ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder</returns>
        public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder With()
        {
            return Builder()
                .NuiEnabled(NuiEnabled)
                .NuiServiceUrl(NuiServiceUrl)
                .NuiApiKey(NuiApiKey);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties left, ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties left, ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.
        /// </summary>
        public sealed class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _NuiEnabled;
            private ConfigNodePropertyString _NuiServiceUrl;
            private ConfigNodePropertyString _NuiApiKey;

            internal ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.NuiEnabled property.
            /// </summary>
            /// <param name="value">NuiEnabled</param>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder NuiEnabled(ConfigNodePropertyBoolean value)
            {
                _NuiEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.NuiServiceUrl property.
            /// </summary>
            /// <param name="value">NuiServiceUrl</param>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder NuiServiceUrl(ConfigNodePropertyString value)
            {
                _NuiServiceUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.NuiApiKey property.
            /// </summary>
            /// <param name="value">NuiApiKey</param>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder NuiApiKey(ConfigNodePropertyString value)
            {
                _NuiApiKey = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties</returns>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties Build()
            {
                Validate();
                return new ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(
                    NuiEnabled: _NuiEnabled,
                    NuiServiceUrl: _NuiServiceUrl,
                    NuiApiKey: _NuiApiKey
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}