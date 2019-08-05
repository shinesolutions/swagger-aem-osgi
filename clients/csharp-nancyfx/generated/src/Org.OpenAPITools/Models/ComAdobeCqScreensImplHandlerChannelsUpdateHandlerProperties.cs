using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
    /// </summary>
    public sealed class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties:  IEquatable<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties>
    { 
        /// <summary>
        /// CqPagesupdatehandlerImageresourcetypes
        /// </summary>
        public ConfigNodePropertyArray CqPagesupdatehandlerImageresourcetypes { get; private set; }

        /// <summary>
        /// CqPagesupdatehandlerProductresourcetypes
        /// </summary>
        public ConfigNodePropertyArray CqPagesupdatehandlerProductresourcetypes { get; private set; }

        /// <summary>
        /// CqPagesupdatehandlerVideoresourcetypes
        /// </summary>
        public ConfigNodePropertyArray CqPagesupdatehandlerVideoresourcetypes { get; private set; }

        /// <summary>
        /// CqPagesupdatehandlerDynamicsequenceresourcetypes
        /// </summary>
        public ConfigNodePropertyArray CqPagesupdatehandlerDynamicsequenceresourcetypes { get; private set; }

        /// <summary>
        /// CqPagesupdatehandlerPreviewmodepaths
        /// </summary>
        public ConfigNodePropertyArray CqPagesupdatehandlerPreviewmodepaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties()
        {
        }

        private ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(ConfigNodePropertyArray CqPagesupdatehandlerImageresourcetypes, ConfigNodePropertyArray CqPagesupdatehandlerProductresourcetypes, ConfigNodePropertyArray CqPagesupdatehandlerVideoresourcetypes, ConfigNodePropertyArray CqPagesupdatehandlerDynamicsequenceresourcetypes, ConfigNodePropertyArray CqPagesupdatehandlerPreviewmodepaths)
        {
            
            this.CqPagesupdatehandlerImageresourcetypes = CqPagesupdatehandlerImageresourcetypes;
            
            this.CqPagesupdatehandlerProductresourcetypes = CqPagesupdatehandlerProductresourcetypes;
            
            this.CqPagesupdatehandlerVideoresourcetypes = CqPagesupdatehandlerVideoresourcetypes;
            
            this.CqPagesupdatehandlerDynamicsequenceresourcetypes = CqPagesupdatehandlerDynamicsequenceresourcetypes;
            
            this.CqPagesupdatehandlerPreviewmodepaths = CqPagesupdatehandlerPreviewmodepaths;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder</returns>
        public static ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder</returns>
        public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder With()
        {
            return Builder()
                .CqPagesupdatehandlerImageresourcetypes(CqPagesupdatehandlerImageresourcetypes)
                .CqPagesupdatehandlerProductresourcetypes(CqPagesupdatehandlerProductresourcetypes)
                .CqPagesupdatehandlerVideoresourcetypes(CqPagesupdatehandlerVideoresourcetypes)
                .CqPagesupdatehandlerDynamicsequenceresourcetypes(CqPagesupdatehandlerDynamicsequenceresourcetypes)
                .CqPagesupdatehandlerPreviewmodepaths(CqPagesupdatehandlerPreviewmodepaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties left, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties left, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqPagesupdatehandlerImageresourcetypes;
            private ConfigNodePropertyArray _CqPagesupdatehandlerProductresourcetypes;
            private ConfigNodePropertyArray _CqPagesupdatehandlerVideoresourcetypes;
            private ConfigNodePropertyArray _CqPagesupdatehandlerDynamicsequenceresourcetypes;
            private ConfigNodePropertyArray _CqPagesupdatehandlerPreviewmodepaths;

            internal ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.CqPagesupdatehandlerImageresourcetypes property.
            /// </summary>
            /// <param name="value">CqPagesupdatehandlerImageresourcetypes</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder CqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray value)
            {
                _CqPagesupdatehandlerImageresourcetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.CqPagesupdatehandlerProductresourcetypes property.
            /// </summary>
            /// <param name="value">CqPagesupdatehandlerProductresourcetypes</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder CqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray value)
            {
                _CqPagesupdatehandlerProductresourcetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.CqPagesupdatehandlerVideoresourcetypes property.
            /// </summary>
            /// <param name="value">CqPagesupdatehandlerVideoresourcetypes</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder CqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray value)
            {
                _CqPagesupdatehandlerVideoresourcetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.CqPagesupdatehandlerDynamicsequenceresourcetypes property.
            /// </summary>
            /// <param name="value">CqPagesupdatehandlerDynamicsequenceresourcetypes</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder CqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray value)
            {
                _CqPagesupdatehandlerDynamicsequenceresourcetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.CqPagesupdatehandlerPreviewmodepaths property.
            /// </summary>
            /// <param name="value">CqPagesupdatehandlerPreviewmodepaths</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder CqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray value)
            {
                _CqPagesupdatehandlerPreviewmodepaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties</returns>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(
                    CqPagesupdatehandlerImageresourcetypes: _CqPagesupdatehandlerImageresourcetypes,
                    CqPagesupdatehandlerProductresourcetypes: _CqPagesupdatehandlerProductresourcetypes,
                    CqPagesupdatehandlerVideoresourcetypes: _CqPagesupdatehandlerVideoresourcetypes,
                    CqPagesupdatehandlerDynamicsequenceresourcetypes: _CqPagesupdatehandlerDynamicsequenceresourcetypes,
                    CqPagesupdatehandlerPreviewmodepaths: _CqPagesupdatehandlerPreviewmodepaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}