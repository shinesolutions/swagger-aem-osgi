using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsThumbnailServletProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsThumbnailServletProperties:  IEquatable<ComDayCqWcmCoreImplServletsThumbnailServletProperties>
    { 
        /// <summary>
        /// Workspace
        /// </summary>
        public ConfigNodePropertyString Workspace { get; private set; }

        /// <summary>
        /// Dimensions
        /// </summary>
        public ConfigNodePropertyArray Dimensions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsThumbnailServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsThumbnailServletProperties()
        {
        }

        private ComDayCqWcmCoreImplServletsThumbnailServletProperties(ConfigNodePropertyString Workspace, ConfigNodePropertyArray Dimensions)
        {
            
            this.Workspace = Workspace;
            
            this.Dimensions = Dimensions;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsThumbnailServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder With()
        {
            return Builder()
                .Workspace(Workspace)
                .Dimensions(Dimensions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplServletsThumbnailServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsThumbnailServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsThumbnailServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsThumbnailServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsThumbnailServletProperties left, ComDayCqWcmCoreImplServletsThumbnailServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsThumbnailServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsThumbnailServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsThumbnailServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsThumbnailServletProperties left, ComDayCqWcmCoreImplServletsThumbnailServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsThumbnailServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder
        {
            private ConfigNodePropertyString _Workspace;
            private ConfigNodePropertyArray _Dimensions;

            internal ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsThumbnailServletProperties.Workspace property.
            /// </summary>
            /// <param name="value">Workspace</param>
            public ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder Workspace(ConfigNodePropertyString value)
            {
                _Workspace = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsThumbnailServletProperties.Dimensions property.
            /// </summary>
            /// <param name="value">Dimensions</param>
            public ComDayCqWcmCoreImplServletsThumbnailServletPropertiesBuilder Dimensions(ConfigNodePropertyArray value)
            {
                _Dimensions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsThumbnailServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsThumbnailServletProperties</returns>
            public ComDayCqWcmCoreImplServletsThumbnailServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsThumbnailServletProperties(
                    Workspace: _Workspace,
                    Dimensions: _Dimensions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}