using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterProcessorImplHtmlParserFactoryProperties
    /// </summary>
    public sealed class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties:  IEquatable<ComDayCqRewriterProcessorImplHtmlParserFactoryProperties>
    { 
        /// <summary>
        /// HtmlparserProcessTags
        /// </summary>
        public ConfigNodePropertyArray HtmlparserProcessTags { get; private set; }

        /// <summary>
        /// HtmlparserPreserveCamelCase
        /// </summary>
        public ConfigNodePropertyBoolean HtmlparserPreserveCamelCase { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterProcessorImplHtmlParserFactoryProperties()
        {
        }

        private ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(ConfigNodePropertyArray HtmlparserProcessTags, ConfigNodePropertyBoolean HtmlparserPreserveCamelCase)
        {
            
            this.HtmlparserProcessTags = HtmlparserProcessTags;
            
            this.HtmlparserPreserveCamelCase = HtmlparserPreserveCamelCase;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.
        /// </summary>
        /// <returns>ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder</returns>
        public static ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder Builder()
        {
            return new ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder</returns>
        public ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder With()
        {
            return Builder()
                .HtmlparserProcessTags(HtmlparserProcessTags)
                .HtmlparserPreserveCamelCase(HtmlparserPreserveCamelCase);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqRewriterProcessorImplHtmlParserFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties left, ComDayCqRewriterProcessorImplHtmlParserFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties left, ComDayCqRewriterProcessorImplHtmlParserFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.
        /// </summary>
        public sealed class ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder
        {
            private ConfigNodePropertyArray _HtmlparserProcessTags;
            private ConfigNodePropertyBoolean _HtmlparserPreserveCamelCase;

            internal ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.HtmlparserProcessTags property.
            /// </summary>
            /// <param name="value">HtmlparserProcessTags</param>
            public ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder HtmlparserProcessTags(ConfigNodePropertyArray value)
            {
                _HtmlparserProcessTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.HtmlparserPreserveCamelCase property.
            /// </summary>
            /// <param name="value">HtmlparserPreserveCamelCase</param>
            public ComDayCqRewriterProcessorImplHtmlParserFactoryPropertiesBuilder HtmlparserPreserveCamelCase(ConfigNodePropertyBoolean value)
            {
                _HtmlparserPreserveCamelCase = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.
            /// </summary>
            /// <returns>ComDayCqRewriterProcessorImplHtmlParserFactoryProperties</returns>
            public ComDayCqRewriterProcessorImplHtmlParserFactoryProperties Build()
            {
                Validate();
                return new ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(
                    HtmlparserProcessTags: _HtmlparserProcessTags,
                    HtmlparserPreserveCamelCase: _HtmlparserPreserveCamelCase
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}