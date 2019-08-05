using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties
    /// </summary>
    public sealed class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties:  IEquatable<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties>
    { 
        /// <summary>
        /// CqSearchpromoteConfighandlerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqSearchpromoteConfighandlerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties()
        {
        }

        private ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(ConfigNodePropertyBoolean CqSearchpromoteConfighandlerEnabled)
        {
            
            this.CqSearchpromoteConfighandlerEnabled = CqSearchpromoteConfighandlerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder</returns>
        public static ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder</returns>
        public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder With()
        {
            return Builder()
                .CqSearchpromoteConfighandlerEnabled(CqSearchpromoteConfighandlerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties left, ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties left, ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.
        /// </summary>
        public sealed class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqSearchpromoteConfighandlerEnabled;

            internal ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.CqSearchpromoteConfighandlerEnabled property.
            /// </summary>
            /// <param name="value">CqSearchpromoteConfighandlerEnabled</param>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder CqSearchpromoteConfighandlerEnabled(ConfigNodePropertyBoolean value)
            {
                _CqSearchpromoteConfighandlerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties</returns>
            public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties Build()
            {
                Validate();
                return new ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(
                    CqSearchpromoteConfighandlerEnabled: _CqSearchpromoteConfighandlerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}