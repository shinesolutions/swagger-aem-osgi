using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties
    /// </summary>
    public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties:  IEquatable<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties>
    { 
        /// <summary>
        /// LinkcheckertransformerDisableRewriting
        /// </summary>
        public ConfigNodePropertyBoolean LinkcheckertransformerDisableRewriting { get; private set; }

        /// <summary>
        /// LinkcheckertransformerDisableChecking
        /// </summary>
        public ConfigNodePropertyBoolean LinkcheckertransformerDisableChecking { get; private set; }

        /// <summary>
        /// LinkcheckertransformerMapCacheSize
        /// </summary>
        public ConfigNodePropertyInteger LinkcheckertransformerMapCacheSize { get; private set; }

        /// <summary>
        /// LinkcheckertransformerStrictExtensionCheck
        /// </summary>
        public ConfigNodePropertyBoolean LinkcheckertransformerStrictExtensionCheck { get; private set; }

        /// <summary>
        /// LinkcheckertransformerStripHtmltExtension
        /// </summary>
        public ConfigNodePropertyBoolean LinkcheckertransformerStripHtmltExtension { get; private set; }

        /// <summary>
        /// LinkcheckertransformerRewriteElements
        /// </summary>
        public ConfigNodePropertyArray LinkcheckertransformerRewriteElements { get; private set; }

        /// <summary>
        /// LinkcheckertransformerStripExtensionPathBlacklist
        /// </summary>
        public ConfigNodePropertyArray LinkcheckertransformerStripExtensionPathBlacklist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties()
        {
        }

        private ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(ConfigNodePropertyBoolean LinkcheckertransformerDisableRewriting, ConfigNodePropertyBoolean LinkcheckertransformerDisableChecking, ConfigNodePropertyInteger LinkcheckertransformerMapCacheSize, ConfigNodePropertyBoolean LinkcheckertransformerStrictExtensionCheck, ConfigNodePropertyBoolean LinkcheckertransformerStripHtmltExtension, ConfigNodePropertyArray LinkcheckertransformerRewriteElements, ConfigNodePropertyArray LinkcheckertransformerStripExtensionPathBlacklist)
        {
            
            this.LinkcheckertransformerDisableRewriting = LinkcheckertransformerDisableRewriting;
            
            this.LinkcheckertransformerDisableChecking = LinkcheckertransformerDisableChecking;
            
            this.LinkcheckertransformerMapCacheSize = LinkcheckertransformerMapCacheSize;
            
            this.LinkcheckertransformerStrictExtensionCheck = LinkcheckertransformerStrictExtensionCheck;
            
            this.LinkcheckertransformerStripHtmltExtension = LinkcheckertransformerStripHtmltExtension;
            
            this.LinkcheckertransformerRewriteElements = LinkcheckertransformerRewriteElements;
            
            this.LinkcheckertransformerStripExtensionPathBlacklist = LinkcheckertransformerStripExtensionPathBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder</returns>
        public static ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder</returns>
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder With()
        {
            return Builder()
                .LinkcheckertransformerDisableRewriting(LinkcheckertransformerDisableRewriting)
                .LinkcheckertransformerDisableChecking(LinkcheckertransformerDisableChecking)
                .LinkcheckertransformerMapCacheSize(LinkcheckertransformerMapCacheSize)
                .LinkcheckertransformerStrictExtensionCheck(LinkcheckertransformerStrictExtensionCheck)
                .LinkcheckertransformerStripHtmltExtension(LinkcheckertransformerStripHtmltExtension)
                .LinkcheckertransformerRewriteElements(LinkcheckertransformerRewriteElements)
                .LinkcheckertransformerStripExtensionPathBlacklist(LinkcheckertransformerStripExtensionPathBlacklist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties left, ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties left, ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.
        /// </summary>
        public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _LinkcheckertransformerDisableRewriting;
            private ConfigNodePropertyBoolean _LinkcheckertransformerDisableChecking;
            private ConfigNodePropertyInteger _LinkcheckertransformerMapCacheSize;
            private ConfigNodePropertyBoolean _LinkcheckertransformerStrictExtensionCheck;
            private ConfigNodePropertyBoolean _LinkcheckertransformerStripHtmltExtension;
            private ConfigNodePropertyArray _LinkcheckertransformerRewriteElements;
            private ConfigNodePropertyArray _LinkcheckertransformerStripExtensionPathBlacklist;

            internal ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.LinkcheckertransformerDisableRewriting property.
            /// </summary>
            /// <param name="value">LinkcheckertransformerDisableRewriting</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder LinkcheckertransformerDisableRewriting(ConfigNodePropertyBoolean value)
            {
                _LinkcheckertransformerDisableRewriting = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.LinkcheckertransformerDisableChecking property.
            /// </summary>
            /// <param name="value">LinkcheckertransformerDisableChecking</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder LinkcheckertransformerDisableChecking(ConfigNodePropertyBoolean value)
            {
                _LinkcheckertransformerDisableChecking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.LinkcheckertransformerMapCacheSize property.
            /// </summary>
            /// <param name="value">LinkcheckertransformerMapCacheSize</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder LinkcheckertransformerMapCacheSize(ConfigNodePropertyInteger value)
            {
                _LinkcheckertransformerMapCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.LinkcheckertransformerStrictExtensionCheck property.
            /// </summary>
            /// <param name="value">LinkcheckertransformerStrictExtensionCheck</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder LinkcheckertransformerStrictExtensionCheck(ConfigNodePropertyBoolean value)
            {
                _LinkcheckertransformerStrictExtensionCheck = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.LinkcheckertransformerStripHtmltExtension property.
            /// </summary>
            /// <param name="value">LinkcheckertransformerStripHtmltExtension</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder LinkcheckertransformerStripHtmltExtension(ConfigNodePropertyBoolean value)
            {
                _LinkcheckertransformerStripHtmltExtension = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.LinkcheckertransformerRewriteElements property.
            /// </summary>
            /// <param name="value">LinkcheckertransformerRewriteElements</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder LinkcheckertransformerRewriteElements(ConfigNodePropertyArray value)
            {
                _LinkcheckertransformerRewriteElements = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.LinkcheckertransformerStripExtensionPathBlacklist property.
            /// </summary>
            /// <param name="value">LinkcheckertransformerStripExtensionPathBlacklist</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesBuilder LinkcheckertransformerStripExtensionPathBlacklist(ConfigNodePropertyArray value)
            {
                _LinkcheckertransformerStripExtensionPathBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties</returns>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties Build()
            {
                Validate();
                return new ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(
                    LinkcheckertransformerDisableRewriting: _LinkcheckertransformerDisableRewriting,
                    LinkcheckertransformerDisableChecking: _LinkcheckertransformerDisableChecking,
                    LinkcheckertransformerMapCacheSize: _LinkcheckertransformerMapCacheSize,
                    LinkcheckertransformerStrictExtensionCheck: _LinkcheckertransformerStrictExtensionCheck,
                    LinkcheckertransformerStripHtmltExtension: _LinkcheckertransformerStripHtmltExtension,
                    LinkcheckertransformerRewriteElements: _LinkcheckertransformerRewriteElements,
                    LinkcheckertransformerStripExtensionPathBlacklist: _LinkcheckertransformerStripExtensionPathBlacklist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}