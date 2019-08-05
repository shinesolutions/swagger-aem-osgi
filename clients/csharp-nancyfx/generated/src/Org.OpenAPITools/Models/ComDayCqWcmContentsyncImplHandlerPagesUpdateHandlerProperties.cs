using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
    /// </summary>
    public sealed class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties:  IEquatable<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties>
    { 
        /// <summary>
        /// CqPagesupdatehandlerImageresourcetypes
        /// </summary>
        public ConfigNodePropertyArray CqPagesupdatehandlerImageresourcetypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties()
        {
        }

        private ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties(ConfigNodePropertyArray CqPagesupdatehandlerImageresourcetypes)
        {
            
            this.CqPagesupdatehandlerImageresourcetypes = CqPagesupdatehandlerImageresourcetypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder</returns>
        public static ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder</returns>
        public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder With()
        {
            return Builder()
                .CqPagesupdatehandlerImageresourcetypes(CqPagesupdatehandlerImageresourcetypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties left, ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties left, ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.
        /// </summary>
        public sealed class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqPagesupdatehandlerImageresourcetypes;

            internal ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.CqPagesupdatehandlerImageresourcetypes property.
            /// </summary>
            /// <param name="value">CqPagesupdatehandlerImageresourcetypes</param>
            public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder CqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray value)
            {
                _CqPagesupdatehandlerImageresourcetypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties</returns>
            public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties Build()
            {
                Validate();
                return new ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties(
                    CqPagesupdatehandlerImageresourcetypes: _CqPagesupdatehandlerImageresourcetypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}