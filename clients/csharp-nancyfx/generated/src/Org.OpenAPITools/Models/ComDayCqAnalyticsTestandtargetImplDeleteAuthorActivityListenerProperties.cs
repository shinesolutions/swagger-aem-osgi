using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties:  IEquatable<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties>
    { 
        /// <summary>
        /// CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties(ConfigNodePropertyBoolean CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled)
        {
            
            this.CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled = CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder With()
        {
            return Builder()
                .CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled(CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties left, ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties left, ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled;

            internal ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled</param>
            public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesBuilder CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled(ConfigNodePropertyBoolean value)
            {
                _CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties</returns>
            public ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties(
                    CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled: _CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}