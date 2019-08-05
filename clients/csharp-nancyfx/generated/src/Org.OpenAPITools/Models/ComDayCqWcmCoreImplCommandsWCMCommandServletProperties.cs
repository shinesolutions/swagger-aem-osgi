using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties:  IEquatable<ComDayCqWcmCoreImplCommandsWCMCommandServletProperties>
    { 
        /// <summary>
        /// WcmcommandservletDeleteWhitelist
        /// </summary>
        public ConfigNodePropertyArray WcmcommandservletDeleteWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties()
        {
        }

        private ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(ConfigNodePropertyArray WcmcommandservletDeleteWhitelist)
        {
            
            this.WcmcommandservletDeleteWhitelist = WcmcommandservletDeleteWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder With()
        {
            return Builder()
                .WcmcommandservletDeleteWhitelist(WcmcommandservletDeleteWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplCommandsWCMCommandServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties left, ComDayCqWcmCoreImplCommandsWCMCommandServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties left, ComDayCqWcmCoreImplCommandsWCMCommandServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _WcmcommandservletDeleteWhitelist;

            internal ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.WcmcommandservletDeleteWhitelist property.
            /// </summary>
            /// <param name="value">WcmcommandservletDeleteWhitelist</param>
            public ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder WcmcommandservletDeleteWhitelist(ConfigNodePropertyArray value)
            {
                _WcmcommandservletDeleteWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplCommandsWCMCommandServletProperties</returns>
            public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(
                    WcmcommandservletDeleteWhitelist: _WcmcommandservletDeleteWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}