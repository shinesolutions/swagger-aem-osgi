using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqContentsyncImplContentSyncManagerImplProperties
    /// </summary>
    public sealed class ComDayCqContentsyncImplContentSyncManagerImplProperties:  IEquatable<ComDayCqContentsyncImplContentSyncManagerImplProperties>
    { 
        /// <summary>
        /// ContentsyncFallbackAuthorizable
        /// </summary>
        public ConfigNodePropertyString ContentsyncFallbackAuthorizable { get; private set; }

        /// <summary>
        /// ContentsyncFallbackUpdateuser
        /// </summary>
        public ConfigNodePropertyString ContentsyncFallbackUpdateuser { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqContentsyncImplContentSyncManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqContentsyncImplContentSyncManagerImplProperties()
        {
        }

        private ComDayCqContentsyncImplContentSyncManagerImplProperties(ConfigNodePropertyString ContentsyncFallbackAuthorizable, ConfigNodePropertyString ContentsyncFallbackUpdateuser)
        {
            
            this.ContentsyncFallbackAuthorizable = ContentsyncFallbackAuthorizable;
            
            this.ContentsyncFallbackUpdateuser = ContentsyncFallbackUpdateuser;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqContentsyncImplContentSyncManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder</returns>
        public static ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder</returns>
        public ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder With()
        {
            return Builder()
                .ContentsyncFallbackAuthorizable(ContentsyncFallbackAuthorizable)
                .ContentsyncFallbackUpdateuser(ContentsyncFallbackUpdateuser);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqContentsyncImplContentSyncManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqContentsyncImplContentSyncManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqContentsyncImplContentSyncManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqContentsyncImplContentSyncManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqContentsyncImplContentSyncManagerImplProperties left, ComDayCqContentsyncImplContentSyncManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqContentsyncImplContentSyncManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqContentsyncImplContentSyncManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqContentsyncImplContentSyncManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqContentsyncImplContentSyncManagerImplProperties left, ComDayCqContentsyncImplContentSyncManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqContentsyncImplContentSyncManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _ContentsyncFallbackAuthorizable;
            private ConfigNodePropertyString _ContentsyncFallbackUpdateuser;

            internal ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqContentsyncImplContentSyncManagerImplProperties.ContentsyncFallbackAuthorizable property.
            /// </summary>
            /// <param name="value">ContentsyncFallbackAuthorizable</param>
            public ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder ContentsyncFallbackAuthorizable(ConfigNodePropertyString value)
            {
                _ContentsyncFallbackAuthorizable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqContentsyncImplContentSyncManagerImplProperties.ContentsyncFallbackUpdateuser property.
            /// </summary>
            /// <param name="value">ContentsyncFallbackUpdateuser</param>
            public ComDayCqContentsyncImplContentSyncManagerImplPropertiesBuilder ContentsyncFallbackUpdateuser(ConfigNodePropertyString value)
            {
                _ContentsyncFallbackUpdateuser = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqContentsyncImplContentSyncManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqContentsyncImplContentSyncManagerImplProperties</returns>
            public ComDayCqContentsyncImplContentSyncManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqContentsyncImplContentSyncManagerImplProperties(
                    ContentsyncFallbackAuthorizable: _ContentsyncFallbackAuthorizable,
                    ContentsyncFallbackUpdateuser: _ContentsyncFallbackUpdateuser
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}