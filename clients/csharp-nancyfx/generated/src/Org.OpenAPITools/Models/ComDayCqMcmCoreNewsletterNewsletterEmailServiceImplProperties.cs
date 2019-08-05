using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
    /// </summary>
    public sealed class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties:  IEquatable<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties>
    { 
        /// <summary>
        /// FromAddress
        /// </summary>
        public ConfigNodePropertyString FromAddress { get; private set; }

        /// <summary>
        /// SenderHost
        /// </summary>
        public ConfigNodePropertyString SenderHost { get; private set; }

        /// <summary>
        /// MaxBounceCount
        /// </summary>
        public ConfigNodePropertyString MaxBounceCount { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties()
        {
        }

        private ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(ConfigNodePropertyString FromAddress, ConfigNodePropertyString SenderHost, ConfigNodePropertyString MaxBounceCount)
        {
            
            this.FromAddress = FromAddress;
            
            this.SenderHost = SenderHost;
            
            this.MaxBounceCount = MaxBounceCount;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder</returns>
        public static ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder</returns>
        public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder With()
        {
            return Builder()
                .FromAddress(FromAddress)
                .SenderHost(SenderHost)
                .MaxBounceCount(MaxBounceCount);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties left, ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties left, ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _FromAddress;
            private ConfigNodePropertyString _SenderHost;
            private ConfigNodePropertyString _MaxBounceCount;

            internal ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.FromAddress property.
            /// </summary>
            /// <param name="value">FromAddress</param>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder FromAddress(ConfigNodePropertyString value)
            {
                _FromAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.SenderHost property.
            /// </summary>
            /// <param name="value">SenderHost</param>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder SenderHost(ConfigNodePropertyString value)
            {
                _SenderHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.MaxBounceCount property.
            /// </summary>
            /// <param name="value">MaxBounceCount</param>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder MaxBounceCount(ConfigNodePropertyString value)
            {
                _MaxBounceCount = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties</returns>
            public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(
                    FromAddress: _FromAddress,
                    SenderHost: _SenderHost,
                    MaxBounceCount: _MaxBounceCount
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}